public class Grasshopper_GradeBook {
    public static char getGrade(int s1, int s2, int s3) {
        int x = (s1 + s2 + s3) / 3;

        if(90 <= x && x <= 100) {
            return 'A';
        }
        else if(80 <= x && x < 90) {
            return 'B';
        }
        else if(70 <= x && x < 80) {
            return 'C';
        }
        else if(60 <= x && x < 70) {
            return 'D';
        }
        else return 'F';
    }

    public static void main(String[] args) {
        System.out.println(getGrade(95, 90, 93));
        System.out.println(getGrade(82, 85, 87));
        System.out.println(getGrade(75, 70, 79));
        System.out.println(getGrade(60,82,76));
        System.out.println(getGrade(58,62,70));
    }
}
