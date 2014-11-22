public class MediaDatosEstadisticos {
    
    private long tiempoEjecuciónAcumulado;
    private int nComparacionesAcumuladas;
    private int nMovimientosAcumulados;
    private int nDatosEstadisticos;
    
    public MediaDatosEstadisticos () {
        tiempoEjecuciónAcumulado=0;
        nComparacionesAcumuladas=0;
        nMovimientosAcumulados=0;
        nDatosEstadisticos=0;
    }
    
    public void añadeDatosEstadisticos(DatosEstadisticos datosEstadisticos){
        nDatosEstadisticos++;
        tiempoEjecuciónAcumulado += datosEstadisticos.dameTiempo();
        nComparacionesAcumuladas += datosEstadisticos.dameComparaciones();
        nMovimientosAcumulados += datosEstadisticos.dameMovimientos();
    }
    
    public long dameMediaTiempos (){
        return tiempoEjecuciónAcumulado/nDatosEstadisticos;
    }
    
    public int dameMediaComparaciones (){
        return nComparacionesAcumuladas/nDatosEstadisticos;
    }
    
    public int dameMediaMovimientos (){
        return nMovimientosAcumulados/nDatosEstadisticos;
    }
}