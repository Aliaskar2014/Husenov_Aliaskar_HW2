package com.company;

public class Main {

    public static void main(String[] args) {

        num(giveRandomNum(), 26);
        num(giveRandomNum(), 25);
        num(giveRandomNum(), 18);
        num(giveRandomNum(), 21);
        num(giveRandomNum(), -14);

    }
    public static int num(int age, int temperature){
        if (age > 19 && age < 45 && temperature > -20 && temperature < 30){
            System.out.println("Can go out");
        } else if (age < 20 && temperature > 0 && temperature < 28) {
            System.out.println("Can go out");
        } else if (age > 45 && temperature > -10 && temperature < 25) {
            System.out.println("Can go out");
        } else{
            System.out.println("Stay at home");
        }
        return 0;
    }

    public static int giveRandomNum(){
        int randomNum = (int) (Math.random() * 85);

        return randomNum;
    }
}
