package com.chirag.Banking_Console_Tool;

public class Inputs extends BConsoleTool {
    
    public Inputs(int b_yr, int amt, int balance, String name, String user_id) {
        super(b_yr, amt, balance, name, user_id);
        this.name=name;
        this.b_yr=b_yr;
    }

    //@Override
    protected void identity(){
        System.out.println("Enter Name: ");
        name=sys.nextLine();
        System.out.println("Enter the Birth Year: ");
        b_yr=sys.nextInt();
        
    }
   
    protected String indate(){
        String date;
        //Date date= new Date(b_yr, amt, balance, name, user_id);
        int dd,mm,yy;
        int leap=0,flag=1;
        for(;;){
            flag=1;leap=0;
            System.out.println("Enter Date as DD/MM/YYYY");
            dd=sys.nextInt();
            mm=sys.nextInt();
            yy=sys.nextInt();
            //date.work();
            if(flag==1){
                if(yy>2023){
                    flag=0;
                    System.out.println("Cannot do future entries.");
                }
                else if(yy<1971){
                    flag=0;
                    System.out.println("Too early a date entered");
                }     
                else{
                    if(yy% 4 == 0 && yy % 100 != 0){
                        leap=1;
                    }
                    else{
                        if(yy%400==0){
                            leap=1;
                        }
                    }
                }
                
                if(mm<0||mm>12){
                    System.out.println("Invalid Date Entered. Month doesn't exist.");
                    flag=0;
                }
                else{
                    if(dd<0){
                        System.out.println("Invalid Date Entered. Cannot be negative.");
                        flag=0;
                    }
                    else{
                        if(mm%2==0){
                            if(leap==1){
                                if(mm==2&&dd>29){
                                    flag=0;
                                    System.out.println("Invalid Date Entered. The month doesn't extend date 29.");
                                }
                                else if(dd>30){
                                    flag=0;
                                    System.out.println("Invalid Date Entered. The month doesn't extend date 30.");
                                }
                            }
                            else{
                                if(mm==2&&dd>28){
                                    flag=0;
                                    System.out.println("Invalid Date Entered. The month doesn't extend date 28.");
                                }
                                else if(dd>30){
                                    flag=0;
                                    System.out.println("Invalid Date Entered. The month doesn't extend date 30.");
                                }
                            }
                        }
                        else{
                            if(dd>31){
                                flag=0;
                                System.out.println("Invalid Date Entered. The month doesn't extend date 31.");
                            }
                        }
                    }
                }
            }
            if(flag==1)
            break;
        
    }
             date=dd+"/"+mm+"/"+yy;
             return date;
    }

    protected String intime(){
        String time;
        int flag1=0;
                for(;;){
                System.out.println("Enter Time in 24 Hrs format");
                time=sys.next();
                String t1="",t2="";
                t1=t1+time.charAt(0)+(time.charAt(1));
                t2=t2+time.charAt(3)+(time.charAt(4));
                int ti1=Integer.parseInt(t1);
                int ti2=Integer.parseInt(t2);
                if((ti1>24||ti1<0)||(ti2>59||ti2<0)){
                    System.out.println(time+"INVALID FORMAT. Please enter as hrs:mins");
                    flag1=1;
                }
                else flag1=0;
                if(flag1==0) break; 
            }
        return time;
    }

    protected int inamt(){
        int amt;
        
        System.out.println("Enter Amount ");
        amt=sys.nextInt();
        return amt;
    }
}
