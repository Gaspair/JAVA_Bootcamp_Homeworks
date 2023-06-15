package FirstExerciseObjectComposition.Person.Profession;

public class Profession implements PersonProfession {

    private String profession;

    public Profession(String profession){
        this.setProfession(profession);
    }

    public void setProfession(String profession){
        this.profession = profession;
    }

    @Override
    public void printPersonProfession(){
        System.out.println(profession);
    }

}
