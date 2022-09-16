public class Oops_1 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        String[] names = new String[5];
        int[] rno = new int[5];
        String[] name = new String[6];
        float[] marks = new float[5];

        // Student[] students;

        // Student harshit;
        Student harshit=new Student(7,"harshit chodvadiya",85.4f);

        ;
        // harshit.rno=7;
        // harshit.name="harshit chodvadiya";
        // harshit.marks=88.5f;

        // harshit.changeName("cricket lover");
        // harshit.greeting();

        System.out.println(harshit.rno);
        System.out.println(harshit.name);
        System.out.println(harshit.marks);
    }
}




class Student {
    int rno;
    String name;
    float marks;

    void greeting(){
        System.out.println("hello! my name is " + this.name);
    }

    void changeName(String newname){
        name=newname;
    }

    Student(){
        this.rno=7;
        this.name="harshit chodvadiya";
        this.marks=88.5f;
    }

    Student(int roll,String naam,float mark){
        // this.rno=rno;
        // this.name=name;
        // this.marks=marks;

        rno=roll;
        name=naam;
        marks=mark;        
    }
}