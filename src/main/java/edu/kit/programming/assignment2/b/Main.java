package edu.kit.programming.assignment2.b;

import java.math.BigInteger;

/**
 * This class implements a program that calculates IBANs from user input.
 *
 * @see #main(String[])
 * @author Jana, Johnny, Christof
 * @version 1.0
 */
public class Main {

    /**
     * Entry point of the program.
     *
     * Calculates an IBAN from the provided arguments and prints it in a human readable format.
     *
     * @param args Three strings:
     *             <ol>
     *               <li>A two letter country code, e.g. "DE" or "AT"</li>
     *               <li>A bank code, i.e. a number between 10,000,000 and 99,999,999 (both inclusive)</li>
     *               <li>An account number, i.e. a number between 1 and 9,999,999,999 (both inclusive)</li>
     *             </ol>
     */
    public static void main(String[] args) {
        String countryCode = args[0];
        BigInteger bankCode = new BigInteger(args[1]);
        BigInteger accountNumber = new BigInteger(args[2]);
        String filledAccountNumber = padZeros(accountNumber);
        String partialIban = bankCode + filledAccountNumber;
        String checksum = checksum(countryCode, partialIban);
        String iban = countryCode + checksum + partialIban;
        printIban(iban);
    }

    private static void printIban(String iban) {
        for (int i = 0; i < iban.length(); i += 4) {
            int end = Math.min(i + 4, iban.length());
            String ibanPart = iban.substring(i, end);
            System.out.print(ibanPart + " ");
        }
        System.out.println();
    }

    private static String padZeros(BigInteger num) {
        String result = num.toString();
        while (result.length() < 10) {
            result = 0 + result;
        }
        return result;
    }

    private static String checksum(String countryCode, String partialIban) {
        /* Calculate the position of both country code letters in the latin alphabet and add 9 each.
           We add 10 because we start the alphabet from index zero, while the
           algorithm expects the use of a one-indexed alphabet. */
        int firstCountryNum = countryCode.charAt(0) - 'A' + 10;
        int secondCountryNum = countryCode.charAt(1) - 'A' + 10;
        String processedCountryCode = firstCountryNum + Integer.toString(secondCountryNum) + "00";
        String checksumBase = partialIban + processedCountryCode;
        BigInteger checksum = BigInteger.valueOf(98)
                .subtract(new BigInteger(checksumBase).mod(BigInteger.valueOf(97)));
        if (checksum.intValue() < 10) {
            return "0" + checksum;
        }
        return checksum.toString();
    }

}
