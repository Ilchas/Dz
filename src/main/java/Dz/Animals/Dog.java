package Dz.Animals;

public class Dog extends Animals {
    static int countDog = 0;
    public Dog() {
    }
    public Dog (String name, String color, int age, int rundistance, int swimdistance) {
        super();
        this.name = name;
        this.color = color;
        this.age = age;
        this.rundistance = rundistance;
        this.swimdistance = swimdistance;
        countDog++;
    }
    @Override
    public void rundis() {
        if (rundistance > 500) {
            System.out.println(name + " " + rundistance + " m не ну ты в натуре ахуел , хозяин ");
        } else {
            System.out.println(name + " " + rundistance + " ща метнусь , хозяин ");
        }
    }
    @Override
    public void swimdis() {
        if (swimdistance > 10) {
            System.out.println(name + " " + swimdistance + " я не поплыву ");
        } else {
            System.out.println(name + " " + swimdistance + "m гребу ");
        }
    }
    public static int getCountDog(){
        return countDog;
    }
    public void dogMethod(){
        System.out.println("dogMethod");
    }
}