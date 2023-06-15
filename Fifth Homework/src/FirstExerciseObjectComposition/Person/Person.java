package FirstExerciseObjectComposition.Person;

import FirstExerciseObjectComposition.Person.Age.Age;
import FirstExerciseObjectComposition.Person.Gender.Gender;
import FirstExerciseObjectComposition.Person.Name.Name;
import FirstExerciseObjectComposition.Person.Profession.Profession;
import FirstExerciseObjectComposition.Person.Specialisation.Specialisation;

public class Person {

    private Age age;
    private Name name;
    private Gender gender;
    private Profession profession;
    private Specialisation specialisation;

    public Person(int age, String name, String gender, String profession) {
        this.age = new Age(age);
        this.name = new Name(name);
        this.gender = new Gender(gender);
        this.profession = new Profession(profession);

    }


    public Person(int age, String name, String gender, String profession, String specialisation) {
        this.age = new Age(age);
        this.name = new Name(name);
        this.gender = new Gender(gender);
        this.profession = new Profession(profession);
        this.specialisation = new Specialisation(specialisation);
    }


    public void printName() {
        name.printPersonName();
    }

    public void printAge() {
        age.printPersonAge();
    }

    public void printGender() {
        gender.printPersonGender();
    }

    public void printProfession() {
        profession.printPersonProfession();
    }


    public void printSpecialisation() {
        specialisation.printPersonSpecialisation();
    }

}
