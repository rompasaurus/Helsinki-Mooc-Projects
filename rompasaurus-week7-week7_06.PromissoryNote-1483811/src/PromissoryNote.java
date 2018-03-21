import java.util.HashMap;

public class PromissoryNote {
    private HashMap<String, Double> ledger;


    public PromissoryNote() {
        ledger = new HashMap<String, Double>();
    }

    public void setLoan(String toWhom, double value) {
        ledger.put(toWhom, value);
    }

    public double howMuchIsTheDebt(String Whose) {
        if (this.ledger.containsKey(Whose)) {
            return this.ledger.get(Whose);
        }
        return 0;
    }


}
