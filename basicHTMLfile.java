import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.StringWriter;
import javax.swing.JOptionPane;

public class basicHTMLfile{
    public static void main(String[] args) throws IOException {
      Scanner in = new Scanner(System.in);
      StringWriter sw =null;
      BufferedWriter bw = null;
      final int CREATION = 1, EDITION = 2, TERMINATION = 3;
      String filename, tagAdder, textAdder, fnwt; //fnwt = file name with type//
      String answer = JOptionPane.showInputDialog(null, "creating web files enter 1,\n for editing existing web files drag them to the same folder as this one and enter 2,\n enter 3 in order to stop the program");
      int mission = Integer.parseInt(answer);
      while(mission != 3){
      switch(mission){
        case CREATION:
              filename = JOptionPane.showInputDialog(null, "enter file name");
              String fileContent = String.format("<!DOCTYPE html>\n<html>\n <head>\n    <link rel=\"stylesheet\" type=\"text/css\" href=\"%s.css\">\n     <title></title>\n </head>\n <body>\n  </body>\n</html>", filename);
              fnwt = filename + ".html";
              File file = new File(fnwt);
              if (file.createNewFile()){                                                           //creates the files//
              JOptionPane.showMessageDialog(null, "html file was created");
              BufferedWriter writer = new BufferedWriter(new FileWriter(fnwt));
              writer.write(fileContent);
              writer.close();
               } else {
                  JOptionPane.showMessageDialog(null, "html file name is already existing.");
              }
          
              fnwt = filename + ".css";
              file = new File(fnwt);
              if (file.createNewFile()){
                  JOptionPane.showMessageDialog(null, "css file was created");
              } else {
                  JOptionPane.showMessageDialog(null, "css file name is already existing.");
              }
              answer = JOptionPane.showInputDialog(null, "creating web files enter 1,\n for editing existing web files drag them to the same folder as this one and enter 2,\n enter 3 in order to stop the program");
              mission = Integer.parseInt(answer);
        }
      }
      }

        
    
}
