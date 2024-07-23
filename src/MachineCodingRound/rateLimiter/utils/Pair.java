package MachineCodingRound.rateLimiter.utils;

public class Pair{
  private   int bucketSize;
   private long time;

    public Pair(int bucketSize, long time) {
        this.bucketSize = bucketSize;
        this.time = time;
    }

    public int getBucketSize() {
        return bucketSize;
    }

    public void setBucketSize(int bucketSize) {
        this.bucketSize = bucketSize;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}