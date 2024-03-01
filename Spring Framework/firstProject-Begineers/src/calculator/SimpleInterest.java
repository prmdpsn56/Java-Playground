package calculator;

import java.math.BigDecimal;

public class SimpleInterest {

    BigDecimal principal;
    BigDecimal interest;


    public SimpleInterest(String principal, String interest){
        this.principal = new BigDecimal(principal);
        this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
    }

    BigDecimal calculateTotalValue(int noOfYears){
        BigDecimal noOfYearsBigDecimal = new BigDecimal(noOfYears);
        BigDecimal TotalValue = principal.add(principal.multiply(interest).multiply(noOfYearsBigDecimal));
        return TotalValue;
    }

}
