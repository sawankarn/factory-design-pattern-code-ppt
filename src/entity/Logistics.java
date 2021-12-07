package entity;

public class Logistics {
    private String consignment_name;
    private String hazardous;
    private String mode_of_logistics;

    public String getConsignment_name() {
        return consignment_name;
    }

    public void setConsignment_name(String consignment_name) {
        this.consignment_name = consignment_name;
    }

    public String getHazardous() {
        return hazardous;
    }

    public void setHazardous(String hazardous) {
        this.hazardous = hazardous;
    }

    public Logistics(String consignment_name, String hazardous, String mode_of_logistics) {
        this.consignment_name = consignment_name;
        this.hazardous = hazardous;
        this.mode_of_logistics = mode_of_logistics;
    }

    public Logistics() {
    }

    public String getMode_of_logistics() {
        return mode_of_logistics;
    }

    public void setMode_of_logistics(String mode_of_logistics) {
        this.mode_of_logistics = mode_of_logistics;
    }
}
