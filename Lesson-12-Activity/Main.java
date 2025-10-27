class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   
  }
    String creditCardType(String num) {
        if(num.starts("4")) {
            return "Visa";
        } else if(num.starts("34") || num.starts("37")) {
            return "American Express";
        } else if(num.starts("36")) {
            return "Diner Club";
        } else if(num.starts("51") || num.starts("55")) {
            return "Mastercard";
        } else if(num.starts("6011") || num.starts("65")) {
            return "Discovery";
        } else {
            return "Unknown";
        }
    }
       String pigLatin(String word) {
        if(word.length() == 0) return word;
        return word.substring(1) + word.charAt(0) + "ay";
    }
        
        String nycLocate(String zip) {
        if(zip.startsWith("100") || zip.startsWith("101") || zip.startsWith("102")) {
            return "Manhattan";
        } else if(zip.startsWith("103")) {
            return "Staten Island";
        } else if(zip.startsWith("104")) {
            return "Bronx";
        } else if(zip.startsWith("112")) {
            return "Brooklyn";
        } else if(zip.startsWith("113") || zip.startsWith("114") || zip.startsWith("111")) {
            return "Queens";
        } else {
            return "Unknown";
        }
    }

        String getMonth(String date) {
        String[] parts = date.split("/");
        int month = Integer.parseInt(parts[0]);
        String[] months = {"January","February","March","April","May","June",
                           "July","August","September","October","November","December"};
        if(month >= 1 && month <= 12) {
            return months[month-1];
        } else {
            return "Invalid Month";
        }
    }

       boolean validatePswd(String pswd) {
        if(pswd.length() < 5 && pswd.length() > 8) {
            return false;
            }
            return true;
        }
      }

