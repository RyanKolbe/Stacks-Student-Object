/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentStack;

/**
 *
 * @author Ryan Kolbe
 */
public class Student {
    
    private String studentName, dob, gender, studyProgramme;

    public Student() {
    }

    public Student(String studentName, String dob, String gender, String studyProgramme) {
        this.studentName = studentName;
        this.dob = dob;
        this.gender = gender;
        this.studyProgramme = studyProgramme;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStudyProgramme() {
        return studyProgramme;
    }

    public void setStudyProgramme(String studyProgramme) {
        this.studyProgramme = studyProgramme;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{studentName=").append(studentName);
        sb.append(", dob=").append(dob);
        sb.append(", gender=").append(gender);
        sb.append(", studyProgramme=").append(studyProgramme);
        sb.append('}');
        return sb.toString();
    }    
}
