public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override 
    public void takeOff() {
        System.out.println("ok");
    }

    @Override 
    public int ascend(int meters) {
        System.out.println("Eagles fly at " + meters);
        return meters;
    }

    
    public int descend(int meters) {
        System.out.println("Eagles descend at " + meters);
        return meters;
    }
        
    @Override 
    public void land() {
        System.out.println("Arizona");
    }

    @Override 
    public void glide(){
        System.out.println("Eagles don't glide");
    }


}
