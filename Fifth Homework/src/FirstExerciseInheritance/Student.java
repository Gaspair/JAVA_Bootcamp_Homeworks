package FirstExerciseInheritance;

public class Student extends Person {




        Student(int age, String gender,String name) {
            super(age, gender, name);
            String profession = "Student";
            this.setProfession(profession);
        }

    void isStudying(){
        System.out.println(name + " is studying for the final exam!");
    }

}
