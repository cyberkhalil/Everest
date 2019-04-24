package teachers;

public class Teacher {

    private int TeacherID;
    private String TeacherName;
    private int TeacherPhoneNumber;

    public Teacher() {

    }

    public Teacher(int TeacherID, String Teacher_name, int Teacher_phone_number) {
        this.TeacherName = Teacher_name;
        this.TeacherPhoneNumber = Teacher_phone_number;
        this.TeacherID = TeacherID;
    }

    public int getTeacherID() {
        return TeacherID;
    }

    public void setTeacherID(int TeacherID) {
        this.TeacherID = TeacherID;
    }

    public String getTeacherName() {
        return TeacherName;
    }

    public void setTeacherName(String TeacherName) {
        this.TeacherName = TeacherName;
    }

    public int getTeacherPhoneNumber() {
        return TeacherPhoneNumber;
    }

    public void setTeacherPhoneNumber(int TeacherPhoneNumber) {
        this.TeacherPhoneNumber = TeacherPhoneNumber;
    }
}
