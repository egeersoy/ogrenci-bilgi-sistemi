package org.example;

import java.util.Scanner;
public class Course
{
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int verbalNote;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.verbalNote = 0;
    }
    public void addTeacher(Teacher tutor){
        if(tutor.branch.equals(this.prefix)){
            this.courseTeacher = tutor;
            System.out.println(tutor.name+"Atandı ! \nİşlem Başarılı");
        }
        else {
            System.out.println(tutor.name+" Bu dersi veremez !");
        }

    }
    public void printTeacher(){
        if(courseTeacher != null){
            System.out.println(this.name + " dersinin akademisyeni: " + courseTeacher.name);
        }
        else{
            System.out.println(this.name + " dersine akademisyen atanmamıştır.");
        }
    }


}


