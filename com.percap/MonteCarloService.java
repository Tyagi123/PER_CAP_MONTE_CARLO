import java.util.Arrays;
import java.util.Random;

/**
 * Class to calculate investment
 */
public class MonteCarloService {

    /**
     * Method to calculate investment
     *
     * @param initialInvestment initialInvestment
     * @param installment installment per cycle
     * @param inflation inflation
     * @param years years
     * @param mean mean
     * @param stdDev stdDev
     * @param rounds rounds
     * @return best amd worst cases
     */
    public MonteCarloModel calculate(double initialInvestment,double installment,double inflation,int years,double mean,
                                     double stdDev,int rounds) {
        double[] investmentValues = new double[rounds];
        for (int i = 0; i < rounds; i++) {
            double investment = initialInvestment;
            for (int j = 0; j < years; j++) {
                investment = investment * (1 + (new Random().nextGaussian()*stdDev+mean)) * (1 - inflation);
                investment=investment+installment;

            }
            investmentValues[i] = investment;
        }

        double[] values=percentiles(investmentValues,.90,.10);
       return new MonteCarloModel(values[0], values[1]);
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
