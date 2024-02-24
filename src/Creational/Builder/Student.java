package Creational.Builder;

public class Student {
    private int id;
    private String name;
    private int rollNo;
    private String fatherName;
    private String motherName;
    private String state;

    private Student(StudentBuilder sb) {
        setId(sb.id);
        setName(sb.name);
        setRollNo(sb.rollNo);
        setFatherName(sb.fatherName);
        setState(sb.state);
        setMotherName(sb.motherName);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public void setState(String state) {
        this.state = state;
    }

    public static StudentBuilder getBuilder(){
        return new StudentBuilder();
    }

    public static class StudentBuilder{
        private int id;
        private String name;
        private int rollNo;
        private String fatherName;
        private String motherName;
        private String state;

        public StudentBuilder() {
        }

        public StudentBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;

        }

        public StudentBuilder setRollNo(int rollNo) {
            this.rollNo = rollNo;
            return this;
        }

        public StudentBuilder setFatherName(String fatherName) {
            this.fatherName = fatherName;
            return this;
        }

        public StudentBuilder setMotherName(String motherName) {
            this.motherName = motherName;
            return this;
        }

        public StudentBuilder setState(String state) {
            this.state = state;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }

    @Override
    public String toString() {
        return ("Student -> id: "+this.id+ " , name: "+this.name+" , rollNo: "+this.rollNo+" , fatherName: "+this.fatherName+" , motherName: "+this.motherName);
    }
}
