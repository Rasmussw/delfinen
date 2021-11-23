package controller;

import UI.Menu;
import database.LoadMemberMissingPayment;
import database.MemberToSave;
import database.ReadAllMembers;
import database.ReadFiles;
import factory.MemberGenerator;
import persons.Cashier;
import persons.EliteSwimmer;
import persons.Member;

import java.util.ArrayList;
import java.util.Collection;

public class SystemController {
    static MemberToSave memberToSave = new MemberToSave();
    private Menu menu = new Menu();
    private MemberGenerator member = new MemberGenerator();
    private EliteSwimmer eliteSwimmer = new EliteSwimmer();
    private Cashier cashier = new Cashier();


    public void chooseOptions(){
        int userInput;

        menu.welcome();

        do {

            menu.chooseUser();
            userInput = menu.getUserInput();

            switch (userInput){
                case 1:
                    menu.optionsForChairman();
                    int chairmanChoice = menu.getUserInput();
                    if (chairmanChoice == 1){
                        //create member
                        memberToSave.saveMemberDetailsToFile(member.MemberGenerator());
                    }else if (chairmanChoice == 2){
                        //show members
                        new ReadFiles("resources/members.csv");

                    }else if (chairmanChoice == 9){             //go back option

                    }
                    break;

                case 2:
                    menu.optionsForCashier();
                    int cashierChoice = menu.getUserInput();
                    if (cashierChoice == 1){
                        //Show contingent prices
                        cashier.showContingentPrices();
                    }else if (cashierChoice == 2){
                        //show expected payments
                        cashier.getExpectedContigentRevenue();
                    }else if (cashierChoice == 3){
                        //show members in arrears
                        cashier.getMembersWhoHasntPayed();
                    } else if (cashierChoice == 4){
                        //change member payment status
                        cashier.getMembersWhoHasntPayed();
                        cashier.setMembersWhoHasntPayed();

                    } else if (cashierChoice ==9){

                    }
                    break;

                case 3:
                    menu.optionsForCoach();
                    int coachChoice = menu.getUserInput();
                    if (coachChoice == 1){
                        //Show top 5 elite swimmers
                    }else if (coachChoice == 2){
                        //Show elite swimmers

                        eliteSwimmer.showEliteSwimmers();

                        //til at få



                    }else if (coachChoice == 3){
                        //create result
                    }else if (coachChoice == 9){
                        //return
                    }
                    break;
            }
        } while (userInput != 9);
    }

    public static void main(String[] args) {
        SystemController hej = new SystemController();
        hej.chooseOptions();
    }
}