import java.util.Scanner;

public class ATMDispenseChain {
        private DispenseChain c1;
        static BankCurrency bankCurrency = new BankCurrency();

    public static void main(String[] args) {
        //Initialize the machine ATM
        Initialize();

        ATMDispenseChain atmDispenser = new ATMDispenseChain();
        while (true) {
            int amount = 0;
            int remaining =0;
            remaining = bankCurrency.getBank();
            System.out.println("Enter amount to dispense");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            if (amount % 20 != 0
                    && amount % 50 != 0
                    && amount % 70 != 0
                    && amount % 90 != 0
                    && amount % 110 != 0
                    && amount % 130 != 0) {
                System.out.println("Amount should be in multiple of 20$ or 50$.");
                return;
            }
            if(amount > remaining){
                System.out.println("Please find a different ATM Machine");
                return;
            }
            // process the request
            atmDispenser.c1.dispense(new Currency(amount));
        }
    }

    private static void Initialize() {

        System.out.println("Initialization");
        System.out.println("ATM has: " + bankCurrency.getDollar50() / 50 + ": 50$ notes + " + bankCurrency.getDollar20() / 20 + ": 20$ notes");
    }

    public ATMDispenseChain() {
        // initialize the chain
        this.c1 = new Dollar50Dispenser();
        DispenseChain c2 = new Dollar20Dispenser();

        // set the chain of responsibility
        c1.setNextChain(c2);
    }
}
