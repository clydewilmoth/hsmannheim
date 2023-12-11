public class GameCharacter {
    int attack;
    int defense;
    int health;
    int speed;
    int ppSize;
    int height;
    public GameCharacter(int attack, int defense, int health, int speed, int ppSize){
        this.attack = attack;
        this.defense = defense;
        this.health = health;
        this.speed = speed;
        this.ppSize = ppSize;
    }//constructor
    public GameCharacter(int attack, int defense, int health, int speed, int ppSize, int height){
        this(attack,defense,health,speed,ppSize);
        this.height = height;
    }//constructorÜberladen

}
