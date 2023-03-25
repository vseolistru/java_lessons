import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;


import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String htmlFile = parseFile("./data/PersonalPortfolio.html");
        Document htmlDoc = Jsoup.parse(htmlFile);
        Elements elms = htmlDoc.select("div.portfolio__announce");
        System.out.println(elms);
    }

    public static String parseFile (String path) {
        StringBuilder builder = new StringBuilder();
        try {
            List<String> lines = Files.readAllLines(Paths.get(path));
            lines.forEach(item -> builder.append(item+"\n"));
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return builder.toString();
    }
}