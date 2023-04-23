package Dz.Animals;

public abstract class Animals {
   String name;
   String color;
   int age;
   int rundistance;
   int swimdistance;
  static int countAnimal = 0;
    public Animals(){
        countAnimal++;
    }
    public Animals(String name , String color , int age , int rundistance , int swimdistance ){
        this.name = name;
        this.color = color;
        this.age = age;
        this.rundistance = rundistance;
        this.swimdistance = swimdistance;
    }
    public void info(){
        System.out.println(name + " " + color + " " + age);
    }
    public void rundis(){
        System.out.println(name + " " + rundistance + " " );
    }
    public void swimdis(){
        System.out.println(name + " " + swimdistance + " " );
    }
    public void voice(){
        System.out.println( "Животное издало звук ");
    }
    public static int getCountAnimal () {
        return countAnimal;
    }
}