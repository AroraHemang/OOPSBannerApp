/**
 * OOPSBannerApp UC3 - Banner Display Application using String.join()
 *
 * This class demonstrates an improved and memory-efficient approach to rendering
 * the "OOPS" banner by refactoring the string concatenation logic used in UC2.
 * Instead of using the '+' operator to combine multiple string segments, this
 * version utilizes the String.join() method to construct each line of the banner.
 *
 * The String.join() method reduces the creation of intermediate String objects,
 * thereby improving memory efficiency and performance while maintaining the
 * same visual output as the previous use case.
 *
 * This use case focuses on code refactoring, readability, and efficient string
 * handling without altering the external behavior of the application.
 *
 * @author Hemang Arora
 * @version 3.0
 */
public class OOPSBannerApp{
    public static void main (String[] args) {
        System.out.println(String.join(" ", "   ***   ", "   ***   ", "*******  ", "   ******"));
        System.out.println(String.join(" ", " **   ** ", " **   ** ", "**     **", " **      "));
        System.out.println(String.join(" ", "**     **", "**     **", "**     **", "**       "));
        System.out.println(String.join(" ", "**     **", "**     **", "*******  ", "  *****  "));
        System.out.println(String.join(" ", "**     **", "**     **", "**       ", "       **"));
        System.out.println(String.join(" ", " **   ** ", " **   ** ", "**       ", "**    ** "));
        System.out.println(String.join(" ", "   ***   ", "   ***   ", "**       ", "  *****  "));
    }
}