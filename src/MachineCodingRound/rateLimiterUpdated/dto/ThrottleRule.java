package MachineCodingRound.rateLimiterUpdated.dto;

public class ThrottleRule {
    private int tokens;
    private int refilTime;

    public ThrottleRule(int tokens, int refilTime) {
        this.tokens = tokens;
        this.refilTime = refilTime;
    }

    public int getTokens() {
        return tokens;
    }

    public void setTokens(int tokens) {
        this.tokens = tokens;
    }

    public int getRefilTime() {
        return refilTime;
    }

    public void setRefilTime(int refilTime) {
        this.refilTime = refilTime;
    }
}
