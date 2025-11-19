class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    
    
  }
  String spaces(int N){
    String s = "";
    for(int i=0; i<N; i++){
      s += " ";
    }
    return s;
  }

  double harmonic(int N){
    double sum = 0;
    for(int i=1; i<=N; i++){
      sum += 1.0 / i;
    }
    return sum;
  }
  
}