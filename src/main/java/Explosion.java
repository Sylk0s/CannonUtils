import java.util.ArrayList;
import java.util.List;

public class Explosion {

    private Vec3 pos;
    private SimulationManager sim;
    private Tnt tnt;

    private float exposure;

    Explosion(Vec3 pos, SimulationManager sim, Tnt tnt) {
        this.pos = pos;
        this.sim = sim;
        this.tnt = tnt;

        this.exposure=getExposure(); //todo fix

        for (Entity entity: this.getAffectedEntities()) {

            entity.addVelocity(new Vec3(0f,this.getExplosionVelocity(entity, exposure),0f)); //todo implement this as vec3

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

    public float getExplosionVelocity(Entity affected, float exposure) {
        return (float) (((8-tnt.pos.distanceTo(affected.pos))/8)*tnt.count*exposure);

        //todo direction?
    }

    public float getExposure() {
        return 1f; //todo implement
    }
}
