public class cwh_27_arrays {
    public static void main(String[] args) {
        //
        int [] marks = {98, 45, 79, 99, 80};
        String [] students = {"Aryan", "Harray", "Sara", "Akansha", "Abhijeet"};

        System.out.println("print [0] of both arrays");
        System.out.println(marks[0]);
        System.out.println(students[0]);

        // length of array
        System.out.println("Lenght of arrays");
        System.out.println(marks.length);
        System.out.println(students.length);

        // Displaying array (naive method)
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        // Displaying array (FOR LOOP method)
        System.out.println("for loop-->");
        for (int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
        
        // Displaying array (FOR-Each loop)
        System.out.println("For-Each Loop--->");
        for (int element : marks) {
            System.out.println(element);
        }
    }
}
