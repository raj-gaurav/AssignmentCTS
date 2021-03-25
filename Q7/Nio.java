import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Nio {

	public static void main(String[] args) {
		Path path = Paths.get("C:\\Users\\rajga\\Desktop\\Assignment-Mentor\\Q5\\Answer.txt");
	      Charset charset = Charset.forName("ISO-8859-1");
	      try {
	         List<String> list = Files.readAllLines(path, charset);
	         for (String l : list) {
	            System.out.println(l);
	         }
	      } 
	      catch (IOException e) {
	         System.out.println(e);
	      }

	}

}
