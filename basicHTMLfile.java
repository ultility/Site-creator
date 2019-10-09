import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.StringWriter;
import javax.swing.JOptionPane;

public class basicHtmlFile{
	private String filename;
	private String fileContent;
	private String fnwt;

	public void setSiteName(){
		this.filename = JOptionPane.showInputDialog(null, "enter file name");
	}

	public String getSiteName(){
		return filename;
	}

	public void createHtmlFile(String filename)throws IOException{
     	StringWriter sw =null;
    	BufferedWriter bw = null;
		this.fileContent = String.format("<!DOCTYPE html>\n<html>\n\t<head>\n\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"%s.css\">\n\t\t<title></title>\n\t</head>\n\t<body>\n\n\t</body>\n</html>", filename);
		this.fnwt = filename + ".html";
        File file = new File(fnwt);
        if (file.createNewFile()){                                                          
            JOptionPane.showMessageDialog(null, "html file was created");
            BufferedWriter writer = new BufferedWriter(new FileWriter(fnwt));
            writer.write(fileContent);
            writer.close();
        } else {
            JOptionPane.showMessageDialog(null, "html file name is already existing.");
        }
	}

	public void createCssFile(String filename)throws IOException{
		this.fnwt = filename + ".css";
		fnwt = filename + ".css";
        File file = new File(fnwt);
        if (file.createNewFile()){
            JOptionPane.showMessageDialog(null, "css file was created");
        } else {
            JOptionPane.showMessageDialog(null, "css file name is already existing.");
        }
	}
}