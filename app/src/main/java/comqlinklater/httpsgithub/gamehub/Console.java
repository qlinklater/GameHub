package comqlinklater.httpsgithub.gamehub;

/**
 * Created by q.linklater on 6/4/2018.
 */

public class Console {

    private String name;
    private String description;
    private int imageResourceId;

    /**
     * Console[] is an array containing all of the consoles and displays them in a list
     * @param ""there is no parameters
     * @return nothing to return
     *
     */
    public static final Console[] consoles = {
            new Console("Xbox 360", "Price: $160 today's standard \n\nThe Xbox 360 is one of the older game system model's that microsoft has produce over the years. After a decade of production, it was decided to stop manufacture the 360 after it's first release back at 2005. The 360 was highly respected for it's great selection of games and its software that push it to the limit. There still a great deal of them in the market but in a few years finding them will prove difficult", R.drawable.xbox_360),
            new Console("Xbox one", "Price: $320-$500 \n\nThe Xbox one is one of the latest game model's that came out in the last 5 years, with different versions of the console like the xbox one s and there latest version the xbox one x. Both push the boundaries of games and entertainment as a whole with Graphics that looks real and immersion game play. Game development for the one was much better, with a lot more freedom of software space game development will just improve", R.drawable.xbox_one),
            new Console("Playstation 3", "Price: $160 today's standard \n\nThe Playstation was revolutionary at the time it first launch back in 2006. Having lots of features in the console besides games and great game titles thar can only be played on the playstation. Sony the producers of the console, decided to stop production in 2017 and start focus on there next project", R.drawable.playstation_3),
            new Console("Playstation 4", "Price: $300-$500 \n\nThe Playstation 4 is one of there newer model's that came out from sony. With two different versions the standard and the pro, both prove to excel in graphics and game mechanics. Because of these improvements, game development only exceed and many exclusive game titles release only for playstation 4 which lead many consumers to go for playstation then there competitors", R.drawable.playstation_4),
            new Console("Wii", "Price: $150-$300 \n\nThe Wii was very different at it's time compared to other consoles. the wii relied on controls then anything else, having the player move around and doing actions instead of sitting around. this system was geared towards group activity's and bringing them together then solo Gaming. after a few years when it was release, nintendo the company wanted to make another one bringing us the Wii-U", R.drawable.wii),
            new Console("Switch", "Price: $300 \n\nThe Switch came out a year ago by nintendo and just like the wii it was different. the Switch was a console and a hand held device at the same time, with portable side controls that can be remove and replace back on the controller or the console itself was amazing. A console that can be played anywhere was revolutionary and it fit many play styles many consumers had", R.drawable.switch2),
            new Console("3DS", "Price: $150 \n\nThe 3Ds is a hand held system that nintendo has produce. with many variances that has came out over the years finding the right one to fit the costumer should be easy. The 3Ds was known for it's portability and easy controls that almost everyone can enjoy. The one title that the 3Ds is most commonly played on are Pokemon. With every new instalments for pokemon every few years, it has always shown to bring back people whenever a new title is released", R.drawable.ds),
            new Console("PC", "Price: $500-$2000 \n\nPC is regarded as the best system you should get for video games. There are countless amount of games on steam alone and more on different websites or apps. PC has way more other uses besides video games since it's a computer after all. unlike the other consoles, PC can be modified and upgraded to your hearts content, so you only need one instead of replacing for a new one every few years like the other consoles", R.drawable.pc2)
    };

    /**
     * Console is the constructor for objects of type console that stores
     * a name, a description, and an image resource ID for each console
     *
     * @param consoleName is the name of the console
     * @param consoleDescription is the description of the console
     * @param consoleResourceId is the image resource ID of the console
     * @return an object of class console
     */
    public Console( String consoleName, String consoleDescription, int consoleResourceId){
        name = consoleName;
        description = consoleDescription;
        imageResourceId = consoleResourceId;
    }

    /**
     * getName returns the name of the console
     * @param "" there are no parameters
     * @return a string representing the console name
     */
    public String getName(){
        return name;
    }

    /**
     * getDescription returns the description of the console
     * @param "" there are no parameters
     * @return a string representing the console description
     */
    public String getDescription(){
        return description;
    }

    /**
     * getImageResourceId returns the image for the console
     * @param "" there is no parameters
     * @return a int representing the console image resource id
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
