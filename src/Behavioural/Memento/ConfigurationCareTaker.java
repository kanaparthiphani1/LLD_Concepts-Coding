package Behavioural.Memento;

import java.util.ArrayList;
import java.util.List;

public class ConfigurationCareTaker {
    private List<ConfigurationMemento> his;

    public ConfigurationCareTaker() {
        this.his = new ArrayList<>();
    }

    public void addMomento(ConfigurationMemento mon){
        his.add(mon);
    }

    public ConfigurationMemento undo(){
        if (!his.isEmpty()){
            int lastInd = his.size()-1;
            ConfigurationMemento lastSnap = his.get(lastInd);
            his.remove(lastSnap);
            return lastSnap;
        }
        return null;
    }


}
