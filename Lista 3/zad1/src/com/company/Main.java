package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static javafx.application.Platform.exit;

public class Main {

    public static void main(String[] args) {


        // zaladowanie slownika

        System.out.println("Ładuję słownik...");

        List<String> words = new ArrayList<>();

        File myObj = new File("dictionary/slowa.txt");
        Scanner myReader = null;
        try
        {
            myReader = new Scanner(myObj);
        } catch (FileNotFoundException ex)
        {
            System.out.println("Error! Błąd importu slownika");
            ex.printStackTrace();
        }
        while (myReader.hasNextLine())
        {
            String data = myReader.nextLine();
            words.add(data);
        }
        myReader.close();
        System.out.println("Załadowano!");

        // randomowy numer w zakresie words wg wzoru int b = (int)(Math.random()*(max-min+1)+min); min = 0
        int x = (int)(Math.random()*(words.size()));

        //wybor slowa
        String current = words.get(x);
        int curr_len = current.length();
        System.out.println("Wylosowano słowo o długości " + curr_len);
        // ______ (dlugosc hasla) pomocniczo
        String helpful = "";
        for (int i = 0; i < curr_len; i++)
        {
            helpful += "_";
        }
        // string builder zeby potem zmieniac pojedyncze litery

        StringBuilder str = new StringBuilder(helpful);
        // poczatkowe zycia i string ___ z dlugoscia hasla
        int lives = 7;
        int guessed = 0;
        String used = "";


        while (lives <= 7 && lives > 0 && guessed != curr_len)
        {
            hangman(lives);
            print(str, lives, used);
            String letter = getinput();
            // kiedy niepoprawna
            if(current.indexOf(letter) == -1)
            {
                used += letter + " ";
                lives -= 1;
            }
            else
            {
                used += letter + " ";
                // w przypadku gdy litera wystepuje wiecej niz raz
                for (int i = 0; i < curr_len; i++)
                {
                    char check = current.charAt(i);
                    if (check == letter.charAt(0))
                    {
                        str.setCharAt(i, check);
                        guessed += 1;
                    }
                }
            }
        }
        if (lives == 0)
        {
            hangman(lives);
            System.out.println("Hasło: " + current);
            exit();
        }
        if (guessed == curr_len)
        {
            System.out.println("Gratulacje, wygrana!");
            System.out.println("Twoje hasło to: " + current);
            exit();
        }


    }

    // funkcja do rysowania wisielca

    private static void hangman(int n) {
        if (n==7)
        {
            System.out.println(" +___+");
            System.out.println("     |");
            System.out.println("     |");
            System.out.println("     |");
            System.out.println("    ===");
        }
        if (n==6)
        {
            System.out.println(" +___+");
            System.out.println(" 0   |");
            System.out.println("     |");
            System.out.println("     |");
            System.out.println("    ===");
        }
        if (n==5)
        {
            System.out.println(" +___+");
            System.out.println(" 0   |");
            System.out.println(" |   |");
            System.out.println("     |");
            System.out.println("    ===");
        }
        if (n==4)
        {
            System.out.println(" +___+");
            System.out.println(" 0   |");
            System.out.println("/|   |");
            System.out.println("     |");
            System.out.println("    ===");
        }
        if (n==3)
        {
            System.out.println(" +___+");
            System.out.println(" 0   |");
            System.out.println("/|\\  |");
            System.out.println("     |");
            System.out.println("    ===");
        }
        if (n==2)
        {
            System.out.println(" +___+");
            System.out.println(" 0   |");
            System.out.println("/|\\  |");
            System.out.println("/    |");
            System.out.println("    ===");
        }
        if (n==1)
        {
            System.out.println(" +___+");
            System.out.println(" 0   |");
            System.out.println("/|\\  |");
            System.out.println("/ \\  |");
            System.out.println("    ===");
        }
        if (n==0)
        {
            System.out.println("PRZEGRANA!");
        }

    }
    private static void print(StringBuilder str, int lives, String used)
    {
        System.out.println("Hasło: " + str);
        System.out.println("Życia: " + lives);
        System.out.println("Wykorzystane litery: " + used);
    }
    private static String getinput()
    {
        // input od uzytkownika
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj literę: ");
        String usrinput = input.nextLine();
        if (usrinput.length()!=1)
        {
            System.out.println("Niepoprawna litera");
            getinput();
        }
        char letter2 = usrinput.charAt(0);
        String letter = Character.toString(letter2).toLowerCase();
        return letter;
    }
}
