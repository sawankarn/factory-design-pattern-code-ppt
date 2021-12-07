package vehicle;

import entity.Logistics;
import repository.Transport;

public class Truck implements Transport {
    @Override
    public void deliver(Logistics logistics) {
        System.out.println("Consignment name: "+logistics.getConsignment_name()+" deliver by Truck");
    }
}
