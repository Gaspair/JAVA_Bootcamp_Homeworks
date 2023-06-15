package FirstExerciseObjectComposition.Person.Specialisation;

public class Specialisation implements PersonSpecialisation{


    private String specialisation;

    public Specialisation(String specialisation){
        this.setSpecialisation(specialisation);
    }

    public void setSpecialisation(String specialisation){
        this.specialisation = specialisation;
    }


    @Override
    public void printPersonSpecialisation(){
        System.out.println(specialisation);
    }

}
