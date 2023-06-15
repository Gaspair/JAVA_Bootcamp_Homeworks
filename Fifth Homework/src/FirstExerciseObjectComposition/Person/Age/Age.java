package FirstExerciseObjectComposition.Person.Age;

public class Age implements PersonAge {
    private int age;

    public Age(int age) {
        this.setAge(age);
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public void printPersonAge() {
        System.out.println(age);

    }
}
