import java.util.Scanner;
public class Tax {
    /**
     * Asks a user for there taxable income and if they are singled or Married. then calculates there tax.
     */
    public Tax(){
        Scanner in = new Scanner(System.in);
        int status = 0;
        double tax = 0;
        System.out.print("Enter your taxable income: ");
        double taxableIncome = in.nextDouble();
        while (status != 1 && status != 2){
            System.out.print("Enter your filing status Single (1) or Married (2): ");
            status = in.nextInt();
        }
        if (status ==1){ // single tax caclation
            if (taxableIncome < 27050){
                tax = taxableIncome * 0.15;
            }
            else if (taxableIncome > 27050 && taxableIncome < 65550 ){
                tax = ((taxableIncome - 27050) * 0.275) + 4057.5;
            }
            else if (taxableIncome > 65550 && taxableIncome < 136750){
                tax = ((taxableIncome - 65550) * 0.305) + 14645.00;
            }
            else if (taxableIncome > 136750 && taxableIncome < 297350){
                tax = ((taxableIncome - 136750) * 0.355) + 36361;
            }
            else if (taxableIncome > 297350){
                tax = ((taxableIncome - 297350) * 0.391) + 93374;
            }
        }else {
            if (taxableIncome < 45200){
                tax = taxableIncome * 0.15;
            }
            else if (taxableIncome > 45200  && taxableIncome < 109250){
                tax = ((taxableIncome - 45200) * 0.275) + 6780;
            }
            else if (taxableIncome > 109250 && taxableIncome < 166500){
                tax = ((taxableIncome - 109250) * 0.305) + 24393.75;
            }
            else if (taxableIncome > 166500  && taxableIncome < 297350){
                tax = ((taxableIncome - 166500) * 0.355) + 41855;
            }
            else if (taxableIncome > 297350){
                tax = ((taxableIncome - 297350) * 0.391) + 88306;
            }
        }

         System.out.println("Your tax is " + tax);
    }
}
