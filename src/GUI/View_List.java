package GUI;

import Model.Object_Factory;
import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class View_List extends javax.swing.JFrame 
{
// Var
    public static ArrayList<String> List = new ArrayList<>();
    public static JPopupMenu Menu;
    public static JPopupMenu Menu_PopUp;
    public static Component com;
    public static View_List conection;
    public static Boolean Check_Add = true;
// -------------------------------------------------------------------------- //    
    public View_List() throws FileNotFoundException, IOException, ClassNotFoundException
    {
        initComponents();
        set_GUI();
        load_Data();
        conection = this;        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel(){
            // Set Backgound
            Image image = Toolkit.getDefaultToolkit().createImage("Data\\Image\\Background_2.png");
            @Override
            public void paintComponent(Graphics g)
            {
                super.paintComponent(g);
                if (image != null)
                {
                    g.drawImage(image, 0, 0, this);
                }
            }
        };
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        Home = new javax.swing.JLabel();
        Add = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Table.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        Table.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Table.setFocusCycleRoot(true);
        Table.setGridColor(new java.awt.Color(0, 0, 0));
        Table.setRowHeight(50);
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TableMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(Table);

        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HomeMouseExited(evt);
            }
        });

        Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122)
                        .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseEntered
        show_PopUp(evt.getComponent(), "Add new");
    }//GEN-LAST:event_AddMouseEntered

    private void AddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseExited
        Menu.setVisible(false);
    }//GEN-LAST:event_AddMouseExited

    private void AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseClicked
        if(Check_Add)
        {
            JFrame jf;
            try {
                jf = new Add_New();
                jf.setLocation(this.getLocation());
                jf.setVisible(true);
            } catch (FontFormatException ex) {
                Logger.getLogger(View_List.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(View_List.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedFlavorException ex) {
                Logger.getLogger(View_List.class.getName()).log(Level.SEVERE, null, ex);
            } 
            Check_Add = false;
        }
        
    }//GEN-LAST:event_AddMouseClicked

    private void HomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseEntered
        show_PopUp(evt.getComponent(), "Back");
    }//GEN-LAST:event_HomeMouseEntered

    private void HomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseExited
        Menu.setVisible(false);
    }//GEN-LAST:event_HomeMouseExited

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        try {
            new Auto_Add_URL().setVisible(true);
        } catch (FontFormatException ex) {
            Logger.getLogger(View_List.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(View_List.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(View_List.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_HomeMouseClicked

    private void TableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseEntered
        com = evt.getComponent();
    }//GEN-LAST:event_TableMouseEntered

    public static void main(String args[]) 
    {
        set_LookAndFeel();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new View_List().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(View_List.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(View_List.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(View_List.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    public static void set_LookAndFeel()
    {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Auto_Add_URL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Auto_Add_URL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Auto_Add_URL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Auto_Add_URL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
                
    }
    
    public void load_Data() throws FileNotFoundException, IOException, ClassNotFoundException
    {
        input_Data(); 
        
        TableModel model = new DefaultTableModel(load_Row(), load_Column())
        {
            @Override
            public boolean isCellEditable(int row, int column) 
            {
                return false; 
            }              
        };  
        Table.setModel(model);                
    }
    
    public void set_GUI() throws IOException, FileNotFoundException, ClassNotFoundException
    {
        // Set Table
        Table.setShowGrid(true);
        Table.setOpaque(true);
        Table.getTableHeader().setReorderingAllowed(false);    
        Table.getSelectionModel().addListSelectionListener(selection_action);
        
        // Set Icon
        Add.setIcon(new ImageIcon("Data\\Image\\Add_Icon.png"));
        Home.setIcon(new ImageIcon("Data\\Image\\Home_Icon.png"));
        
        // PopUp
        set_MenuPopUp();
    }
    
    public static Object[] load_Column()
    {
        return new Object[]{"Word","URL"};
    }
    
    public static Object[][] load_Row()
    {
        Object[][] ob = new Object[List.size()][2];
        for(int i = 0; i < List.size(); i++)
        {
            String[] split = List.get(i).split("_");
            ob[i][0] = split[0];
            ob[i][1] = split[1];
        }
        return ob;
    }
    
    public static void input_Data() throws FileNotFoundException, IOException, ClassNotFoundException
    {
        List = (ArrayList<String>) Object_Factory.input_Object("Data\\DB\\Library.db");
    }
    
// Listener
    public ListSelectionListener selection_action = new ListSelectionListener() 
    {
        @Override
        public void valueChanged(ListSelectionEvent e)
        {
            int location = Table.getSelectedRow() * 50;
            Menu_PopUp.show(com, 580, location);
        }
    };
    
// Void for Menu_PopUp
    public void delete() throws IOException, FileNotFoundException, ClassNotFoundException
    {
        List.remove(Table.getSelectedRow());
        Object_Factory.output_Object(List, "Data\\DB\\Library.db");
        Menu_PopUp.setVisible(false);
        load_Data();
    }
    
    public  void open_Web() throws MalformedURLException, IOException
    {
        String link = (List.get(Table.getSelectedRow())).split("_")[1];
        Desktop.getDesktop().browse(URI.create(link));
    }    
// For PopUo    
    public static void show_PopUp(Component com, String text)
    {
        Menu = new JPopupMenu();
        
        // Set JMenuItem
        JMenuItem  jmenu = new JMenuItem (text);
        jmenu.setEnabled(false);
        jmenu.setForeground(Color.BLACK);
        
        // Add and show
        Menu.add(jmenu);
        Menu.show(com, 30, 80);
    }
// Table PopUp   
    public void set_MenuPopUp() throws IOException, FileNotFoundException, ClassNotFoundException, MalformedURLException
    {
        Menu_PopUp = new JPopupMenu();
        JMenuItem Delete = new JMenuItem("Delete");
        JMenuItem Open_Web = new JMenuItem("Open URL");
// Add Action
        ActionListener Delete_action = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                try {
                    delete();
                } catch (IOException ex) {
                    Logger.getLogger(View_List.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(View_List.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        Delete.addActionListener(Delete_action);
        
        ActionListener Open_action = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                try {
                    open_Web();
                } catch (IOException ex) {
                    Logger.getLogger(View_List.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };        
        Open_Web.addActionListener(Open_action);
        
        Menu_PopUp.add(Delete);
        Menu_PopUp.add(Open_Web);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Add;
    private javax.swing.JLabel Home;
    private javax.swing.JTable Table;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
