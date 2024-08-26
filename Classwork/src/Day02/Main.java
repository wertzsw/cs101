package Day02;

public class Main {
    public static void main(String[] args){
        Cat c1 = new Cat("Grey", 10, 7, "Tano");
        c1.goForRun(3.5);
        System.out.println("Tano weighs " + c1.getWeight());
        c1.eatFood(5);
        System.out.println("Tano weighs " + c1.getWeight());
    }


}
