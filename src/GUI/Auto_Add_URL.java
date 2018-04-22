package GUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

public class Auto_Add_URL extends javax.swing.JFrame 
{        
// Var
    public static JPopupMenu Menu;
    public static ArrayList<String> List = new ArrayList<String>();
// -------------------------------------------------------------------------- //    
    
    public Auto_Add_URL() throws FontFormatException, IOException 
    {
        initComponents();
        Set_GUI();
        Get_Data();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel()
        {
            // Set Backgound
            Image image = Toolkit.getDefaultToolkit().createImage("Data\\Image\\Background.png");
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
        jScrollPane2 = new javax.swing.JScrollPane();
        Text_Output = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        Text_Input = new javax.swing.JTextArea();
        Label_Output = new javax.swing.JLabel();
        Label_Input = new javax.swing.JLabel();
        Library = new javax.swing.JLabel();
        Copy = new javax.swing.JLabel();
        Convert = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Auto Add URL"); // NOI18N
        setResizable(false);

        Text_Output.setEditable(false);
        Text_Output.setBackground(new java.awt.Color(0, 0, 0));
        Text_Output.setColumns(20);
        Text_Output.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Text_Output.setForeground(new java.awt.Color(255, 255, 255));
        Text_Output.setLineWrap(true);
        Text_Output.setRows(5);
        Text_Output.setWrapStyleWord(true);
        Text_Output.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jScrollPane2.setViewportView(Text_Output);

        Text_Input.setBackground(new java.awt.Color(0, 0, 0));
        Text_Input.setColumns(20);
        Text_Input.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Text_Input.setForeground(new java.awt.Color(255, 255, 255));
        Text_Input.setLineWrap(true);
        Text_Input.setRows(5);
        Text_Input.setWrapStyleWord(true);
        Text_Input.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jScrollPane3.setViewportView(Text_Input);

        Label_Output.setFont(new java.awt.Font("iCiel Showcase Sans", 0, 60)); // NOI18N
        Label_Output.setForeground(new java.awt.Color(255, 255, 255));
        Label_Output.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Output.setText("Output : ");

        Label_Input.setFont(new java.awt.Font("iCiel Showcase Sans", 0, 60)); // NOI18N
        Label_Input.setForeground(new java.awt.Color(255, 255, 255));
        Label_Input.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Input.setText("Input : ");

        Library.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LibraryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LibraryMouseExited(evt);
            }
        });

        Copy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CopyMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CopyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CopyMouseExited(evt);
            }
        });

        Convert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConvertMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ConvertMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ConvertMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Label_Input, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(66, 66, 66)
                        .addComponent(Label_Output, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(323, 323, 323)
                .addComponent(Convert, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(Library, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(Copy, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Output, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Label_Input, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Copy, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Library, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Convert, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LibraryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LibraryMouseEntered
        Show_PopUp(evt.getComponent(), "Open Library !");
    }//GEN-LAST:event_LibraryMouseEntered

    private void CopyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CopyMouseEntered
        Show_PopUp(evt.getComponent(), "Copy !");
    }//GEN-LAST:event_CopyMouseEntered

    private void ConvertMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConvertMouseEntered
        Show_PopUp(evt.getComponent(), "Start Convert !");
    }//GEN-LAST:event_ConvertMouseEntered

    private void ConvertMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConvertMouseExited
        Menu.setVisible(false);
    }//GEN-LAST:event_ConvertMouseExited

    private void LibraryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LibraryMouseExited
        Menu.setVisible(false);
    }//GEN-LAST:event_LibraryMouseExited

    private void CopyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CopyMouseExited
        Menu.setVisible(false);
    }//GEN-LAST:event_CopyMouseExited

    private void ConvertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConvertMouseClicked
        String input = Text_Input.getText();
        for(int i = 0; i < List.size(); i++)
        {
            String[] split = List.get(i).split("_");
            input = Convert(input, split[0], split[1]);            
        }
        
        Text_Output.setText(input);
    }//GEN-LAST:event_ConvertMouseClicked

    private void CopyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CopyMouseClicked
        StringSelection output = new StringSelection(Text_Output.getText());
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(output, null);
        
        // Show Message
        JOptionPane.showMessageDialog(null, "Done !");
    }//GEN-LAST:event_CopyMouseClicked

    public static void main(String args[]) 
    {
        Set_LookAndFeel();
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                try {
                    new Auto_Add_URL().setVisible(true);
                } catch (FontFormatException ex) {
                    Logger.getLogger(Auto_Add_URL.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Auto_Add_URL.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    public void Set_GUI() throws FileNotFoundException, FontFormatException, IOException
    {
        // Set Text Font
        Font font = Font.createFont(Font.TRUETYPE_FONT, new FileInputStream(new File("Data\\Font\\ShowcaseSans.ttf"))).deriveFont(Font.PLAIN, 60);
        Label_Input.setFont(font);
        Label_Output.setFont(font);
        
        // Set icon
        Convert.setIcon(new ImageIcon("Data\\Image\\Convert_Icon.png"));
        Library.setIcon(new ImageIcon("Data\\Image\\Library_Icon.png"));
        Copy.setIcon(new ImageIcon("Data\\Image\\Copy_Icon.png"));
    }

    public static void Set_LookAndFeel()
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
    
    public static void Show_PopUp(Component com, String text)
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
    
    public static void Get_Data() throws FileNotFoundException
    {
        FileInputStream fi = new FileInputStream(new File("Data\\DB\\Library.txt"));
        Scanner scan = new Scanner(fi);
            while(scan.hasNext())
            {
                List.add(scan.nextLine());
            }
        scan.close();
    }
    
    public static String Convert(String input, String find, String url)
    {        
        int pos = input.indexOf(find);
        int length = find.length();
        StringBuilder sb = new StringBuilder(input);
        
        
        while(pos != -1)
        {
            if( pos + length == sb.toString().length() || pos == 0) //
            {
                StringBuilder extra = new StringBuilder("");
                extra.append(sb.substring(0, pos)).append("[URL=\"").append(url).append("\"]").append(find).append("[/URL]").append(sb.substring(pos + length));
                sb = extra;
                pos = sb.indexOf(find, pos + length + url.length() + 15);
            }
            else
            {
                if((sb.charAt(pos + length) + "").equals(" ") && (sb.charAt(pos - 1) + "").equals(" "))
                {
                    StringBuilder extra = new StringBuilder("");
                    extra.append(sb.substring(0, pos)).append("[URL=\"").append(url).append("\"]").append(find).append("[/URL]").append(sb.substring(pos + length));
                    sb = extra;
                    pos = sb.indexOf(find, pos + length + url.length() + 15);                    
                }
                else
                {
                    pos = sb.indexOf(find, pos + length);                
                }
            }
        }
        return sb.toString();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Convert;
    private javax.swing.JLabel Copy;
    private javax.swing.JLabel Label_Input;
    private javax.swing.JLabel Label_Output;
    private javax.swing.JLabel Library;
    private javax.swing.JTextArea Text_Input;
    private javax.swing.JTextArea Text_Output;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
