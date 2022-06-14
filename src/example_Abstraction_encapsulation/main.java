package example_Abstraction_encapsulation;

public class main {

    // this is an example of encapsulation and
    //
    // abstraction because unnecessary information is hidden from the main class

    public static void main(String[] args) {
        person obj = new person("jack", 25);
person obj1 = new person("hailey", 34);


        // Displaying values of the variables
        System.out.println("obj name: " + " " +obj.getName() +  "obj age = " + " " + obj.getAge());
        System.out.println("obj1 name: " + " " +obj1.getName() +  "obj1 age = " + " " + obj1.getAge());


        // Direct access of geekRoll is not possible
        // due to encapsulation
        // System.out.println("Geek's roll: " +
        // obj.geekName);

    }


}
