public class Ordenar1Vector implements OrdenarVector{
            
    @Override
    public String nombreMetodo (){
        return "ordena";
    }
    
    @Override
    public void ordena (int[] v, DatosEstadisticos de){
        long tIni = System.currentTimeMillis();
        int max, aux;
        for (int i = v.length - 1; i >= 0; i--) {
            max = i;
            for (int j = 0; j < i; j++) {
                if (v[max] < v[j]) {
                    max = j;
                    de.añadeComparacion();
                }
            }
            aux = v[i];
            v[i] = v[max];
            v[max] = aux;
            de.añadeMovimiento();
        }
        de.añadeTiempo((float)(System.currentTimeMillis()-tIni)/1000);
    }
}