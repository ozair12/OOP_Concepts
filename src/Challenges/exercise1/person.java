package Challenges.exercise1;

public class person {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    private String name;
private int age, height;
private double weight;

    public person(String name, int age, int height, double weight){
        this.name =name;
        this.age = age;
        this.weight = weight;
        this.height =height;
    }




            public void growOlder(){
        age++;
        height--;
        weight = weight - 0.5;
            }



}
