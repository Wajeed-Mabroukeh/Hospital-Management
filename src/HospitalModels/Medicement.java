package HospitalModels;

public class Medicement {

    public String MEDIC_NAME;
    public int MEDIC_ID;
    public int PRICE;
    public Medicement() {}

    public Medicement(int MEDIC_ID, String MEDIC_NAME, int PRICE) {
        this.MEDIC_ID = MEDIC_ID;
        this.MEDIC_NAME = MEDIC_NAME;
        this.PRICE = PRICE;
    }

}