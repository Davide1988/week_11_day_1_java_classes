public class WaterBottle {
    private int volume;
    private int emptyVolume;

    public WaterBottle(int volume){
        this.volume = 100;
    }

    public int getVolume(){
        return this.volume;
    }

    public int getDrink(int amount){
        return this.volume - amount;
    }

    public int empty(){
          this.emptyVolume = this.volume - this.volume;
          return this.emptyVolume;
    }

    public int fill(){
        return this.emptyVolume + this.volume;
    }
}
