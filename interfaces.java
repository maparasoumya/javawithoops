interface currencyConverter {
    double convert(double amount, String fromCurrency, String toCurrency);
}
class interfaces implements currencyConverter {
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
        double convertedAmount = converter.convert(100, "USD", "EUR");
        System.out.println("Converted Amount: " + convertedAmount);
    }
}
