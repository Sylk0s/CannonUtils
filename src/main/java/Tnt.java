public class Tnt extends Entity {

    Tnt(Vec3 pos, Vec3 vel, SimulationManager sim) {
        super(pos, vel, sim);
    }

    public void tick() {
        this.vel.addY(-0.04f);
        this.pos.add(vel);
        this.vel.scale(0.98f);
        this.checkForExplosion();
        super.tick();
    }

    protected void explode() {

    }

    public void checkForExplosion() {
        if(super.tick == 80) {
            explode();
        }
    }

    public static Tnt createEntity(Vec3 initPos, Vec3 initVel, SimulationManager sim) {
        Tnt tnt = new Tnt(initPos, initVel, sim);
        return tnt;
    }
}
