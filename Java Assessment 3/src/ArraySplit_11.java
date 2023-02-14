public class ArraySplit_11 {
    public static void main(String[] args){
        int[] ArrNo = {58, 24, 13, 15, 63, 9, 8, 81, 1, 78};

        int[] Arr1 = new int[(ArrNo.length)/2];
        int[] Arr2 = new int[(ArrNo.length)/2];
        int i;
//        the arrry;
        System.out.print("The Initial array: ");
        for (i=0; i<ArrNo.length; i++){
            System.out.print(ArrNo[i] + " ");
        }
        System.out.println("\n After spliting: ");
//        the split array 1
        System.out.print("Array Split 1: ");
        for (i=0; i<(ArrNo.length)/2; i++){
            Arr1[i] = ArrNo[i];
            System.out.print(Arr1[i] + " ");
        }
        System.out.println();
        //        the split array 2
        System.out.print("Array Split 2: ");
        for (i=(ArrNo.length)/2; i<ArrNo.length; i++){
            Arr2[i-(ArrNo.length)/2] = ArrNo[i];
            System.out.print(Arr2[i-(ArrNo.length)/2] + " ");
        }
    }
}
