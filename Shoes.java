public class Shoes extends Clothing{

    boolean hasHeel;

    public Shoes (String color, String pattern, String aesthetic, int outfit, String imageURL, boolean hasHeel){
        super(color, pattern, aesthetic, outfit, imageURL);
        this.hasHeel = hasHeel;
    }

    public boolean getHasHeel(){
        return hasHeel;
    }

}