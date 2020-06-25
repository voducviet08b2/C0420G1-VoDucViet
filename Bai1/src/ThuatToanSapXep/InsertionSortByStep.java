package ThuatToanSapXep;

public class InsertionSortByStep {
    public static void insertionSort(int []list){
        for (int i = 1; i < list.length; i++){
//insert list[i] into a sorted sublist list[0...i-1]
//so that list[0..i] is sorted
            int currentElement = list[i];
            System.out.println("Vong lap thu "+i+", current Element = "+currentElement);
            int k;
            for(k = i - 1; k >=0 && list[k] > currentElement; k--){
                System.out.println("Vi tri cua k: "+k+", Gia tri cua k: "+list[k]+", Gia tri cua k+1: "+list[k+1]);
                list[k+1] = list[k];


            }
//insert the current elemtn into list[k+1]
            list[k+1] = currentElement;
        }
    }

    public static void main(String[] args) {
        int list[]={12,34,23,12,78,45,236,563};
        insertionSort(list);
        for (int i=0;i<list.length;i++){
            System.out.print(list[i]+" - " );
        }
    }
}
