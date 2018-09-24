package practice.problems.misc;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by kartik on 10/08/17.
 */
public class EqualDP
{

    private boolean isSolved(int [] num)
    {
        boolean result = true;

        for(int i=0; i<num.length-1; i++)
            if(num[i] != num[i+1])
                result = false;

        return result;
    }

    public static void main(String[] args)
    {
        EqualDP dp = new EqualDP();

        int[] sol = new int[]{53,
                361,
                188,
                665,
                786,
                898,
                447,
                562,
                272,
                123,
                229,
                629,
                670,
                848,
                994,
                54,
                822,
                46,
                208,
                17,
                449,
                302,
                466,
                832,
                931,
                778,
                156,
                39,
                31,
                777,
                749,
                436,
                138,
                289,
                453,
                276,
                539,
                901,
                839,
                811,
                24,
                420,
                440,
                46,
                269,
                786,
                101,
                443,
                832,
                661,
                460,
                281,
                964,
                278,
                465,
                247,
                408,
                622,
                638,
                440,
                751,
                739,
                876,
                889,
                380,
                330,
                517,
                919,
                583,
                356,
                83,
                959,
                129,
                875,
                5,
                750,
                662,
                106,
                193,
                494,
                120,
                653,
                128,
                84,
                283,
                593,
                683,
                44,
                567,
                321,
                484,
                318,
                412,
                712,
                559,
                792,
                394,
                77,
                711,
                977,
                785,
                146,
                936,
                914,
                22,
                942,
                664,
                36,
                400,
                857};
        System.out.println(dp.makeAllSame(sol,0));

    }

    public int makeAllSame(int[] num, int count)
    {
        if(isSolved(num)) {
            return count;
        }

        int mean = getMean(num);
        int value = computeReducer(mean);

        Set<Integer> doIndexes = getAllMaxs(num);
        int[] result = reduce(num, doIndexes, value);
        //int reductions = num.length - leaveIndexes.size();

        return makeAllSame(result, count + doIndexes.size());
    }

    private int getMean(int[] num)
    {
        int mean = 0;
        for(int i=0; i<num.length; i++)
            mean = mean + num[i];
        mean = mean / num.length;
        return mean;
    }

    private int getMin(int[] num)
    {
        int pos = -1;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<num.length; i++)
            if(min > num[i]) {
                min = num[i];
                pos = i;
            }
        return pos;
    }

    private int getMax(int[] num)
    {
        int pos = -1;
        int min = Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++)
            if(min < num[i]) {
                min = num[i];
                pos = i;
            }
        return pos;
    }

    private Set<Integer> getAllMins(int[] num)
    {
        Set<Integer> list = new HashSet<Integer>();
        int min = num[getMin(num)];
        for(int i=0; i<num.length; i++)
            if(min == num[i])
                list.add(i);
        return list;
    }

    private Set<Integer> getAllMaxs(int[] num)
    {
        Set<Integer> list = new HashSet<Integer>();
        int max = num[getMax(num)];
        for(int i=0; i<num.length; i++)
            if(max == num[i])
                list.add(i);
        return list;
    }

    public int computeReducer(int mean)
    {
        for(int i=5; i>2; i-=2)
            if(mean >= i)
                return i;
        return 1;
    }

    public int getSum(int[] num)
    {
        Set<Integer> set = getAllMaxs(num);
        int sum = 0;
        for(int i=0; i<num.length; i++)
            if(set.contains(i))
                sum = sum + num[i];
        return sum;
    }

    private int[] reduce(int[] num, Set<Integer> leaveIndex, int value)
    {
        int[] res = num.clone();
        for(int i=0; i<res.length; i++)
            if(leaveIndex.contains(i))
                res[i] -= value;
        return res;
    }

}
