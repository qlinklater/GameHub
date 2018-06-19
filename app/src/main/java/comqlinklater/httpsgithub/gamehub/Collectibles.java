package comqlinklater.httpsgithub.gamehub;

/**
 * Created by q.linklater on 6/4/2018.
 */

public class Collectibles {

    private String name;
    private String description;
    private int imageResourceId;

    /**
     * Collectibles[] is an array containing all of the collectibles and displays them in a list
     * @param ""there is no parameters
     * @return nothing to return
     *
     */
    public static final Collectibles[] collectibles = {
            new Collectibles("Xbox Controller", "Price: $70 \n\nThe Xbox Controller is essential for using the xbox console. the controller is used for playing games and provides hand comfort while playing. it is also used for guiding through the menu's on the console and In-game", R.drawable.xbox_controller),
            new Collectibles("Playstation Controller", "Price: $70 \n\nThe playstation Controller is essential for using the playstation console. the controller is used for playing games and provides hand comfort while playing. It also has a touch pad on the controller that provides like an extra button or used for a game mechanic design. the Controller also used for guiding through the menu's on the console and In-game menu's", R.drawable.ps4_controller),
            new Collectibles("Wii remote", "Price: $15 \n\nThe wii remote is like a controller for the wii. the wii remote almost entirely relies on motion controls which a lot of people like since friend's can play against each other using motions and goiters in order to play. player's are able to dance, bowl or bat on the wii giving it the title the perfect party game", R.drawable.wii_remote),
            new Collectibles("Switch Controller", "Price: $80 \n\nThe Switch Controllers are two part in one. You have the two joy cons that are different from each other, then you have the actual controller that does nothing without the joy con's. the two joy con's are the thing's you play with, you can either slip them onto the controller, the console or you can free hand it and play how ever you like. just like the wii it's motion base, which gave the designers more ways to find ways to play with it", R.drawable.switch2_controller),
            new Collectibles("Headset", "Price: $30-$200 \n\nThe Headset is used for talking to other people online In-game. a lot of people had enjoyable experience because they were able to talk to others while playing a game together and there is a lot of variations out there in the market, some great, some not so great compared to others", R.drawable.headset),
            new Collectibles("Playstation vr headset", "Price: $450 \n\nThe Playstation vr headset is a specialize headset that puts players into in-game characters eyes. the headset go's over the person's eyes giving that effect that the person is somewhere else ans someone else. this is very popular since no game has ever done this and makes it feel real, although it has prove hazardous since you can't see as you move around", R.drawable.ps_vr)
    };

    /**
     * Collectible is the constructor for objects of type collectible that stores
     * a name, a description, and an image resource ID for each collectible
     *
     * @param collectibleName is the name of the collectible
     * @param collectibleDescription is the description of the collectible
     * @param collectibleResourceId is the image resource ID of the collectible
     * @return an object of class collectible
     */
    public Collectibles( String collectibleName, String collectibleDescription, int collectibleResourceId){
        name = collectibleName;
        description = collectibleDescription;
        imageResourceId = collectibleResourceId;
    }

    /**
     * getName returns the name of the collectible
     * @param "" there is no parameters
     * @return a string representing the collectible name
     */
    public String getName(){
        return name;
    }

    /**
     * getDescription returns the description of the collectible
     * @param "" there is no parameters
     * @return a string representing the collectible description
     */
    public String getDescription(){
        return description;
    }

    /**
     * getImageResourceId returns the Image of the collectible
     * @param "" there is no parameters
     * @return a int representing the image resource id for the collectible
     */
    public int getImageResourceId(){
        return imageResourceId;
    }

    /**
     * toString returns a String representation of the data held
     * inside the console class
     * @param "" there is no parameters
     * @return a string representing the data within each console
     */
    public String toString(){
        return this.name;
    }
}
