package chapter4;
import java.util.*;
public class LambdaLesson {

    static void print(List<Animal> animals, Predicate, CheckTrait checker ){
        for(Animal animal: animals){
            if( checker.test(animal)){
                System.out.println(animal);
            }
        }
        System.out.println("****************");
    }
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal(speciesName:"Fish", hopper:false, swimmer:true,age:1));
        animals.add(new Animal(speciesName:"Kangaroo", hopper:true, swimmer:false,age:5));
        animals.add(new Animal(speciesName:"Rabbit", hopper:true, swimmer:false,age:2));
        animals.add(new Animal(speciesName:"Turtle", hopper:false, swimmer:true,age:10));
        animals.add(new Animal(speciesName:"Frog", hopper:true, swimmer:true,age:2));
        animals.add(new Animal(speciesName:"Koala", hopper:false, swimmer:false,age:6));
        // print(animal, new CheckIfHopper());
        // print(animal, new CheckIfSwimmer());
        print(animal, new a->a.canSwim());
        print(animal, new a->a.canHop());
        print(animal, new a->(a.canHop() && a.canSwim()));
        print(animal, new a->(!a.canHop() && !a.canSwim()));
    }
}
class Animaal{
    private String species;
    private boolean canHop;
    private boolean canSwim;
    private int Age;
    public Animal(String speciesName,boolean hopper,boolean swimmer){
    species 
    }
    
    public boolean canHop(){ return canHop;}
    public boolean canSwim(){ return canSwim;}
    public String toString(){ return species;}
}
