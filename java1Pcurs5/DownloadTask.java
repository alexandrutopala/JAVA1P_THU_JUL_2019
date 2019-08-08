import java.util.concurrent.*;
import java.net.*;
import java.nio.file.*;
import java.io.*;

public class DownloadTask implements Callable<String> {
    public String call() throws Exception {
        
        
        URL url = new URL("https://www.cs.cmu.edu/afs/cs.cmu.edu/user/gchen/www/download/java/LearnJava.pdf");
        
        InputStream src = url.openStream();
        Path dest = Paths.get("./file.pdf");
        
        Files.copy(src, dest, 
            StandardCopyOption.REPLACE_EXISTING);
        
        return "Done";    
    }
}

