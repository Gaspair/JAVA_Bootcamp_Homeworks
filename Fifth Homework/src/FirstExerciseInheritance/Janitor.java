package FirstExerciseInheritance;

public class Janitor extends Person {

    Janitor(int age,String gender,String name){
        super(age,gender,name);
        String profession = "Janitor";
        this.setProfession(profession);
    }

    void isCleaning(){
        System.out.println(name + " is sweeping the floors!");
    }

}
