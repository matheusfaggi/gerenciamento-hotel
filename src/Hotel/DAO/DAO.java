/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.SQLException;
import java.util.List;


/**
 *
 * @author matheusfaggi
 * @param <ValueObjects> Classe 
 */
public interface DAO<ValueObjects> {
       
        public boolean adiciona(ValueObjects dado)
                throws SQLException;
        
        public boolean remove(ValueObjects dado)
                throws SQLException;
        
        public boolean atualiza(ValueObjects dado)
                throws SQLException;
        
        public ValueObjects busca(ValueObjects dado)
                throws SQLException;
        
        public List<ValueObjects> listar(String criterio)
                throws SQLException;
}
