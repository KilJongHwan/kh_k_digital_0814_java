package 학생성적정렬;
// 미리 입력 받아 놓고 시작
// 5명의 학생에 대해 이름과 성적을 입력 성적이 높은 사람 순으로 정렬, 성적이 가틍면 이름 순 정렬

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class StudentSortEx {
    public static void main(String[] args) {
        TreeSet<StudentInfo> set = new TreeSet<>(new Compare());
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            System.out.print("Name Insert : ");
            String s = sc.next();
            System.out.print("Grade Insert : ");
            int a = sc.nextInt();
            set.add(new StudentInfo(s,a));
        }
        for (StudentInfo e : set){
            System.out.print("name : " + e.name + " grade : " + e.grade);
            System.out.println();
        }
    }
}
class StudentInfo{
    String name;
    int grade;

    public StudentInfo(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
}
class Compare implements Comparator<StudentInfo> {
    @Override
    public int compare(StudentInfo o1, StudentInfo o2) {
        if (o1.grade > o2.grade) return 1;
        else if (o1.grade == o2.grade) {
            return o1.name.compareTo(o2.name);
        }
        return -1;
    }
}
