
/**
 * @author Villy
 * Toy Object
 * has property of name, brand, price and quantity
 * with a method of setPrice() where you can change
 * the price state of Toy Object
 */
package chapter1;

public class Toy {
    public String name = "Gundam";
    public String brand;
    public double price;
    public int quantity;
    /*multi
     * line
     *comment
     */
    //set the amount of toy to the argument example setPrice(1000)
    void setPrice(double price){
        this.price = price;
    }
    //psvm - public static void main(String[] args) {}
    public static void main(String[] args) {
        System.out.println("hello java trainees");
        Toy toy1 = new Toy();
        toy1.brand="Bandai";
        toy1.name="Gundam Wing";
        toy1.price=4500;
        toy1.quantity=12;
        // Toy toy2 = new Toy();
        toy1.setPrice(toy1.price*0.5);
        System.out.println(toy1.price);
    }
}
class Fruit{}
class Fruit2{}
class Fruit3{
    int numberOfLeaves;
}
class Fruit4{
public static void main(String[] args) {
    System.out.println("I am Fruit 4");
    Fruit3 f3 = new Fruit3();
    f3.numberOfLeaves=31;
    System.out.println(f3.numberOfLeaves);
    System.out.println(args[0]);
}

}
