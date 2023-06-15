package FirstExerciseInheritance;

public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor(35,"Male","Andrew");
        Janitor janitor = new Janitor(38,"Female","Sorana");


        System.out.println(professor.getProfession());



        Student student = new Student(35,"Male","Andrew");
        System.out.println(professor.getProfession());


        janitor.isCleaning();
        professor.isTeaching();
    }


}
