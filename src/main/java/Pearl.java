public class Pearl extends ProjectileEntity {

    Pearl(Vec3 pos, Vec3 vel, SimulationManager sim) {
        super(pos, vel, sim);
    }

    public static Pearl createEntity(Vec3 initPos, Vec3 initVel, SimulationManager sim) {
        Pearl pearl = new Pearl(initPos, initVel, sim);
        return pearl;
    }
}