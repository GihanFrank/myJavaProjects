package ATM;

import java.util.*;

public class Cheqing extends Account {
    protected int chqAcc;
    protected double chqBal;

    public Cheqing(int chqAcc, double bal, String Name, int AccNo) {
        super(Name, AccNo);
        this.chqAcc = (AccNo + 1);
        chqBal = bal;

    }

    public void cheqingRun() {

        System.out.println(
                "\n\nChecqing Account Menue \n1- Withdraw. \n2- Deposit. \n3- Check the balance. \n4- Main Menue.\n\n");
        Scanner chqScann = new Scanner(System.in);
        int a = chqScann.nextInt();
        if (a == 1) {
            System.out.println("Amount: ");
            Scanner chqWith = new Scanner(System.in);
            double withChoi = (double) chqWith.nextDouble();

            withdraw(withChoi);
            System.out.println("Withdrawn Amount: \n" + withChoi + "\nCurrent Balance: \n" + getChqBal());
            this.cheqingRun();

        } else if (a == 2) {
            System.out.println("Amount to deposit: ");
            Scanner chqDepo = new Scanner(System.in);
            double depChoi = (double) chqDepo.nextDouble();
            deposit(depChoi);
            System.out.println("Deposit Amount: \n" + depChoi + "\nCurrent Balance: \n" + getChqBal());
            this.cheqingRun();
        } else if (a == 3) {
            System.out.println("Account Name\n" + getName() + "\nAccount Number\n" + getAccNo()
                    + "\nCurrent Account Number \n" +getAccNo()+"-"+getChqAcc()+"\nAccount Balance\n"+getChqBal());
                    this.cheqingRun();
        }

        else if (a == 4)
            Loader();

        else {
            System.out.println("Please Enter correct value");
            cheqingRun();
        }

    }

    public double getChqBal() {
        return chqBal;
    }

    public int getChqAcc() {
        return chqAcc;
    }

    public void withdraw(double ab) {
        if (ab < this.chqBal)
            chqBal -= ab;

        else
            System.out.println("Error please check your balance");

    }

    public void deposit(double ab) {
        if (ab > 0.0)
            chqBal += ab;

        else
            System.out.println("Error");

    }

}
