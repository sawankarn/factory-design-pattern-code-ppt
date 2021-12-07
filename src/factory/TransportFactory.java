package factory;

import entity.Logistics;
import repository.Transport;
import vehicle.Ship;
import vehicle.Truck;

public class TransportFactory {
    public Transport getDeliver(String modeOfLogistic){
        switch (modeOfLogistic){
            case "truck": return new Truck();
            case "ship" : return new Ship();
            default: return null;
        }
    }
}
