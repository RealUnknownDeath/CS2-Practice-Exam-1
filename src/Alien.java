public class Alien {
    private int energyLevel;
    private int hostilityIndex;

    public Alien(int energyLevel, int hostilityIndex){
        this.energyLevel = energyLevel;
        this.hostilityIndex = hostilityIndex;
    }

    public int getEnergyLevel(){
        return this.energyLevel;
    }
    public int getHostilityIndex(){
        return this.hostilityIndex;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }
    public void setHostilityIndex(int hostilityIndex) {
        this.energyLevel = hostilityIndex;
    }

    public void printInfo(){
        System.out.println("Energy Level: " + this.energyLevel);
        System.out.println("Hostility Index: " + this.hostilityIndex);
    }
}
