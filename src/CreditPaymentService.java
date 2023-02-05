public class CreditPaymentService {
    public double calculate(int debt, int term, double interestRate) {

        int monthlyTerm = term * 12;
        double monthlyInterestRate = interestRate / (100 * 12);
        double base = 1 + monthlyInterestRate;
        double powValue = monthlyTerm * -1;
        // double denominator = 1 - (Math.pow(base, powValue));

        return (debt * (monthlyInterestRate / (1 - (Math.pow(base, powValue)))));
    }
}