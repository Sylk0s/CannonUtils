public class Entity {

    protected Vec3 pos;
    protected Vec3 vel;
    protected int tick;

    Entity(Vec3 pos, Vec3 vel, SimulationManager sim) {
        this.pos=pos;
        this.vel=vel;
        this.tick=0;
    }

    public void tick() { tick++; }

    public void addVelocity(Vec3 newVel) {
        this.vel.add(newVel);
    }

    public void setVelocity(Vec3 newVel) {
        this.vel.setCurrent(newVel);
    }

    public void setPosition(Vec3 newPos) {
        this.pos.setCurrent(newPos);
    }
}
