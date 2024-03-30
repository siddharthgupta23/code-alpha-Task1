/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author dell
 */
public class gradecalculator {
    
    public static void main(String args[])
    {
         cacluatemarks k= new cacluatemarks();
         k.getdata();
         k.showdata();
         k.summ__average_gradecalculation();
         
        
    }
}
class markks{
    int sub;
    int[] marks;
    void getdata(){
    System.out.println("enter how many subjects do you want to enter");
    marks=new int[45];
          Scanner scanner=new Scanner(System.in);
          sub=scanner.nextInt();
          System.out.println(" the subjects enterd by user "+sub);
          System.out.println("enter the marks by user");
         for(int i=0;i<sub;i++)
         {
             marks[i]=scanner.nextInt();
             
         }
          scanner.close();
      
    }
      
    void showdata(){
        for(int i=0;i<sub;i++)
        {
        System.out.println(" the marks enterd by users"+marks[i]);
        }
}
}
class cacluatemarks extends markks{
    int sum=0;
    float avg;
    void summ__average_gradecalculation()
    {
        for(int i=0;i<sub;i++)
        {
        sum=sum+marks[i];
        }
         System.out.println("the sum of marks "+sum);
        avg=sum/sub;
        System.out.println("the average percentage scored "+avg);
        if (avg>95.00)
        {
          System.out.println(" the grade is A+"); 
        }
        else if(avg>90.00)
        {
            System.out.println(" the grade is A");
            
        }
        else if (avg>80.00)
        {
             System.out.println(" the grade is b+");
             
        }
        else if(avg>70.00)
                
                {
                    System.out.println(" the grade is b");
                    
                }
        else if(avg>65)
        {
            System.out.println(" the garde is c");
            
        }
        else if (avg>50)
        {
            System.out.println(" the marks scored is d ");
            
        }
        else
        {
            System.out.println("  you are fail");
        }
    }
      
          
       
       
    }
    

