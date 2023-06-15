package FirstExerciseObjectComposition.Person.Name;

public class Name implements PersonName {

    private String name;

    public Name(String name){
        this.setName(name);
    }


    public void setName(String name){
        this.name = name;
    }

    @Override
    public void printPersonName(){
        System.out.println(name);

    }
}
