package com.exercise.jframe.frame.calculator;

import java.math.BigDecimal;

public class Calculator {

    private String result = "0";
    private BigDecimal a;
    private BigDecimal b;
    private String option;
    private static final String CONST_OPTION_PATTERN = "/*-+";

    public Calculator() {

    }

    public Calculator(BigDecimal b, String option) {
        super();
        this.b = b;
        this.option = option;
    }

    public Calculator(BigDecimal a, BigDecimal b, String option) {
        super();
        this.a = a;
        this.b = b;
        this.option = option;
    }

    public String calcMathOperation(BigDecimal a, BigDecimal b, String option) {

        switch (option) {
            case "/":
                return result = a.divide(b).toString();
            case "*":
                return result = a.multiply(b).toString();
            case "-":
                return result = a.subtract(b).toString();
            case "+":
                return result = a.add(b).toString();

            default:
                break;
        }
        return result;
    }

    public BigDecimal getAValue(String textArea) {

        int textAreaLength = textArea.length();
        int optionPatternLength = CONST_OPTION_PATTERN.length();
        char[] textAreaPerChar = new char[textAreaLength];
        char[] optionPatternPerChar = new char[optionPatternLength];

        for (int i = 0; i < textAreaLength; i++) {
            textAreaPerChar[i] = textArea.charAt(i);
        }

        for (int j = 0; j < optionPatternLength; j++) {
            optionPatternPerChar[j] = CONST_OPTION_PATTERN.charAt(j);
        }

        for (int j = 1; j < textAreaLength; j++) {
            for (int k = 0; k <= 3; k++) {
                if (textAreaPerChar[j] == optionPatternPerChar[k]) {
                    double aDouble = Double.valueOf(textArea.substring(0, j));
                    BigDecimal a = BigDecimal.valueOf(aDouble);
                    return a;
                }
            }
        }

        return a;
    }

     public BigDecimal getBValue(String textArea) {
    
         int textAreaLength = textArea.length();
         int optionPatternLength = CONST_OPTION_PATTERN.length();
         char[] textAreaPerChar = new char[textAreaLength];
         char[] optionPatternPerChar = new char[optionPatternLength];

         for (int i = 0; i < textAreaLength; i++) {
             textAreaPerChar[i] = textArea.charAt(i);
         }

         for (int j = 0; j < optionPatternLength; j++) {
             optionPatternPerChar[j] = CONST_OPTION_PATTERN.charAt(j);
         }

         for (int j = 1; j < textAreaLength; j++) {
             for (int k = 0; k <= 3; k++) {
                 if (textAreaPerChar[j] == optionPatternPerChar[k]) {
                     double bDouble = Double.valueOf(textArea.substring(j+1, textAreaLength));
                     BigDecimal b = BigDecimal.valueOf(bDouble);
                     return b;
                 }
             }
         }

         return b;
     }

    public String getOptionValue(String textArea) {

        int textAreaLength = textArea.length();
        int optionPatternLength = CONST_OPTION_PATTERN.length();
        char[] textAreaPerChar = new char[textAreaLength];
        char[] optionPatternPerChar = new char[optionPatternLength];

        for (int i = 0; i < textAreaLength; i++) {
            textAreaPerChar[i] = textArea.charAt(i);
        }

        for (int j = 0; j < optionPatternLength; j++) {
            optionPatternPerChar[j] = CONST_OPTION_PATTERN.charAt(j);
        }

        for (int j = 1; j < textAreaLength; j++) {
            for (int k = 0; k <= 3; k++) {
                if (textAreaPerChar[j] == optionPatternPerChar[k]) {
                    return option = String.valueOf(textAreaPerChar[j]);
                }
            }
        }

        return null;
    }

}