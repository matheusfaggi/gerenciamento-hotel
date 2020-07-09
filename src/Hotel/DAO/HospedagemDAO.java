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
import java.sql.Date;
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
        sql = "INSERT INTO hospedagem(check_in,check_out,id_quarto,id_cliente,id_funcionario) VALUES(?, ?, ?, ?, ?);";
         
        Database.open();
        pst = Database.getConnection().prepareStatement(sql);
        pst.setDate(1, (Date) dado.getEntrada());
        pst.setDate(2, (Date) dado.getSaida());
        pst.setInt(3, dado.getQuartoid());
        pst.setInt(4, dado.getClienteid());
        pst.setInt(5, dado.getFuncionarioid());
        
        
        
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
    
    public Map<TipoQuarto, Integer> listTiposQuartoDisponiveis() throws SQLException{
            sql = "SELECT * FROM  tipo_quarto WHERE ocupacao =  0 ";
        
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
    
    public Map<Quarto, Integer> listQuartosDisponiveis() throws SQLException{
            
            
        Map response =  new HashMap<Quarto, Integer>();
        sql = "SELECT q.id, q.valor_diaria, q.descricao," + 
            " tq.descricao as tipo_quarto_desc, tq.qtdCamas, tq.id as tipo_quarto_id\n" +
            " FROM quarto q\n" +
            " INNER JOIN tipo_quarto tq\n" +
            " ON q.id_tipo_quarto = tq.id GROUP BY 1 ORDER BY 3";
        
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
