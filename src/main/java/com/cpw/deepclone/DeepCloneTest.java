package com.cpw.deepclone;

/**
 * Created by epeicen on 11/12 0011.
 * DeepCloneTest
 */
public class DeepCloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepStudent originalDeepStudent = new DeepStudent("zhang", "China");
        System.out.println("Original Object: " + originalDeepStudent.getName() + "-" + originalDeepStudent.getSubject().getName());

        DeepStudent newDeepStudent = (DeepStudent) originalDeepStudent.clone();
        System.out.println("Cloned object: " + newDeepStudent.getName() + "-" + newDeepStudent.getSubject().getName());

        System.out.println("Is Original Object the same with Cloned Object: " + (originalDeepStudent == newDeepStudent));
        System.out.println("Is Original Object's field name the same with Cloned Object: " + (originalDeepStudent.getName().equals(newDeepStudent.getName())));
        System.out.println("Is Original Object's field subj the same with Cloned Object: " + (originalDeepStudent.getSubject() == newDeepStudent.getSubject()));

        originalDeepStudent.setName("li");
        originalDeepStudent.getSubject().setName("English");
        System.out.println("Original object after update, it is: " + originalDeepStudent.getName() + "-" + originalDeepStudent.getSubject().getName());
        System.out.println("Cloned object after original object update, it is: " + newDeepStudent.getName() + "-" + newDeepStudent.getSubject().getName());
    }
}
