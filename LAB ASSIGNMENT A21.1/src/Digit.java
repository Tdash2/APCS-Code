public class Digit{
    int base,value;
    /**
     * Sets the value to zero and base to 10 if none is provided
     */
    public Digit(){
        base=10;
        value=0;
    }
    /**
     * Sets the value and base to the given values
     * @param v initial value
     * @param b base
     */
    public Digit(int v, int b){
        base=b;
        value=v;
    }

    /**
     * Gives the value of the digit
     * @return the value of the digit
     */
    public String toString(){
        if(value<10||base<=10){
            String temp="";
            temp+=value;
            return temp;
        }else{
            int a='A'+value-10;
            String c="";
            c+=(char)a;
            return c;
        }
    }
    /**
     * Increments the digit by 1
     * @return true if you have to carry the number if not it returns false
     */
    public boolean increment(){
        if(value+1>=base)
            return true;
        return false;
    }
}