/**
 * OOPSBannerApp UC6 - Banner Display using Static Methods for Each Letter
 *
 * This version improves modularity by defining separate static methods
 * for each character (O, P, S). Each method is responsible for printing
 * its respective character using a String array and loop.
 *
 * The main method calls these functions sequentially.
 *
 * @author Hemang Arora
 * @version 6.0
 */
public class OOPSBannerApp{
    public static String[] getOPattern(){
        return new String[] {
            "   ***   ",
            " **   ** ",
            "**     **",
            "**     **",
            "**     **",
            " **   ** ",
            "   ***   ",
        };
    }

    public static String[] getPPattern(){
        return new String[] {
            "*******  ",
            "**     **",
            "**     **",
            "*******  ",
            "**       ",
            "**       ",
            "**       ",
        };
    }

    public static String[] getSPattern(){
        return new String[] {
            "   ******",
            " **      ",
            "**       ",
            "  *****  ",
            "       **",
            "**    ** ",
            "  *****  ",
        };
    }
    public static void main (String[] args) {
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(oPattern[i] + "  " + oPattern[i] + "  " + pPattern[i] + "  " + sPattern[i]);
        }
    }
}