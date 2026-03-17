/**
 * OOPSBannerApp UC5 - Banner Display Application using Array Initialization
 *
 * This version improves the UC4 implementation by initializing the
 * banner lines directly inside the String array declaration using
 * String.join(). This makes the code cleaner and easier to maintain.
 *
 * The banner lines are stored in an array and printed using a loop.
 *
 * @author Hemang Arora
 * @version 5.0
 */
public class OOPSBannerApp{
    public static void main (String[] args) {
        String[] banner = {
            String.join(" ", "   ***   ", "   ***   ", "*******  ", "   ******"),
            String.join(" ", " **   ** ", " **   ** ", "**     **", " **      "),
            String.join(" ", "**     **", "**     **", "**     **", "**       "),
            String.join(" ", "**     **", "**     **", "*******  ", "  *****  "),
            String.join(" ", "**     **", "**     **", "**       ", "       **"),
            String.join(" ", " **   ** ", " **   ** ", "**       ", "**    ** "),
            String.join(" ", "   ***   ", "   ***   ", "**       ", "  *****  "),
        };
        for (String line : banner) {
            System.out.println(line);
        }
    }
}