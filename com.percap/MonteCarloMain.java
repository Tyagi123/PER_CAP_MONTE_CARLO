import java.text.NumberFormat;
import java.util.Locale;

/**
 * Main class
 */
public class MonteCarloMain {


    public static void main(String [] args) {
        MonteCarloService monteCarlo = new MonteCarloService();
        MonteCarloResponse monteCarloModel1 = monteCarlo.calculate(new MonteCarloRequest(100000, 0, 0.035,
                20, 0.094324, 0.15675, 10000));

        MonteCarloResponse monteCarloModel2 = monteCarlo.calculate(new MonteCarloRequest(100000, 0, 0.035,
                20, 0.06189, 0.063438, 10000));

        Locale locale = new Locale("en", "US");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);

        System.out.println("Best Case = " + currencyFormatter.format(monteCarloModel1.getBestCase()));
        System.out.println("Best Case = " + currencyFormatter.format(monteCarloModel2.getBestCase()));

        System.out.println("=======================================================================");

        System.out.println("Worst Case = " + currencyFormatter.format(monteCarloModel1.getWorstCase()));
        System.out.println("Worst Case = " + currencyFormatter.format(monteCarloModel2.getWorstCase()));
    }
}