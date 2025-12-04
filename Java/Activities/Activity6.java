package Activities;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Activity6 {

    private List<String> passengers = new ArrayList<>();
    private int maxPassengers;
    private Date lastTimeTookOff;
    private Date lastTimeLanded;


    public Activity6(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

   
    public boolean addPassenger(String name) {
        if (passengers.size() < maxPassengers) {
            passengers.add(name);
            return true;
        }
        return false; 
    }

  
    public boolean removePassenger(String name) {
        return passengers.remove(name);
    }


    public void takeOff() {
        this.lastTimeTookOff = new Date();
        System.out.println("Plane took off at: " + lastTimeTookOff);
    }


    public void land() {
        this.lastTimeLanded = new Date();
        System.out.println("Plane landed at: " + lastTimeLanded);
    }


    public List<String> getPassengers() {
        return new ArrayList<>(passengers); // return copy for safety
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public Date getLastTimeTookOff() {
        return lastTimeTookOff;
    }

    public Date getLastTimeLanded() {
        return lastTimeLanded;
    }
}

