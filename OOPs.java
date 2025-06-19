public class OOPs {
    // creating class students which is a blue print for an object
    public static class Students {
        int rolno;
        String name;
        int Class;

        // creating a constructor which is called by object automatically
        public Students(int rolno, String name, int Class) {
            this.rolno = rolno;
            this.name = name;
            this.Class = Class;
        }
    }

    public static void Print(Students s1) {
        System.out.println(s1.name);
        System.out.println(s1.rolno);
        System.out.println(s1.Class);

    }

    public static void main(String[] args) {
        // creating an object s1 which is an instance of class Students
        Students s1 = new Students(1, "keshav", 12);
        Print(s1);
    }
}
