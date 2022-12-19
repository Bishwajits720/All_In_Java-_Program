package bs.com;



    class linearsearch2 {
        public static void main(String[] args) {
            int[] nums = {21, 32, 43, 42, 24, 45, 75, 88};
            int target =776;
            int ans = linearsearch2(nums, target);
            System.out.println(ans);
        }

        static int linearsearch2(int[] arr, int target) {
            if (arr.length == 0) {
                return -1;
            }
            for (int element : arr) {
                if (element == target) {
                    return element;

                }

            }
            return -1;

        }

    }


