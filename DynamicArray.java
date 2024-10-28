public class DynamicArray {
    private int[] data;
    private int nextElemenyindex;

    public DynamicArray(){
        data = new int[5];
        nextElemenyindex = 0;
    }

    public int size(){
        return nextElemenyindex;
    }
    public boolean isEmpty(){
        return nextElemenyindex == 0;
    }
    public void print(){
        for(int i = 0; i<nextElemenyindex; i++){
            System.out.print(data[i] + " ");
        }
    }
    public void add(int elem){
        if(nextElemenyindex == data.length){
            doublecapacity();
        }
        
        data[nextElemenyindex] = elem;
        nextElemenyindex++;

    }

    private void doublecapacity() {
        int temp[] = data;
        data = new int[2* temp.length];
        for(int i = 0; i<temp.length; i++){
            data[i] = temp[i];    
        }
    }

    public void get(int i){
        if(i > nextElemenyindex){
            System.out.println("Index out of bound");;
        }
        System.out.println( "data at " + i + "is " + data[i]);
    }

    public void set(int ele, int i){
        if(i> nextElemenyindex){
         System.err.println(" Index out of bound");
        }
        data[i] = ele;
    }
    

    public static void main(String[] args) {
        DynamicArray d = new DynamicArray();
        System.out.println(d.isEmpty());
        for (int i = 0; i<10; i++){
            int ele = i*10;
            d.add( ele );
        }
        d.print();
        System.out.println();
        System.out.println(d.size());
        System.out.println(d.isEmpty());
        d.get(5);
        d.set(9000, 2);
        d.print();
    }
}
    

    