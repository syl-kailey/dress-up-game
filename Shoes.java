public class Shoes extends Clothing{

    boolean hasHeel;

    public Shoes (String color, String pattern, String aesthetic, int outfit, boolean hasHeel){
        super(color, pattern, aesthetic, outfit);
        this.hasHeel = hasHeel;
    }

    public boolean getHasHeel(){
        return hasHeel;
    }

}