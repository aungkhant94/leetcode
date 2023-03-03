package hackerRank;

import java.util.*;

public class WebsitePaginationEnhanced {
    public static void main(String[] args) {
        List<List<String>> items = Arrays.asList(Arrays.asList("item1", "10", "15"),
                Arrays.asList("item2","3","4"), Arrays.asList("items3","17","8"));
        List<String> output = fetchItemsToDisplay(items, 1, 0, 2,1);
        System.out.println(output);
    }

    public static List<String> fetchItemsToDisplay(List<List<String>> items, int sortParameter,
                                                   int sortOrder, int itemsPerPage, int pageNumber) {

        Collections.sort(items, new Comparator<List<String>>() {
            @Override
            public int compare(List<String> list1, List<String> list2) {
                int num1;
                int num2;
                if(sortParameter == 0) {
                    if(sortOrder == 0) return list1.get(0).compareTo(list2.get(0));
                    else return list2.get(0).compareTo(list1.get(0));
                } else if(sortParameter == 1) {
                    num1 = Integer.parseInt(list1.get(1));
                    num2 = Integer.parseInt(list2.get(1));
                    if(sortOrder == 0) return num1 - num2;
                    else return num2 - num1;
                } else {
                    num1 = Integer.parseInt(list1.get(2));
                    num2 = Integer.parseInt(list2.get(2));
                    if(sortOrder == 0) return num1 - num2;
                    else return num2 - num1;
                }
            }
        });

        List<String> result = new ArrayList<>();

        int count = 0;
        for(int i=itemsPerPage*pageNumber; i<items.size(); i++) {
            if(count > itemsPerPage) {
                break;
            }
            result.add(items.get(i).get(0));
            count++;
        }

        return result;
    }
}
