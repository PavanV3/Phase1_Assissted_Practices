package File_Handling;
import java.io.File;

import java.io.FileWriter;
import java.io.IOException;
public class createfile {

    public static void main(String[] args) throws IOException
    {
        createFileUsingFileClass();

    }
 
    private static void createFileUsingFileClass() throws IOException
    {
          File file = new File("C:\\Users\\Pavan Jr\\OneDrive\\Documents\\JavaPractices\\create2.txt");
  
          //Create the file
          if (file.createNewFile()){
            System.out.println("File is created!");
          }else{
            System.out.println("File already exists.");
          }
           
          //Write Content
          FileWriter writer = new FileWriter(file);
          writer.write("This is File name is create 2");
          writer.close();
    }
 
}