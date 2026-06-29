package appender;
import java.io.FileWriter;
import java.io.IOException;

public class FileAppender implements LogAppender {
    
    private final String filename;

    public FileAppender(String filename){
        this.filename=filename;
    }

    public void append(String FormattedMessage){
          
        try(FileWriter writer=new FileWriter(filename,true)){

          writer.write(FormattedMessage);
          writer.write(System.lineSeparator());

        }catch(IOException e){
            System.out.println("failed to append to file");
        }
    }
}
