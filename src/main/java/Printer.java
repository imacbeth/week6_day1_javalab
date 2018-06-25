public class Printer {
    private int sheets;
    private int tonerVolume;

    public Printer(int sheets, int tonerVolume){
        this.sheets = sheets;
        this.tonerVolume = tonerVolume;
    }

    public int getSheets(){
        return this.sheets;
    }

    public int getTonerVolume(){
        return this.tonerVolume;
    }

     public void print( int copies,  int pages){
         if(this.sheets >= (pages * copies)) {
             this.sheets -= (pages * copies);
             this.tonerVolume -= (pages * copies);
         }
     }

     public int refill(){
        return this.sheets = 50;
     }


}
