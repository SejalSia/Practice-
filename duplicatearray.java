import java.util.ArrayList;
import java.util.Arrays;

class duplicatearray {

    static ArrayList<Integer> findDuplicates(int[] arr) {

        // sort the array so that duplicates are adjacent
        Arrays.sort(arr);

        ArrayList<Integer> ans = new ArrayList<>();

        // traverse the sorted array and check
        // for consecutive duplicates
        for (int i = 1; i < arr.length; i++) {

            // if current element is same as previous
            if (arr[i] == arr[i - 1]) {

                // avoid adding the same duplicate
                // multiple times
                if (ans.isEmpty() ||
                        ans.get(ans.size() - 1) != arr[i]) {
                    ans.add(arr[i]);
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 1, 2, 3};

        ArrayList<Integer> res = findDuplicates(arr);

        for (int ele : res) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
