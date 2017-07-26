
package ValidacionArrastrado;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.TransferHandler;


public class ListaTransfer extends TransferHandler {
    public boolean importData(TransferHandler.TransferSupport info) {
        if (!info.isDrop()) {
            return false;
        }
        if (!info.isDataFlavorSupported(DataFlavor.stringFlavor)) {
            JOptionPane.showMessageDialog(null, "Esta lista no acepta este tipo de elementos.");
            return false;
        }
        JList lista = (JList) info.getComponent();
        JList.DropLocation dl = (JList.DropLocation) info.getDropLocation();
        DefaultListModel listModel = (DefaultListModel) lista.getModel();
        int index = dl.getIndex();
        boolean insert = dl.isInsert();
        
        Transferable t = info.getTransferable();
        String data;
        try {
            data=(String)t.getTransferData(DataFlavor.stringFlavor);
        }catch (Exception e) {
            return false;
        }
        
        String valorSoltado = "\"" + data + "\" soltado";
        
        if(dl.isInsert()) {
            if(dl.getIndex() == 0){
                MostrarUbicacionDelSoltado(valorSoltado + "al inicio de la lista");
            }else if (dl.getIndex() >= lista.getModel().getSize()) {
                MostrarUbicacionDelSoltado(valorSoltado + "al final de la lista");
            }else {
                String valor1 = (String)lista.getModel().getElementAt(dl.getIndex() - 1);
                String valor2 = (String)lista.getModel().getElementAt(dl.getIndex());
                MostrarUbicacionDelSoltado(valorSoltado + "entre \"" + valor1 + "\" y \"" + valor2 + "\"");
            }
        }else {
            String valor = (String)listModel.getElementAt(index);
            MostrarUbicacionDelSoltado(valorSoltado + "encima de " + "\"" + valor + "\"");
        }
        if (insert) {
            listModel.add(index, data);
        } else {
            listModel.set(index, data);
        }
        return true;
    }
    
    private void MostrarUbicacionDelSoltado(final String string) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JOptionPane.showMessageDialog(null, string);
            }
        });
    }
}
