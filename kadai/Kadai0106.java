package kadai;

import java.util.Scanner;

public class Kadai0106 {
  
  public static void main(String[] args){
    Scanner stdIO = new Scanner(System.in);
    Order order = new Order();

    System.out.print("CustomerNo --> ");
    String customerNo = stdIO.next();
    order.setCustomerNo(customerNo);

    System.out.print("CustomerName -->");
    String customerName = stdIO.next();
    order.setCustomerName(customerName);

    int code = 0, num = 0;
    while(code != -1){
      System.out.print("Code(-1:End) --> ");
      code = stdIO.nextInt();
      if(order.getPrice(code) != -1){
        System.out.printf("Price : %d Num : %d\n", order.getPrice(code), order.getNum(code));
        System.out.print("Num --> ");
        
        num = stdIO.nextInt();
        order.addNum(code, num);
      }else{
        System.out.println("Code Error");
      }
    }

    System.out.println("CustomerNo : " + order.getCustomerNo());
    System.out.println("CustomerName : " + order.getCustomerName());
    System.out.println("Total Price : " + order.getTotal());

    stdIO.close();
  }
}
