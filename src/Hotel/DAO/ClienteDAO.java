/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hotel.DAO;

import Hotel.Database.Database;
import Hotel.Pessoa.Cliente;
import Hotel.Pessoa.PessoaException;
import Hotel.Views.TableModel.ClienteListTableModel;
import Hotel.Views.TableModel.HospedagemListTableModel;
import Hotel.Views.TableModel.HospedagemModel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author matheusfaggi
 */
public class ClienteDAO implements DAO<Cliente>{
    
    private String sql;
    private PreparedStatement pst;
    private ResultSet rs;

    @Override
    public boolean adiciona(Cliente dado) throws SQLException {
        sql = "INSERT INTO cliente(nome,email) VALUES(?, ?);";
        
        Database.open();
        pst = Database.getConnection().prepareStatement(sql);
        
        pst.setString(1, dado.getNome());
        pst.setString(2, dado.getEmail());
        
        int rowsAffected = pst.executeUpdate();
        Database.close();
        
        return rowsAffected != 0;
    }

    @Override
    public boolean remove(Cliente dado) throws SQLException {
        sql ="DELETE FROM cliente WHERE id = ?";
        Database.open();
        pst = Database.getConnection().prepareStatement(sql);
        
        pst.setInt(1, dado.getId());
        int rowsAffected = pst.executeUpdate();
        
        Database.close();
        return rowsAffected != 0;
    }

    @Override
    public boolean atualiza(Cliente dado) throws SQLException {
        sql = "UPDATE cliente SET email = ?, nome = ? "
                + "WHERE id = ?";
        Database.open();
        pst = Database.getConnection().prepareStatement(sql);
        
        pst.setString(1, dado.getEmail());
        pst.setString(2, dado.getNome());
        pst.setInt(3, dado.getId());
        
        int rowsAffected = pst.executeUpdate();
        System.out.println(rowsAffected);
        
        Database.close();
        return rowsAffected != 0;
    }

    @Override
    public Cliente busca(Cliente dado) throws SQLException {
        Cliente cliente = null;
        sql = "SELECT * FROM cliente WHERE email = ?";
        
        
        Database.open();
        pst = Database.getConnection().prepareStatement(sql);
        
        pst.setString(1,dado.getEmail());
        
        rs = pst.executeQuery();
        if(rs.next()){
            cliente = new Cliente();
            try {
                cliente = new Cliente(rs.getString("nome"));
                cliente.setEmail(rs.getString("email"));
                cliente.setId(rs.getInt("id"));
            } catch (PessoaException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
        
        Database.close();
        return cliente;
    }

    @Override
    public List<Cliente> listar(String criterio) throws SQLException {
        Cliente cliente = null;
        List<Cliente> response = new ArrayList<> ();
        
        sql = "SELECT * FROM cliente";
        if(criterio.length() > 0)
            sql += " WHERE"+ criterio;
        
        Database.open();
        pst = Database.getConnection().prepareStatement(sql);
        
        rs = pst.executeQuery();
        
        while(rs.next()){
            try {
                cliente = new Cliente(rs.getString("nome"));
                cliente.setEmail(rs.getString("email"));
                
            } catch (PessoaException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());

            }
            
        }
        Database.close();
        return response;
    }
    

    public HospedagemListTableModel listarHospedagens(String email) throws SQLException{
      
        HospedagemListTableModel response =  new HospedagemListTableModel();
        
        String criterio = (email.length() == 0) ?  (" ") : ("WHERE email like \"%" + email + "%\"");
        
        sql = " SELECT h.id, c.nome, tq.descricao,\n " +
                    "q.valor_diaria,DATEDIFF(h.check_out, h.check_in) AS diarias,\n " +
                    "DATEDIFF(h.check_out, h.check_in) * q.valor_diaria AS total_pagar\n " +
                    "FROM cliente c \n " +
                    "INNER JOIN hospedagem h\n " +
                    "ON c.id = h.id_cliente\n " +
                    "INNER JOIN quarto q\n " +
                    "ON q.id = h.id_quarto\n " +
                    "INNER JOIN tipo_quarto tq\n " +
                    "ON q.id_tipo_quarto = tq.id\n " + criterio;
                    
        
        Database.open();
        pst =  Database.getConnection().prepareStatement(sql);
        rs = pst.executeQuery();
        int i = 0;
        while(rs.next()){
            HospedagemModel aux = new HospedagemModel();
            aux.setId(rs.getInt("id"));
            aux.setNome(rs.getString("nome"));
            aux.setDescricao(rs.getString("descricao"));
            aux.setDiarias(rs.getInt("diarias"));
            aux.setValorDiaria(rs.getFloat("valor_diaria"));
            aux.setTotalPagar(rs.getFloat("total_pagar"));
            
            response.addRow(aux);
            i++;
        }
        System.out.println("Quantidade de registro encontrados: " + i);
        
        return response;
    }
    
    public ClienteListTableModel listarClientes(String email) throws SQLException{
        ClienteListTableModel response =  new  ClienteListTableModel();
        
        String criterio = (email.length() == 0) ?  (" ") : ("WHERE email like \"%" + email + "%\"");
        sql =  "SELECT * FROM cliente " + criterio;
        
        Database.open();
        pst = Database.getConnection().prepareStatement(sql);
        rs = pst.executeQuery();
        
        while(rs.next()){
            Cliente aux = new Cliente();
            aux.setId(rs.getInt("id"));
            aux.setEmail(rs.getString("email"));
            aux.setNome(rs.getString("nome"));
            
            response.addRow(aux);
        }
        return response;
    }
    
}
