
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class tagContentExtractor {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();
            Pattern pattern = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher matcher = pattern.matcher(line);
            boolean match = false;
            while (matcher.find()) {
                System.out.println(matcher.group(2));
                match = true;
            };
            if (!match) System.out.println("None");
            testCases--;
        }
    }

}