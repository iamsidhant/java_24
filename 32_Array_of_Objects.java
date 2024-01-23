class Student
{
    int rollno;
    String name;
    int marks;
}

class Demo{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.rollno = 29;
        s1.name = "Sidhant";
        s1.marks = 96; 

        Student s2 = new Student();
        s2.rollno = 6;
        s2.name = "Ekam";
        s2.marks = 97; 

        Student s3 = new Student();
        s3.rollno = 11;
        s3.name = "Ishita";
        s3.marks = 67;

        Student s4 = new Student();
        s4.rollno = 8;
        s4.name = "Aashima";
        s4.marks = 87;

        Student s5 = new Student();
        s5.rollno = 3;
        s5.name = "Anjali";
        s5.marks = 95;

        Student s6 = new Student();
        s6.rollno = 9;
        s6.name = "Shreyas";
        s6.marks = 93;

        Student s7 = new Student();
        s7.rollno = 4;
        s7.name = "Sanjana";
        s7.marks = 77;

        // System.out.println(s1.name + ": " + s1.marks); 
        // System.out.println(s2.name + ": " + s2.marks);
        // System.out.println(s3.name + ": " + s3.marks);
        // System.out.println(s4.name + ": " + s4.marks);
        // System.out.println(s5.name + ": " + s5.marks);
        // System.out.println(s6.name + ": " + s6.marks);
        // System.out.println(s7.name + ": " + s7.marks);

        Student students[] = new Student[7];
        students[0] = s1; 
        students[1] = s2; 
        students[2] = s3; 
        students[3] = s4; 
        students[4] = s5; 
        students[5] = s6; 
        students[6] = s7; 

        for(int i = 0; i < students.length; i++){
            System.out.println(students[i].name + ": " + students[i].marks);
        }

        // int nums[] = new int[6];
        // nums[0] = 4;
        // nums[1] = 8;
        // nums[2] = 3;
        // nums[3] = 9;

        // for(int i = 0; i < nums.length; i++){
        //     System.out.println(nums[i]);
        // }

    }
}
