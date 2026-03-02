public class OOPSBannerApp {

    // Main method to run the banner display
    public static void main(String[] args) {

        // Define String Array variable to hold the OOPS banner lines
        // Each line represents a row in the banner for the letters O, O, P, S
        String[] lines = {
            " *****    *****    *****    ***** ",
            "*     *  *     *  *     *  *      ",
            "*     *  *     *   *****    ***** ",
            "*     *  *     *  *              *",
            " *****    *****   *        ***** "
        };

        // Use a loop to print each line of the banner
        for (String line : lines) {
            System.out.println(line);
        }
    }
}