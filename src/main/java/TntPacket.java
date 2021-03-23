public class TntPacket extends Tnt {

    private int count;

    TntPacket(int count, Vec3 pos, Vec3 vel, SimulationManager sim){
        super(pos, vel, sim);
    }

    @Override
    protected void explode() {

    }

    public static TntPacket createEntity(int count, Vec3 initPos, Vec3 initVel, SimulationManager sim) {
        TntPacket tntPacket = new TntPacket(count, initPos, initVel, sim);
        return tntPacket;
    }

    /*
    ((8-super.pos.distanceTo("Affected Entity"))/8)*this.count*("Exposure")
    -note that this is in a direction... needs to multiply by a direction
     */
}