package Arrays.array;

public class OfAnObject {

    public static void main(String[] args){

        Account obj[] = new Account[2];


        for(int i = 0; i < 2; i++){
int x = 1;
int y = 2;

            obj[0] = new Account();
obj[i].setdata(x + i, y + i);
            obj[0].showdata();


        }
obj[1] = new Account();
        obj[0].setdata(2,3);
        obj[1].setdata(3,5);

obj[1].showdata();


    }

}
class Account{

    int a , b ;

    public void setdata(int c,int  d){
a =c;
b = d;

    }
public void showdata(){
        System.out.println("value for a " + a);
        System.out.println("value for b" + b);

}



}
