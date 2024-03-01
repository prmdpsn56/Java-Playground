package oops;

public class Fan {
    public String make;
    public int radius;
    public String color;
    private boolean isOn;
    private byte speed;

        public Fan(String make, int radius, String color){
            this.make = make;
            this.radius = radius;
            this.color = color;
        }


        public String toString(){
            System.out.println();
            return String.format("make - %s, radius = %s, color - %s, isOn - %s",make,radius,color,isOn);
        }

}
