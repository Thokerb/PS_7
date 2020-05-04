# Exercise 4
Assume you are in charge of a news website and want to show the k most often clicked articles on
the landing page, in descending order of clicks received. You are given an array A of m articles
where A[i] includes the heading (string) and the click count (integer) of article i.

### What Abstract Data Type would suit this application? Explain your choice!
Priority Queue, because it sorts the entries with the key and has an efficient sorting algorithmn

### What are the complexities of the methods that you use in your implementation?

    public static Entry[] top_entries(Entry[] entries, int k) {
        var queue = new PriorityQueue<Entry>(Arrays.asList(entries));   //so the priority queue can initialize itself with all elements (Bottom-Up Heap Construction)
        Entry[] result = new Entry[k];
        for (int i = 0; i < k; i++) {
            result[i] = queue.poll();
        }
        return result;
    }
    
1. Bottom Up Heap Construction has a complexity of O(n)
2. poll has a complexity of O(log n) -> O(k*log(n)) -> O(log n)  
=> Complexity is O(n) + O(log n) -> O(n)  
=> Complexity is O(n)  