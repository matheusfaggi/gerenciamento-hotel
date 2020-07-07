/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hotel.DAO;

import Hotel.Database.Database;
import Hotel.Hospedagem.Hospedagem;
import Hotel.Hospedagem.Quarto;
import Hotel.Hospedagem.QuartoException;
import Hotel.Hospedagem.TipoQuarto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author matheusfaggi
 */
public class HospedagemDAO implements DAO<Hospedagem> {
    private Hospedagem hospedagem;
    private String sql;
    private PreparedStatement pst;
    private ResultSet rs;
    
    @Override
    public boolean adiciona(Hospedagem dado) throws SQLException {
        sql = "INSERT INTO cliente(nome,email) VALUES(?, ?);";
        
        Database.open();
        pst = Database.getConnection().prepareStatement(sql);
        
        
        
        int rowsAffected = pst.executeUpdate();
        Database.close();
        
        return rowsAffected != 0;
    }

    @Override
    public boolean remove(Hospedagem dado) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean atualiza(Hospedagem dado) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Hospedagem busca(Hospedagem dado) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Hospedagem> listar(String criterio) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Map<TipoQuarto, Integer> listTiposQuartoDisponiveis(String entrada) throws SQLException{
            String criterio = (entrada.length() == 0 ) 
                    ?  (" ") 
                    : ("WHERE CAST(STR_TO_DATE('" + entrada + "','%d/%m/%Y') as DATE) \n"
                    + "NOT BETWEEN CAST(h.check_in as DATE) \n"
                    + "AND CAST(h.check_out as DATE) AND CAST(h.check_out as DATE) \n");
            
        sql = "SELECT tq.id, tq.descricao, tq.qtdCamas, count(*) as disponiveis\n " +
                "FROM quarto q\n " +
                "INNER JOIN\n " +
                "tipo_quarto tq\n " +
                "ON q.id_tipo_quarto = tq.id\n " +
                "INNER JOIN hospedagem h\n " +
                "ON h.id_quarto = q.id\n " +
                criterio + " GROUP BY 1";
        
        Database.open();
        
        pst = Database.getConnection().prepareStatement(sql);
        
        rs = pst.executeQuery();
        
        Map response =  new HashMap<TipoQuarto, Integer>();
        while(rs.next()){
           try {
                TipoQuarto aux = new TipoQuarto(rs.getString("descricao"), rs.getInt("qtdCamas"));
                aux.setId(rs.getInt("id"));
                response.put(aux,rs.getInt("id"));
                
            } catch (QuartoException ex) {
                System.out.println(ex.getMessage());
            }
        }
        
        Database.close();
        
        return response;
    }
    
    public Map<Quarto, Integer> listQuartosDisponiveis(String entrada, String tipoQuarto) throws SQLException{
            String criterio = (entrada.length() == 0) 
                    ?  (" ") 
                    : ("WHERE q.id NOT IN ( \n" +
                        "SELECT h.id FROM hospedagem h \n" +
                        "WHERE CAST(STR_TO_DATE('" + entrada + "','%d/%m/%Y') as DATE) \n" +
                        "NOT BETWEEN CAST(h.check_in as DATE) AND CAST(h.check_out as DATE) AND CAST(h.check_out as DATE)) \n");
            
        Map response =  new HashMap<Quarto, Integer>();
        sql = "SELECT q.id, q.valor_diaria, q.descricao, tq.descricao as tipo_quarto_desc, tq.qtdCamas, tq.id as tipo_quarto_id\n" +
            " FROM quarto q\n" +
            " INNER JOIN tipo_quarto tq\n" +
            " ON q.id_tipo_quarto = tq.id " +
            criterio + " GROUP BY 1 ORDER BY 3";
//        System.out.println(sql);
        Database.open();
        
        pst = Database.getConnection().prepareStatement(sql);
        
        
        rs = pst.executeQuery();        
        
        while(rs.next()){
                try {
                    TipoQuarto tq = new TipoQuarto(rs.getString("tipo_quarto_desc"), rs.getInt("qtdCamas"));
                    tq.setId(rs.getInt("tipo_quarto_id"));
                    Quarto quarto = new Quarto(tq);
                    quarto.setValorDiaria(rs.getFloat("valor_diaria"));
                    quarto.setDescricao(rs.getString("descricao"));
                    response.put(quarto, rs.getInt("id"));
                } catch (QuartoException ex) {
                    Logger.getLogger(HospedagemDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
        }   
        
        Database.close();
        
        return response;
    }
    
}
