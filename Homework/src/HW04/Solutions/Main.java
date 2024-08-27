package HW04.Solutions;

import HW04.HW.LoopMath;

public class Main {
    public static void main(String[] args){
        LoopMath lm = new LoopMath();
        for(int i = 0; i<20; i++){
            System.out.println(lm.fibonacci(i));
        }

    }
}
