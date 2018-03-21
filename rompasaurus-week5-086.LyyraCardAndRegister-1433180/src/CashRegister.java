
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        cashInRegister=1000.00;
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        if (cashGiven >= 2.50) {
            cashInRegister+=2.50;
            economicalSold++;
            return cashGiven-2.50;
        }
        return cashGiven;
    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        if (cashGiven >= 4.0) {
            cashInRegister+=4;
            gourmetSold++;
            return cashGiven-4;
        }
        return cashGiven;
    }


    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }

    public boolean payEconomical(LyyraCard card) {
        if (card.pay(2.50)) {
            economicalSold++;
            return true;
        }


        return false;
    }

    public boolean payGourmet(LyyraCard card) {
        if (card.pay(4.00)) {
            gourmetSold++;
            return true;
        }
        return false;

    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum > 0) {
            card.loadMoney(sum);
            cashInRegister+=sum;
        }
    }
}
