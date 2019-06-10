import java.util.Arrays;
import java.util.Random;

/**
 * Class to calculate investment
 */
public class MonteCarloService {

    /**
     * Method to calculate investment
     *
     * @param request MonteCarloRequest
     * @return MonteCarloResponse
     */
    public MonteCarloResponse calculate(MonteCarloRequest request) {
        double[] investmentValues = new double[request.getRound()];
        for (int i = 0; i < request.getRound(); i++) {
            double investment = request.getInitialInvestment();
            for (int j = 0; j < request.getYears(); j++) {
                investment = investment * (1 + (new Random().nextGaussian() * request.getStdDev() + request.getMean())) * (1 - request.getInflation());
                investment = investment + request.getInstallment();

            }
            investmentValues[i] = investment;
        }

        double[] values=percentiles(investmentValues,.90,.10);
        return new MonteCarloResponse(values[0], values[1]);
    }

    /**
     * Method to calculate percentile
     *
     * @param latencies array of forecasts
     * @param percentiles percentiles
     * @return
     */
    public static double[] percentiles(double[] latencies, double... percentiles) {
        Arrays.sort(latencies, 0, latencies.length);
        double[] values = new double[percentiles.length];
        for (int i = 0; i < percentiles.length; i++) {
            int index = (int) (percentiles[i] * latencies.length);
            values[i] = latencies[index];
        }
        return values;
    }
}
