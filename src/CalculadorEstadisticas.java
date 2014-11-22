public class CalculadorEstadisticas {
	public static DatosEstadisticos estadisticaOrdenaVector(OrdenarVector m, int tam_vector, boolean modo){
		int [] vec = GeneraCaso.generaVector(tam_vector,modo);
		DatosEstadisticos datosEstadVec = new DatosEstadisticos();
	    m.ordena(vec, datosEstadVec);
	    CompruebaCaso.compruebaVector(vec, tam_vector);
	    return datosEstadVec;  
    }
    public static MediaDatosEstadisticos estadisticaOrdenaVectorAleatorio(OrdenarVector m, int tam_vector){
        MediaDatosEstadisticos mediaDatosEstadisticos = new MediaDatosEstadisticos();
        for(int i=0; i<10; i++){
            mediaDatosEstadisticos.añadeDatosEstadisticos(estadisticaOrdenaVector(m, tam_vector, true));
        }
        return mediaDatosEstadisticos;
    }
    public static DatosEstadisticos[] estadisticasOrdenaVectoresInversos(OrdenarVector m, int[] tam_vectores){
        DatosEstadisticos[] datos= new DatosEstadisticos[tam_vectores.length]; 
    	for(int i=0; i<tam_vectores.length; i++){
    		datos[i]= estadisticaOrdenaVector(m,tam_vectores[i],false);
    	}
    	return datos;
    }
    public static MediaDatosEstadisticos[] estadisticasOrdenaVectoresAleatorios(OrdenarVector m, int[] tam_vectores){
        MediaDatosEstadisticos[] mediadatos= new MediaDatosEstadisticos[tam_vectores.length]; 
    	for(int i=0; i<tam_vectores.length; i++){
    		mediadatos[i]= estadisticaOrdenaVectorAleatorio(m,tam_vectores[i]);
    	}
    	return mediadatos;
    }

}