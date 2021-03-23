public class ProjectileEntity extends Entity {

    ProjectileEntity(Vec3 pos, Vec3 vel, SimulationManager sim) {
        super(pos, vel, sim);
    }

    @Override
    public void tick() {
        this.vel.scale(0.99f);
        this.vel.addY(-0.03f);
        this.pos.add(vel);
        this.tick++;
    }
}