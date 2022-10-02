//Player Interface:
class Player
{
    
    public virtual void open(string filePath) = 0;
    public virtual void play() = 0;
    public virtual void stop() = 0;
    public virtual void setVolume(float value) = 0;
};
//PlayerPitchable Interface:
class PlayerPitchable
{
public virtual void setPitch(float pitch) = 0;
};

//VLC concrete class
public class VLC : extends Player, extends PlayerPitchable
{
    protected bool isOpen = false;
    protected bool isPlaying = false;
    protected float volume;
    protected float pitch;

    public VLC()
    {
        System.out.println("The VLC constructor was invoked.");
    }

    @Override
    public void open(string filePath)
    {
        //@ToDo: por ahora simulamos la apertura correcta
        this.isOpen = true;
        System.out.println("The audiofile: " + filePath + " is open.");
    }
    @Override
    public void play()
    {
        //@ToDo: por ahora simulamos la reproducción correcta
        if(this.isOpen) 
            this.isPlaying = true;
            System.out.println("The audiofile is playing.");
    }
    @Override
    public void stop()
    {
        //@ToDo: por ahora simulamos la detención correcta
        if(this.isPlaying) 
            this.isPlaying = false;
            System.out.println("The audiofile is stopped.");
    }
    @Override
    public void setVolume(float value)
    {
        this.volume = value;
        System.out.println("The volume value is: " + this.volume);
    }
    @Override
    public void setPitch(float value)
    {
        this.pitch = value;
        System.out.println("The pitch value is: " + this.pitch);
    }

};

public static void main(string[] args)
{
    System.out.println(--------);
    VLC vlcPlayer = new VLC();
    vlcPlayer.open("./resources/orchestral.ogg");
    vlcPlayer.play();
    vlcPlayer.setVolume(13);
    System.out.println(--------);
}