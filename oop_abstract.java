public class oop_abstract {
    public static void main(String[] args) {
        // Player p = new Player("Generic"); // ❌ Error: Cannot instantiate abstract
        // class

        Player myMusic = new MusicPlayer("Sony Walkman");
        Player myVideo = new VideoPlayer("VLC Media Player");

        myMusic.powerOn(); // Uses common logic from abstract class
        myMusic.play(); // Uses specific logic from MusicPlayer

        System.out.println("---");

        myVideo.powerOn();
        myVideo.play(); // Uses specific logic from VideoPlayer
    }
}

// Abstract Class: Cannot be instantiated (cannot use 'new Player')
// It acts as a template for all players
abstract class Player {
    private String name;

    Player(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    // Regular Method: All players will use this same logic
    public void powerOn() {
        System.out.println(this.name + " is powering on...");
    }

    // Abstract Method: No body {} here!
    // Every Subclass MUST implement their own version of 'play'
    public abstract void play();
}

// Subclass 1: Music Player
class MusicPlayer extends Player {
    MusicPlayer(String name) {
        super(name);
    }

    // Providing the specific implementation for 'play'
    @Override
    public void play() {
        System.out.println(getName() + " is playing an MP3 song 🎵");
    }
}

// Subclass 2: Video Player
class VideoPlayer extends Player {
    VideoPlayer(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println(getName() + " is streaming a 4K video 🎬");
    }
}

// abstract almost like interfce but interface can extend more than 1 super
// class