public class Main {
    public static void main(String[] args) {
        Student student = new Student("Sai", 9295, 'A');
        StudentView studentView = new StudentView();
        StudentController studentController = new StudentController(student, studentView);

        studentController.updateView();

        String name = studentController.getName(); //can be used later
        int id = studentController.getID(); //this too can be used later

        studentController.setGrade('O');
        studentController.setName("Sai Swayam Shree");
        studentController.updateView();
    }
}