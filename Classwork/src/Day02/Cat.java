package Day02;

public class Cat {
    private String color;
    private int weight;
    private int speed;
    private String name;

    public Cat(String color, int w, int s, String name){
        this.color = color;
        this.weight = w;
        this.speed = s;
        this.name = name;
    }

    public void eatFood(int foodWeight){
        this.weight = this.weight + foodWeight;
    }

    public void goForRun(double miles){
        this.weight = this.weight - (int)miles;
        System.out.println(name + " went for a " + miles + " mile run! It took them " + (miles/this.speed) + " hours!");
    }

    public int getWeight(){
        return this.weight;
    }
}
