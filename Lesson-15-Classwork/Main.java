class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    
  }

  
    double approxPI(int N){
    double sum = 0.0;
    for(int i = 0; i < N; i++){
      if(i % 2 == 0)
        sum += 1.0 / (2 * i + 1);
      else
        sum -= 1.0 / (2 * i + 1);
    }
    return 4 * sum;
  }

  
}