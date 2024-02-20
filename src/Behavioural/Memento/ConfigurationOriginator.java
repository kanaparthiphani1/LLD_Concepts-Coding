package Behavioural.Memento;

public class ConfigurationOriginator {
    int height;
    int weight;

    public ConfigurationOriginator(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public ConfigurationMemento createMemento(){
       return new ConfigurationMemento(height,weight);
    }

    public void restore(ConfigurationMemento mon){
        this.height = mon.getHeight();
        this.weight = mon.getWeight();
    }
}
