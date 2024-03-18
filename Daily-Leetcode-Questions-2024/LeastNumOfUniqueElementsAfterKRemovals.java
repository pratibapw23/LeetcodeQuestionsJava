package dailyLeetcodeQuestions2024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LeastNumOfUniqueElementsAfterKRemovals {

	public static void main(String[] args) {
		int nums[]= {2,1,1,3,3,3};
		int k=3;
		int count=leastNumberOfFrequentElementsAFterKRemovals(nums,k);
		System.out.println(count);
	}

	private static int leastNumberOfFrequentElementsAFterKRemovals(int[] nums, int k) {
		Map<Integer,Integer> map=new HashMap<>();
		Set<Integer> set=new HashSet<>();
		
		for(int i=0;i<nums.length;i++)
		{
			if(!map.containsKey(nums[i])) map.put(nums[i], 1);
			else map.put(nums[i], map.get(nums[i])+1);
		}
		System.out.println(map);
		
		List<Integer> list=new ArrayList<>();
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			list.add(entry.getValue());
		}
		Collections.sort(list);
		System.out.println(list);
		
		int pos=0;
		while(k!=0) {
			if(list.get(pos)>=1) {
				int e=list.get(pos);
				int a=e-1;
				list.remove(pos);
				list.add(pos, a);
				pos++;
				k--;
			}
			
		}
		System.out.println(list);
		
//		HashMap<Integer,Integer> sortedMap=sortByValue(map);
//		System.out.println(sortedMap);
//		
//		int count=0;
//		for(Map.Entry<Integer, Integer> entry:sortedMap.entrySet()) {
//			while(count!=k && entry.getValue()!=0) {
//			sortedMap.put(entry.getKey(),(entry.getValue()-1));
//			count++;
//			
//			}
//			if(entry.getValue()>0) {
//				set.add(entry.getKey());
//				
//			}
//				
//		}
//		System.out.println(sortedMap);
//		System.out.println(set);
//		return set.size();
		return 0;
	}
//	public static HashMap<Integer, Integer> sortByValue(Map<Integer, Integer> map)
//    {
//        List<Map.Entry<Integer, Integer> > list =
//               new LinkedList<Map.Entry<Integer, Integer> >(map.entrySet());
// 
//        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() {
//            public int compare(Map.Entry<Integer, Integer> o1, 
//                               Map.Entry<Integer, Integer> o2)
//            {
//                return (o1.getValue()).compareTo(o2.getValue());
//            }
//        });
//         
//        // put data from sorted list to hashmap 
//        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
//        for (Map.Entry<Integer, Integer> aa : list) {
//            temp.put(aa.getKey(), aa.getValue());
//        }
//        return temp;
//    }

}
