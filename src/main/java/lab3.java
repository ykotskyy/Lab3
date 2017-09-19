import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class lab3{

    /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     */

    public static void main(String[] args) {
      String strl = urlToString("http://erdani.com/tdpl/hamlet.txt");
      String[] wordArray = strl.trim().split("\\s+");
      int count = wordArray.length;
      System.out.println("Word count is = " + count);
      int prince = 0;
      for(int counter= 0; counter < count; counter++)
      {
        if(wordArray[counter].compareToIgnoreCase("prince")>0) {
           prince++;
        }
      }
      System.out.print(prince);
    }
    /*
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
       // System.out.println("http://erdani.com/tdpl/hamlet.txt");
        return contents;

    }

}
