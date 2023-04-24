import java.util.*;
import java.lang.*;

public class DressUpGame {
    User user1;
    User user2;
    Outfit finalOutfit;
    List<String> colors;
    List<String> patterns;
    List<String> aesthetics;
    List<String> favoritePattern;
    Top[] allTops;
    Bottom[] allBottoms;
    Shoes[] allShoes;
    public Outfit[] allOutfits;

    public List<String> favoriteColor(User user1, User user2){
        List<String> colors1 = user1.preferredColors();
        List<String> colors2 = user2.preferredColors();
        
        //look through user1's list and compare with user2's list
        //if anything matches, that is the only item in the list
        for(String c : colors1){
            if (colors2.contains(c)){
                colors.add(c);
                break;
            }
        }
        //else, select the color of first selected item of each 
            //user and put those in list
        if (colors.size() == 0){
            colors.add(colors1.get(0));
            colors.add(colors2.get(0));
        }
        return colors;
    }

    public List<String> favoritePattern(User user1, User user2){
        List<String> patterns1 = user1.preferredPatterns();
        List<String> patterns2 = user2.preferredPatterns();
        
        //look through user1's list and compare with user2's list
        //if anything matches, that is the only item in the list
        for(String c : patterns1){
            if (patterns2.contains(c)){
                patterns.add(c);
                break;
            }
        }
        //else, select the color of first selected item of each 
            //user and put those in list
        if (patterns.size() == 0){
            patterns.add(patterns1.get(0));
            patterns.add(patterns2.get(0));
        }
        return patterns;
    }

    public List<String> favoriteAesthetic(User user1, User user2){
        List<String> aes1 = user1.preferredAesthetics();
        List<String> aes2 = user2.preferredAesthetics();
        
        //look through user1's list and compare with user2's list
        //if anything matches, that is the only item in the list
        for(String c : aes1){
            if (aes2.contains(c)){
                aesthetics.add(c);
                break;
            }
        }
        //else, select the color of first selected item of each 
            //user and put those in list
        if (aesthetics.size() == 0){
            aesthetics.add(aes1.get(0));
            aesthetics.add(aes2.get(0));
        }
        return aesthetics;
    }

    void populateTops(){
        allTops = new Top[20];
        allTops[0] = new Top(0, "./allpngs/top1.png");
        allTops[1] = new Top(1, "./allpngs/top2.png");
        allTops[2] = new Top(2, "./allpngs/top3 .png");
        allTops[3] = new Top(3, "./allpngs/top4 .png");
        allTops[4] = new Top(4, "./allpngs/top5.png");
        allTops[5] = new Top(5, "./allpngs/top6 .png");
        allTops[6] = new Top(6, "./allpngs/top7 .png");
        allTops[7] = new Top(7, "./allpngs/top8 .png");
        allTops[8] = new Top(8, "./allpngs/top9 .png");
        allTops[9] = new Top(9, "./allpngs/top10.png");
        allTops[10] = new Top(10, "./allpngs/top 11 .png");
        allTops[11] = new Top(11, "./allpngs/top 12.png");
        allTops[12] = new Top(12, "./allpngs/top 13 .png");
        allTops[13] = new Top(13, "./allpngs/top 14.png");
        allTops[14] = new Top(14, "./allpngs/top 15 .png");
        allTops[15] = new Top(15, "./allpngs/top 16 .png");
        allTops[16] = new Top(16, "./allpngs/top17 .png");
        allTops[17] = new Top(17, "./allpngs/top18.png");
        allTops[18] = new Top(18, "./allpngs/top19 .png");
        allTops[19] = new Top(19, "./allpngs/top20.png");
    }

    void populateBottoms(){
        allBottoms = new Bottom[20];
        allBottoms[0] = new Bottom(0, null);
    }

    void populateShoes(){
        allShoes = new Shoes[20];
        allShoes[0] = new Shoes(0, null);
    }

    void populateOutfit(){//in spreadsheet all outfit numbers are +1
        allOutfits = new Outfit[20];
        allOutfits[0] = new Outfit(allTops[0], allBottoms[0], allShoes[0], "pink", "floral", "casual", 0);
        allOutfits[1] = new Outfit(allTops[1], allBottoms[1], allShoes[1], "blue", "floral", "casual", 1);
        allOutfits[2] = new Outfit(allTops[2], allBottoms[2], allShoes[2], "purple", "plain", "club", 2);
        allOutfits[3] = new Outfit(allTops[3], allBottoms[3], allShoes[3], "blue", "stars", "casual", 3);
        allOutfits[4] = new Outfit(allTops[4], allBottoms[4], allShoes[4], "blue", "plain", "flowy", 4);
        allOutfits[5] = new Outfit(allTops[5], allBottoms[5], allShoes[5], "purple", "stripes", "club", 5);
        allOutfits[6] = new Outfit(allTops[6], allBottoms[6], allShoes[6], "pink", "plain", "flowy", 6);
        allOutfits[7] = new Outfit(allTops[7], allBottoms[7], allShoes[7], "blue", "stars", "fun", 7);
        allOutfits[8] = new Outfit(allTops[8], allBottoms[8], allShoes[8], "red", "plain", "flowy", 8);
        allOutfits[9] = new Outfit(allTops[9], allBottoms[9], allShoes[9], "blue", "hearts", "casual", 9);
        allOutfits[10] = new Outfit(allTops[10], allBottoms[10], allShoes[10], "blue", "plain", "fancy", 10);
        allOutfits[11] = new Outfit(allTops[11], allBottoms[11], allShoes[11], "pink", "stripes", "casual", 11);
        allOutfits[12] = new Outfit(allTops[12], allBottoms[12], allShoes[12], "green", "stars", "fancy", 12);
        allOutfits[13] = new Outfit(allTops[13], allBottoms[13], allShoes[13], "green", "plain", "flowy", 13);
        allOutfits[14] = new Outfit(allTops[14], allBottoms[14], allShoes[14], "pink", "stripes", "flowy", 14);
        allOutfits[15] = new Outfit(allTops[15], allBottoms[15], allShoes[15], "pink", "hearts", "casual", 15);
        allOutfits[16] = new Outfit(allTops[16], allBottoms[16], allShoes[16], "red", "flora", "fancy", 16);
        allOutfits[17] = new Outfit(allTops[17], allBottoms[17], allShoes[17], "purple", "stripes", "fun", 17);
        allOutfits[18] = new Outfit(allTops[18], allBottoms[18], allShoes[18], "red", "hearts", "fancy", 18);
        allOutfits[19] = new Outfit(allTops[19], allBottoms[19], allShoes[19], "red", "floral", "fun", 19);
        
    }


    Outfit selectOutfit(){//i removed parameters because theyre already global variables


        List<Outfit> patternOutfits = null;
        List<Outfit> colorOutfits = null;
        List<Outfit> aestheticOutfits = null;

        //if length of colors is 1
            //find outfits with that color
            //colorOutfits
        int color = 0;
        if (colors.size() > 1){
            color = (int)(Math.random()*2)+1;//i think this is right, should probably double check
        }
        for (Outfit o: allOutfits){
            if (o.getColor().equals(colors.get(color))){
                colorOutfits.add(o);
            }
        }

        //else if length of patterns is 1
            //find outfits with that pattern
            //patternOutfits
            int pattern = 0;
            if (patterns.size() > 1){
                pattern = (int)(Math.random()*2)+1;
            }
            for (Outfit o: allOutfits){
                if (o.getPattern().equals(patterns.get(pattern))){
                    patternOutfits.add(o);
                }
            }

        //else if length of aesthetics is 1
            //find outfits with that aesthetic
            //aestheticOutfits
            int aesthetic = 0;
            if (aesthetics.size() > 1){
                aesthetic = (int)(Math.random()*2)+1;
            }
            for (Outfit o: allOutfits){
                if (o.getAesthetic().equals(aesthetics.get(aesthetic))){
                    aestheticOutfits.add(o);
                }
            }
        
        //else
            //randomly select color 1 or color 2
            //find outfits with that color
            //colorOutfits

            //randomly select pattern 1 or pattern 2
            //find outfits with that patter
            //patternOutfits

            //randomly select aesthetic 1 or aesthetic 2
            //find outfits with that aesthetic
            //aestheticOutfits

        //make list of colorOutfits, patternOutfits, and aestheticOutfits
        //if an outfit appears more than once
            //make list of those
            //if length of list is one
            //that outfit is finalOutfit

        List<Outfit> potentialOutfits = null;
        for (Outfit o : colorOutfits){
            if (aestheticOutfits.contains(o) && patternOutfits.contains(o)){
                finalOutfit = o;
                return finalOutfit;
            }else if (aestheticOutfits.contains(o) || patternOutfits.contains(o)){//compare color w/ aesthetic and pattern
                potentialOutfits.add(o);
            }
        }
        for (Outfit o : aestheticOutfits){//compare aesthetic with pattern
            if (patternOutfits.contains(o)){
                potentialOutfits.add(o);
            }
        }
        //else randomly select an outfit from the list
            //that outfit is final outfit
        if (potentialOutfits.size() == 0){//very unlikely,maybe impossible
            potentialOutfits.add(colorOutfits.get(0));
            potentialOutfits.add(patternOutfits.get(0));
            potentialOutfits.add(aestheticOutfits.get(0));
        }
        finalOutfit = potentialOutfits.get((int)(Math.random()*potentialOutfits.size()));//again, should probably check my math
        return finalOutfit ;
    }



    public static void main(String[] args) {

    }

}
