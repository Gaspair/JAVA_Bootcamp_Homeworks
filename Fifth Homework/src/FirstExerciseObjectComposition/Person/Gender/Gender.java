package FirstExerciseObjectComposition.Person.Gender;

public class Gender implements PersonGender {
    private String gender;

    public Gender(String gender) {
        this.setGender(gender);
    }


    public void setGender(String gender) {
        this.gender = gender;
    }



    @Override
    public void printPersonGender() {
        System.out.println(gender);
    }
}
