package database;

import persons.Member;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

public class MemberToSave {
    private ArrayList<String> memberDetails = new ArrayList<String>();
    static int memberId;


    public void saveMemberDetailsToFile(Member member) {
        saveMemberIdCounter();
        member.setMemberId(memberId);
        String[] memberDetailsArray = member.toString().split(",");
        try {
            Writer w = new FileWriter("src/disciplines/resources/members.csv", true);
            w.write("\r");
            for (int i = 0; i < memberDetailsArray.length; i++) {
                w.write(memberDetailsArray[i]);
            }
            w.close();

            System.out.println("Saved" + "💾");

        } catch (IOException e) {
            e.printStackTrace();
        }
        saveMemberIdCounter();
    }
    static void saveMemberIdCounter() {
        int number = 0;
        try {
            File file = new File("src/disciplines/resources/memberIdCounter.csv");
            Scanner numberScanner = new Scanner(file);
            while (numberScanner.hasNext()){
                memberId = numberScanner.nextInt();
            }
        } catch(Exception e) {
            System.out.println("File couldn't read");
        }
        try {
            Writer w = new FileWriter("resources/members.csv");
            w.write(Integer.toString(memberId+1));
            w.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

