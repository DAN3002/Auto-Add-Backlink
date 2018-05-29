package GUI;

import Model.Object_Factory;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Add_New extends javax.swing.JFrame 
{

    public Add_New() throws FileNotFoundException, FontFormatException, IOException, UnsupportedFlavorException
    {
        initComponents();        
        set_GUI();
        get_Data();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Text_2 = new javax.swing.JLabel();
        Text_3 = new javax.swing.JLabel();
        Input_Word = new javax.swing.JTextField();
        Input_URL = new javax.swing.JTextField();
        Back = new javax.swing.JButton();
        Add = new javax.swing.JButton();
        Text_1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Text_2.setFont(new java.awt.Font("iCiel Showcase Sans", 1, 24)); // NOI18N
        Text_2.setText("Word: ");

        Text_3.setFont(new java.awt.Font("iCiel Showcase Sans", 1, 24)); // NOI18N
        Text_3.setText("URL:");

        Input_Word.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N

        Input_URL.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        Input_URL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Input_URLMouseClicked(evt);
            }
        });

        Back.setFont(new java.awt.Font("iCiel Showcase Sans", 0, 24)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        Add.setFont(new java.awt.Font("iCiel Showcase Sans", 0, 24)); // NOI18N
        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Text_1.setFont(new java.awt.Font("iCiel Showcase Sans", 1, 24)); // NOI18N
        Text_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Text_1.setText("ADD New");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Add)
                        .addGap(91, 91, 91)
                        .addComponent(Back)
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Text_2)
                            .addComponent(Text_3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Input_Word)
                            .addComponent(Input_URL, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Text_1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Text_1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Text_2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Input_Word, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Text_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Input_URL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Add)
                    .addComponent(Back))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        String word = Input_Word.getText();
        String url = Input_URL.getText();
        if(check_URL(url))
        {
           View_List.List.add(word + "_" + url);      
           
           try {
               Object_Factory.output_Object(View_List.List, "Data\\DB\\Library.db");
               View_List.conection.load_Data();               
           } catch (IOException ex) {
               Logger.getLogger(Add_New.class.getName()).log(Level.SEVERE, null, ex);
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(Add_New.class.getName()).log(Level.SEVERE, null, ex);
           }
           
           back();
        }
        else
        {
            Input_URL.setForeground(Color.red);
        }

    }//GEN-LAST:event_AddActionPerformed

    private void Input_URLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Input_URLMouseClicked
        Input_URL.setForeground(Color.BLACK);
        Input_URL.selectAll();
    }//GEN-LAST:event_Input_URLMouseClicked

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        back();
    }//GEN-LAST:event_BackActionPerformed

    public static void main(String args[]) 
    {        
        set_LookAndFeel();
        java.awt.EventQueue.invokeLater(new Runnable() 
        {           
            public void run() 
            {
                try {
                    new Add_New().setVisible(true);
                } catch (FontFormatException ex) {
                    Logger.getLogger(Add_New.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Add_New.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedFlavorException ex) {
                    Logger.getLogger(Add_New.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(Add_New.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_New.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_New.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_New.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }        
    }
    
    public void set_GUI() throws FileNotFoundException, FontFormatException, IOException
    {
        // Set Text Font
        Font font = Font.createFont(Font.TRUETYPE_FONT, new FileInputStream(new File("Data\\Font\\ShowcaseSans.ttf"))).deriveFont(Font.PLAIN, 24);
        Text_1.setFont(font);              
        Text_2.setFont(font);
        Text_3.setFont(font);
        Add.setFont(font);
        Back.setFont(font);
    }
      
    public void get_Data() throws UnsupportedFlavorException, IOException
    {
        try {
            String Clipboard_Copy = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
            if(check_URL(Clipboard_Copy))
            {
                Input_URL.setText(Clipboard_Copy);
                Input_URL.selectAll();
            }
        } catch (Exception e) 
        {
        }
    }
    
    public static Boolean check_URL(String url)
    {
        Boolean output = true;
        try 
        {
            URL link = new URL(url);
        } catch (Exception e) 
        {
            output = false;
        }
        return output;
    }
            
    public void back()
    {
        dispose();
        View_List.Check_Add = true;
        View_List.conection.requestFocus();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Back;
    private javax.swing.JTextField Input_URL;
    private javax.swing.JTextField Input_Word;
    private javax.swing.JLabel Text_1;
    private javax.swing.JLabel Text_2;
    private javax.swing.JLabel Text_3;
    // End of variables declaration//GEN-END:variables
}
