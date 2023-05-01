public class Clothing {

    int outfit;
    String imageURL;

    public Clothing(int outfit, String imageURL){
        this.outfit = outfit;
        this.imageURL = imageURL;
    }

    public int getOutfit(){
        return outfit;
    }

    public String getImageURL(){
        return imageURL;
    }

}