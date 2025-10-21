class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   

    
  }

    boolean collegeCredit(String courseCode){
    if(courseCode.length() >= 6){
      char c = courseCode.charAt(5); 
      if(c == 'E' || c == 'M'){
        return true;
      }
    }
    else;
    return false;
   }

String getCounselor(String officialClass){
    if(officialClass.length() < 1) return "Unknown";

    char first = officialClass.charAt(0);
    char second = officialClass.charAt(officialClass.length()/2);
    char C = first; 
    char B = second;


    switch(c){
      case 'B': return "Berrouet";
      case 'C': return "Chu";
      case 'D': return "Dinn";
      case 'E': return "Eyzengart";
      case 'F': return "Flores";
      case 'G': return "Gibson";
      case 'L': return "Shim Lee";
      case 'M': return "Meltzer";
      case 'P': return "Paccione";
      case 'S': return "Fiore";
      case 'T': return "Tsai";
      case 'Z': return "Zayes";
      default: return "Unknown";
    }
  }

  String imageType(String fileName){
    fileName = fileName.toLowerCase();

    if(fileName.endsWith(".jpeg") || fileName.endsWith(".jpg")){
      return "Joint Photographic Experts Group";
    } else if(fileName.endsWith(".png")){
      return "Portable Network Graphics";
    } else if(fileName.endsWith(".gif")){
      return "Graphics Interchange Format";
    } else if(fileName.endsWith(".pdf")){
      return "Portable Document Format";
    } else {
      return "Unknown File Type";
    }
  }


  }
