public class Printer {

    private int pages;

    public Printer(int pages){
        this.pages = pages;

    }


    public boolean print(int pages,int copies) {
        int numberOfPages = pages * copies;
        if (this.pages >= numberOfPages) {
            return true;
        } else {
            return false;
        }
    }


    public int refill() {
        return this.pages = 100;
    }

    }


