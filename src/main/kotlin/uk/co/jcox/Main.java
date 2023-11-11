package uk.co.jcox;


public class Main {

    // Vigenere Cipher decryptor.
    //Very temperamental

    static String ciphered = "CIPHER HERE";
    static int[] key = {
            0, 0, 0, 0
    };


    public static int decrpyt(int number, int stage) {
        int i =  stage % key.length;
        return number - key[i];
    }


    public static int modulo26(int index) {


        if (index < 0) {
            int size = Math.abs(index);
            return modulo26(26 - size);
        }

        return index % 26;
    }

    public static void main(String[] args) {

        for (int i = 0; i < ciphered.length(); i++) {

            char current = ciphered.charAt(i);
            int numericalRep = current - 'a';

            int decipheredNumericalRep = decrpyt(numericalRep, i);
            int mod = modulo26(decipheredNumericalRep);

            char newChar = (char) ((char) mod + 'a');
            System.out.println(newChar);
        }
    }
}
