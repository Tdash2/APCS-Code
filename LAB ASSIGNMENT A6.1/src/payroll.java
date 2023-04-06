public class payroll {
    private double my_Hours;
    private double my_rate;

    private double my_grossPay;

    /**
     * Finds and stores the tax info.
     * @param Hours How many hours the person worked.
     * @param Rate What the person get paid per hour.
     */
    public payroll(double Hours, double Rate){
        my_rate=Rate;
        my_Hours=Hours;
        my_grossPay = my_Hours*my_rate;
        System.out.println("Hours Worked: " + getHoursWorked());
        System.out.println("Hourly rate: " +getRate());
        System.out.println();
        System.out.println("Gross pay: " +getGrossPay());
        System.out.println();
        System.out.println("Federal Tax (15.4%): " + getFederaltax());
        System.out.println("FICA Tax (7.75%): " + getFICATax());
        System.out.println("State Tax (4.0%) " + getStateTax());
        System.out.println();
        System.out.println("Net pay: "+ getNetPay());
    }

    /**
     *
     * @return How many hours the person worked
     */
    public double getHoursWorked(){
        return my_Hours;
    }

    /**
     *
     * @return Returns how much they get payed
     */
    public double getRate(){
        return my_rate;
    }

    /**
     *
     * @return returns the person gross pay
     */
    public double getGrossPay(){
        return my_grossPay ;
    }

    /**
     *
     * @return returns how much Federal tax they have.
     */
    public double getFederaltax(){
        return my_grossPay * 0.154;
    }
    /**
     *
     * @return returns how much FICA tax they have.
     */
    public double getFICATax(){
        return my_grossPay *0.0775;
    }
    /**
     *
     * @return returns how much State tax they have.
     */
    public double getStateTax(){
        return my_grossPay *0.04;
    }
    /**
     *
     * @return returns the person net pay.
     */
    public double getNetPay(){
        return my_grossPay * 0.805;
    }
}
