public class Bottom extends Clothing{

    boolean isPant;

    public Bottom (String color, String pattern, String aesthetic, int outfit, String imageURL, boolean isPant){
        super(color, pattern, aesthetic, outfit, imageURL);
        this.isPant = isPant;
    }

    public boolean getIsPant(){
        return isPant;
    }

}