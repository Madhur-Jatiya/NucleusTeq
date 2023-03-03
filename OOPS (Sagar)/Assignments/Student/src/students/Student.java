package students;

public class Student {

    private int rollNumber;
    private String name;
    private String course;
    private int marks1;
    private int marks2;
    private int marks3;

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getMarks1() {
        return marks1;
    }

    public void setMarks1(int marks1) {
        this.marks1 = marks1;
    }

    public double getMarks2() {
        return marks2;
    }

    public void setMarks2(int marks2) {
        this.marks2 = marks2;
    }

    public double getMarks3() {
        return marks3;
    }

    public void setMarks3(int marks3) {
        this.marks3 = marks3;
    }

    @Override
    public String toString() {
        return "Students{" + "rollNumber=" + rollNumber + ", name=" + name + ", course=" + course + ", marks1=" + marks1 + ", marks2=" + marks2 + ", marks3=" + marks3 + '}';
    }

    public int calculateTotal() {
        return marks1 + marks2 + marks3;
    }

    public double calculateAverage() {
        return (marks1 + marks2 + marks3)/3;
    }

    public String calculateGrade() {
        double average = calculateAverage();
        if (average >= 90) {
            return "O";
        } else if (average >= 80) {
            return "A+";
        } else if (average >= 70) {
            return "A";
        } else if (average >= 60) {
            return "B+";
        } else if (average >= 50) {
            return "B";
        } else if (average >= 40) {
            return "C";
        } else if (average >= 45) {
            return "p";
        } else {
            return "F";
        }
    }
}
