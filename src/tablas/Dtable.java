package tablas;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;


/**
 *
 * @author USER
 */

public class Dtable extends  JTable{
    @Override
    public Component prepareRenderer(TableCellRenderer renderer, int rowIndex, int columnIndex){
         Component component = super.prepareRenderer(renderer,rowIndex, columnIndex);
         component.setBackground(Color.RED);
         component.setForeground(Color.WHITE);
          if ((Float.class.equals(this.getColumnClass(columnIndex)))&& (getValueAt(rowIndex, columnIndex)!=null)){
               float val = Float.parseFloat(getValueAt(rowIndex, columnIndex).toString());
            if (val==1){
                component.setBackground(Color.GREEN);
                component.setForeground(Color.green);
        }
      }
          return component;
    
} 
}