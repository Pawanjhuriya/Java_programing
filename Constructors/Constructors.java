public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Pawan";
        s1.roll = 1234;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 98;
        s1.marks[2] = 99;
    
        Student s2 = new Student(s1);
            s2.password = "xyz";
            s1.marks[2] = 100;
            s2.marks[1] = 100;
            for(int i=0; i<3; i++){
                System.out.println(s1.marks[i]);
            }
    }
    
}

class Student{
    String name;
    int roll;
    String password;
    int marks[];

    //copy constructors
    Student( Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    }


    Student(){
        marks = new int[3];
        System.out.println("Constructoes is called....");
    }
    Student(String name){
        marks = new int[3];
        this.name = name;
        this.marks = marks;
    }
    Student(int roll){
        marks = new int[3];
        this.roll = roll;
        this.marks = marks;
    }
   
}
