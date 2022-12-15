package com.chirag.Banking_Console_Tool;

public class User_ID extends BConsoleTool {
    
    public User_ID(int b_yr, int amt, int balance, String name, String user_id) {
        super(b_yr, amt, balance, name, user_id);
        this.user_id=user_id;
    } 

    @Override
    protected void work(){
        user_id="";
        int flag=0,length=name.length();
        for(int i=0;i<length;i++){
            if(flag<3){
                user_id=user_id+name.charAt(i);
            }
            if(flag==3){
            user_id=user_id+"_";
            }
            flag++;
            if(name.charAt(i)==' '){
                flag=0;
            }
            
        }
        user_id=user_id+b_yr;
        user_id=user_id.toUpperCase();
        //super.work();
        System.out.println("User id: "+user_id );
    }
}