public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[10];
  }

  public void clear(){
    for (int i = 0; i < data.length; i++){
      data[i] = null;
    }
  }

  public int size(){
    int count = 0;
    for (int i = 0; i < data.length; i++){
      if (data[i] != null){
        count++;
      }
    }
    return count;
  }

  public boolean isEmpty(){
    return (size == 0);
  }

  public boolean add(String element){
    if (this.size() != data.length){
      data[this.size()] = element;
      return true;
  } else return false;
}

  public String toString(){
    String result = "";
    for (int i = 0; i < data.length; i++){
      if (i == this.size()-1){
      result += data[i];
    } else if (data[i] != null){
      result += data[i];
      result += ", ";
    }
  }
  return "[" + result + "]";
}

public String toStringDebug(){
  String result = "";
  for (int i = 0; i < data.length; i++){
    if (i == data.length-1){
      result += data[i];
    } else {
      result += data[i];
      result += ", ";
    }
  }
  return "[" + result + "]";
}

  public String get(int index){
    if (index < 0 || index >= size()){
      return null;
    } else {
      return data[index];
    }
  }

  public String set(int index, String element){
    if (index < 0 || index >= size()){
      return null;
    } else {
      String old = data[index];
      data[index] = element;
      return old;
    }
}

}
