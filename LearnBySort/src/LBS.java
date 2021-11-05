public class LBS {


    public static int[] Sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            // Inner nested loop pointing 1 index ahead
            for (int j = i + 1; j < arr.length; j++) {

                // Checking elements
                int temp = 0;
                if (arr[j] < arr[i]) {

                    // Swapping
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }

                // Printing sorted array elements
                //System.out.print(arr[i] + " ");

            }
        }
            return arr;
        }
        public static int[] Sum(int[][] examples)
        {
            int[] totals = new int[examples[1].length];
            for (int i = 0; i < totals.length; i++) {
                totals[i] = 0;
            }

            for (int i = 0; i < examples.length; i++) {
                for (int j = 0; j < examples[0].length; j++) {
                    totals[j] = totals[j] + examples[i][j];
                }
            }

            return totals;
        }


        public static void main (String[]args)
        {
            int[][] trainingData = new int[][]{{1, 0, 1}, {1, 0, 0}, {0, 1, 1}, {1, 1, 1}};
            int[] sm = Sum(trainingData);
            int[] in = Sort(Sum(trainingData));
            //System.out.println("Sorted Array: ");

            //COLLAPSE IN TO A SINGLE LOOP
            int Max = 0;
            for (int i = 0 ; i < in.length; i++)
            {
                if (in[i] > Max)
                {
                    Max = in[i];
                }
                System.out.print(i + ":" + in[i] + " ");
            }

            //Remove all arrays with Max as 1
            for (int j = 0; j < in.length; j++)
            {
                for (int k = 0; k < in.length; k++)
                {
                    if (sm[k] == Max && trainingData[j][k] == 1)
                    {
                        trainingData[j][0] = 0;
                        trainingData[j][1] = 0;
                        trainingData[j][2] = 0;
                    }
                }

            }
            System.out.println("");
            int[] in2 = Sort(Sum(trainingData));
            int[] sum2 = Sum(trainingData);
            for (int i = 0; i < in2.length; i++)
            {
                System.out.print(in2[i] + " ");

            }
            System.out.println();
            int Max2 = 0;
            for (int i = 0 ; i < in2.length; i++)
            {
                if (sum2[i] > Max2)
                {
                    Max2 = sum2[i];
                }
                System.out.print(i + ":" + sum2[i] + " ");
            }
            //Remove all arrays with Max as 1 for the 3rd most important value
            for (int j = 0; j < in2.length; j++)
            {
                for (int k = 0; k < in2.length; k++)
                {
                    if (sum2[k] == Max2 && trainingData[j][k] == 1)
                    {
                        trainingData[j][0] = 0;
                        trainingData[j][1] = 0;
                        trainingData[j][2] = 0;
                    }
                }

            }
            System.out.println("");
            int[] in3 = Sort(Sum(trainingData));
            int[] sum3 = Sum(trainingData);
            for (int i = 0; i < in3.length; i++)
            {
                System.out.print(in3[i] + " ");

            }
            System.out.println();
            int Max3 = 0;
            for (int i = 0 ; i < in3.length; i++)
            {
                if (sum3[i] > Max3)
                {
                    Max3 = sum3[i];
                }
                System.out.print(i + ":" + sum3[i] + " ");
            }
            for (int j = 0; j < in3.length; j++)
            {
                for (int k = 0; k < in3.length; k++)
                {
                    if (sum3[k] == Max3 && trainingData[j][k] == 1)
                    {
                        trainingData[j][0] = 0;
                        trainingData[j][1] = 0;
                        trainingData[j][2] = 0;
                    }
                }

            }
        }
    }
