package Creational.Builder;

public class Clien {
    public static void main(String[] args) {
        Student obj = Student.getBuilder().setId(1).setName("Phani").setState("AP").setFatherName("Prasad").setMotherName("Padma").build();
        System.out.println(obj.toString());
    }
}
