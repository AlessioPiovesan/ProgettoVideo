package it.polimi.ingsw;

import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        System.out.println("Ciao Alessio\nCosa vuoi fare?");
        System.out.println("Menu:\n1)\tCerca\n2)\tSpegni");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a == 1) search();
        else return;
    }

    private static void search ( ){
        System.out.println("Cosa cerchi?\nTitolo:");
        String b = new Scanner(System.in).nextLine();
        System.out.println(MyDatabase.getInstance().search(b));
    }
}
