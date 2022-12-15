package com.chirag.Banking_Console_Tool;

import java.util.Scanner;

public class BConsoleTool {
    
    
    Scanner sys=new Scanner(System.in);
        int b_yr,amt;
        int balance;
        String name="",user_id;
        
        public BConsoleTool(int b_yr,int amt,int balance,String name, String user_id){
            this.b_yr=b_yr;
            this.amt=amt;
            this.balance=balance;
            this.name=name;
            this.user_id=user_id;
        }
        protected void work() {
           // System.out.println("This method will be used for all the calculations in sub classes");
        }
    }
