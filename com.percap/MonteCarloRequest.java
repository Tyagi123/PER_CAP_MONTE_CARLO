public class MonteCarloRequest {

    private double initialInvestment;

    private double installment;

    private double inflation;

    private int years;

    private double mean;

    private double stdDev;

    private int round;

    /**
     * Parametrized constructor
     *
     * @param initialInvestment initialInvestment
     * @param installment       installment
     * @param inflation         inflation
     * @param years             years
     * @param mean              mean
     * @param stdDev            stdDev
     * @param round             round
     */
    public MonteCarloRequest(double initialInvestment, double installment, double inflation, int years, double mean, double stdDev, int round) {
        super();
        this.initialInvestment = initialInvestment;
        this.installment = installment;
        this.inflation = inflation;
        this.years = years;
        this.mean = mean;
        this.stdDev = stdDev;
        this.round = round;
    }

    /**
     * Getter method for initialInvestment
     *
     * @return initialInvestment
     */
    public double getInitialInvestment() {
        return initialInvestment;
    }

    /**
     * Setter method for initialInvestment
     *
     * @return initialInvestment
     */
    public void setInitialInvestment(double initialInvestment) {
        this.initialInvestment = initialInvestment;
    }

    /**
     * Getter method for installment
     *
     * @return installment
     */
    public double getInstallment() {
        return installment;
    }

    /**
     * Setter method for initialInvestment
     *
     * @return installment
     */
    public void setInstallment(double installment) {
        this.installment = installment;
    }

    /**
     * Getter method for inflation
     *
     * @return inflation
     */
    public double getInflation() {
        return inflation;
    }

    /**
     * Setter method for inflation
     *
     * @param inflation inflation
     */
    public void setInflation(double inflation) {
        this.inflation = inflation;
    }

    /**
     * Getter method for years
     *
     * @return years
     */
    public int getYears() {
        return years;
    }

    /**
     * Setter method for years
     *
     * @param years years
     */
    public void setYears(int years) {
        this.years = years;
    }

    /**
     * Getter method for mean
     *
     * @return mean
     */
    public double getMean() {
        return mean;
    }

    /**
     * Setter mean for mean
     *
     * @param mean mean
     */
    public void setMean(double mean) {
        this.mean = mean;
    }

    /**
     * Getter method for stdDev
     *
     * @return stdDev
     */
    public double getStdDev() {
        return stdDev;
    }

    /**
     * Setter method for stdDev
     *
     * @param stdDev v
     */
    public void setStdDev(double stdDev) {
        this.stdDev = stdDev;
    }

    /**
     * Getter method for round
     *
     * @return round
     */
    public int getRound() {
        return round;
    }

    /**
     * Setter method for round
     *
     * @param round round
     */
    public void setRound(int round) {
        this.round = round;
    }
}
