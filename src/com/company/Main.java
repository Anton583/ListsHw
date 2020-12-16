package com.company;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        }


        static void hw4(){
        LinkedList<Integer> integers = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("write integers and press 'x' when finished:");
        while (input.hasNextInt()){
            int nextInt = input.nextInt();
            if (integers.contains(nextInt))
                integers.addFirst(integers.remove(integers.indexOf(nextInt)));
                else integers.addFirst(nextInt);
        }
            System.out.println(integers);
        }

        static void hw3 (){
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

