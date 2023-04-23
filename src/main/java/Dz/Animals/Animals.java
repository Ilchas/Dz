package Dz.Animals;

public abstract class Animals {
    String name;
    String color;
    int age;
    int rundistance;
    int swimdistance;
    static int countAnimal = 0;

    public Animals() {
        countAnimal++;
    }

    public Animals(String name, String color, int age, int leghtrundistance, int leghtswimdistance) {
        this.name = name;
        this.color = color;
        this.age = age;
        rundistance = leghtrundistance;
        swimdistance = leghtswimdistance;
    }

    public void info() {
        System.out.println(name + " " + color + " " + age);
    }

    public void voice() {
        System.out.println("Животное издало звук ");
    }

    public static int getCountAnimal() {
        return countAnimal;}

        public void rundis ( int lenght) {
            if (rundistance < lenght) {
                System.out.println(name + " не могёт" + lenght + " m");
            } else {
                System.out.println(name + " могёт" + lenght + " m");
            }
        }
            public void swimdis ( int lenght){
                if (swimdistance < lenght) {
                    System.out.println(name + " не могёт" + lenght + " m");
                } else {
                    System.out.println(name + " могёт" + lenght + " m");
                }
        }
}


