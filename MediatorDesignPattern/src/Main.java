import colleague.Airplane;
import colleague.CommercialAirplane;
import mediator.AirTrafficControlTower;
import mediator.AirportControlTower;

public class Main {
    public static void main(String[] args) {
        AirTrafficControlTower controlTower=new AirportControlTower();

        Airplane airplane1=new CommercialAirplane(controlTower);
        Airplane airplane2=new CommercialAirplane(controlTower);

        airplane1.requestTakeoff();
        airplane2.requestLanding();
    }
}