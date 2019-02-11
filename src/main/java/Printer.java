public class Printer {

    private int pages;
    private int toner;

    public Printer(int pages, int toner){
        this.pages = pages;
        this.toner = toner;

    }


    public int getPages(){
        return this.pages;
    }

    public int getToner(){
        return this.toner;
    }

    public void print(int pages,int copies) {
        int numberOfPages = pages * copies;
        if (this.pages >= numberOfPages) {
            this.pages -= numberOfPages;
        }
    }


    public int refill(int refill) {
        if (this.pages == 100) {
           return this.pages;
        }else{
            return this.pages + refill;
        }
    }

    public int reduceToner(){


    }





}


