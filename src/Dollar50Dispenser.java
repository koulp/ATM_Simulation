public class Dollar50Dispenser implements DispenseChain{

    private  DispenseChain nextInChain;

    // Defines the next Object to receive the
    // data if this one can't use it

    @Override
    public void setNextChain(DispenseChain nextChain) {
        nextInChain=nextChain;
    }

    // Tries to calculate the data, or passes it
    // to the Object defined in method setNextChain()

    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount() >= 50 && cur.getAmount()%20 !=0){
            int num = cur.getAmount()/50;
            ATMDispenseChain.bankCurrency.setDollar50(ATMDispenseChain.bankCurrency.getDollar50() - (num*50));
            ATMDispenseChain.bankCurrency.setBank(ATMDispenseChain.bankCurrency.getBank()- (num*50));
            System.out.println("left50$ - " + ATMDispenseChain.bankCurrency.getBank());
            int remainder = cur.getAmount() % 50;
            System.out.println("Dispensing "+num+" 50$ note");
            if(remainder !=0) nextInChain.dispense(new Currency(remainder));
        }else{
            nextInChain.dispense(cur);
        }
    }
}