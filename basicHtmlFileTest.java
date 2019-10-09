import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.StringWriter;
import javax.swing.JOptionPane;

public class basicHtmlFileTest{
    public static void main(String[] args) throws IOException {
      basicHtmlFile newSite = new basicHtmlFile();
      final int CREATION = 1, EDITION = 2, TERMINATION = 4, REMOVAL = 3;
      String answer = JOptionPane.showInputDialog(null, "creating web files enter 1,\n for editing existing web files drag them to the same folder as this one and enter 2,\n enter 3 in order to stop the program");
      int mission = Integer.parseInt(answer);
      while(mission != 4){
      switch(mission){
        case CREATION:
              newSite.setSiteName();
              newSite.createHtmlFile(newSite.getSiteName());
              newSite.createCssFile(newSite.getSiteName());
              
              
              answer = JOptionPane.showInputDialog(null, "creating web files enter 1,\n for editing existing web files drag them to the same folder as this one and enter 2,\n enter 3 in order to stop the program");
              mission = Integer.parseInt(answer);
        }
      }
      }

        
    
}
