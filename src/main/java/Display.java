public class Display {
    
    private double sizeInches;
    private String resolution;
    private boolean displayOn;

    public Display(double sizeInches, String resolution) {
        this.sizeInches = sizeInches;
        this.resolution = resolution;
        this.displayOn = false;
    }

    public String turnOn() {
        return "Display turned on. " + this.sizeInches + "-inch, " + this.resolution;
    }

    public String turnOff() {
        return "Display turned off.";
    }

    public double getSizeInches() {
        return this.sizeInches;
    }

    public String getResolution() {
        return this.resolution;
    }

    public String toString() {
        return "Display: " + this.sizeInches + " inches, " + this.resolution;
    }

    public Display() {
    } 

    public boolean getDisplayOn() {
        return this.displayOn;
    }
}
    

