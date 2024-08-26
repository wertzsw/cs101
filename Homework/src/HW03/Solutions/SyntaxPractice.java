package HW03.Solutions;

public class SyntaxPractice {
    private int var1;
    private int var2;

    public SyntaxPractice(int var1, int var2){
        this.var1 = var1;
        this.var2 = var2;
    }

    /*
    TODO: Write a method isVar1Greater() that returns a boolean. It returns true when var1 is greater than var2
    TODO: and false when var1 is not greater than var2.
     */
    public boolean isVar1Greater(){
        if(this.var1 > this.var2){
            return true;
        }
        else{
            return false;
        }
    }

    /*
    TODO: Write a method swap() that swaps the values of var1 and var2.
    HINT: You should not need an if statement here, even though that is what we learned today.
     */
    public void swap(){
        int temp = this.var1;
        this.var1 = this.var2;
        this.var2 = temp;
    }
}
