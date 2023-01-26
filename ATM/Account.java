package ATM;

import java.util.*;

public abstract class Account {
    protected String Name;
    protected int AccNo;

    public Account(String Name, int AccNo) {
        this.Name = Name;
        AccnumGen(AccNo);

    }

    public void Loader() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("\n\nWelcome to the CIBC ATM main menue.\n" + "Please Enter your Choice\n" + "\n"
                    + "1. Checqing Account \n2. Savings Account \n3. Exit");
            int chioce = scanner.nextInt();
            if (chioce == 1)
                cheqingRun();
            else if (chioce == 3)
                System.out.println("Thank you for using the ATM");
        }
    }

    public String getName() {
        return Name;
    }

    public int getAccNo() {
        return AccNo;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAccNo(int accNo) {
        AccNo = accNo;
    }

    public abstract void cheqingRun();

    private void AccnumGen(int a) {
        int k = (int) (Math.random() * a) + 1987;
        this.AccNo = k;
    }

    // public abstract void withdraw(double a);
}
