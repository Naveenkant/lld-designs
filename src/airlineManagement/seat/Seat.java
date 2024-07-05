package airlineManagement.seat;

public class Seat {
    int row;
    int column;
    SeatStatus seatStatus;
    public Seat(int row, int column, SeatStatus seatStatus) {
        this.row = row;
        this.column = column;
        this.seatStatus = seatStatus;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public SeatStatus getSeatStatus() {
        return seatStatus;
    }

    public void setSeatStatus(SeatStatus seatStatus) {
        this.seatStatus = seatStatus;
    }
}
