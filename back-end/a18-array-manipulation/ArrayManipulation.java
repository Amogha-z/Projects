public class ArrayManipulation {
    int[] data;
    public ArrayManipulation(int[] data){
        this.data = data;
    }
    public void display(int[] data){
        String res="";
        if (data!=null && data.length>0){
            res="[";
            for (int i=0; i<data.length; i++){
                if(i!=data.length-1){
                    res=res+data[i]+ ", ";
                }
                else {
                    res = res + data[i] + "]";
                }
            }
        }
        System.out.println(res);
    }
    public int[] addInto(int val){
        int[] newAddData = new int[this.data.length+1];
        for(int i=0; i<this.data.length; i++){
            newAddData[i]=data[i];
        }
        newAddData[this.data.length]=val;
        return newAddData;
    }
    public int[] modifyIn(int index, int val){
        int[] newModifiedData = new int[this.data.length];
        for(int i=0; i<this.data.length; i++){
            newModifiedData[i]=data[i];
        }
        for(int j=0; j<newModifiedData.length; j++){
            newModifiedData[index]=val;
        }
        return newModifiedData;
    }
    public int[] addIntoUsingIndex(int index, int val){
        int[] newIData = new int[this.data.length+1];
        for(int i=0;i<index;i++){
            newIData[i] = data[i];
        }
        newIData[index] = val;
        for(int i = index;i<newIData.length-1;i++){
            newIData[i+1] = data[i];
        } 
        return newIData;
    }
    public int[] removeFromUsingIndex(int index){
        int[] newRData = new int[this.data.length-1];
        int newi=0;
        for(int i=0; i<data.length; i++){
            if(i!=index){
                newRData[newi]=data[i];
                newi++;
            }
        }
        return newRData;
    }
    public static void main(String[] args){
        ArrayManipulation obj = new ArrayManipulation(new int[]{2,3,4,5,6});
        obj.display(obj.addInto(10));
        obj.display(obj.modifyIn(3,9));
        obj.display(obj.addIntoUsingIndex(3, 4));
        obj.display(obj.removeFromUsingIndex(2));
        
    }
}
