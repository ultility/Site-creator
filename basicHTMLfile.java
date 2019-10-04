import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.StringWriter;

public class basicHTMLfile{
    public static void main(String[] args) throws IOException {
    	Scanner in = new Scanner(System.in);
    	StringWriter sw =null;
    	BufferedWriter bw = null;
    	final int CREATION = 1, EDITION = 2, TERMINATION = 3;
    	String fileContent = "<!DOCTYPE html>\n<html>\n	<head>\n		<link rel=\"stylesheet\" type=\"text/css\" href=\"main.css\">\n 		<title></title>\n	</head>\n	<body>\n	</body>\n</html>", filename, tagAdder, textAdder, fnwt; //fnwt = file name with type//
    	int mission = 0;
    	while(mission != 3){
    		System.out.println("creating web files enter 1,\n for editing existing web files drag them to the same folder as this one and enter 2,\n enter 3 in order to stop the program");
			mission = in.nextInt();
			switch(mission){
				case CREATION:
					System.out.println("enter file name");
					in.nextLine();
       				filename = in.nextLine();
       				fnwt = filename + ".html";
      				File htmlFile = new  File(fnwt);
        			if (htmlFile.createNewFile()){
    					System.out.println("html file was created");
    					BufferedWriter writer = new BufferedWriter(new FileWriter(fnwt));
    					writer.write(fileContent);
    					writer.close();
					} else {
   						 System.out.println("html file name is already existing.");
					}
					
					fnwt = filename + ".css";
      				File cssFile = new  File(fnwt);
        			if (cssFile.createNewFile()){
		
    					System.out.println("css file was created");
					} else {
   						 System.out.println("css file name is already existing.");
					}
				}
			}
    	}

        
		
}
