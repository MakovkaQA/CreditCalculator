public class Main {
    public static void main(String[] args) {

        double interestRate = 9.99;

        CreditPaymentService service = new CreditPaymentService();

        int debt1 = 1000000;
        int term1 = 1;

        double annuity1 = service.calculate(debt1, term1, interestRate);
        System.out.println();
        System.out.println(("Сумма кредита: " + debt1) + ("  Срок кредита: " + term1));
        System.out.println(("Процентная ставка: " + interestRate));
        System.out.println("Ежемесячный платеж: " + (String.format("%(.0f", annuity1)));

        int debt2 = 1000000;
        int term2 = 2;

        double annuity2 = service.calculate(debt2, term2, interestRate);
        System.out.println();
        System.out.println(("Сумма кредита: " + debt2) + ("  Срок кредита: " + term2));
        System.out.println(("Процентная ставка: " + interestRate));
        System.out.println("Ежемесячный платеж: " + (String.format("%(.0f", annuity2)));

        int debt3 = 1000000;
        int term3 = 3;

        double annuity3 = service.calculate(debt3, term3, interestRate);
        System.out.println();
        System.out.println(("Сумма кредита: " + debt3) + ("  Срок кредита: " + term3));
        System.out.println(("Процентная ставка: " + interestRate));
        System.out.println("Ежемесячный платеж: " + (String.format("%(.0f", annuity3)));
    }
}
