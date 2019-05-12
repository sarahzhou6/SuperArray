public class SuperArray{
  public int size;
  public String[] data;

  SuperArray(){
    data = new String[10];
  }
  public void clear(){
    data = new String[0];
  }
  public int Size(){
    int counter = 0;
    for(int i = 0; i < data.length; i++){
      if(data[i] != null){
        counter++;
      }
    }
    return counter;
  }
  public boolean isEmpty(){
    int counter = 0;
    for(int i = 0; i < data.length; i++){
      if(data[i] != null){
        counter++;
      }
    }
    if(counter == 0){
      return true;
    }
    else{
      return false;
    }
  }
  public void resize(){
    String[] data2 = new String[data.length + 1];
    for(int i = 0; i < data.length; i++){
      data2[i] = data[i];
    }
    String[] data = new String[data2.length];
    for(int j = 0; j < data2.length; j++){
      data[j] = data2[j];
    }
  }
  public boolean add(String element){
    if(data[data.length - 1] == null){
      for(int i = data.length - 1; i >= 0; i--){
        if(data[i] != null){
          data[i+1] = element;
          return true;
        }
      }
    }
    this.resize();
    data[data.length - 1] = element;
    return true;
  }
  public String get(int index){
    String s = "";
    try{
      s = data[index];
      }
    catch (ArrayIndexOutOfBoundsException e){
        System.out.println("error: " + e.getMessage());
      }
    return ge;
  }
  public String Set(int index, String element){
    String st = "";
    try{
      st = data[index];
      data[index] = element;
    }
    catch (ArrayIndexOutOfBoundsException e){
      System.out.println(e.getMessage());
    }
    return st;
  }
  public String toString(){
    String format = "[";
    for(int i=0; i<data.length;i++){
      format = format + data[i];
      if(i < data.length - 1){
          format = format + ",";
      }
  }
  return format;
  }
  public boolean contains(String element){
    for(int i = 0; i < data.length; i++){
      if(data[i] == element){
        return true;
      }
    }
    return false;
  }
  public void add(int index, String element){
    try{for(int i = data.length - 1; i > index; i--){
      data[i] = data[i-1];
      }
    data[index] = element;
    }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println(e.getMessage());
    }
  }
  public int indexOf(String element){
    for(int i = 0; i < data.length; i++){
      if(data[i] == element){
        return i;
      }
    }
    return -1;
  }
  public int lastIndexOf(String element){
    for(int i = data.length - 1; i >= 0; i--){
      if(data[i] == element){
        return i;
      }
    }
    return -1;
  }
  public String remove(int index){
    String str ="";
    try{
    str = data[index];
    for(int i = index; i < data.length; i++){
      data[i] = data[i+1];
    }
    }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println("this is the error for remove 1: " + e.getMessage());
    }
    return str;
  }
  public boolean remove(String element){
    for(int i = 0; i < data.length; i++){
      if(data[i] == element){
          for(int j = i; j < data.length - 1; j++){
            data[j] = data[j+1];

          }
      data[data.length - 1] = null;
      return true;
      }
    }
    return false;
  }
}
