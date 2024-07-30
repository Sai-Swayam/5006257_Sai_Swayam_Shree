public class StudentController {
    private Student studentModel;
    private StudentView studentView;

    StudentController(Student studentModel, StudentView studentView) {
        this.studentModel = studentModel;
        this.studentView = studentView;
    }

    //Getters
    public String getName() {
        return this.studentModel.name;
    }

    public int getID() {
        return this.studentModel.id;
    }

    public char getGrade() {
        return this.studentModel.grade;
    }

    //Setters
    public void setName(String name) {
        this.studentModel.name = name;
    }

    public void setID(int id) {
        this.studentModel.id = id;
    }

    public void setGrade(char grade) {
        this.studentModel.grade = grade;
    }

    //Update the view
    public void updateView() {
        studentView.displayStudentDetails(studentModel.getName(), studentModel.getId(), studentModel.getGrade());
    }

}
