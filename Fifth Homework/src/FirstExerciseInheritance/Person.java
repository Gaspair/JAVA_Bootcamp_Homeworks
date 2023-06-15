package FirstExerciseInheritance;

public class Person {

    protected int age;
    protected String name;
    protected String gender;
    protected String profession;


    Person(int age, String gender,String name){
        this.setAge(age);
        this.setGender(gender);
        this.setProfession(profession);
        this.setName(name);

    }




    public void setName(String name) {
        this.name = name;
    }



    public void setAge(int age) {
        this.age = age;
    }



    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}
