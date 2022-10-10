public class payroll {
    private double my_Hours;
    private double my_rate;

    private double my_grossPay;
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

    public double getHoursWorked(){
        return my_Hours;
    }
    public double getRate(){
        return my_rate;
    }
    public double getGrossPay(){
        return my_grossPay ;
    }
    public double getFederaltax(){
        return my_grossPay * 0.154;
    }

    public double getFICATax(){
        return my_grossPay *0.0775;
    }

    public double getStateTax(){
        return my_grossPay *0.04;
    }

    public double getNetPay(){
        return my_grossPay * 0.805;
    }
}
