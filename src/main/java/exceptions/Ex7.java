package exceptions;

import java.io.IOException;

public class Ex7 {
}
class Miller { String contents; }
class TGIF {
    public static void main(String[] args) {
        try { enjoyQuietEvening(); }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        catch (RuntimeException rte) {
            System.out.println(rte.getMessage());
        }
    }
    static void enjoyQuietEvening() throws IOException {
        Miller[] sixPack = new Miller[6];
        for (Miller coldOne : sixPack)
            if (coldOne.contents == null)
                throw new IOException("WHAT?! No more beer?");
            else drink(coldOne);
    }
    static void drink(Miller mmm) {
        throw new RuntimeException("Excellent!");
    }
}
    /**What is the result?
        A. WHAT?! No more beer?
        B. Excellent!
        C. null
        D. Total bliss and serenity of being*/
