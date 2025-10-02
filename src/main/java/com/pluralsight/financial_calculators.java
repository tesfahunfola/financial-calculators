package com.pluralsight;

public class financial_calculators {
    public static void main(String[] args) {
        mortgageCalculator(530000.0,0.07625,15);
        futureValue(1000.0,0.0175,5);
        presentValue(3000,0.025,20);
    }
    public static void mortgageCalculator(double principal, double annualInterestRate, int loanYears){
        double p = principal;
        double r = annualInterestRate;
        int y = loanYears;
        int n = y*12;
        double i = r/12;

        double pow = Math.pow(1 + i, n);

       double m = (p * (i * pow))/(pow-1);
        System.out.printf("$%.2f/mo \n", m);
        double totalInterest = (m * n) - p;
        System.out.printf("$%.2f",totalInterest);
    }
    public static void futureValue(double deposit, double interestRate, int numberOfyears){
        double p = deposit;
        double r = interestRate;
        int t = numberOfyears;
        double FV = p * (Math.pow(1 + (r/365), 365*t));

        System.out.println("\n\n");
        System.out.printf("Ending balance: $%.2f \n",FV);

        double totalInterestEarned = FV - p;
        System.out.printf("Earned $%.2f in interest.",totalInterestEarned);
    }
    public static void presentValue(double monthlyPayOut, double interestRate, int numOfYears){
        double PMT = monthlyPayOut;
        double i = interestRate / 12;
        int n = numOfYears * 12;

        double PV = PMT * (( 1 - Math.pow(1 + i,-n))/i);
        System.out.println("\n");
        System.out.printf("$%.2f ",PV);
    }

}
