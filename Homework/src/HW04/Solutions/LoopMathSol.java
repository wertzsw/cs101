package HW04.Solutions;

public class LoopMathSol {

    /*
    TODO: Without using *, write a method, multiply, that computes a*b and returns.
     */
    public int multiply(int a, int b){
        int sum = 0;
        for(int i = 0; i<a; i++){
            sum = sum + b;
        }
        return sum;
    }
    /*
    TODO: Write a method, pow, that computes and returns base^exponent.
     */
    public int pow(int base, int exponent){
        int prod = 1;
        for(int i = 0; i<exponent; i++){
            prod = prod*base;
        }
        return prod;
    }
    /*
    TODO: Write a method, factorial, that computes and returns n!.
     */
    public int factorial(int n){
        int prod = 1;
        for(int i = 1; i<n+1; i++){
            prod = prod*i;
        }
        return prod;
    }
    /*
    TODO: Write a method, fibonacci, that returns the nth fibonacci number,
    TODO: where fibonacci(0) = 0 and fibonacci(1) = 1
    TODO: The fibonacci sequence is (0),1,1,2,3,5,8,13,21,34... where we add the previous two numbers in the sequence to get the next.
    TODO: This problem is significantly more challenging (though doable!) than the other two. Give it a shot, but don't be afraid to get help.
     */
    public int fibonacci(int n){
        int lastNum = 1;
        int curNum = 1;
        if(n <= 1){
            return n;
        }
        for(int i = 2; i<n; i++){
            int temp = curNum;
            curNum = lastNum + curNum;
            lastNum = temp;

        }
        return curNum;
    }

}
