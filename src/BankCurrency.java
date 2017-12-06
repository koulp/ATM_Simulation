public class BankCurrency {
    private int dollar50 = 300;              //300$
    private int dollar20 = 200;              //200$
    private int bank= dollar50 + dollar20;   //500$

    public BankCurrency(int dollar50, int dollar20){
        this.dollar50 = dollar50;
        this.dollar20 = dollar20;
    }
    public BankCurrency(){
    }

    public void setBank(int bank) {
        this.bank = bank;
    }

    public int getBank() {
        return bank;
    }
    public void setDollar50(int dollar50) {
        this.dollar50 = dollar50;
    }

    public void setDollar20(int dollar20) {
        this.dollar20 = dollar20;
    }

    public int getDollar50() {
        return dollar50;
    }

    public int getDollar20() {
        return dollar20;
    }
}
