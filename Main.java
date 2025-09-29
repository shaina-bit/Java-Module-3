
class Students {
    String Name;
    int roll;
    int sem;
    String Branch;
    String gender;

    Students(String name,int Roll,int SEM, String branch,String Gender){
        this.Name= name;
        this.roll=Roll;
        this.sem=SEM;
        this.Branch=branch;
        this.gender=Gender;
    }

    void displayInfo(){
        System.out.println("Name: " + Name);
        System.out.println("Roll no.: " + roll);
        System.out.println("Semester: " + sem);
        System.out.println("Branch: " + Branch);
        System.out.println("Gender:  " + gender );
    }
}

public class Main{
    public static void main(String [] args){
        Students s1= new Students("Shaina", 54, 3, "AIML","Female");
        Students s2= new Students("Gyan", 24, 1, "AIML","male");
        s1.displayInfo();
        s2.displayInfo();
    }
}
