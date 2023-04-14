public class Bottom extends Clothing{

    boolean isPant;

    public Bottom (String color, String pattern, String aesthetic, int outfit, boolean isPant){
        super(color, pattern, aesthetic, outfit);
        this.isPant = isPant;
    }

    public boolean isPant(){
        return isPant;
    }

}