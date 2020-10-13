package controller;

import model.Model;

import java.util.Random;
import java.util.Scanner;

public class ControllerMethods implements Methods{
    Scanner in=new Scanner(System.in);
    @Override
    public Model setter() {
        Model model=new Model();
        System.out.println("Hello dear player");
        System.out.println("Please enter your age");
        int age=in.nextInt();
        if (age<18){
            System.out.println("Sorry your to small for this game");
        }else{
            System.out.println("Enter your name");
            String name=in.next();
            System.out.println("Enter your surname");
            String surname=in.next();
            model.setMoney(2000);
            model.setAge(age);
            String n=name+" "+surname;
            model.setNameSurname(n);
            model.setNumers(random());
        }
        return model;
    }

    @Override
    public int[] random() {
        Random random=new Random();
        int a[]=new int[30];
        for (int i=0;i<a.length;i++){
            boolean ch=false;
            int r=random.nextInt(1000);
            for (int j=i;j>=0;j--){
                if (a[j]!=r){
                    ch=true;
                }
            }
            a[i]=r;
        }
        return a;
    }

    @Override
    public Model game(Model model) {
        System.out.println(model.toString());
        System.out.println("Enter your bit");
        int bit=in.nextInt();
        System.out.println("Enter first number from 1-1000");
        int first=in.nextInt();
        System.out.println("Enter second number from 1-1000");
        int second=in.nextInt();
        model.setFirst(first);
        model.setSecond(second);
        int[] num = model.getNumers();
        int coun=0;
            for (int j = 0; j < 30; j++) {
                System.out.print(num[j]+" ");
                coun++;
                if (coun==10){
                    System.out.println();
                    coun=0;
                }
            }

        System.out.println("");
        int count=0;
        for (int i=0;i<num.length;i++){
            if (num[i]==first || num[i]==second){
                count++;
            }
        }
        if (count==1){
            System.out.println("you win"+" "+bit*2);
            model.setMoney(model.getMoney()+bit*2);
        }else{
            if (count==2){
                System.out.println("you win"+" "+bit*4);
                model.setMoney(model.getMoney()+bit*4);
            } else {
                System.out.println("you loose"+" "+bit);
                model.setMoney(model.getMoney()-bit);
            }
        }
        System.out.println("want to play again");
        System.out.println("1)yes 2)no");
        int fd=in.nextInt();
        if (fd==1){
            game(model);
        }else{
            System.out.println("Goodbye");
            return model;
        }
        return model;
    }
}
