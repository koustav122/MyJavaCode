// //import java.util.*;
// class University {
//     private String universityName;
//     private String location;

//     public University(String universityName, String location) {
//         this.universityName = universityName;
//         this.location = location;
//     }
//     public String getUniversityName() {
//         return universityName;

//     }
//     public String getLocation() {
//         return location;
//     } 
// }
// class College extends University {
//    private String collegeName;
//    public College(String universityName, String location, String collegeName) {
//      super(universityName, location);
//      this.collegeName = collegeName;
//    }
//    public String getCollegeName() {
//        return collegeName;
//    }

// }
// class Student extends College {
//     private String studentName;
//     private String courseName;
//     private int feesPaid;
//     private  static int totalFees = 0;

//     public Student(String universityName, String location, String collegeName,
//     String studentName, String courseName, int feesPaid) {
//         super(universityName, location, collegeName);
//         this.studentName = studentName;
//         this.courseName = courseName;
//         this.feesPaid = feesPaid;
//         totalFees += feesPaid;
//     }
//     public String getStudentName() {
//         return studentName;
//     }
//      public String getCourseName() {
//         return courseName;
//     }
//      public int getFeesPaid() {
//         return feesPaid;
//     }
//      public int getTotalFees() {
//         return totalFees;
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         // Create Student objects
//         Student s1 = new Student("Oxford University", "London", "Trinity College",
//                                  "Alice", "Computer Science", 20000);
//         Student s2 = new Student("Oxford University", "London", "Balliol College",
//                                  "Bob", "Mathematics", 25000);

//         // Print details of student1
//         System.out.println("University Name: " + s1.getUniversityName());
//         System.out.println("Location: " + s1.getLocation());
//         System.out.println("College Name: " + s1.getCollegeName());
//         System.out.println("Student Name: " + s1.getStudentName());
//         System.out.println("Course Name: " + s1.getCourseName());
//         System.out.println("Fees Paid: " + s1.getFeesPaid());

//         // Print total fees of all students
//         System.out.println("\nTotal Fees Paid by all students: " + Student.getTotalFees());
//     }
// }











class University {
    private String universityName;
    private String location;

    public University(String universityName, String location) {
        this.universityName = universityName;
        this.location = location;
    }

    public String getUniversityName() {
        return universityName;
    }

    public String getLocation() {
        return location;
    }

    // 👉 main() moved here
    public static void main(String[] args) {
        Student s1 = new Student("Oxford University", "London", "Trinity College",
                                 "Alice", "Computer Science", 20000);
        Student s2 = new Student("Oxford University", "London", "Balliol College",
                                 "Bob", "Mathematics", 25000);

        System.out.println("University Name: " + s1.getUniversityName());
        System.out.println("Location: " + s1.getLocation());
        System.out.println("College Name: " + s1.getCollegeName());
        System.out.println("Student Name: " + s1.getStudentName());
        System.out.println("Course Name: " + s1.getCourseName());
        System.out.println("Fees Paid: " + s1.getFeesPaid());

        System.out.println("\nTotal Fees Paid by all students: " + Student.getTotalFees());
    }
}

class College extends University {
    private String collegeName;

    public College(String universityName, String location, String collegeName) {
        super(universityName, location);
        this.collegeName = collegeName;
    }

    public String getCollegeName() {
        return collegeName;
    }
}

class Student extends College {
    private String studentName;
    private String courseName;
    private int feesPaid;
    private static int totalFees = 0;

    public Student(String universityName, String location, String collegeName,
                   String studentName, String courseName, int feesPaid) {
        super(universityName, location, collegeName);
        this.studentName = studentName;
        this.courseName = courseName;
        this.feesPaid = feesPaid;
        totalFees += feesPaid;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public static int getTotalFees() {
        return totalFees;
    }
}
