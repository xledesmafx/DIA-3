package javapoo_dia3;

public class reloj {
     int hora;
     int minutos;
     int segundos;


    public reloj() {
        this.hora = 12;
        this.minutos = 00;
        this.segundos = 00;
    }

    public reloj(int hora,int minutos,int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public reloj(int segundos){
        this.hora = ((6248/60)/60);
        this.minutos =  ((6248/60)%60);
        this.segundos = 6248%60;
    }

    public void saludo(){
        System.out.println("Hola Fer");
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void tick(){
        this.segundos = segundos + 1;
    }

    public void setSegundos(int segundos) {
        this.hora = ((6248/60)/60);
        this.minutos =  ((6248/60)%60);
        this.segundos = 6248%60;
    }

    public void addReloj(reloj r1){
        this.hora += r1.getHora();
        this.minutos += r1.getMinutos();
        this.segundos += r1.getSegundos();

        if (segundos>60) {
            segundos = 0;
            minutos= minutos +1;
        }
        if (minutos > 60) {
            minutos = 0;
            hora = hora +1;
        }
        if (hora >23){
            hora = 0;
        }
    }

    public void tickDecrement(){
        this.segundos = segundos - 1;
    }

    public void restaReloj(reloj r2){
        this.hora -= r2.getHora();
        this.minutos -=  r2.getSegundos();
        this.segundos -= r2.getSegundos();

        if (segundos<0) {
            segundos = 59;
            minutos= minutos -1;
        }
        if (minutos <0) {
            minutos = 59;
            hora = hora -1;
        }
        if (hora < 0){
            hora = 23;
        }
    }

    @Override
    public String toString() {
        return "["+hora+":"+minutos+":"+segundos+"]";
    }
}
