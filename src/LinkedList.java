public class LinkedList <T>{
    private Nodes start = null;
    private Nodes current;
    void Insert(T data){
        if(this.start == null){
            start =  new Nodes<T>(data);
            current = start;
        }else{
            current.nextNode = new Nodes<T>(data);
            current = current.nextNode;
        }
    }

    T Delete(){
      Nodes temp  = start;
      start = start.nextNode;
      return (T) temp.readtData();
    }
    void Display(){
        Nodes Temp  = start;
        do{
            System.out.println(Temp.readtData());
            Temp = Temp.nextNode;
        }while(Temp != null);
    }
}
