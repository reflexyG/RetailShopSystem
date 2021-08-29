/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rss.gui;

import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Admin
 */
public class function {
    
    public void search(javax.swing.JTable tb, String key)
    {
        DefaultTableModel table = (DefaultTableModel)tb.getModel();
        String search = key.toLowerCase();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        tb.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }
    
    public void updateTable(javax.swing.JTable tb,Object[] list)
    {
        DefaultTableModel model = (DefaultTableModel)tb.getModel();
        Object[] lines = list;
        model.setRowCount(0);
        for(int i = 0; i < lines.length; i++){
                String line = lines[i].toString().trim();
                String[] row = line.split(";");
                model.addRow(row);
        }
    }
    
    public void updateCustTable(javax.swing.JTable tb,Object[] list)
    {
        DefaultTableModel model = (DefaultTableModel)tb.getModel();
        Object[] lines = list;
        model.setRowCount(0);
        for(int i = 0; i < lines.length; i++){
                String line = lines[i].toString().trim();
                String[] row = line.split(";");
                if(row[2].equals("Customer"))
                {
                    model.addRow(row);
                }
        }
     }
}
