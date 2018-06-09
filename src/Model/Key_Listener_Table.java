package Model;

import static GUI.View_List.List;
import java.awt.Desktop;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.net.MalformedURLException;
import java.net.URI;

public class Key_Listener_Table extends KeyAdapter
{
    private JTable table;  

    public Key_Listener_Table(JTable table) 
    {
        this.table = table;
    }
    
    public void delete() throws IOException
    {
        List.remove(table.getSelectedRow());
        Object_Factory.output_Object(List, "Data\\DB\\Library.db");
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.removeRow(table.getSelectedRow());
        table.setModel(model);
    }
    
    
    public  void open_Web() throws MalformedURLException, IOException
    {
        String link = (List.get(table.getSelectedRow())).split("_")[1];
        Desktop.getDesktop().browse(URI.create(link));
    }    
    
    @Override
    public void keyPressed(final KeyEvent e)
    {
        switch(e.getKeyCode())
        {
            // When user Press "Delete"
            case KeyEvent.VK_DELETE :
            {
                try {
                    delete();
                } catch (IOException ex) {
                    Logger.getLogger(Key_Listener_Table.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            }            
        }
        
        // When user Press "Ctrl + C"
        if ((e.getKeyCode() == KeyEvent.VK_O) && ((e.getModifiers() & KeyEvent.CTRL_MASK) != 0)) 
        {
            try {
                open_Web();
            } catch (IOException ex) {
                Logger.getLogger(Key_Listener_Table.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
}
