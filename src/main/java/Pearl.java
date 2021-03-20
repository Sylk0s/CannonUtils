public class Pearl extends ProjectileEntity {

    Pearl(Vec3 pos, Vec3 vel) {
        super(pos, vel);
    }

    public static Pearl createEntity(Vec3 initPos, Vec3 initVel) {
        Pearl pearl = new Pearl(initPos, initVel);
        return pearl;
    }
}