public class TestPerson {
    public static void main(String[] args) {
       
        Student s1 = new Student("Santhiya", 20, "IT");
        Student s2 = new Student("Ramu", 22, "CSE");

        s2.setAge(-5);
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
        System.out.println("Dept: " + s1.getDepartment());
        System.out.println("\nName: " + s2.getName());
        System.out.println("Age: " + s2.getAge());
        System.out.println("Dept: " + s2.getDepartment());
        System.out.println("\nTotal Students Created: " + Student.getStudentCount());
    }
}

class Student {
    private String name;
    private int age;
    private String department;
    private static int studentCount = 0;
    public Student() {
        System.out.println("Default Student Created");
        studentCount++;
    }

    public Student(String name, int age, String department) {
        this();  
        this.setName(name);
        this.setAge(age);
        this.setDepartment(department);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name.length() <= 30) {
            this.name = name;
        } else {
            System.out.println("Invalid Name");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 60) {
            this.age = age;
        } else {
            System.out.println("Invalid Age (18-60 only)");
        }
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        if (department != null && !department.isEmpty()) {
            this.department = department;
        } else {
            System.out.println("Invalid Department");
        }
    }

    public static int getStudentCount() {
        return studentCount;
    }
}