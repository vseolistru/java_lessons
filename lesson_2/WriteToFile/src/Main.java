
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        try {

            PrintWriter writer = new PrintWriter("./someOutput.txt");
            writer.write("Hello someOne");
            writer.flush();
            writer.close();
        }
        catch ( FileNotFoundException e){
            System.out.println(e.getMessage());
        }


    }
}