class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){

  }
  void print(String msg){
	System.out.println(msg);	
  }
  Fotc(double F){
	double c =(F-32) * 5/9.0;
	return c;
  }
  double sphereVolume(double r){
	double v=(4.0 / 3.0)* Math.PI *Math.pow(r, 3);
	return v;
  }
  double coneVolume(double r1,double h){
    double v1 = (1.0 / 3.0) * Math.PI *Math.pow(r1,2)* h; 
    return v1;
}
  double distant(double x1,double y1,double x2,double y2){
    return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
  }
}
