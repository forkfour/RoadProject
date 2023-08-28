package Road.counterAggregation;

public class Counter {
    static public int counterQuantity = 0;
    static public Counter [] counterList = new Counter [10];
    public final String name;
    private final String measureType;
    int count;

    public Counter(String name, String measureType) {
        this.name = name;
        this.measureType = measureType;
        counterList[counterQuantity] = this;
        counterQuantity++;
    }

    public String getName(){
        return this.name;
    }
    public String getMeasureType() {
        return this.measureType;
    }
    public int getCount(){
        return count;
    }


}
