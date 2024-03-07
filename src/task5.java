import java.math.BigDecimal;

public class task5 {
    public static void main(String[] args) {

        BigDecimal netPrice = new BigDecimal("9.99");
        BigDecimal vatRate = new BigDecimal("0.23");
        int quantity = 10000;


        BigDecimal grossValue = netPrice.multiply(BigDecimal.ONE.add(vatRate));
        BigDecimal totalValue = grossValue.multiply(BigDecimal.valueOf(quantity));
        BigDecimal totalValueExcludingVAT = netPrice.multiply(BigDecimal.valueOf(quantity));


        System.out.println("Gross Value: " + grossValue);
        System.out.println("Total Value: " + totalValue);
        System.out.println("Total Value Excluding VAT: " + totalValueExcludingVAT);
    }
}
