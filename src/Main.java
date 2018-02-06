public class Main {

    public static void main(String[] args) {
        String hamlet = "http://erdani.com/tdpl/hamlet.txt";
        System.out.println(WebScraper.urlToString(hamlet));
        System.out.println("Number of lines: " + WebScraper.lineCount(hamlet));
        System.out.println("Number of words: " + WebScraper.wordCount(hamlet));
    }
}
