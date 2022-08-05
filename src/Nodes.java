public class Nodes <T>{
    private T Data;
    public Nodes nextNode;

    Nodes(T data){
        this.Data = data;
        nextNode = null;
    }

    public T readtData(){
        return this.Data;
    }
}
