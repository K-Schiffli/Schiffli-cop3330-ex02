/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Kevin Schiffli
 */
package Base;

import java.util.Scanner;
public class App {
        static Scanner in = new Scanner(System.in);

        public static void main( String[] args )
        {
            String word = getWord();
            int letterCount = countLetters(word);
            printLength(letterCount, word);
        }
        public static String getWord()
        {
            System.out.println( "Please enter your word:" );
            return in.nextLine();
        }

        public static int countLetters(String word)
        {
            return word.length();
        }

        public static void printLength(int letterCount, String word)
        {
            System.out.printf( "%s has %d letters", word, letterCount );
        }
    }
