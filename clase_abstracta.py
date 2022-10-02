from abc import ABC, abstractclassmethod
import abc

class Player(ABC):
    def __init__(self):
        self.isPlaying = False
        self.isOpen = True
        self.value = 0

    #metodo abtracto 
    @abstractclassmethod
    def open(filepath):
        pass

    def play(self):
        if self.isOpen:
            self.isPlaying = True
            print("The audiofile is playing.")

    def stop(self):
        if self.isPlaying: 
            self.isPlaying = False
            print("The audiofile is stopped.")

    def setvolume(self, value):
        self.value = value 
        return self.value

#*******************************************************************                                  

class VLC(Player):

    def __init__(self):
        self.pitch = 0
        self.isOpen = True
        self.filePath = ""
        print("The VLC constructor was invoked.")

    # Metodo abtracto que debo implementar en todas las clases derivadas 
    def open(self, filepath):
        self.filePath = filepath
        if self.isOpen:
            print("The audiofile: " + self.filePath + " is open.")

    def setPitch(self, value):   
        self.pitch = value
        print("The pitch value is: " + self.pitch)

#********************************************************************

class Winamp(Player):
    def __init__(self):
        self.filePath = ""
        self.isOpen = True
        print("The Winamp constructor was invoked.")
    
    # Metodo abtracto que debo implementar en todas las clases derivadas  
    def open(self, filepath):
        self.filePath = filepath
        if self.isOpen:
            print("The audiofile: " + self.filePath + " is open.")

vlcPlayer = VLC()
vlcPlayer.open("./resources/orchestral.ogg")
vlcPlayer.play()
print(" ")
print(" ")

winampPlayer = Winamp()
winampPlayer.open("./resources/orchestral.ogg")
winampPlayer.play()