package functions;

import java.util.*;
import java.util.logging.Logger;
import java.util.logging.Level;

import assigingvalues.Assignvalues;

public class Functions
{
    public HashMap<String,String> Student = new HashMap<>();
    private Scanner sc = new Scanner(System.in);
    private Logger l = Logger.getLogger("Functions");
    private String name;
    private String grade;
    private String gpa;


    public void insert()
    {
        l.info("\n Enter Student Name Followed by  Initial : ");
        name = sc.nextLine();
        l.info(" Grade Details .....");
        l.info("\n  A -> 4 Points \n  B -> 3 Points \n  C -> 2 Points \n  D -> 1 Point \n");
        l.info("\n Enter Here : ");
        grade = sc.nextLine();
        gpa = calgpa(grade);
        new Assignvalues(name,grade,gpa);
        Student.put(name, gpa);
    }

    public void upgpa()
    {
        l.info("\n Enter Student Name Followed by  Initial : ");
        name = sc.nextLine();
        if(Student.containsKey(name))
        {
            l.info("\n Enter your new grade: ");
            String newgrade = sc.next();
            gpa = calgpa(newgrade);
            Student.replace(name, newgrade);
        }
        else
            l.info(" Student Dose not Exists ...");
    }

    public void display()
    {
        for (String studentName : Student.keySet())
            l.log(Level.INFO,()->studentName+" has "+Student.get(studentName)+" GPA.");
    }

    private String calgpa(String grade)
    {
        switch (grade)
        {
            case "A" -> gpa = "4";
            case "B" -> gpa = "3";
            case "C" -> gpa = "2";
            case "D" -> gpa = "1";
            default -> l.info("\n Enter the valid grade A to D");
        }
        return gpa;
    }
}