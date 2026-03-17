/**
 * OOPSBannerApp UC4 - Banner Display Application using String Array and Loop
 *
 * This class demonstrates an improved and more modular approach to rendering
 * the "OOPS" banner by storing all banner lines in a String array and printing
 * them using a loop. This refactors the UC3 implementation, which relied on
 * multiple individual print statements.
 *
 * By organizing the banner lines into an array and iterating through it using
 * a loop, the code becomes more maintainable, readable, and reusable. This
 * approach eliminates repetition and centralizes banner data while preserving
 * the same visual output as earlier use cases.
 *
 * This use case highlights the use of arrays and loop constructs to improve
 * code structure without changing the external behavior of the application.
 *
 * @author Hemang Arora
 * @version 4.0
 */
public class OOPSBannerApp{
    public static void main (String[] args) {
        String[] banner = new String[7];
        banner[0] = String.join(" ", "   ***   ", "   ***   ", "*******  ", "   ******");
        banner[1] = String.join(" ", " **   ** ", " **   ** ", "**     **", " **      ");
        banner[2] = String.join(" ", "**     **", "**     **", "**     **", "**       ");
        banner[3] = String.join(" ", "**     **", "**     **", "*******  ", "  *****  ");
        banner[4] = String.join(" ", "**     **", "**     **", "**       ", "       **");
        banner[5] = String.join(" ", " **   ** ", " **   ** ", "**       ", "**    ** ");
        banner[6] = String.join(" ", "   ***   ", "   ***   ", "**       ", "  *****  ");
        for (String line : banner) {
            System.out.println(line);
        }
    }
}