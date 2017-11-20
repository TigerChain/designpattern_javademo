package strategy;

/**
 * 具体的策略二走华容道
 */
public class HuaRongRoad implements IRunStrategy {
    @Override
    public void escapeRoute() {
        System.out.println("走华容道");
    }
}
