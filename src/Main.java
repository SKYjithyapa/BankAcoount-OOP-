import java.util.Scanner;
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
    BankAccount sahan = new BankAccount("Sahan Rashmika",9435345,100000,"sahanrashmi@gmail.com",485492);

    sahan.getinformation();
    sahan.DepositeFunds(100000);
    sahan.WithdrawFunds(30000);
    sahan.getinformation();

        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter Cumstomer Name : ");
        String Name = input1.nextLine();

        System.out.println("Enter the account Number : ");
        int AccoNumber  = input1.nextInt();

        System.out.println("Enter Account Balane : ");
        int Accblance = input1.nextInt();

        System.out.println("Enter email : ");
        String email = input1.nextLine();

        System.out.println("Enter Phone Number : ");
        int pnumber = input1.nextInt();


        accounts.add(
                new BankAccount(Name,AccoNumber,Accblance,email,pnumber)
        );

        for (BankAccount b : accounts
             ) {
            b.getinformation();
            
        }

    }
}