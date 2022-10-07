class MyCalendarThree {
TreeMap<Integer,Integer> timeline;
    public MyCalendarThree() {
        timeline=new TreeMap<>();
    }
    
    public int book(int s, int e) {
         timeline.put(s, timeline.getOrDefault(s, 0) + 1); // 1 new event will be starting at [s]
        timeline.put(e, timeline.getOrDefault(e, 0) - 1); // 1 new event will be ending at [e];
        int ongoing = 0, k = 0;
        for (int v : timeline.values())
            k = Math.max(k, ongoing += v);
        return k;
    }
}

/**
 * Your MyCalendarThree object will be instantiated and called as such:
 * MyCalendarThree obj = new MyCalendarThree();
 * int param_1 = obj.book(start,end);
 */