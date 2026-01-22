public class oop_inheritance {
    public static void main(String[] args) {
        MPlayer p1 = new MPlayer("Sony");
        p1.play();
        p1.stop();
        p1.record();
        p1.sleep();
    }
}

// this is super class useally contain the main class and properties
// super class can't access to value of sub class
class Player {

    private String name;// private can not access through sub class

    // so we need to make get method
    protected String getName() {
        return this.name;
    }

    // protect can be use in super-sub class only other can not access
    protected void setName(String newName) {
        this.name = newName;
    }

    Player(String inputName) {
        this.name = inputName;
    }

    public void play() {
        System.out.println(this.name + " is playing");
    }

    public void stop() {
        System.out.println(this.name + " is stoping");
    }

    public void record() {
        System.out.println(this.name + " can record");
    }

}

// this is Sub class
// sub class can access to value of super class (proteced)
class MPlayer extends Player {
    MPlayer(String name) {
        super(name); // this is the way to access super class consructure(value)
    }

    @Override // you can also overide some method
    public void record() {
        System.out.println(this.getName() + " can not record");
    }

    public void sleep() {
        System.out.println(this.getName() + " can sleep");// we can not use this.name due to private
    }
}