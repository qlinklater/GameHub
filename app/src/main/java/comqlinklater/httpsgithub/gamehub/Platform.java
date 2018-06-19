package comqlinklater.httpsgithub.gamehub;

/**
 * Created by q.linklater on 5/30/2018.
 */

public class Platform
{
    private String name;
    private String description;
    private int imageResourceId;

    /**
     * Platform[] is an array containing all of the platforms and displays them in a list
     * @param ""there is no parameters
     * @return nothing to return
     *
     */
    public static final Platform[] platforms = {
            new Platform("PC","What most people consider the best platform to play video games in,PC Gaming is playing video games on a computer,With countless Games on the PC and multiple apps/sites to get those games from no wonder it is regarded as the best but it does have it flaws,for example most games on PC are indie games with only 1/2 or a month of game development and some triple A games are sometimes not on PC,wither you agree or disagree is all up to you", R.drawable.pc),
            new Platform("Consoles","Video game consoles are specialized hardware with the sole purpose of playing video games, Video game consoles is where most triple A games are and thanks to the console, it can store more games into its system and can download games off its market online. Over the years more and more features go's into the hardware and now it can download apps and movies online but the console has one great flaw,there is a limit on how much it can hold and there is vary few options to fit it", R.drawable.consoles),
            new Platform("Mobile","The most neglected platform compared to the other two, with very limited storage on phones and other devices, there is not that many great games on mobile but it try's to persevere. One great advantage mobile has compared to it's competitors is it's usability and potability and because of that it is regarded as a video game platform, with games like Pokemon and other great titles", R.drawable.mobile)
    };

    /**
     * Platform is the constructor for objects of type platform that stores
     * a name, a description, and an image resource ID for each platform
     *
     * @param platformName is the name of the platform
     * @param platformDescription is the description of the platform
     * @param platformResourceId is the image resource ID of the platform
     * @return an object of class platform
     */
    public Platform( String platformName, String platformDescription, int platformResourceId){
        name = platformName;
        description = platformDescription;
        imageResourceId = platformResourceId;
    }

    /**
     * getName returns the name of the platform
     * @param "" there are no parameters
     * @return a string representing the platform name
     */
    public String getName(){
        return name;
    }

    /**
     * getDescription returns the description of the platform
     * @param "" there are no parameters
     * @return a string representing the platform description
     */
    public String getDescription(){
        return description;
    }

    /**
     * getImageResourceId returns the image of the platform
     * @param "" there are no parameters
     * @return a int representing the image resource id for the platform
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
