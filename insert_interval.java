/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
            int pos = 0; // used to record where to insert newInterval into "result"
            ArrayList<Interval> result = new ArrayList<Interval>();
            
            for (Interval cur_interval : intervals){
                if (cur_interval.end < newInterval.start){
                    result.add(cur_interval);
                    pos++;
                }
                else if (cur_interval.start > newInterval.end){
                    result.add(cur_interval);
                }
                else {
                    int new_start = Math.min(cur_interval.start, newInterval.start);
                    int new_end = Math.max(cur_interval.end, newInterval.end);
                    newInterval = new Interval(new_start, new_end);
                }
            }
            result.add(pos, newInterval);
            return result;
        
        
    }
        
}
