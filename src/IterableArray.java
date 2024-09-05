public class IterableArray {

    private final Object[] data;

    public IterableArray(Object[] data){
        this.data = data.clone();
    }

    public Iterator iterator(){
        return new ArrayIterator();
    }

    private class ArrayIterator implements Iterator {

        private int pos = 0;

        @Override
        public boolean hasNext() {
            return pos < data.length;
        }

        @Override
        public Object next() {
            return data[pos++];
        }
    }
}
