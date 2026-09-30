import java.util.Scanner;

class Student {
    long studentId;
    String name;
    String major;
    long phoneNumber;

    void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    long getStudentId() {
        return studentId;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setMajor(String major) {
        this.major = major;
    }

    String getMajor() {
        return major;
    }

    void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    long getPhoneNumber() {
        return phoneNumber;
    }
}

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");

            long studentId = sc.nextLong();
            String name = sc.next();
            String major = sc.next();
            long phoneNumber = sc.nextLong();

            students[i] = new Student();

            students[i].setStudentId(studentId);
            students[i].setName(name);
            students[i].setMajor(major);
            students[i].setPhoneNumber(phoneNumber);
        }

        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");

        for (int i = 0; i < 3; i++) {
            Student s = students[i];

            String phone = "0" + Long.toString(s.getPhoneNumber());

            String formattedPhone =
                    phone.substring(0, 3) + "-" +
                            phone.substring(3, 7) + "-" +
                            phone.substring(7, 11);

            System.out.println(
                    (i + 1) + "번째 학생: " +
                            s.getStudentId() + " " +
                            s.getName() + " " +
                            s.getMajor() + " " +
                            formattedPhone
            );
        }

        sc.close();
    }
}