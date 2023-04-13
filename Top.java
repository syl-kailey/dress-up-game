public class Top extends Clothing{

    String type;

    public Top (String color, String pattern, String aesthetic, int outfit, String type){
        super(color, pattern, aesthetic, outfit);
        this.type = type;
    }

    public String getType(){
        return type;
    }

}