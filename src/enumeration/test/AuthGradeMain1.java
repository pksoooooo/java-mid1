package enumeration.test;

public class AuthGradeMain1 {
    static void main(String[] args) {
        for (AuthGrade value : AuthGrade.values()) {
            printAuthGrade(value);
        }
    }

    static void printAuthGrade(AuthGrade authGrade) {
        System.out.println("grade=" + authGrade.name() + ", level=" + authGrade.getLevel() + ", 설명=" + authGrade.getDescription());
    }
}
