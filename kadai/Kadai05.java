package kadai;

import java.util.Scanner;

public class Kadai05{
  public static void main(String[] args){
    Scanner stdIO = new Scanner(System.in);
    Seiseki seiseki = new Seiseki();

    System.out.print("No --> ");
    String gakusekiNo = stdIO.next();
    seiseki.setNo(gakusekiNo);

    System.out.print("Name -->");
    String gakuseiName = stdIO.next();
    seiseki.setName(gakuseiName);

    System.out.print("Kamoku --> ");
    String kamoku = stdIO.next();
    seiseki.setKamoku(kamoku);

    System.out.print("Count --> ");
    int inputCount = stdIO.nextInt();
    int[] tokuten = new int[inputCount];
    seiseki.setTokuten(tokuten);

    int testScore;
    for(int i = 1; i <= inputCount; i++){
      System.out.printf("Test %d --> ", i);
      testScore = stdIO.nextInt();
      seiseki.setTokutenN(i - 1, testScore);
    }

    System.out.println("No : " + seiseki.getNo());
    System.out.println("Name : " + seiseki.getName());

    System.out.println("Kamoku : " + seiseki.getKamoku());
    System.out.print("Tokuten : ");
    tokuten = seiseki.getTokuten();
    for(int score : tokuten){
      System.out.print(score + "  ");
    }
    System.out.println();

    System.out.println("Average : " + seiseki.getAverage());
    System.out.println("Grade : " + seiseki.getGrade());

    stdIO.close();
  }
}