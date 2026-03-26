package Biblioteca.carti;

public class BookCopy {
    private String copyID;
    private Status status;

    public BookCopy(String copyID, Status status) {
        this.copyID = copyID;
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void checkStatus() {
        if (status == Status.available) {
            System.out.println("Aceasta carte este valabila!");
        } else {
            System.out.println("Aceasta carte a fost imprumutata si ca atare nu mai este disponibila!");
        }

    }

    public void updateStatus() {
        if (status == Status.borrowed) {
            status = Status.available;
        } else {
            status = Status.borrowed;
        }
    }

}
