package jdbc.Db;

import exceptions.Person;

public class Organisation implements Person {
    int age=89;
    String name="john doe";
    @Override
    public void qualification() {
        System.out.println("this is the employee profile \t\n"+"Name\t\n"+ name +"Age\t\n"+age);
    }

    public static void main(String args[]){
        Organisation org = new Organisation();
        org.qualification();
    }
}
