/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hotel.Views.TableModel;

import Hotel.Pessoa.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author matheusfaggi
 */
public class ClienteListTableModel extends AbstractTableModel{
    private List<Cliente> dados =  new ArrayList<>();

    static String[] cols ={
        "id",
        "nome",
        "email"
    };
    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return cols.length;
    }
    
    @Override
    public String getColumnName(int i){
        return cols[i];
    }

    @Override
    public Object getValueAt(int row, int col) {
        switch(col){
            case 0:
                return dados.get(row).getId();
            case 1: 
                return dados.get(row).getNome();
            case 2: 
                return dados.get(row).getEmail();
            default:
                return "";
        }
    }
    public void addRow(Cliente cliente){
        this.dados.add(cliente);
    }
    
}
