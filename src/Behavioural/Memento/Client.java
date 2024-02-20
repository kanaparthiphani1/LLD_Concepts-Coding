package Behavioural.Memento;

public class Client {
    public static void main(String[] args) {
        ConfigurationOriginator org = new ConfigurationOriginator(4,5);
        ConfigurationMemento mon = org.createMemento();
        ConfigurationCareTaker ctk = new ConfigurationCareTaker();
        ctk.addMomento(mon);

        org.setHeight(8);
        org.setWeight(10);

        ConfigurationMemento mon2 = org.createMemento();

        ctk.addMomento(mon2);

        org.setHeight(11);
        org.setWeight(12);

        org.restore(ctk.undo());
        System.out.println("Undo 1 : Hwight : "+org.getHeight());
        System.out.println("Undo 1 : Weight : "+org.getWeight());
        org.restore(ctk.undo());

        System.out.println("Undo 2 : Hwight : "+org.getHeight());
        System.out.println("Undo 2 : Weight : "+org.getWeight());



    }
}
