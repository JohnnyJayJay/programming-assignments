package edu.kit.programming.assignment2.c;

/**
 * A program that allows users to perform a set of operations on magic squares
 * and related properties, such as validating and analysing magic squares or computing
 * magic numbers.
 *
 * @author Johnny
 * @version 1.0
 * @see <a href="https://mathworld.wolfram.com/MagicSquare.html">Magic Squares</a>
 */
public class Main {

    /**
     * The entry point of the program.
     *
     * @param args 2 positional command line arguments, one representing the
     *             command to run and the other providing an
     *             additional argument to that command.
     */
    public static void main(String[] args) {
        String command = args[0];
        String arg = args[1];
        switch (command) {
            case "showMagicNumbers":
                int n = Integer.parseInt(arg);
                System.out.println(MagicSquare.showMagicNumbers(n));
                break;
            case "isMagicSquare?":
                MagicSquare square = MagicSquare.parse(arg);
                String output = "not magical";
                if (square.isMagicSquare()) {
                    output = "magic square";
                } else if (square.isSemimagicSquare()) {
                    output = "semimagic square";
                }
                System.out.println(output);
                break;
            case "complement":
                MagicSquare complement = MagicSquare.parse(arg).complement();
                System.out.println(complement);
                break;
            default:
                System.err.println("Invalid command");
                System.exit(1);
                break;
        }
    }

}
