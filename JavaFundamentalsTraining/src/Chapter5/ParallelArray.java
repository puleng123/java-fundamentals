package Chapter5;

public class ParallelArray {
    public static void main(String[] args) {
        String[] arrStudents = new String[]{"Jog","Tom","Dan","Ara"};
        int[] arrTestMarks = new int[]{50,56,100,40};

        int size = arrStudents.length;

        System.out.println("Student\tTestMark");
        for (int i = 0; i < size; i++)
        {
            System.out.println(arrStudents[i] + "\t\t\t" + arrTestMarks[i]);
        }
    }
}
