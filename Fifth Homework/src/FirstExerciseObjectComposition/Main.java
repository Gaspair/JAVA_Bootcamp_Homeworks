package FirstExerciseObjectComposition;

import FirstExerciseObjectComposition.Person.Person;

public class Main {
    public static void main(String[] args) {

        Person Janitor = new Person(35,"Andrew","male","Janitor");
        Person Student =  new Person(20,"Sophie","female","Student","Medicine");
        Person SecurityGuard = new Person(47,"Brandon","male","Security Guard");
        Person Professor = new Person(43,"Andrea","female","Professor","Mathematics");


    Janitor.printProfession();
    Professor.printSpecialisation();
    Student.printName();
    SecurityGuard.printAge();



    }
}
