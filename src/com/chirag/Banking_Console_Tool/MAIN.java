package com.chirag.Banking_Console_Tool;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class MAIN  {
    
    public static void main(String[] args) throws IOException {
        //BConsoleTool bct=new BConsoleTool(0, 0, 0, null, null);
        Inputs in=new Inputs(0, 0, 0, null, null);
        in.identity();
        User_ID uid=new User_ID(in.b_yr, 0, 0, in.name, null);
        uid.work();
        int balance=0;

        
        File f=new File(uid.user_id+".csv");
        if(f.createNewFile()){
            System.out.println("File created for new user: "+f.getName());
        }
        else{
            System.out.println("File already exists for user:"+f.getName());
        }
        FileWriter fw=new FileWriter(f);
        fw.write("S.N,\tDate,\t\tTime,\tAmount,\tBalance\n");
        fw.close();
        int i;
        for(i=1;i<=5;i++){
            String date=in.indate();
            String time=in.intime();
            int amt=in.inamt();
            balance=balance+amt;
            //Writing data in file
            FileWriter fa=new FileWriter(f,true);
            fa.write(i+",\t"+date+",\t"+time+",\t"+amt+",\t"+balance+"\n");
            fa.close();
        }
        //int point;
        Scanner Reader = new Scanner(f);
       /*  if(i>2){
            point=i-1;
            while(Reader.hasNextLine()){
                point--;
                Reader.nextLine();
                if(point==0)
                break;
            }
        }  */
        while(Reader.hasNextLine()){
            String data=Reader.nextLine();
            System.out.println(data);
        }
        Reader.close();

    }
}
