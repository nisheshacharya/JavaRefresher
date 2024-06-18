package javaClass;

public class Animal {
    private String name;
    private boolean canFly;

    public Animal(String name, boolean canFly){
        this.name = name;
        this.canFly = canFly;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public boolean getCanFly(){
        return canFly;
    }
    public void setCanFky(boolean canFly){
        this.canFly = canFly;
    }

    public void animalFlies(){
        if(this.canFly) {
            System.out.println(this.name + " can fly.");
        }else{
            System.out.println(this.name + " can not fly.");
        }
    }



    public static void main(String[] args) {
        Animal parrot = new Animal("Parrot", true);
        parrot.setName("Green Parrot");
        parrot.animalFlies();

    }
}


