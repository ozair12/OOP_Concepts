package CreatingFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileClass {


    public static void main(String[] args) {







    }

    public void deletefile(){
File f = new File("example.txt");
        if(f.delete()){
            System.out.println("file has been deleted = " + f.getName());
        }

    }

    public void FileExists(){

        File f = new File("example.txt");

        if(f .exists()){

            System.out.println("NAME OF FILE = " + f.getName());
            System.out.println("readable = " + f.canRead());
            System.out.println("writable = " + f.canWrite());
            System.out.println("get absolute path = " + f.getAbsolutePath());
            System.out.println("length = " + f.length());
        }else{
            System.out.println("file does not exists");
        }


    }


    public void Reading_Data_In_File(){

        try {
            File f = new File("example.txt");
            Scanner myreader = new Scanner(f);

            while (myreader.hasNextLine()) {
                String data = myreader.nextLine();
                System.out.println(data);
            }

            System.out.println("completed");
            myreader.close();


        }catch(FileNotFoundException e){
            e.printStackTrace();
            System.out.println("error");
        }



    }

    public void Write_data_onFile(){

        //FileWriter mywriter = new FileWriter();





    }
}
