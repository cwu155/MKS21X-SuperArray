public class SuperArray{
  private String[] data;
  private int size;

  // Phase 1

  public SuperArray(){
    data = new String[10];
  }

  public SuperArray(int size){
    data = new String[size];
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
    if (size() == data.length){
      resize();
    }
      data[size()] = element;
      size++;
      return true;
    }

  public String toString(){
    String result = "";
    for (int i = 0; i < data.length; i++){
      if (i == size()-1){
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

// Phase 2

  private void resize() {
    String[] copy = new String[size() * 2];
      for (int i = 0; i < size(); i++){
        data[i] = copy[i];
      }
    data = copy;
  }

// Phase 3

  public boolean contains(String element){
    for (int i = 0; i < size(); i++){
      if (data[i].equals(element))
      return true;
    } return false;
  }

  public int indexOf(String element){
    for (int i = 0; i < size(); i++){
      if (data[i].equals(element))
        return i;
    } return -1;
  }

  public int lastIndexOf(String element){
    for (int i = size()-1; i >= 0; i--){
      if (data[i].equals(element))
        return i;
    } return -1;
  }



}
