package Dz.Animals;

public class Cat extends Animals {
   static int countCat = 0;
    public Cat() {
    }
    public Cat(String name, String color, int age, int rundistance, int swimdistance) {
        super();
        this.name = name;
        this.color = color;
        this.age = age;
        this.rundistance = rundistance;
        this.swimdistance = swimdistance;
        countCat++;
    }
        public void voice () {
            System.out.println(" Cat meow ");
        }
        public void rundis () {
            if (rundistance > 200) {
                System.out.println(name + " " + rundistance + "m не побегу , пошел на хуй ");
            } else {
                System.out.println(name + " " + rundistance + " бегу нахуй m ");
            }
        }
        public void swimdis () {
            if (swimdistance > 0) {
                System.out.println(name + " " + swimdistance + " m плыви сам ублюдок ");
            }
            if (swimdistance == 0) {
                System.out.println(name + " " + swimdistance + " я и так не умею плавать дэбыл");
            }
    }
    public static int getCountCat(){
        return countCat;
    }
    public void catMethod(){
        System.out.println("catMethod");
    }
}