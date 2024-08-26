package Day03;

public class Conditionals {
    /*
    TODO: Write 4 functions.
    TODO: 1. Write a method that takes in an int and returns True if the int is greater than 100 and false if not.
    TODO: 2. Write a method that takes in an int and returns a grade using the following scale: >=90: A, >=80: B, >=70: C, >=60: D, <60: F
    TODO: 3. Write a method that takes in two ints and returns the greater one.
    TODO: 4 (Bonus). Write method 1 in a more condensed way.
     */
    public boolean isGreaterThan100(int num){
        if(num > 100){
            return true;
        }
        else{
            return false;
        }
    }

    public char gradingScale(int num){
        if(num >= 90){
            return 'A';
        }
        else if(num >= 80){
            return 'B';
        }
        else if(num >= 70){
            return 'C';
        }
        else if(num >= 60){
            return 'D';
        }
        else{
            return 'F';
        }
    }

    public int getHigher(int num1, int num2){
        if(num1 > num2){
            return num1;
        }
        else{
            return num2;
        }
    }

    public boolean isGreaterThan100Condensed(int num){
        return (num > 100);
    }

}
