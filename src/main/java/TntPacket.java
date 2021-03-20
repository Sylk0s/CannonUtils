public class TntPacket extends Tnt {

    private int count;

    TntPacket(int count, Vec3 pos, Vec3 vel){
        super(pos, vel);
    }

    @Override
    protected void explode() {

    }

    public static TntPacket createEntity(int count, Vec3 initPos, Vec3 initVel) {
        TntPacket tntPacket = new TntPacket(count, initPos, initVel);
        return tntPacket;
    }

    /*
    ((8-super.pos.distanceTo("Affected Entity"))/8)*this.count*("Exposure")
    -note that this is in a direction... needs to multiply by a direction
     */
}