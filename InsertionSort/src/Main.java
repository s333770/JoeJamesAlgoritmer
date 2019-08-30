import java.util.Random;

public class Main {
    //Insertion sort er ikke en rask algoritme, den bruker O(n^2);
    int [] arrayGenerert=new int [10];

    public int [] generateRandomArray(int n){
        for(int i=0; i<n; i++){
            Random r= new Random();
            arrayGenerert[i]= r.nextInt(10)+1;
        }
        return arrayGenerert;
    }
    public void printArray(){
        for(int i=0; i<arrayGenerert.length; i++){
            System.out.printf("%5s", i);

        }
        System.out.println();
        for(int i=0; i<arrayGenerert.length;i++){
            System.out.printf("%5s",arrayGenerert[i]);
        }
        System.out.println();
        System.out.println();
    }
    public int[] insertionSort(){
        int i,j,key,temp;
        for(i=1; i<arrayGenerert.length;i++){
            key=arrayGenerert[i]; //Dette er verdien som som i har gjennom arrayet
            j=i-1;
            while((j >= 0) && (key < arrayGenerert[j])){ // Hvis k er mindre enn j så switcher vi verdier
               arrayGenerert[j+1]=arrayGenerert[j];
               j=j-1;
            }
            arrayGenerert[j+1]=key;
        }
        return arrayGenerert;
    }
    public void swap(int A, int B){
        int temp=A;
        A=B;
        B=temp;
    }
    public int [] selectionSort(){
        int i,j, minIndex,temp=0;
        for(i=0; i<arrayGenerert.length;i++){
            minIndex=i;
            for(j=i+1;j<arrayGenerert.length;j++ ){
                if(arrayGenerert[j]<arrayGenerert[minIndex]){
                    minIndex=j;
                }
            }
            temp=arrayGenerert[minIndex];
            arrayGenerert[minIndex]=arrayGenerert[i];
            arrayGenerert[i]=temp;

        }
        return arrayGenerert;
    }


    public static void main(String[] args) {
        Main array=new Main();
        array.generateRandomArray(10);
        array.printArray();
        array.insertionSort();// Insertion sort sammenligner to og to elementer mens den jobber seg oppover O(n^2=

        array.printArray();

        //SelectionSort
        array.generateRandomArray(10);
        array.printArray();
        array.selectionSort();// Søker gjennom hele arrayet etter minste verdi,og bytter disse verdiene (n^2)
        array.printArray();




    }
}
