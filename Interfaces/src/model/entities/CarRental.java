package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CarRental {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Date start;
    private Date finish;

    private Vehicle vehicle;
    private Invoice invoice;

    public CarRental(){

    }

    public CarRental(Date start, Date finish, Vehicle vehicle){
        this.start = start;
        this.finish = finish;
        this.vehicle = vehicle;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getStart(){
        return start;
    }

    public void setFinish(Date finish){
        this.finish = finish;
    }

    public Date getFinish(){
        return finish;
    }

    public void setVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle(){
        return vehicle;
    }

    public void setInvoice(Invoice invoice){
        this.invoice = invoice;
    }

    public Invoice getInvoice(){
        return invoice;
    }
    
}
