public class Printer {
    private int sheets;

    public Printer(int sheets){
        this.sheets = sheets;
    }

    public int getSheets(){
        return this.sheets;
    }

     public int print( int copies,  int pages){
         if(this.sheets >= (pages * copies))
         {return this.sheets -= (pages * copies);
         } else {
             return this.sheets;
         }
     }

     public int refill(){
        return this.sheets = 50;
     }
}
