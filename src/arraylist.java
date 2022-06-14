import java.util.ArrayList;

public class arraylist {

    public static void main(String[]args){


        ArrayList<String> names = new ArrayList();
        names.add("john");
        names.add("andy");
        names.add("welcome");
        System.out.print("size of array = " + names.size()+ " " + "values = " + " " + names);

        System.out.println();

        names.remove("john");
        System.out.print("size of array = " + names.size()+ " " + "values = " + " " + names);

        System.out.println();

if(names.contains("andy")){
    System.out.println(true);
        }else{
    System.out.println(false);
        }
        // using for loop
        for(String name: names){
            System.out.print(" " + name);
        }
    }
}
