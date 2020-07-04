/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hotel.Views.TableModel;

import Hotel.Views.TableModel.HospedagemModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author matheusfaggi
 */
public class HospedagemListTableModel extends AbstractTableModel{
    private List<HospedagemModel> dados =  new ArrayList();
    
    private String [] cols = {
            "id",
            "Nome",
            "Descrição",
            "Valor diária",
            "diarias",
            "Total a pagar"
        };
    
    @Override
    public int getRowCount() {
        return dados.size();
    }
    
    @Override
    public String getColumnName(int i){
        return cols[i];
    }

    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
        switch(col){
            case 0:
                return dados.get(row).getId();
            case 1: 
                return dados.get(row).getNome();
            case 2:
                return dados.get(row).getDescricao();
            case 3:
                return dados.get(row).getValorDiaria();
            case 4:
                return dados.get(row).getDiarias();
            case 5:
                return dados.get(row).getTotalPagar();
            default: return "";
        }
    }
    
    public void addRow(HospedagemModel hospedagem){
        this.dados.add(hospedagem);
    }
    
    public void setRows(ArrayList<HospedagemModel> dados){
        this.dados.clear();
        for(HospedagemModel row : dados){
            this.dados.add(row);
        }
        this.fireTableDataChanged();
    }

   
    
}
