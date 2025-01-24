import java.util.ArrayList;

public class Number{
    int base,value;
    ArrayList<Digit> digits = new ArrayList<Digit>();
    /**
     * Sets the value to zero and base to 10 if none is provided
     */
    public Number(){
        base=10;
        value=0;
        convert();
    }
    /**
     * Sets the value and base to the given values
     * @param v value
     * @param b base
     */
    public Number(int v, int b){
        base=b;
        value=v;
        convert();
    }

    /**
     * returns the digitsList
     * @return A string that contains the digits of the number
     */
    public String toString(){
        convert();
        String a="";
        for(Digit d:digits)
            a+=d.toString();
        if(a.equals(""))
            return "0";
        else
            return a;
    }
    /**
     * Increments the digit by 1
     */
    public void increment(){
        value++;
        int n=0;
        while(true){
            if(n>=digits.size())
                digits.add(0,new Digit());
            if(digits.get(n).increment()){
                digits.get(n).value=0;
                n++;
            }else{
                digits.get(n).value++;
                break;
            }
        }
    }

    /**
     * Converts the base and number to base 10 for easy use in the code.
     */
    private void convert(){
        int temp=value;
        for(int i=0;value!=0;i++){
            if(i>=digits.size())
                digits.add(0,new Digit());
            digits.set(i, new Digit(value%base, base));
            digits.get(0).increment();
            value/=base;
        }
        value=temp;
        for(int i=0,j=digits.size()-1;i<j;i++)
            digits.add(i, digits.remove(j));
    }
}