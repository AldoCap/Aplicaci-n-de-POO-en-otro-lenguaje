//Player abstract class
public class Player
{
    protected bool isOpen = false;
    protected bool isPlaying = false;
    protected float volume;

    public Player()
    {
        System.out.println("The Player constructor was invoked.");
        //método abstracto o virtual puro:
        public virtual void open(string filePath) = 0;
    }

    public void play()
    {
        if(isOpen) 
            this.isPlaying = true;
            System.out.println("The audiofile is playing.");
    }
    public void stop()
    {
        if(isPlaying) 
            this.isPlaying = false;
            System.out.println("The audiofile is stopped.");
    }

    public void setVolume(float value)
    {
        this.volume = value;
        System.out.println("The volume value is: " + volume);
    }
    
};
//VLC concrete class

public class VLC  extends Player
{
    private float pitch;

    public VLC()
    {
        System.out.println("The VLC constructor was invoked.");
    }
    @Override
    public void open(string filePath)
    {
       
        this.isOpen = true;
        System.out.println("The audiofile: " + filePath + " is open.");
    }

    public void setPitch(float value)
    {
        this.pitch = value;
        System.out.println("The pitch value is: " + this.pitch);
    }


};
//Winamp concrete class
public class Winamp  extends Player
{
    public Winamp()
    {
        System.out.println("The Winamp constructor was invoked.");
    }
    @Override
    public void open(string filePath)
    {
        this.isOpen = true;
        System.out.println("The audiofile: " + filePath + " is open.");
    }
};

public static void main(String[] args)
{

    VLC vlcPlayer = new VLC();
    vlcPlayer.open("./resources/orchestral.ogg");
    vlcPlayer.play();
    vlcPlayer.setVolume(13);

    Winamp winampPlayer = new Winamp();
    winampPlayer.open("./resources/orchestral.ogg");
    winampPlayer.play();
    winampPlayer.setVolume(13);
}