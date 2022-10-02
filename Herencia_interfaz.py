from abc import ABC, abstractclassmethod
import abc

class Player(ABC):
    def __init__(self):
        pass

    #metodo abtracto 
    @abstractclassmethod
    def open(self, filepath):
        pass

    @abstractclassmethod
    def play(self):
        pass

    @abstractclassmethod
    def stop(self):
        pass

    @abstractclassmethod
    def setvolume(self, value):
        pass

#*******************************************************************                                  

class PlayerPitchable(ABC):
    def __init__(self):
        pass
    
    @abstractclassmethod
    def setPitch(self, pitch):
        pass

#*******************************************************************
class VLC(Player, PlayerPitchable):

    def __init__(self):
        self.isOpen = True
        self.isPlaying = False
        self.volume = 0
        print("The VLC constructor was invoked.")

    # Metodo abtracto que debo implementar en todas las clases derivadas 
    def open(self, filepath):
        self.filePath = filepath
        if self.isOpen:
            print("The audiofile: " + self.filePath + " is open.")

    def setPitch(self, value):   
        self.pitch = value
        print("The pitch value is: " , self.pitch)

    def setvolume(self, value):
        self.volume = value
        print("The volume value is: " , self.volume)

    def play(self):
        if self.isOpen:
            self.isPlaying = True
            print("The audiofile is playing.")

    def stop(self):
        if self.isPlaying:
            self.isPlaying = False
            print("The audiofile is stopped.")

#********************************************************************

vlcPlayer = VLC()
vlcPlayer.open("./resources/orchestral.ogg")
vlcPlayer.play()
vlcPlayer.setvolume(13)