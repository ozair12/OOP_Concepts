package Challenges.exercise1;

public class personCreater {

    public static void main(String[]args){

        person person1 = new person("jack",25,167, 67);
        person person2 = new person("henry", 25, 156, 67);

        person2.growOlder();
        System.out.println("person name " + " " + person2.getName() + " " + "age " + " " + person2.getAge() + " height" + " " + person2.getHeight() + " weight" + " " + person2.getWeight());
    }


}
