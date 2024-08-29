package University;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Student> studentList = new ArrayList();
    public static ArrayList<Faculty> facultyList= new ArrayList<>();
    public static ArrayList<Course> courseList= new ArrayList<>();


    // Check already exist
    public static boolean alreadyExistStudent(int s) {
        boolean flag = false;
        for (Student x : studentList) {
            if (x.getStudentId() == s) {
                flag = true;
                return true;
            }
        }
        return flag;
    }

    public static boolean alreadyExistCourse(String s) {
        boolean flag = false;
        for (Course x : courseList) {
            if (x.getCourseId() == s) {
                flag = true;
                return true;
            }
        }
        return flag;
    }

    public static boolean alreadyExistFaculty(int s) {
        boolean flag = false;
        for (Faculty x : facultyList) {
            if (x.getFacultyId() == s) {
                flag = true;
                return true;
            }
        }
        return flag;
    }




    // Add & Drop Student
    public static void addStudent(Student s) {
        boolean result = alreadyExistStudent(s.getStudentId());
        if (result == false) {
            studentList.add(s);
            System.out.println("\nStudent Added successfull!");
            Student.increaseNumberofStudent();
        } else {
            System.out.println("\nStudent already Added!");
        }

    }

    public static void dropStudent(int studentId) {
        int r=searchStudentById(studentId);
            if(r>=0){
                studentList.remove(r);
                Student.decreaseNumberofStudent();
                System.out.println("\nStudent deleted from the course successfully!");

            }
        else{
             System.out.println("\nStudent is not in the course!!");
        } 
    }

    // Add and Delete a student to a course
    public static void addAStudentToACoure(int a, String b){
        int n=searchStudentById(a);
        if(n==-100){
            System.out.println("Student haven't in the student list");
        }
        else{
            int n1= searchCourseById(b);
            if(n1==-100){
                System.out.println("Course haven't in the course list");
            }
            else{
                courseList.get(n1).setStudentList(studentList.get(n));
                System.out.println("Added Successfully!");
            }
        }
    }

    public static void deleteAStudentToACoure(int a, String b){
        
        int n1= searchCourseById(b);
        if(n1==-100){
            System.out.println("Course haven't in the course list");       
        }
        else{
            
           Course c= courseList.get(n1);
           int n=c.searchStudentToACourse(a);
            if(n==-100){
                System.out.println("Student haven't in the course");
            }
            else{
                c.deleteStudent(n);
                System.out.println("\nDelete Successfully!");
            }
        }
    }
    // Student search
    public static int searchStudentById(int id) {
        int flag = -100;
        int count = 0;
        for (Student x : studentList) {
            if (id != x.getStudentId()) {
                count++;
            } else {
                return count;
            }
        }
        return flag;
    }

    // Update Student
    public static void updateStudentId(int index, int id) {

        studentList.get(index).setStudentId(id);
    }

    public static void updateStudentName(int index, String name) {
        studentList.get(index).setStudentName(name);
    }

    public static void updateStudentCGPA(int index, double cgpa) {
        studentList.get(index).setStudentCGPA(cgpa);
    }




    // Add & Drop Faculty
    public static void addFaculty(Faculty s) {
        boolean result = alreadyExistFaculty(s.getFacultyId());
        if (result == false) {
            facultyList.add(s);
            System.out.println("\nFaculty Added successfull!");
        } else {
            System.out.println("\nFaculty already Added!");
        }

    }

    public static void dropFaculty(int facultyId) {
        int r=searchFacultyById(facultyId);
            if(r>=0){
                facultyList.remove(r);
                System.out.println("\nFaculty deleted from the course successfully!");
            }
        else{
             System.out.println("\nFaculty is not in the course!!");
        } 
    }

    // Faculty search
    public static int searchFacultyById(int id) {
        int flag = -100;
        int count = 0;
        for (Faculty x : facultyList) {
            if (id != x.getFacultyId()) {
                count++;
            } else {
                return count;
            }
        }
        return flag;
    }

    // Update Faculty
    public static void updateFacultyId(int index, int id) {

        facultyList.get(index).setFacultyId(id);
    }

    public static void updateFacultyName(int index, String name) {
        facultyList.get(index).setFacultyName(name);
    }

    public static void updateFacultyPosition(int index, String pos) {
        facultyList.get(index).setFacultyPosition(pos);
    }

    // Add and Delete a Faculty to a Course
    public static void addAFacultyToACourse(int a, String b){
        int n=searchFacultyById(a);
        if(n==-100){
            System.out.println("Faculty haven't in the Faculty list");
        }
        else{
            int n1= searchCourseById(b);
            if(n1==-100){
                System.out.println("Course haven't in the course list");
            }
            else{
                courseList.get(n1).setFaculty(facultyList.get(n));
                System.out.println("Added Successfully!");
            }
        }
    } 
    
    public static void deleteAFacultyToACoure(int a, String b){
        
        int n1= searchCourseById(b);
        if(n1==-100){
            System.out.println("Course haven't in the course list");       
        }
        else{
            Course c= courseList.get(n1);
            if(c.getFaculty()==null){
                System.out.println("Faculty haven't in this course");
            }
            else{
                c.deleteFaculty();
                System.out.println("\nDelete Successfully!");
            }
        }
    }

   
    
    // Add & Drop Course
    public static void addCourse(Course s) {
        boolean result = alreadyExistCourse(s.getCourseId());
        if (result == false) {
            courseList.add(s);
            System.out.println("\nCourse Added successfull!");

        } else {
            System.out.println("\nCourse already Added!");
        }

    }

    public static void dropCourse(String courseId) {
        int r=searchCourseById(courseId);
            if(r>=0){
                courseList.remove(r);
                System.out.println("\nCourse deleted from the course successfully!");
            }
            else{
                System.out.println("\nCourse is not in the course!!");
            } 
    }

    // Course search
    public static int searchCourseById(String id) {
        int flag = -100;
        int count = 0;
        for (Course x : courseList) {
            if (!id.equals(x.getCourseId())) {
                count++;
            } else {
                return count;
            }
        }
        return flag;
    }

    
    // Update Course
    public static void updateCourseId(int index, String id) {

        courseList.get(index).setCourseId(id);
    }

    public static void updateCourseTitle(int index, String title) {
        courseList.get(index).setCourseTitle(title);
    }

    public static void updateCourseCredit(int index, double credit) {
        courseList.get(index).setCredit(credit);
    }



    
    // Print
    public static void printStudentList(ArrayList<Student> studentList) {
        System.out.println("\n");
        System.out.println("The students " + studentList.size() + " are: ");
        for (Student x : studentList) {
            System.out.println(x.toString());
        }
    }

    public static void printFacultyList(ArrayList<Faculty> facultyList) {
        System.out.println("\n");
        System.out.println("The Faculty " + facultyList.size() + " are: ");
        for (Faculty x1 : facultyList) {
            System.out.println(x1.toString());
        }
    }

    public static void printCourseList(ArrayList<Course> courseList) {
        System.out.println("\n");
        System.out.println("The Course " + courseList.size() + " are: ");
        for (Course x2 : courseList) {
            System.out.println(x2.toString());
        }
    }

    public static void printAStudent(int id){
        int r=searchStudentById(id);
        if(r==-100){
            System.out.println("Student haven'n in this Student list!");
        }
        else{
            Student s1=studentList.get(r);
            System.out.println(s1.toString());
        }
    }

    
    public static void printACourse(String id){
        int r=searchCourseById(id);
        if(r==-100){
            System.out.println("Course haven'n in this Course list!");
        }
       else{
            Course s2=courseList.get(r);
            System.out.println(s2.toString());
       }
    }

    public static void printAFaculty(int id){
        int r=searchFacultyById(id);
        if(r==-100){
            System.out.println("Faculty haven'n in this faculty list!");
        }
        else{
            Faculty s3=facultyList.get(r);
            System.out.println(s3.toString());
        }
    }

    
    public static void printStudentListAndFacultyInformationOfACourse(String s){
        int r= searchCourseById(s);
        if(r==-100){
            System.out.println("Course haven't in the course list!");
        }
        else{
            Course c= courseList.get(r);
            c.printStudentList();
            System.out.println(c.getFaculty().toString());
        }
    }
    
    public static void printCoursesTakenByAStudent(int a){
        int flag=-100;
        int count=0;
        int st=searchStudentById(a);
        if(st==-100){
            System.out.println("This student is not in this course");
        }
        else{
            for(Course x: courseList){
            int r=x.searchStudentToACourse(a);
            if(r==-100){
                count++;
            }
            else
            {
                flag=200;
                break;
                }
            }
            if(flag==200){
                System.out.println(courseList.get(count).toString());
            }
        }
    }


    // Search Method

    public static void searchAStudent(int a){
        int r= searchStudentById(a);
        if(r==-100){
            System.out.println("Not Found!!!");
        }
        else{
            System.out.println("Yes Found!");
            System.out.println(studentList.get(r).toString());
        }
    }

    public static void  searchACourse(String s){
        int r= searchCourseById(s);
        if(r==-100){
            System.out.println("Not Found!!!");
        }
        else{
            System.out.println("Yes Found!");
            System.out.println(courseList.get(r).toString());
        }
    }


    public static void searchAFaculty(int a){
        int r= searchFacultyById(a);
        if(r==-100){
            System.out.println("Not Found!!!");
        }
        else{
            System.out.println("Yes Found!");
            System.out.println(facultyList.get(r).toString());
        }
    }

    public static void searchWhetherAStudentTakesACourse(int a){
        int flag=-100;
        int count=0;
        int st=searchStudentById(a);
        if(st==-100){
            System.out.println("This student is not in this Student List");
        }
        else{
            for(Course x: courseList){
                int r=x.searchStudentToACourse(a);
                if(r==-100){
                    count++;
                }
                else
                {
                    flag=200;
                    break;
                }
            }
            if(flag==200){
                System.out.println("Yes, this student does the course !");
                System.out.println("The Course is: "+courseList.get(count).toString());
            }
            else{
                System.out.println("No this student does not the course !");
            }
        }
    }

    public static void earchWhetherAFacultyTeachesACourse(int a){
        int flag=-100;
        int count=0;
        int st=searchFacultyById(a);
        if(st==-100){
            System.out.println("This faculty is not in this faculty List");
        }
        else{
            for(Course x: courseList){
                if(x.getFaculty().getFacultyId()!=a){
                    count++;
                }
                else{
                    flag=200;
                    break;
                }
            }
            if(flag==200){
                System.out.println("Yes, this faculty teaches the course !");
                System.out.println("The Course is: "+courseList.get(count).toString());
            }
            else{
                System.out.println("No, this faculry does not teaches the course !");
            }
        }
    }

    public static void searchCoursesTakenByAStudent(int a){
        int flag=-100;
        int st=searchStudentById(a);
        if(st==-100){
            System.out.println("This Student is not in this Student List");
        }
        else{
            for(Course x: courseList){
                if(x.searchStudentToACourse(a)!=-100){
                    System.out.println(x.toString());
                    flag=200;
                }
            }
            if(flag==-100){
               System.out.println("This Student does not takes any course !");
            }
        }
    }
   
    public static void searchCoursesTaughtByAFaculty(int a){
        int flag=-100;
        int st=searchFacultyById(a);
        if(st==-100){
            System.out.println("This faculty is not in this faculty List");
        }
        else{
            for(Course x: courseList){
                if(x.getFaculty().getFacultyId()==a){
                    System.out.println(x.toString());
                    flag=200;
                }
            }
            if(flag==-100){
               System.out.println("This faculty does not teaches any course !");
            }
        }
    }






    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // For All recuire
        while (true) {
            System.out.println("1. Add\n2. Delete\n3. Update\n4. Print\n5. Search\n6. Exist");
            int x = input.nextInt();
            if (x == 6) {
                break;
            } 
            else {
                switch (x) {

                    // For add
                    case 1:
                        while (true) {
                            System.out.println("\t1. Add a Student\n\t2. Add a Course\n\t3. Add a Faculty\n\t4. Add a student to a course\n\t5. Add a faculty to a course\n\t6. Exist");
                            System.out.print("\t");
                            int y = input.nextInt();
                            if (y == 6) {
                                break;
                            } else {
                                switch (y) {
                                    case 1:
                                        System.out.print("Enter Student Id: ");
                                        int id = input.nextInt();

                                        input.nextLine();

                                        System.out.print("Enter Student Name: ");
                                        String name = input.nextLine();
                                        System.out.print("Enter Student CGPA: ");
                                        double cgpa = input.nextDouble();

                                        Student s = new Student(id, name, cgpa);
                                        addStudent(s);
                                        break;

                                    case 2:
                                        input.nextLine();
                                        System.out.print("Enter Course Id: ");
                                        String cid = input.nextLine();
                                        System.out.print("Enter Course title: ");
                                        String ct = input.nextLine();
                                        System.out.print("Enter Course credit: ");
                                        double ccredit = input.nextDouble();

                                        Course c1 = new Course(cid, ct, ccredit);
                                        addCourse(c1);
                                        System.out.println("\nCourse added successfull!");
                                        break;

                                    case 3:
                                        System.out.print("Enter Faculty Id: ");
                                        int fid = input.nextInt();

                                        input.nextLine();

                                        System.out.print("Enter Faculty Name: ");
                                        String fname = input.nextLine();
                                        System.out.print("Enter Faculty Position: ");
                                        String fp = input.nextLine();

                                        Faculty f1 = new Faculty(fid, fname, fp);
                                        addFaculty(f1);
                                        break;
                                    case 4:
                                        System.out.print("Enter student Id: ");
                                        int stid =input.nextInt();

                                        System.out.print("Enter course Id: ");                                         
                                        input.nextLine();
                                        String csid= input.nextLine();
                                        addAStudentToACoure(stid, csid);
                                        break;
                                    case 5:
                                        System.out.print("Enter faculty Id: ");
                                        int stid1 =input.nextInt();

                                        System.out.print("Enter course Id: ");
                                        input.nextLine();
                                        String csid1= input.nextLine();
                                        addAFacultyToACourse(stid1, csid1);
                                        break;

                                }
                            }
                        }
                        break;

                        // For Delete
                    case 2:
                        while (true) {
                            System.out.println("\t1. Delete a Student\n\t2. Delete a Course\n\t3. Delete a Faculty\n\t4. Delete a student to a course\n\t5. Delete a faculty to a course\n\t6. Exist");
                            System.out.print("\t");
                            int z = input.nextInt();
                            if (z == 6) {
                                break;
                            } else {
                                switch (z) {
                                    case 1:
                                        System.out.print("Enter Student Id: ");
                                        int id = input.nextInt();

                                        dropStudent(id);
                                        break;

                                    case 2:
                                        input.nextLine();
                                        System.out.print("Enter Course Id: ");
                                        String cid = input.nextLine();
                                        dropCourse(cid);
                                        break;

                                    case 3:
                                        System.out.print("Enter Faculty Id: ");
                                        int fid = input.nextInt();

                                        dropFaculty(fid);
                                        break;
                                    case 4:
                                        System.out.print("Enter student Id: ");
                                        int stid =input.nextInt();

                                        System.out.print("Enter course Id: ");                                         
                                        input.nextLine();
                                        String csid= input.nextLine();
                                        deleteAStudentToACoure(stid, csid);
                                        break;
                                    case 5:
                                        System.out.print("Enter faculty Id: ");
                                        int stid1 =input.nextInt();

                                        System.out.print("Enter course Id: ");
                                        input.nextLine();
                                        String csid1= input.nextLine();
                                        deleteAFacultyToACoure(stid1, csid1);
                                        break;

                                }
                            }
                        }
                        break;
                        

                        // For Update
                    case 3:
                        while (true) {
                            System.out.println("\t1. Update a Student\n\t2. Update a Course\n\t3. Update a Faculty\n\t4. Exist");
                            System.out.print("\t");
                            int z = input.nextInt();
                            if (z == 4) {
                                break;
                            } 
                            else {
                                switch (z) {

                                    // For Student Update
                                    case 1:
                                        System.out.print("Enter Student Id: ");
                                        int id = input.nextInt();
                                        int result= searchStudentById(id);
                                        if(result==-100){
                                            System.out.println("ID is not valid!");
                                            break;
                                        }
                                        else
                                        {
                                            while (true) {
                                                System.out.println("\t\t1. Update Student Id\n\t\t2. Update Student Name\n\t\t3. Update CGPA\n\t\t4. Exist");
                                                 System.out.print("\t\t");
                                                int w = input.nextInt();
                                                if (w == 4) {
                                                break;
                                                }
                                                else {
                                                 switch (w) {
                                                      case 1:
                                                            System.out.print("Enter Update ID: ");
                                                            int updateId=input.nextInt();
                                                            updateStudentId(result, updateId);
                                                            System.out.println("Id update succesful!");
                                                            break;
                                                        case 2: 
                                                            System.out.print("Enter Update Name: ");
                                                            input.nextLine();
                                                            String updateName=input.nextLine();
                                                            updateStudentName(result, updateName);
                                                            System.out.println("Name update succesful!");
                                                            break;
                                                        case 3: 
                                                            System.out.print("Enter Update CGPA: ");
                                                            input.nextLine();
                                                            double updateCgpa=input.nextDouble();
                                                            updateStudentCGPA(result, updateCgpa);
                                                            System.out.println("CGPA update succesful!");
                                                            break;
                                                    }
                                                }
                                            }
                                        }
                                        break;
                                            

                                        // Update Course
                                    case 2:
                                        System.out.print("Enter Course Id: ");
                                        input.nextLine();
                                        String cid = input.nextLine();
                                        int result1= searchCourseById(cid);
                                        if(result1==-100){
                                            System.out.println("ID is not valid!");
                                            break;
                                        }
                                        else
                                        {
                                            while (true) {
                                                System.out.println("\t\t1. Update Course Id\n\t\t2. Update Course Title\n\t\t3. Update Course credit\n\t\t4. Exist");
                                                 System.out.print("\t\t");
                                                int w = input.nextInt();
                                                if (w == 4) {
                                                break;
                                                }
                                                else {
                                                 switch (w) {
                                                      case 1:
                                                            System.out.print("Enter Update Coure ID: ");
                                                            input.nextLine();
                                                            String updateCid = input.nextLine();
                                                            updateCourseId(result1, updateCid);
                                                            System.out.println("Course Id update succesful!");
                                                            break;
                                                        case 2: 
                                                            System.out.print("Enter Update Title: ");
                                                            input.nextLine();
                                                            String updateTitle=input.nextLine();
                                                            updateCourseTitle(result1, updateTitle);
                                                            System.out.println("Title update succesful!");
                                                            break;
                                                        case 3: 
                                                            System.out.print("Enter Update Course credit: ");
                                                            input.nextLine();
                                                            double updateCredit=input.nextDouble();
                                                            updateCourseCredit(result1, updateCredit);
                                                            System.out.println("Credit update succesful!");
                                                            break;
                                                    }
                                                }
                                            }
                                        }
                                        break;
                                            

                                        // Update Faculty
                                    case 3:
                                        System.out.print("Enter Faculty Id: ");
                                        input.nextLine();
                                        int fid = input.nextInt();
                                        int result2= searchFacultyById(fid);
                                        if(result2==-100){
                                            System.out.println("ID is not valid!");
                                            break;
                                        }
                                        else
                                        {
                                            while (true) {
                                                System.out.println("\t\t1. Update Faculty Id\n\t\t2. Update Faculty Name\n\t\t3. Update Faculty Position\n\t\t4. Exist");
                                                System.out.print("\t\t");
                                                int w = input.nextInt();
                                                if (w == 4) {
                                                break;
                                                }
                                                else {
                                                switch (w) {
                                                    case 1:
                                                            System.out.print("Enter Update Coure ID: ");
                                                            input.nextLine();
                                                            int updatefid = input.nextInt();
                                                            updateFacultyId(result2, updatefid);
                                                            System.out.println("Faculty Id update succesful!");
                                                            break;
                                                        case 2: 
                                                            System.out.print("Enter Update Faculty Name: ");
                                                            input.nextLine();
                                                            String updateFName=input.nextLine();
                                                            updateFacultyName(result2, updateFName);
                                                            System.out.println("Faculty Name update succesful!");
                                                            break;
                                                        case 3: 
                                                            System.out.print("Enter Update Faculty Position: ");
                                                            input.nextLine();
                                                            String updateFPos=input.nextLine();
                                                            updateFacultyPosition(result2, updateFPos);
                                                            System.out.println("Faculty Position update succesful!");
                                                            break;
                                                    }
                                                }
                                            }
                                        }
                                        break;
                                }                        
                            }
                        }
                        break;

                        // Print
                    case 4:
                        while (true) {
                            System.out.println("\n\t1. Print all students\n\t2. Print all course\n\t3. Print all faculties\n\t4. Print information of a student"+
                            "\n\t5. Print information of a course\n\t6. Print information of a faculty\n\t7. Print student list and faculty information of a course"+
                            "\n\t8. Print courses taken by a student\n\t9. Exist");
                            System.out.print("\t");
                            int y = input.nextInt();
                            if (y == 9) {
                                break;
                            } else {
                                switch (y) {
                                    case 1:
                                        printStudentList(studentList);
                                        break;
                                    case 2:
                                        printCourseList(courseList);
                                        break;
                                    case 3:
                                        printFacultyList(facultyList);
                                        break;
                                    case 4:
                                        System.out.print("\t\tEnetr student Id: ");
                                        int pStudentId=input.nextInt();
                                        printAStudent(pStudentId);
                                        break;
                                    case 5:
                                        System.out.print("\t\tEnter Course ID: ");
                                        input.nextLine();
                                        String pCourseid= input.nextLine();
                                        printACourse(pCourseid);
                                        break;
                                    case 6:
                                        System.out.print("\t\tEnetr Faculty Id: ");
                                        int pFacultyId=input.nextInt();
                                        printAFaculty(pFacultyId);
                                        break;
                                    case 7:
                                        System.out.print("\t\tEnter Course ID: ");
                                        input.nextLine();
                                        String pCourseid1= input.nextLine();
                                        printStudentListAndFacultyInformationOfACourse(pCourseid1);
                                        break;
                                    case 8:
                                        System.out.print("\t\tEnetr student Id: ");
                                        int pStudentId1=input.nextInt();
                                        printCoursesTakenByAStudent(pStudentId1);
                                        break;    
                                }
                            }
                        }
                        break;


                        //Search
                    case 5:
                        while (true) {
                            System.out.println("\n\t1. Search a Student\n\t2. Search a Course\n\t3. Search a Faculty\n\t4. Search whether a student takes a course"+
                            "\n\t5. Search whether a faculty teaches a course\n\t6. Search courses taken by a student\n\t7. Search courses taught by a faculty"+
                            "\n\t8. Exist");
                            System.out.print("\t");
                            int y = input.nextInt();
                            if (y == 8) {
                                break;
                            } else {
                                switch (y) {
                                    case 1:
                                        System.out.print("\t\tEnetr a student Id: ");
                                        int pStudentId1=input.nextInt();
                                        searchAStudent(pStudentId1);
                                        break;
                                    case 2:
                                        System.out.print("\t\tEnetr a course Id: ");
                                        input.nextLine();
                                        String pCourseId1=input.nextLine();
                                        searchACourse(pCourseId1);
                                        break;
                                    case 3:
                                        System.out.print("\t\tEnetr a faculty Id: ");
                                        int pFacultyId1=input.nextInt();
                                        searchAFaculty(pFacultyId1);
                                        break;
                                    case 4:
                                        System.out.print("\t\tEnetr student Id: ");
                                        int pStudentId=input.nextInt();
                                        searchWhetherAStudentTakesACourse(pStudentId);
                                        break;
                                    case 5:
                                        System.out.print("\t\tEnter faculty ID: ");
                                        int id=input.nextInt();
                                        earchWhetherAFacultyTeachesACourse(id);
                                        break;
                                    case 6:
                                        System.out.print("\t\tEnetr Student Id: ");
                                        int pFacultyId=input.nextInt();
                                        searchCoursesTakenByAStudent(pFacultyId);
                                        break;
                                    case 7:
                                        System.out.print("\t\tEnter Faculty ID: ");
                                        int pCourseid1= input.nextInt();
                                        searchCoursesTaughtByAFaculty(pCourseid1);
                                        break;
                                }
                            }
                        } 
                    }
            }
        }
        input.close();
    }
}
