import java.util.*;
public class SGradeCal
{
    Scanner sc=new Scanner(System.in);
    float IT,Electronics,C,Java,DSA,Project,Sum,Avg;
    void Accept()
    {
        System.out.println("Enter the MArks of Student for each Subject:");
        System.out.println("Enter Mark of The IT Subject:");
        IT=sc.nextFloat();
        System.out.println("Enter Mark of The Electronics Subject:");
        Electronics=sc.nextFloat();
        System.out.println("Enter Mark of The C Subject:");
        C=sc.nextFloat();
        System.out.println("Enter Mark of The Java Subject:");
        Java=sc.nextFloat();
        System.out.println("Enter Mark of The DSA Subject:");
        DSA=sc.nextFloat();
        System.out.println("Enter Mark of The Project Subject:");
        Project=sc.nextFloat();

    }
    String Grades()
    {
        Sum=IT+Electronics+C+Java+DSA+Project;
        Avg=Sum/6;
        if(Avg>=91 && Avg<=100)
        return "O";
        if(Avg>=81 && Avg<=90)
        return "A+";
        if(Avg>=71 && Avg<=80)
        return "A";
        if(Avg>=61 && Avg<=70)
        return "B";
        if(Avg>=51 && Avg<=60)
        return "C";
        if(Avg>=41 && Avg<=50)
        return "D";
        if(Avg>=0 && Avg<=40)
        return "Fail";
        else
        return "Error ";

    }
     public String toString()
    {
        return"\n....Marks of the Each Subject are:"+"\n>>>IT: "+IT+"\n>>>Electronics: "+Electronics+"\n>>>C: "+C+"\n>>>Java: "+Java+"\n>>>DSA: "+DSA+"\n>>>Project: "+Project;
    }
    public static void main(String[] ab) 
    {
        
        SGradeCal S1=new SGradeCal();
        S1.Accept();
        System.out.println(S1.toString());
       String Grade=S1.Grades();
       System.out.println("\n>>>Your Grade is:"+Grade);
       System.out.println("\n");
        
    }
    
}
