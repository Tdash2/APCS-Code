class Word implements Comparable<Word>{
    private int freq = 1;
    private String val;

    /**
     * Sets z to the value given
     * @param x the value you want to set x to
     */
    public void setVal(String x) {
        val = x;
    }

    /**
     * Gets the value of val
     * @return Val
     */
    public String getVal() {
        return val;
    }

    /**
     * Gets The frequency
     * @return The frequency
     */
    public int getFreq() {
        return freq;
    }

    /**
     * Adds 1 to the freqancy
     */
    public void incFreq() {
        freq++;
    }

    /**
     * Give you a nice verson of the frequancy and word
     * @return
     */
    public String toString() {
        return freq + "  " + val;
    }

    public boolean equals(Word other) {
        return compareValTo(other) == 0;
    }

    public int compareValTo(Word other) {
        return val.equals(other.getVal()) ? 0 : val.compareTo(other.getVal());
    }

    public int compareTo(Word other) {
        return freq == other.freq ? 0 : freq - other.freq;
    }
}