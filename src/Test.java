import entity.Logistics;
import factory.TransportFactory;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        createLogisticOrder().forEach(logistics -> {
            new TransportFactory().getDeliver(logistics.getMode_of_logistics()).deliver(logistics);
        });
    }
    private static List<Logistics> createLogisticOrder(){
        List<Logistics> logisticsList = new ArrayList<>();
        Logistics l1 = new Logistics("ABC","N","truck");
        Logistics l2 = new Logistics("CDE","N","ship");
        Logistics l3 = new Logistics("FGH","Y","ship");
        Logistics l4 = new Logistics("IJK","N","truck");
        Logistics l5 = new Logistics("LMN","Y","truck");
        Logistics l6 = new Logistics("OPQ","N","ship");
        logisticsList.add(l1);
        logisticsList.add(l2);
        logisticsList.add(l3);
        logisticsList.add(l4);
        logisticsList.add(l5);
        logisticsList.add(l6);
        return logisticsList;
    }
}
