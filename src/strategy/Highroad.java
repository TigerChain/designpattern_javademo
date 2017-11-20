package strategy;

/**
 * 具体的策略一走大路
 */
public class Highroad implements IRunStrategy {
    @Override
    public void escapeRoute() {
        System.out.println("走大路");
    }
}
