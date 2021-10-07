package example;

public class InsertionSorter implements Sorter {

    private int[] a;
    private String plan = "";

    @Override
    public void load(int[] elements) {
        // TODO Auto-generated method stub
        this.a = elements;    
    }

    private void swap(int i, int j) {
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        plan += "" + a[i] + "<->" + a[j] + "\n";
    }

    @Override
    public void sort() {
        // TODO Auto-generated method stub
        for (int i=1; i<a.length; ++i){
            int value = a[i];
            int position=i;
            while (position>0 && a[position-1]>value){
                swap(position, position-1);
                // a[position] = a[position-1];
                // plan += "" + a[position] + "<->" + a[position-1] + "\n";
                position--;
            }
            // a[position] = value;
            // plan += "" + a[position] + "<->" + a[i] + "\n";
            // System.out.println(plan);
            // int x = 10;
        }//loop i
    }

    @Override
    public String getPlan() {
        // TODO Auto-generated method stub
        return this.plan;
    }
    
}
