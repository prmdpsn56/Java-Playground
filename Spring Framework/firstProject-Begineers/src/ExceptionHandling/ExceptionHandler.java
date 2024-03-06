package ExceptionHandling;

public class ExceptionHandler {

    private String Currency;
    private int Amount;

    public ExceptionHandler(String currency, int amount) {
        Currency = currency;
        Amount = amount;
    }


    public void add(ExceptionHandler Other) throws Exception {
        if (!this.Currency.equals(Other.Currency)){
            throw new Exception("Currency dont match");
        }
        this.Amount = this.Amount + Other.Amount;
    }


    @Override
    public String toString() {
        return "ExceptionHandler{" +
                "Currency='" + Currency + '\'' +
                ", Amount='" + Amount + '\'' +
                '}';
    }
}
