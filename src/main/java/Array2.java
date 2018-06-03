public class Array2 {
    public static void main(String[] args) {
        int array[] = new int[20];
        int maxNeg = array[0];
        int minPos = Integer.MAX_VALUE;
        int maxNegInd = 0;
        int minPosInd = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 21) - 10);
            if (array[i] < 0 && (maxNeg == 0 || array[i] > maxNeg)) {
                maxNeg = array[i];
                maxNegInd = i;
            } else if (array[i] > 0 && array[i] < minPos) {
                minPos = array[i];
                minPosInd = i;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Max: " + maxNeg + ", Min: " + minPos);
       // System.out.println("Ind: " + maxNegInd +", " + minPosInd);
        swapEl(array, maxNegInd, minPosInd);
        printArr(array);
    }

            private static void swapEl (int arr [], int i, int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        private static void printArr (int arr[]) {
            for (int i = 0; i < arr.length; i++)
            {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }






    }

