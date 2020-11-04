import model.Engine;
import services.EngineService;

public class Main {

    public static void main(String[] args) {
        EngineService engineService = new EngineService();

//        Engine engine = new Engine("UZ", 400);
//        engineService.saveEngine(engine);
//        Engine engine1 = new Engine("JZ", 300);
//        engineService.saveEngine(engine1);
//        Engine engine2 = new Engine("k4m", 102);
//        engineService.saveEngine(engine2);

//        Engine engine = new Engine("UZ", 600);
//        engineService.updateEngine(engine);

//        Engine engine = new Engine("JZ");
//        engineService.deleteEngine(engine);

        Engine engine = engineService.findEngine("k4m");
        System.out.println(engine.toString());

    }
}
