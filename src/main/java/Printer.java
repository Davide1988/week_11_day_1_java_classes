public class Printer {

    private int pages;
    private int toner;

    public Printer(int pages, int toner){
        this.pages = pages;
        this.toner = toner;

    }


    public boolean print(int pages,int copies) {
        int numberOfPages = pages * copies;
        if (this.pages >= numberOfPages) {
            return true;
        } else {
            return false;
        }
    }


    public int refill(int refill) {
        if (this.pages == 100) {
           return this.pages;
        }else{
            return this.pages + refill;
        }
    }

    public int reduceToner(int pages){
        return this.toner - pages;
    }





}


