import java.util.ArrayList;
import java.util.List;

public class SimulationManager {

    //handles universal things like entityList, ticking... in theory the cannon script interacts through this

    public int tick;
    public List<Entity> entityList;

    SimulationManager() {
        this.entityList = new ArrayList<>();
        this.tick = 0;
    }

    public void tick() {

        for(Entity list : entityList) {
            list.tick();
        }
        this.tick++;
    }
}