package com.company;

public class Main {

    public static void main(String[] args) {
        int i = 1;
        while (i < 101) {
            if (i % 3 == 0 && i % 5 != 0){
                System.out.println("trzy");
            }
            else if (i % 3 != 0 && i % 5 == 0){
                System.out.println("piec");
            }
            else if (i % 3 == 0 && i % 5 == 0){
                System.out.println("trzypiec");
            }
            else{
            System.out.println(i);
            }
            i++;
        }
    }
}
