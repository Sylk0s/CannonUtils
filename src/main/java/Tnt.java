public class Tnt extends Entity {

    public int fuse;

    Tnt(Vec3 pos, Vec3 vel) {
        super(pos, vel);
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

    public static Tnt createEntity(Vec3 initPos, Vec3 initVel) {
        Tnt tnt = new Tnt(initPos, initVel);
        return tnt;
    }
}
