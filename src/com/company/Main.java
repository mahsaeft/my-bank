package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("meghdare avvalie hesab ra vared konid:");
        int input1=input.nextInt();

        System.out.println("noe hesab ra moshakhas konid\n 1.gharzol hasane \n 2.boland modat \n 3.kootah modat");
        int acc = input.nextInt();
        }
        if(acc==1){
            Account a = new GharzolHasane(input1);
        }
        else if(acc==2){
            Account a = new BolandModat(input1);
        }
        else if(acc==3){
            Account a = new KotahModat(input1);
        }
        else{
            System.out.println("adade vared shde sahih nist!!!");
        }
        while (true){
            System.out.println("1.bardasht \n 2.variz \n 3.sood");
            int menu=input.nextInt();
            switch (menu){
                case 1:
                    System.out.println("mablaghe bardashti ra vared konid");
                    int cash1=input.nextInt();
                    try{
                        a.bardasht(cash1);
                    }
                    catch (bardashtExp){

                    }
                    break;
                case 2:
                    System.out.println("mablaghe varizi ra vared konid");
                    int cash2=input.nextInt();
                    try{
                        a.variz(cash2);
                    }
                    catch (varizExp){

                    }
                    break;
                case 3:

                    break;
            }
        }
    }
}
