import java.util.ArrayList;

public class CourseConflictChecker {

    private DataBase objDataBase;

    public CourseConflictChecker(DataBase objDataBase) {
        this.objDataBase = objDataBase;
    }

    public boolean checkConflict(String sSID, Course objCourse) {
        Student objStudent = objDataBase.getStudentRecord(sSID);
        if (objStudent == null) {
            return false;
        }

        ArrayList<Course> vCourse = objStudent.getRegisteredCourses();
        for (Course registeredCourse : vCourse) {
            if (registeredCourse.conflicts(objCourse)) {
                return true; // Conflict found
            }
        }

        return false; // No conflict
    }
}
