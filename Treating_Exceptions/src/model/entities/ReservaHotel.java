package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class ReservaHotel {
    
    private Integer numeroQuarto;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public ReservaHotel(Integer numeroQuarto, Date checkIn, Date checkOut){
        if(!checkOut.after(checkIn)){
            throw new DomainException("A data de check-out deve ser posterior à data de check-in");
        }
        this.numeroQuarto = numeroQuarto;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public void setNumeroQuarto(Integer numeroQuarto){
        this.numeroQuarto = numeroQuarto;
    }

    public Integer getNumeroQuarto(){
        return numeroQuarto;
    }

    public Date getCheckIn(){
        return checkIn;
    }

    public Date getCheckOut(){
        return checkOut;
    }

    public long duracao(){
        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void atualizaData(Date checkIn, Date checkOut){
        Date now = new Date();
        if(checkIn.before(now) || checkOut.before(now)){
            throw new DomainException("As datas de atualização de reserva devem ser datas futuras");
        }
        if(checkOut.after(checkIn)){
            throw new DomainException("A data de check-out deve ser posterior à data de check-in");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString(){
        return "Quarto "
        + numeroQuarto
        + ", check-in: "
        + sdf.format(checkIn)
        + ", check-out: "
        + sdf.format(checkOut)
        + ", "
        + duracao()
        + " noites";
    }

}