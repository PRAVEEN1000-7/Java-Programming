class Student {
    String name;
    int mark;
    int rollno;
}

public class E_ArrayofObject {
    
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.name = "Pavi";
        s1.mark = 90;
        s1.rollno = 29;

        Student s2 = new Student();
        s2.name = "Sakthi";
        s2.mark = 99;
        s2.rollno = 33;

        Student s3 = new Student();
        s3.name = "Naveen";
        s3.mark = 95;
        s3.rollno = 26;

        Student s4 = new Student();
        s4.name = "Jevi";
        s4.mark = 90;
        s4.rollno = 15;

        Student s5 = new Student();
        s5.name = "LokiVerma";
        s5.mark = 98;
        s5.rollno = 21;

        Student stud[] = new Student[5];

        stud[0] = s1;
        stud[1] = s2;
        stud[2] = s3;
        stud[3] = s4;
        stud[4] = s5;

        for(Student s : stud){
            System.out.println(s.rollno+"."+s.name +":"+s.mark);
        }
        
    }
}
