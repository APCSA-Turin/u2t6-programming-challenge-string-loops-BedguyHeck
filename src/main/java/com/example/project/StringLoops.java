package com.example.project;

public class StringLoops {

    public StringLoops() { }

    // WARM UP
    public String removeA(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'a') result.append(str.charAt(i));
        }
        return result.toString();
    }

    public String removeA2(String str) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            if (str.charAt(i) != 'a') result.append(str.charAt(i));
            i++;
        }
        return result.toString();
    }

    public String reverseString(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) result.append(str.charAt(i));
        return result.toString();
    }

    public String reverseString2(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) result.insert(0, str.charAt(i));
        return result.toString();
    }

    public String replaceCharacterV1(String searchChar, String origStr, String replaceChar){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < origStr.length(); i++) {
            if (origStr.substring(i,i+1).equals(searchChar)) result.append(replaceChar);
            else result.append(origStr.charAt(i));
        }
        return result.toString();
    }

    public String replaceCharacterV2(String searchChar, String origStr, String replaceChar) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < origStr.length()) {
            if (origStr.substring(i,i+1).equals(searchChar)) result.append(replaceChar);
            else result.append(origStr.charAt(i));
            i++;
        }
        return result.toString();
    }

    public int countString(String searchString, String origString) {
        if (searchString.isEmpty()) return 0;
        int count = 0;
        for (int i = 0; i <= origString.length() - searchString.length(); i++) {
            if (origString.substring(i, i + searchString.length()).equals(searchString)) count++;
        }
        return count;
    }

    public String removeString(String searchString, String origString) {
        if (searchString.isEmpty()) return origString;
        String result = origString;
        while (result.contains(searchString)) result = result.replace(searchString, "");
        return result;
    }

    // Print numbers separated by commas, supports ascending and descending ranges
    public void commaSeparated(int fromNum, int toNum) {
        if (fromNum <= toNum) {
            for (int i = fromNum; i <= toNum; i++) {
                System.out.print(i);
                if (i < toNum) System.out.print(", ");
            }
        } else {
            for (int i = fromNum; i >= toNum; i--) {
                System.out.print(i);
                if (i > toNum) System.out.print(", ");
            }
        }
        System.out.print("\n");
    }

    public boolean isPalindrome(String myString) {
        String cleaned = myString.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return cleaned.equals(reverseString(cleaned));
    }

    // Print the string multiple times in [item item ...] format
    public void multiPrint(String toPrint, int num) {
        System.out.print("[");
        for (int i = 0; i < num; i++) {
            System.out.print(toPrint);
            if (i < num - 1) System.out.print(" ");
        }
        System.out.print("]\n");
    }
}
