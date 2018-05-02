package Model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Object_Factory
{
    public static Object Input_Object(String path) throws FileNotFoundException, IOException, ClassNotFoundException
    {
        ObjectInputStream fis = new ObjectInputStream(new FileInputStream(path));
        Object output =  fis.readObject();
        fis.close();
        return output;
    }
    
    public static void Output_Object(Object ob, String path) throws FileNotFoundException, IOException
    {
        ObjectOutputStream fos = new ObjectOutputStream(new FileOutputStream(path));
        fos.writeObject(ob);
        fos.close();
    }
}
