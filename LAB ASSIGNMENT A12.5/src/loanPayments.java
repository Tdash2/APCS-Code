public class loanPayments {
    /**
     * Finds how much a loan will cost
     * @param Principal How much money you need
     * @param annualRate Your instrant rate
     * @param monthlyPayments your monthly payment
     */
    loanPayments(int Principal, double annualRate, int monthlyPayments  ){
        double monthlyRate = (annualRate/12)/100;
        double remaningDebt = Principal;
        int month = 1;
        System.out.println("Month     Principal Loan Amt.    Interest(at 1%/month)   Payment   New Balance ");
        while (remaningDebt > 0) {
            System.out.printf("%3d", month);
            System.out.printf("%26.2f", remaningDebt);
            double intrest = monthlyRate * remaningDebt;
            System.out.printf("%25.2f", intrest);
            System.out.printf("%10d", monthlyPayments);
            remaningDebt = remaningDebt - (monthlyPayments - intrest);
            System.out.printf("%14.2f", remaningDebt);
            if(remaningDebt<= monthlyPayments){
                remaningDebt=-1;
            }
            System.out.println();
            month++;
        }
    }
}
