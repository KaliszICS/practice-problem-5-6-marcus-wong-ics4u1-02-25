public class Battery {
    
    private int capacityMAh;
    private boolean isCharged;

    public Battery(int capacityMAh) {
        this.capacityMAh = capacityMAh;
        this.isCharged = false;
    }

    public void charge() {
        if (isCharged = false) {
            isCharged = true;
        }
    }

    public boolean isCharged() {
        if (isCharged = true) {
            return true;
        }
        else {
            return false;
        }
    }

    public int getCapacityMAh() {
        return this.capacityMAh;
    }

    public String toString() {
        return "Battery: " + this.capacityMAh + " mAh, Charged: " + this.isCharged;
    }

    public Battery() {
    }
}