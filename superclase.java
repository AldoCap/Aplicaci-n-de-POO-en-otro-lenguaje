public class AudioPlayer
{
    protected bool isOpen = false;
    protected bool isPlaying = false;

    public AudioPlayer()
    {
        System.out.println("The AudioPlayer constructor was invoked.");
    }

    public void open(string filePath)
    {
        this.isOpen = true;
        System.out.println("The audiofile: " + filePath + " is open.");
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


class VLC : extends AudioPlayer
{

    public VLC()
    {
    System.out.println("The VLC constructor was invoked.");
    }

    public void setPitch(float value)
    {
        this.pitch = value;
        System.out.println("The pitch value is: " + pitch);
    }

};
public static void main(String[] args)
{
    AudioPlayer player = new AudioPlayer();
    player.open("./resources/orchestral.ogg");
    player.play();
    player.setVolume(4);
    System.out.println(--------);
    
    VLC vlcPlayer = new VLC();
    vlcPlayer.open("./resources/orchestral.ogg");
    vlcPlayer.play();
    vlcPlayer.setVolume(13);
    System.out.println(---)
}