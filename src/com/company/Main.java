package com.company;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> wordsList = new LinkedList<>();
        String word;
       Scanner input = new Scanner(System.in);
            System.out.println("write some words and press '!': ");
            while (!(word = input.next()).equals("!")) {
                wordsList.add(word);
            }
                while (!(word = input.next()).equals("!") && !wordsList.isEmpty()){
                    for (int i = 0; i<wordsList.size(); i++) {
                        if (wordsList.get(i).equals(word)) {
                            System.out.println("hit");
                            wordsList.remove(i);
                        }
                    }
            }
        }
    }

