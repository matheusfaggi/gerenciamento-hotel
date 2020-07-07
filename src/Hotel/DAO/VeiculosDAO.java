/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Hotel.Database.Database;
import Hotel.Veiculos.Veiculo;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author matheusfaggi
 */
public class VeiculosDAO implements DAO<Veiculo>{
    private Veiculo veiculo;
    
    private java.sql.PreparedStatement pst;
    private java.sql.ResultSet rs;
    
    @Override
    public boolean adiciona(Veiculo dado) throws SQLException {
        String sql = "INSERT INTO veiculo (placa, tipo, modelo, cor, ano) VALUES \n" +
            "(?, ?, ?, ?, ?)";
        Database.open();
        pst.setString(1, dado.getPlaca());

        
        Database.close();
        return false;
    }

    @Override
    public boolean remove(Veiculo dado) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean atualiza(Veiculo dado) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Veiculo busca(Veiculo dado) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Veiculo> listar(String criterio) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    } 
}
