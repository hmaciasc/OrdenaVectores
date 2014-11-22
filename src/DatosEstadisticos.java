public class DatosEstadisticos {
    private float tiempoEjecucion; //Segundos
    private int comparaciones, movimientos;

    public DatosEstadisticos() {
        tiempoEjecucion = 0.0f;
        comparaciones = 0;
        movimientos = 0;
    }

    public void añadeComparacion() {
        comparaciones++;
    }

    public void añadeMovimiento() {
        movimientos++;
    }
    
    public void estableceComparaciones(int comparaciones){
        this.comparaciones = comparaciones;
    }

    public void estableceMovimientos(int movimientos){
        this.movimientos = movimientos;
    }

    public int dameMovimientos(){
        return movimientos;
    }
    
    public int dameComparaciones(){
        return comparaciones;
    }
    
    public void añadeTiempo(float incremento){
        tiempoEjecucion+=incremento;
    }
    
    public void estableceTiempo(float tiempo){
        tiempoEjecucion=tiempo;
    }
    
    public float dameTiempo(){
        return tiempoEjecucion;
    }
}