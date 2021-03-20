public class TestCannonScriptAlpha extends Cannon {

    public static void main(String[] args) {
        //creates sim manager object
        //sets up cannon configs
        //maybe someday i can abstract out the "fire class"
        //cannon scripts can extend a "cannon" class

        //seperate modes for tick by tick firing

        //tick/tick uses basket pos for tnt init

        /*
        @override
        fire
            -defines tnt creation per program

        -using sim manager to tick which ticks cannon

         */

        //testin

        Vec3 pearlInit = new Vec3(0f, 0f, 0f);
        Vec3 momentumInit = new Vec3(0f, 0f, 0f);

        int runtime = 100;

        SimulationManager sim = new SimulationManager();
        sim.entityList.add(Pearl.createEntity(pearlInit, momentumInit));

        for(int i=0; i<runtime; i++) {
            sim.tick();
        }


    }
}
