abstract class CurrencyConverter {
    abstract double convert(double amount, String fromCurrency, String toCurrency);
}
class abstracts extends CurrencyConverter {
    public double convert(double amount, String fromCurrency, String toCurrency) {
        double rate = 1.0;
        if (fromCurrency.equals("USD") && toCurrency.equals("EUR")) {
            rate = 0.85;
        } else if (fromCurrency.equals("EUR") && toCurrency.equals("USD")) {
            rate = 1.18;
        }
        return amount * rate;
    }

    public static void main(String[] args) {
        XD converter = new XD();
        double convertedAmount = converter.convert(100, "EUR", "USD");
        System.out.println("Converted Amount: " + convertedAmount);
    }
}
