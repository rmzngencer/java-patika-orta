public class MyList <T> {
    private T[] array;
    private int size = 10;

    public MyList() {
        array = (T[]) new Object[size];
    }
    public MyList(int size) {
        this.size = size;
        array = (T[]) new Object[size];
    }

    public int size() {
        return array.length-size;
    }
    public int getCapacity() {
        return array.length;
    }

    public void add(T element) {
        if (size == 0) {
            T[] tempArray = array;
            array = (T[]) new Object[array.length*2];
            for (int i = 0; i < tempArray.length; i++) {
                array[i] = tempArray[i];
            }
            size = array.length/2;
        }
        array[size()] = element;
        size--;

    }
    public T get(int index) {
        if (index < 0 || index >= size()) {
           return null;
        }
        return array[index];
    }
    public void remove(int index) {
        if (index < 0 || index >= size()) {
            return;
        }
        for (int i = index; i < size()-1; i++) {
            array[i] = array[i+1];
        }
        size++;
    }
    public void set(int index, T element) {
        if (index < 0 || index >= size()) {
            return;
        }
        array[index] = element;
    }
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size(); i++) {
            sb.append(array[i]);
            if (i != size()-1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();

    }

    public int indexOf(T element) {
        for (int i = 0; i < size(); i++) {
            if (array[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T element) {
        for (int i = size()-1; i >= 0; i--) {
            if (array[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }
    public boolean isEmpty(){
        if( size()==0){
            return true;
        }
        return false;
    }
    public T[] toArray(){
        return array;
    }

    public void clear(){

        array = (T[]) new Object[size];

    }
    public MyList<T> subList(int start, int finish){
        MyList<T> temp = new MyList<>();
        for( int i=start; i<finish+1; i++ ){
            temp.add(array[i]);
        }
        return temp;
    }
    public boolean contains(T data){
        for(int i=0; i<size();i++){
            if (array[i]==data){
                return true;

            }
        }
        return false;
    }


}
