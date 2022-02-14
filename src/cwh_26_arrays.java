public class cwh_26_arrays {
    public static void main(String[] args) {
        // classroom of 5 students -- store marks of these students

        // Three ways of write an array------>
        
        // 1st--->   declaration and memory allocation together
        int [] marks = new int[5];  // marks (array of 5 elements)
        // initialization
        marks[0] = 100;
        marks[1] = 60;
        marks[2] = 70;
        marks[3] = 90;
        marks[4] = 86;
        marks[4] = 96; // overwrite

        System.out.println(marks[4]);

        // 2nd----->   Declaration then memory allocation
        int [] stu;
        stu = new int[5];
        // initialization 
        stu[0] = 24;
        stu[1] = 64;
        stu[2] = 54;
        stu[3] = 44;
        stu[4] = 94;

        // 3rd----->   Declaration and then initialization
        int[] lex = {23, 34, 45, 65};
    }
}