public class Dollar20Dispenser implements DispenseChain{

    private  DispenseChain nextInChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {

        nextInChain = nextChain;

    }

    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount() >= 20){
            int num = cur.getAmount()/20;
            ATMDispenseChain.bankCurrency.setDollar20(ATMDispenseChain.bankCurrency.getDollar20() - (num*20));
            ATMDispenseChain.bankCurrency.setBank(ATMDispenseChain.bankCurrency.getBank()- (num*20));
            System.out.println("left20$ - " + ATMDispenseChain.bankCurrency.getBank());
            int remainder = cur.getAmount() % 20;
            System.out.println("Dispensing "+num+" 20$ note");
            if(remainder !=0) nextInChain.dispense(new Currency(remainder));
        }else{
            //System.out.println("Please try again");
            nextInChain.dispense(cur);
        }
    }
}