package com;

public class Student {

    private String name;
    private int age;
    private String rollNo;

    public static class Builder{
        private String name;
        private int age;
        private String rollNo;

        public Builder(String rollNo) {
            this.rollNo = rollNo;
        }

        public Builder setName(String name){
            this.name = name;
            return this;
        }

        public Builder setAge(int age){
            this.age = age;
            return this;
        }

        public Student build(){
            Student st = new Student();
            st.rollNo = rollNo;
            st.name = name;
            st.age = age;
            return st;
        }

    }

    private Student() {

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rollNo='" + rollNo + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student st = new Student.Builder("123").setName("Gyana").setAge(31).build();
        System.out.println("Student:" +st.toString());
    }
}
