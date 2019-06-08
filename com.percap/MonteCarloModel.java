/**
 * Pojo for MonteCarloModel
 */
public class MonteCarloModel {

    private double bestCase;

    private double worstCase;

    /**
     * Parametrized constructor
     *
     * @param bestCase best cases (90 to 100 percentile)
     * @param worstCase best cases (first 10 percentile)
     */
    MonteCarloModel(double bestCase, double worstCase) {
        super();
        this.bestCase = bestCase;
        this.worstCase = worstCase;
    }

    public double getBestCase() {
        return bestCase;
    }

    public double getWorstCase() {
        return worstCase;
    }
}
