import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Observable;
import java.util.Observer;

public class LogHandler implements Observer {
    private PrintWriter logWriter;

    public LogHandler(String logFileName) {
        try{
            logWriter = new PrintWriter(new FileWriter(logFileName, true), true);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void update(Observable o, Object arg){
        if (arg instanceof String){
            logWriter.println((String) arg);
        }
    }

    public void close(){
        if (logWriter != null){
            logWriter.close();
        }
    }

}
