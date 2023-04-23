package Dz.Animals;

public class Tiger extends Animals{
    static int countTiger = 0;
    public Tiger(){
    }
    public Tiger (String name , String color , int age , int rundistance , int swimdistance){
        this.name = name;
        this.color = color;
        this.age = age;
        this.rundistance = rundistance;
        this.swimdistance = swimdistance;
        countTiger ++;
}
    public void voice(){
        System.out.println( name + " rrr " );
    }
    public void rundis(){
        System.out.println( name + " " + rundistance + " m");
    }
    public void swimdis(){
        System.out.println( name + " " + swimdistance + " m");
    }
    public void tigerMethod(){
        System.out.println("tigerMethod");
    }
    public static int getCountTiger(){
        return countTiger;
    }
}