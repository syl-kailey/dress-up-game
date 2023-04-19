public class Top extends Clothing{

    String type;

    public Top (String color, String pattern, String aesthetic, int outfit, String imageURL, String type){
        super(color, pattern, aesthetic, outfit, imageURL);
        this.type = type;
    }

    public String getType(){
        return type;
    }

}