import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class WebScraper {
    public static void main(String[] unused) {
        //System.out.println("Ran");
    }
    /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     */

    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }
    public static int lineCount(final String url) {
        int count = 0;
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return 0;
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        String[] lines = contents.split("\n");
        for (int i = 0; i<lines.length; i++) {
            count++;
        }
        urlScanner.close();
        return count;
    }

    public static int wordCount(final String url) {
        int words = 0;
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return 0;
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        for (int a = 0; a<contents.length(); a++) {
            if (contents.charAt(a) == ' ' && contents.charAt(a + 1) == ' ') {
                continue;
            }
            if (contents.charAt(a) == ' ') {
                words ++;
            }
        }
        urlScanner.close();
        return words;
    }
}
