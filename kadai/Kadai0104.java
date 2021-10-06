package kadai;

import java.util.Scanner;

public class Kadai0104{
    public static void main(String[] args){
        Scanner stdIO = new Scanner(System.in);
        Bonus bonus = new Bonus();

        System.out.print("Number --> ");
        String number = stdIO.next();
        bonus.setNumber(number);

        System.out.print("Pay --> ");
        int pay = stdIO.nextInt();
        bonus.setPay(pay);

        System.out.print("Rank --> ");
        int rank = stdIO.nextInt();
        bonus.setRank(rank);

        System.out.print("PaiedLeave --> ");
        int paiedLeave = stdIO.nextInt();
        bonus.setPaiedLeave(paiedLeave);

        System.out.print("Absence --> ");
        int absence = stdIO.nextInt();
        bonus.setAbsence(absence);
        
        System.out.println();
        System.out.println("Number : " + bonus.getNumber());
        System.out.println("Pay : " + bonus.getPay());
        System.out.println("Rank : " + bonus.getRank());
        System.out.println("PaiedLeave : " + bonus.getPaidedLeave());
        System.out.println("Absence : " + bonus.getAbsence());
        System.out.println("Bonus : " + bonus.getBonus());
    }
}