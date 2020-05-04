package Exercise4;

import java.util.Arrays;
import java.util.PriorityQueue;

class Entry implements Comparable<Entry> {
    public String heading;
    public Integer clickCount;

    public Entry(String heading, Integer clicks) {
        this.heading = heading;
        this.clickCount = clicks;
    }

    public static Entry[] top_entries(Entry[] entries, int k) {
        var queue = new PriorityQueue<Entry>(Arrays.asList(entries));   //so the priority queue can initialize itself with all elements (Bottom-Up Heap Construction)
        Entry[] result = new Entry[k];
        for (int i = 0; i < k; i++) {
            result[i] = queue.poll();
        }
        return result;
    }

    public static void main(String[] args) {
        Entry[] entries = {
                new Entry("aa3", 3),
                new Entry("aa10", 10),
                new Entry("aa1", 1),
                new Entry("aa100", 100),
                new Entry("aa4", 4),
                new Entry("aa20", 20),
                new Entry("aa5", 5),
        };
        for (Entry e : Entry.top_entries(entries, 3)) {
            System.out.println(String.format("%s %d", e.heading, e.clickCount));
        }
    }

    @Override
    public int compareTo(Entry o) {
        return o.clickCount.compareTo(this.clickCount);
    }
}