import com.demo.Engine;

public class EngineFactory {
    // Factory design pattern
//    public static Engine createEngine(String engineType){
//        if(engineType.equals("V8")){
//            return new V8Engine();
//        } else if(engineType.equals("V6")){
//            return new V6Engine();
//        } else {
//            throw new IllegalArgumentException("Invalid engine type: " + engineType);
//        }
//    }

    public static class V6Engine extends Engine {
        @Override
        public void start() {
            System.out.println("Starting V6 engine..., boom ");
        }
    }
}
