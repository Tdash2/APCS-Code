public class LoanTable {
        private double principal;
        private int years;
        private double low;
        private double high;

        /**
         * Constructor
         * @param principal - principal amount borrowed
         * @param years - number of years for the loan to be paid off
         * @param low - low interest rate
         * @param high - high interest rate
         */
        public LoanTable(double principal, int years, double low, double high)
        {
            this.principal = principal;
            this.years = years;
            this.low = low;
            this.high = high;
        }

        /**
         * Prints out hte table
         */
        public void printTable()
        {
            //Print table heading
            System.out.println("Annual Interest Rate    Monthly Payment\n");

            while (low <= high) {
                System.out.printf("%15.2f", low);
                System.out.printf("%17.2f", (principal * ((low / 100) / 12.0) * Math.pow((1 + ((low / 100) / 12.0) ), (years * 12.0))) / (Math.pow((1 + ((low / 100) / 12.0) ), (years * 12)) - 1) );
                System.out.println();
                low = low + 0.25;
            }
        }
}

