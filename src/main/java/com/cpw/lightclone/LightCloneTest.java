package com.cpw.lightclone;

/**
 * Created by epeicen on 11/12 0011.
 * LightCloneTest
 */
public class LightCloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        LightStudent originalLightStudent = new LightStudent("zhang", "China");
        System.out.println("Original Object: " + originalLightStudent.getName() + "-" + originalLightStudent.getSubject().getName());

        LightStudent newLightStudent = (LightStudent) originalLightStudent.clone();
        System.out.println("Cloned object: " + newLightStudent.getName() + "-" + newLightStudent.getSubject().getName());

        System.out.println("Is Original Object the same with Cloned Object: " + (originalLightStudent == newLightStudent));
        System.out.println("Is Original Object's field name the same with Cloned Object: " + (originalLightStudent.getName().equals(newLightStudent.getName())));
        System.out.println("Is Original Object's field subj the same with Cloned Object: " + (originalLightStudent.getSubject() == newLightStudent.getSubject()));

        originalLightStudent.setName("li");
        originalLightStudent.getSubject().setName("English");
        System.out.println("Original object after update, it is: " + originalLightStudent.getName() + "-" + originalLightStudent.getSubject().getName());
        System.out.println("Cloned object after original object update, it is: " + newLightStudent.getName() + "-" + newLightStudent.getSubject().getName());
    }
}
