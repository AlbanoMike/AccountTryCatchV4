package Program;

import Entities.Account;
import Exceptions.ValueException;

import java.util.Locale;
import java.util.Scanner;

public class ProgramMain {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Scanner sc = new Scanner(System.in);
        Account conta1 = new Account();

        System.out.println("Enter Account data !");
        System.out.print("number: ");
        conta1.setNumber(sc.nextInt());
        System.out.print("holder: ");
        sc.nextLine();// usado para alimentar o buffer
        conta1.setHolder(sc.nextLine());
        System.out.print("inicial balance: ");
        conta1.Deposit(sc.nextDouble());
        System.out.print("WithDraw Limit: ");
        conta1.setWithdrawLimit(sc.nextDouble());

        System.out.print("enter a amount to withdraw: ");
        try{
            conta1.Withdraw(sc.nextDouble());
            System.out.println(String.format("New Balance $ %.2f",conta1.getBalance()));
        }
        catch (ValueException e){
            System.out.println("Error: "+ e.getMessage());
        }

        sc.close();
    }
}
