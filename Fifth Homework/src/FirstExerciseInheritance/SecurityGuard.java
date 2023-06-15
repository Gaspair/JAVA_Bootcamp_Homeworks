package FirstExerciseInheritance;



public class SecurityGuard extends Person {

    SecurityGuard(int age,String gender,String name){
        super(age,gender,name);
        String profession = "Security Guard";
        this.setProfession(profession);
    }


    void isPatrolling(){
        System.out.println(name + " is patrolling the building!");
    }

}
