package com.company;

public class Main {

    public static void main(String[] args) {
        int i = 1;
        while (i < 101) {
            if (i % 3 == 0 && i % 5 != 0 && i % 7 != 0 && i % 11 != 0 && i % 13 != 0){
                System.out.println("trzy");
            }
            else if (i % 3 != 0 && i % 5 == 0 && i % 7 != 0 && i % 11 != 0 && i % 13 != 0){
                System.out.println("piec");
            }
            else if (i % 3 != 0 && i % 5 != 0 && i % 7 == 0 && i % 11 != 0 && i % 13 != 0){
                System.out.println("siedem");
            }
            else if (i % 3 != 0 && i % 5 != 0 && i % 7 != 0 && i % 11 == 0 && i % 13 != 0){
                System.out.println("jedenascie");
            }
            else if (i % 3 != 0 && i % 5 != 0 && i % 7 != 0 && i % 11 != 0 && i % 13 == 0){
                System.out.println("trzynascie");
            }
            else if (i % 3 == 0 && i % 5 == 0 && i % 7 != 0 && i % 11 != 0 && i % 13 != 0){
                System.out.println("trzypiec");
            }
            else if (i % 3 == 0 && i % 5 != 0 && i % 7 == 0 && i % 11 != 0 && i % 13 != 0){
                System.out.println("trzysiedem");
            }
            else if (i % 3 == 0 && i % 5 != 0 && i % 7 != 0 && i % 11 == 0 && i % 13 != 0){
                System.out.println("trzyjedenascie");
            }
            else if (i % 3 == 0 && i % 5 != 0 && i % 7 != 0 && i % 11 != 0 && i % 13 == 0){
                System.out.println("trzytrzynascie");
            }
            else if (i % 3 != 0 && i % 5 == 0 && i % 7 == 0 && i % 11 != 0 && i % 13 != 0){
                System.out.println("piecsiedem");
            }
            else if (i % 3 != 0 && i % 5 == 0 && i % 7 != 0 && i % 11 == 0 && i % 13 != 0){
                System.out.println("piecjedenascie");
            }
            else if (i % 3 != 0 && i % 5 == 0 && i % 7 != 0 && i % 11 != 0 && i % 13 == 0){
                System.out.println("piectrzynascie");
            }
            else if (i % 3 != 0 && i % 5 != 0 && i % 7 == 0 && i % 11 == 0 && i % 13 != 0){
                System.out.println("siedemjedenascie");
            }
            else if (i % 3 != 0 && i % 5 != 0 && i % 7 == 0 && i % 11 != 0 && i % 13 == 0){
                System.out.println("siedemtrzynascie");
            }
            else if (i % 3 != 0 && i % 5 != 0 && i % 7 != 0 && i % 11 == 0 && i % 13 == 0){
                System.out.println("jedenascietrzynascie");
            }
            else if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0 && i % 11 != 0 && i % 13 != 0){
                System.out.println("trzypiecsiedem");
            }
            else if (i % 3 == 0 && i % 5 == 0 && i % 7 != 0 && i % 11 == 0 && i % 13 != 0){
                System.out.println("trzypiecjedenascie");
            }
            else if (i % 3 == 0 && i % 5 == 0 && i % 7 != 0 && i % 11 != 0 && i % 13 == 0){
                System.out.println("trzypiectrzynascie");
            }
            else if (i % 3 != 0 && i % 5 == 0 && i % 7 == 0 && i % 11 == 0 && i % 13 != 0){
                System.out.println("piecsiedemjedenascie");
            }
            else if (i % 3 != 0 && i % 5 == 0 && i % 7 == 0 && i % 11 != 0 && i % 13 == 0){
                System.out.println("piecsiedemtrzynascie");
            }
            else if (i % 3 != 0 && i % 5 != 0 && i % 7 == 0 && i % 11 == 0 && i % 13 == 0){
                System.out.println("siedemjedenascietrzynascie");
            }
            else if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0 && i % 11 == 0 && i % 13 != 0){
                System.out.println("trzypiecsiedemjedenascie");
            }
            else if (i % 3 != 0 && i % 5 == 0 && i % 7 == 0 && i % 11 == 0 && i % 13 == 0){
                System.out.println("piecsiedemjedenascietrzynascie");
            }
            else if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0 && i % 11 == 0 && i % 13 == 0){
                System.out.println("trzypiecsiedemjedenascietrzynascie");
            }

            else{
                System.out.println(i);
            }
            i++;
        }
    }
}
