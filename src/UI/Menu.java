package UI;

import persons.Member;

import java.util.Scanner;

public class Menu {
    private Scanner userInput;

    public Menu(){
        this.userInput = new Scanner(System.in);
    }

    public void welcome(){
        System.out.println("------------------------------");
        System.out.println();
        System.out.println("Welcome to swim club The Dolphin!");
        System.out.println();
        System.out.println("------------------------------");
    }

    public void chooseUser(){
        System.out.println("1. Chairman");
        System.out.println("2. Cashier");
        System.out.println("3. Coach");
    }

    public void optionsForChairman() {
        System.out.println("1. Create member");
        System.out.println("2. Show members");
    }

    public void optionsForCashier(){
        System.out.println("1. Show expected payments");
        System.out.println("2. Show members in arrears"); //restance = er i gæld til svømmeklubben
    }

    public void optionsForCoach(){
        System.out.println("1. Show top 5 elite swimmers"); //juniors + seniors
        System.out.println("2. Show elite swimmers");
        System.out.println("3. Create a result");
    }

}
