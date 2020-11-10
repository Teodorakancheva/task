package com.company;

import java.io.BufferedReader;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter string: ");
        String text = scanner.nextLine();
        boolean result = isValidExpression(text);
        if(result){
            System.out.printf("Sorry this is invalid string  result is : %b",result);
        }else{
            System.out.printf("This is valid string  result is : %b",result);
        }

    }

    private static boolean isValidExpression(String text) {
        boolean result;
        char letter;
        int countA = 0;
        int countB = 0;
        int countC = 0;

        if (text.length() % 2 == 1) {
            result = false;

        } else if (text.charAt(0) != 'A' && text.charAt(0) != 'B' && text.charAt(0) != 'C') {
            result = false;

        } else {
            for (int i = 0; i < text.length(); i++) {
                letter = text.charAt(i);

                switch (letter) {
                    case 'A': countA++ ; break;

                    case 'a': countA-- ; break;

                    case 'B': countB++ ; break;

                    case 'b': countB-- ; break;

                    case 'C': countC++ ; break;

                    case 'c': countC-- ; break;

                }

                if (countA < 0 || countB < 0 || countC < 0) {
                    result = false;
                    break;

                }
            }
            if (countA == 0 && countB == 0 && countC == 0) {
                result = true;

            } else {
                result = false;

            }

        }
        return  result;
        }

   }




