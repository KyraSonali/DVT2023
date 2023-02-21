/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

/**
 *
 * @author Kyra Balliram
 */
public class BankingValidator {

    //general checks
    //checks if data is there
    public boolean PresenceCheck(String str) {
        boolean check = true;
        if (str.isBlank()) {
            check = false;
        }
        return check;
    }

    //checks if values are numbers
    public boolean checkForDigits(String str) {
        boolean check = true;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                check = false;
            }
        }
        return check;
    }

    //for visa card first digit needs to be 4
    public boolean checkFirstDigit(String cardNum) {
        boolean check = false;
        char firstDigit = cardNum.charAt(0);
        if (firstDigit == '4') {
            check = true;
        }
        return check;
    }

    //check if visa card has 16 digits:
    public boolean checkCardLength(String cardNum) {
        boolean check = true;
        if (cardNum.length() != 17) {
            check = false;
        }
        return check;
    }

    //checks if visa card contains numbers in range of 2-6 in the seventh to 12th pos
    public boolean checkRange(String cardNum) {
        int start = 7;
        int end = 12;
        boolean check = true;
        char[] digitArr = cardNum.toCharArray();

        for (int i = digitArr[start]; i < digitArr[end]; i++) {
            char currentCh = cardNum.charAt(i);
            if (currentCh < '2' || currentCh > '6') {
                check = false;
            }
        }

        return check;
    }

    //cvv can either be 3 or 4 digits
    public boolean checkCVV(String cvvNum) {
        boolean check = true;
        if (cvvNum.length() != 3 || cvvNum.length() != 4) {
            check = false;
        }
        return check;
    }

    //check if it is only characters:
    public boolean checkString(String str) {
        boolean check = true;
        char currentCh = 'a';

        for (int i = 0; i < str.length(); i++) {
            currentCh = str.charAt(i);

            if (!Character.isLetter(currentCh)) {
                check = false;
            }
        }
        return check;
    }

}
