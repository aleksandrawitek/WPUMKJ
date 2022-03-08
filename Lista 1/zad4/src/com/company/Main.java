package com.company;

import java.util.Arrays;

public class Main {

    public static int missingNumber(int [] tab) {
        //aktualna wielkosc
        int length = tab.length;
        //suma z ciagu arytmetycznego od a1 do an ((a1+an)*n/2)
        //gdzie a1 = 0, an = length (maksymalna wartosc)
        //n = length + 1 (wlasciwy rozmiar tablicy z brakujacym elementem)
        //0 mozna pominac, zostawione dla czytelnosci kodu
        int sum = (0 + length)*(length+1)/ 2;
        int sum_acctual = Arrays.stream(tab).sum();
        //roznica miedzy sumami to brakujacy element
        int diff = sum - sum_acctual;
        return diff;
    }
    public static void main(String[] args) {
	int[] tab = new int[]{2,4,5,3,0,6};
    System.out.println(missingNumber(tab));
    //testowo
    //int[] tab2 = new int[]{1,2,8,4,5,3,0,6};
    //System.out.println(missingNumber(tab2));

    }
}
