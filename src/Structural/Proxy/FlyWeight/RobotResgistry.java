package Structural.Proxy.FlyWeight;

import java.util.HashMap;
import java.util.Map;

public class RobotResgistry {
    static Map<String,IRobot> reg = new HashMap<>();
    public static IRobot createRobot(String type){
        if(reg.containsKey(type)){
            return reg.get(type);
        }else{
            if(type.equalsIgnoreCase("HUMANOID")){
                IRobot rob = new Humanoid("image","HUMANOID");
                reg.put("HUMANOID",rob);
                return  rob;
            }else{
                IRobot rob = new RobotDogs("image","DOG","50");
                reg.put("DOG",rob);
                return  rob;
            }
        }
    }
}
