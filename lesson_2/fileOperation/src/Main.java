import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder some = new StringBuilder();
        File file = new File("./new.txt");
        List<String> lines = Files.readAllLines(Paths.get("./new.txt"));
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        FileInputStream is = new FileInputStream(file);
        for (;;) {
            int code = is.read();
            if (code<0){
                break;
            }
            char ch = (char) code;
            some.append(ch);
            System.out.println(some.toString());
        }
        System.out.println(buffer.readLine());
        lines.forEach(item -> System.out.println(item) );
        ;
    }
}