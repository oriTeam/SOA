package com.vtnc.rest.storage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.vtnc.rest.model.Student;

public class StudentStorage {

    private static final Map<String, Student> studentDB = new HashMap<String, Student>();

    static {
        initStudent();
    }

    public static void initStudent() {
        Student pvt = new Student("16021198", "Phạm Văn Trọng");
        Student vnc = new Student("16020853", "Vũ Ngọc Chi");
        Student nvm = new Student("16020050", "Nguyễn Văn Minh");

        studentDB.put(pvt.getStudentCode(), pvt);
        studentDB.put(vnc.getStudentCode(), vnc);
        studentDB.put(nvm.getStudentCode(), nvm);
    }

    public static Student getStudent(String code) {
        return studentDB.get(code);
    }

    public static Student addStudent(Student student) {
        studentDB.put(student.getStudentCode(), student);
        return student;
    }

    public static Student updateStudent(Student student) {
        studentDB.put(student.getStudentCode(), student);
        return student;
    }

    public static void deleteStudent(String code) {
        studentDB.remove(code);
    }

    public static List<Student> getAllStudents() {
        Collection<Student> c = studentDB.values();
        List<Student> list = new ArrayList<Student>();
        list.addAll(c);
        return list;
    }

    List<Student> list;

}
