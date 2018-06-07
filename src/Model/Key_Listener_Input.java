package Model;

import static GUI.Auto_Add_URL.List;
import static GUI.Auto_Add_URL.convert;
import GUI.View_List;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextArea;

public class Key_Listener_Input extends KeyAdapter      
{
    private JTextArea Text_Input;
    private JTextArea Text_Output;

    public Key_Listener_Input(JTextArea Text_Input, JTextArea Text_Output) 
    {
        this.Text_Input = Text_Input;
        this.Text_Output = Text_Output;       
    }
    
        
    // Void use to convert text when Press "Enter"
    @Override public void keyPressed(final KeyEvent e) 
    {
        if(e.getKeyCode() == KeyEvent.VK_ENTER)
        {
            String input = this.Text_Input.getText();
            for(int i = 0; i < List.size(); i++)
            {
                String[] split = List.get(i).split("_");
                input = convert(input, split[0], split[1]);            
            }

            this.Text_Output.setText(input);    
        }
    }
    
    // Void use to clear text when typing
    @Override public void keyTyped(final KeyEvent e) 
    {
        if(this.Text_Input.getText().equals("Type Here ..."))
        {
            this.Text_Input.setText("");
            this.Text_Input.setRequestFocusEnabled(true);
        }
    }
}
