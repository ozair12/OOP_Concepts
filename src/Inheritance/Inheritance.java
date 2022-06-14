package Inheritance;

public class Inheritance {

    public static void main(String[] args) {

        //Single level inheritance
        System.out.println("Single level inheritance");
        Dog d = new Dog();
        d.bark();
        d.eat();


        System.out.println("multi level inheritance");

        // Multi level inheritance

        BabyDog bd = new BabyDog();
        bd.weep();
        bd.bark();
        bd.eat();

        System.out.println("Hierarchical level inheritance");

        // Hierarchical inheritance

        Cat c = new Cat();
        c.meow();
        c.eat();
        // c.bark();//C.T.Error

        System.out.println("Hybrid level inheritance");

        //hybrid inheritance

        D obj = new D();
        obj.disp();

    }

}

//Single inheritance
class Animal {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("barking...");
    }
}

class BabyDog extends Dog {
    void weep() {
        System.out.println("weeping...");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("meowing...");
    }
}

class C

{

    public void disp()

    {

        System.out.println("C");

    }

}

class A extends C

{

    public void disp()

    {

        System.out.println("A");

    }

}

class B extends C

{

    public void disp()

    {

        System.out.println("B");

    }

}

class D extends A

{

    public void disp()

    {

        System.out.println("D");

    }
}
