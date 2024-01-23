class Student
{
    int rollno;
    String name;
    int marks;
}

class Demo{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.rollno = 6;
        s1.name = "Sidhant";
        s1.marks = 96; 

        Student s2 = new Student();
        s2.rollno = 3;
        s2.name = "Ekam";
        s2.marks = 97; 

        Student s3 = new Student();
        s3.rollno = 9;
        s3.name = "Shreyas";
        s3.marks = 100; 

        // System.out.println(s1.name + ": " + s1.marks);

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // for(int i = 0; i < students.length; i++){
        //     System.out.println(students[i].name + ": " + students[i].marks);
        // }

        for(Student stud: students){
            System.out.println(stud.name + ": " + stud.marks);
        }

        int nums[] = new int[4];
        nums[0] = 4;
        nums[1] = 8;
        nums[2] = 9;
        nums[3] = 3;

        // for(int i = 0; i < nums.length; i++){
        //     System.out.println(nums[i]);
        // }

        for(int n: nums)
        {
            System.out.println(n);
        }

    }
}
