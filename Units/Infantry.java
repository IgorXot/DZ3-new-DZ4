package Units;

import java.util.ArrayList;

public abstract class Infantry extends Hero{ 
    protected int tool; 


    public Infantry(int x, int y, int init, ArrayList<Hero> team, String name, int health, int[] damage, int armor, int tool) {
        super(x, y, init, team, name, health, damage, armor);
        this.tool = tool;
    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }
}