# --------------Superclase-------------------

class AudioPlayer:
    def __init__(self):
        print("The AudioPlayer constructor was invoked.")
        self.isOpen = False
        self.isPlaying = False
        self.volume = 0
    
    def open(self, filePath):
        self.filePath = filePath
        self.isOpen = True
        print("The audiofile: " + self.filePath + " is open.")

    def play(self):
        if self.isOpen:
            self.isPlaying = True
            print("The audiofile is playing.")
        
    def stop(self):
        if self.isPlaying:
            self.isPlaying = False
            print("The audiofile is stopped.")
    
    def setVolume(self, value):
        self.volume = value
        print("The volume value is: " + self.volume)

#****************************************************************************
# ------------Clase Hija o derivada----------------
 
class VLC(AudioPlayer):
    print("The VLC constructor was invoked.")

    def setPitch(self, value):
        self.pitch = value
        print("The pitch value is: " + self.pitch)

#****************************************************************************
# ----instanciacion de clase y sus funciones miembro--
player = AudioPlayer()
player.open("./resources/orchestral.ogg")
player.play()
player.setVolume(13)
print("--"*20)
vlcPlayer = VLC()
vlcPlayer.open("./resources/orchestral.ogg")
vlcPlayer.play()
vlcPlayer.setVolume(13)