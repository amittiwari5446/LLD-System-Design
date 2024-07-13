package obs;

public class TVDisplay implements Observer{
    private String weather;
    @Override
    public void update(String weather) {
        this.weather=weather;
        display();
    }
    private void display(){
        System.out.println("TV Display: weather updated - "+weather);
    }
}
