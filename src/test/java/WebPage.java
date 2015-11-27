import java.util.ArrayList;
import java.util.Arrays;

public class WebPage {

    private String link;

    public WebPage(String link) {
        this.link = link;
    }

    public String getUrl(){
        return link;
    }

    private static ArrayList<Character> special = new ArrayList<Character>(Arrays.asList('/', '(', ')', ' ', '.', ':'));

    public String getFileName() {
        String outputText = "";
        for (int i = 0; i < this.link.length(); i++) {
            Character c = this.link.charAt(i);
            if (!special.contains(c))
                outputText += c;
            else
                outputText += "_";
        }
        System.out.println(outputText);
        return outputText;
    }
}
