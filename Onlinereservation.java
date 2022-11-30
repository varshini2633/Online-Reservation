import java.util.*;
import javax.swing.JOptionPane; 
public class Onlinereservation 
{
    public static void main(String args[])
    {
        JOptionPane.showMessageDialog(null,"Welcome to Online Reservation System");
        Another ob=new Another();
        String again= "yes";
        ob.login();
        while(again == "yes"|| again == "YES"||again == "Yes")
        {
            if(ob.login == 1)
            {
                JOptionPane.showMessageDialog(null,"1.Reservation\n 2.cancellation \n 3.View the Ticket \n 4.Exit");
                System.out.println("enter your choice:");
                String opt=JOptionPane.showInputDialog("enter your choice:");
                int choice=Integer.valueOf(opt);
                switch(choice)
                {
                    case 1:
                        ob.reservation();
                        break;
                    case 2:
                        ob.cancellation();
                        break;
                    case 3:
                        ob.ticket();
                        break;
                    case 4:
                        again="no";
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"wrong option ");
                        break;
                }
            }
        }
    }
}
class Another
{
    Scanner sc =new Scanner(System.in);
    public String email,password,phnum,Name,starting,destination,train,password1;
    public int login = 0,number,reserved=0;
    void login()
    {
        JOptionPane.showMessageDialog(null,"please enter the email and password to login");
        Name=JOptionPane.showInputDialog("Enter your Name");
        email=JOptionPane.showInputDialog("Enter your E-mail");
        password=JOptionPane.showInputDialog("Enter your Password");
        JOptionPane.showMessageDialog(null,"Hello "+Name+" ,you have loggedin successfully");
        login = 1;
    }
    public void reservation()
    {
        
        String stations [] ={"Adilabad","Benguluru","chennai","Delhi","Gujarat","Haryana","Jharkhand","Kerala","Lucknow","Mumbai","Nagaland",
            "Orissa","Punjab","Rajastan","Simla","Tiruvunantha Puram","Uttar Pradesh","Visakapatnam","West Bengal","Yelanaka"};
        JOptionPane.showMessageDialog(null,stations);  
        if(login == 0)
        {
            JOptionPane.showMessageDialog(null,"You haven't logged in ");
        }
        else
        {     
            String num=JOptionPane.showInputDialog("Enter no of tickets :");
            number=Integer.valueOf(num);
            destination=JOptionPane.showInputDialog("enter your Destination point:");
            starting=JOptionPane.showInputDialog("Enter your Starting point");
            train=JOptionPane.showInputDialog("enter your train name:");
            JOptionPane.showMessageDialog(null,"TICKETS BOOKED SUCCESSFULLY");
            reserved=1;
        }
    }
    public void ticket()
    {
        if(reserved== 1)
        {
            JOptionPane.showMessageDialog(null,"\n-----------------------------------------------------------------------------------------\nTICKET\nNAME: "+Name+" \nSTARTING POINT: "+starting+" DESTINATON POINT: "+destination+"\nTRAIN NAME: "+train+"\nNUMBER OF TICKETS: "+number+"\n-----------------------------------------------------------------------------------------");
        }
    else
    {
        JOptionPane.showMessageDialog(null,"You Haven't reserved any ticket");
    }
    }
    public void cancellation()
    {
        if(reserved== 1)
        {
            String pnr = JOptionPane.showInputDialog("enter your PNR status:");
            starting=null;
            destination=null;
            number=0;
            train=null;
            JOptionPane.showMessageDialog(null,"your ticket cancelled successfully with PNR"+pnr);
            reserved=0;
        }
        else
        {
            JOptionPane.showMessageDialog(null,"You Haven't reserved any ticket");
        }
    }
}
