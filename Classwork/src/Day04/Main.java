package Day04;

public class Main {
    public static void main(String[] args){
        Loops l = new Loops();

        for(int i = 1; i<10; i++){
            System.out.println(i + ": " + l.sum1ToN(i));
        }
        l.playGuessTheNumber();
    }
}
