package HW04.HW;

import HW04.HW.LoopMath;

public class Main {
    public static void main(String[] args){
        LoopMath lms = new LoopMath();
        for(int i = 0; i<20; i++){
            System.out.println(lms.fibonacci(i));
        }

    }
}
