/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

/**
 *
 * @author USER
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     * I have made some changes to check git
     */
    private long[] a;
    private int nElems;
    
    BubbleSort(int max){
        a = new long[max];
        nElems=0;
        
    }
    
    public void insert(long value){
        a[nElems]=value;
        nElems++;
        
    }
    
    public void display(){
        for(int j=0;j<nElems;j++){
            System.out.print(a[j] + " ");
            
        }
        System.out.println("");
        
    }
    
    public void bubblesort(){
        int out,in;
        for (out=nElems-1;out>1;out--){
            for(in=0;in<out;in++){
                if(a[in]>a[in+1])
                    swap(in,in+1);
            }
    
            
        }
    }
    
    private void swap(int one,int two){
        long temp=a[one];
        a[one]=a[two];
        a[two]=temp;
        
    }
    
    public void sort(){
        int in,out;
        
        for(out=nElems-1;out>1;out--){
            for(in=0;in<out;in++){
                if(a[in]>a[in+1])
                    sw(in,in+1);
                
            }
        }
    }
    private void sw(int one,int two){
        long temp=a[one];
        a[one]=a[two];
        a[two]=temp;
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int maxsize=10;
        BubbleSort arr =new BubbleSort(maxsize);
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);
        
        arr.display();
        arr.bubblesort();
        arr.display();
        
        
        
    }
}
