import java.util.ArrayList;

class duparray {

    public static ArrayList<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();

        // traverse each element in the array
        for (int i = 0; i < arr.length; i++) {
            int cnt = 0;

            // check if element is already added to result
            for (int it : ans) {
                if (arr[i] == it) {
                    cnt++;
                    break;
                }
            }

            // if already added, skip checking again
            if (cnt > 0) continue;

            // check if current element appears again
            // in the rest of the array
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    cnt++;
                    break;
                }
            }

            // if duplicate found, add to result
            if (cnt > 0) ans.add(arr[i]);
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
