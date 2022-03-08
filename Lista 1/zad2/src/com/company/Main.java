package com.company;

public class Main {

    public static void main(String[] args) {
        int i = 1;
        while (i < 101) {
            if (i % 3 == 0 && i % 5 != 0 && i % 7 != 0){
                System.out.println("trzy");
            }
            else if (i % 3 != 0 && i % 5 == 0 && i % 7 != 0){
                System.out.println("piec");
            }
            else if (i % 3 == 0 && i % 5 == 0 && i % 7 != 0){
                System.out.println("trzypiec");
            }
            else if (i % 3 != 0 && i % 5 != 0 && i % 7 == 0){
                System.out.println("siedem");
            }
            else if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0){
                System.out.println("trzypiecsiedem");
            }
            else if (i % 3 == 0 && i % 5 != 0 && i % 7 == 0){
                System.out.println("trzysiedem");
            }
            else if (i % 3 != 0 && i % 5 == 0 && i % 7 == 0){
                System.out.println("piecsiedem");
            }
            else{
                System.out.println(i);
            }
            i++;
        }
    }
}
