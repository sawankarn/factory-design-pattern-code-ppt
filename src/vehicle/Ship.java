package vehicle;

import entity.Logistics;
import repository.Transport;

public class Ship implements Transport {
    @Override
    public void deliver(Logistics logistics) {
        System.out.println("Consignment name: "+logistics.getConsignment_name()+" deliver by ship");
    }
}
