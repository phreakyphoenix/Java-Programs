import java.io.*;
public class MarksMgmt
{
    public static void main(String args[])throws IOException
    {
        BufferedReader xy = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("**************");
        System.out.println("Faculty Portal");
        System.out.println("**************\n");

        System.out.print("Please enter the number of students: ");
        int strength=Integer.parseInt(xy.readLine());
        Student std[]=new Student[strength];
        for (int i=0;i<strength;i++)
        {
            std[i]=new Student();
            System.out.println("Enter Student details:");
            std[i].create();
            //std[i].display();
        }


        System.out.println("****************");
        System.out.println("Students' Report");
        System.out.println("****************\n");

        System.out.println("Name\t\tADA\t\tJava\t\tPython\t\tAverage");
        for (int i=0;i<strength;i++)
        {
            std[i].displayAll();
        }
    }
}
class Student
{
    String name;
    int marks[]=new int [3];                                    // for three subjects Algorithms D&A, Java, Python out of 100
    BufferedReader xy = new BufferedReader(new InputStreamReader(System.in));
    Student()
    {
        name="";
        marks[0]=marks[1]=marks[2]=0;
    }
    void create()throws IOException
    {
        System.out.print("Name: ");
        name=xy.readLine();
        System.out.print("ADA Marks: ");
        marks[0]=Integer.parseInt(xy.readLine());
        System.out.print("Java Marks: ");
        marks[1]=Integer.parseInt(xy.readLine());
        System.out.print("Python Marks: ");
        marks[2]=Integer.parseInt(xy.readLine());
        System.out.println();
    }
    void display()
    {
        System.out.println("Name:"+name);
        System.out.print("ADA marks is: "+marks[0]+"\t");
        System.out.print("Java marks is: "+marks[1]+"\t");
        System.out.println("Python marks is: "+marks[2]);
    }
    void displayAll()
    {
        System.out.print(name+"\t\t");
        System.out.print(marks[0]+"\t\t");
        System.out.print(marks[1]+"\t\t");
        System.out.print(marks[2]+"\t\t");
        System.out.format("%.2f\n",(marks[0]+marks[1]+marks[2])/3.0);
    }
}
