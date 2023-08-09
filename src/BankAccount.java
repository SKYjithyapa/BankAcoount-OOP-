public class BankAccount {


    private String CustomerName;
private int AccountNumber;
private int AccountBalance;

private String Email;

private int PhoneNumber;


    public BankAccount(String customerName, int accountNumber, int accountBalance, String email, int phoneNumber) {
        this.CustomerName = customerName;
        this.AccountNumber = accountNumber;
        this.AccountBalance = accountBalance;
        this.Email = email;
        this.PhoneNumber = phoneNumber;
    }


    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public int getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        AccountNumber = accountNumber;
    }

    public int getAccountBalance() {
        return AccountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        AccountBalance = accountBalance;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }


    public void  DepositeFunds(int value){

        AccountBalance = AccountBalance+ value;
        System.out.println("Your Deposite Sucessfully ");


    }


    public  void WithdrawFunds (int ammountwithdrawal){

        if (AccountBalance < ammountwithdrawal){

            System.out.println("You Do Not Have Suffcient Balance to withdraw ");

        }

        else {
            AccountBalance = AccountBalance - ammountwithdrawal;
            System.out.println("Your Current Account Balance is : " + AccountBalance);


        }



    }


 public  void  getinformation(){
     System.out.println("Account Balane : " + getAccountBalance() );
     System.out.println("Account Name : " +getCustomerName());
     System.out.println("Account Email :  " + getEmail() );
     System.out.println("Account Number : " + getAccountNumber() );
     System.out.println("Counter PhoneNumber  : " + getPhoneNumber() );
 }



}
