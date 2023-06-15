package FirstExerciseInheritance;

public class Professor extends Person {

    Professor(int age, String gender,String name) {
        super(age, gender, name);
        String profession = "Professor";
        this.setProfession(profession);
    }


    void isTeaching(){
        System.out.println(name + " is teaching algebra!");
    }

}
