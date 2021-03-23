import java.util.ArrayList;
import java.util.List;

public class Explosion {

    private Vec3 pos;
    private SimulationManager sim;

    Explosion(Vec3 pos, SimulationManager sim) {
        this.pos = pos;
        this.sim = sim;

        for (Entity entity: this.getAffectedEntities()) {
            entity.vel.add(); //fix

            //TODO determine how exposure will work

        }
    }

    public List<Entity> getAffectedEntities() {

        List<Entity> hitList = new ArrayList<>();

        for (Entity entity : sim.entityList) {
            if (entity.pos.distanceTo(this.pos)<=8) {
                hitList.add(entity);
            }
        }

        return hitList;

    }
}
