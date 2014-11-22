public class Ordenar2Vector implements OrdenarVector{
    
    /*public int[] shell(int[] vec, int n){
        int dist = n/2;
        int j, aux;
        while (dist > 0){
            for (int i = 0; i < n - dist; i++) {
                j = i + dist;
                while ((j >= dist) && (vec[j] < vec[j - dist])){
                    comparaciones++;
                    aux = vec[j];
                    vec[j] = vec[j-dist];
                    vec[j-dist] = aux;
                    movimientos++;
                    j = j - dist;
                }
                if (j>dist) comparaciones++;
            }
            dist = dist/2;
        }
        return vec;
    }*/

    @Override
    public String nombreMetodo() {
        return "ordena";
    }

    public void ordena(int[] v, DatosEstadisticos de) {
        long tIni = System.currentTimeMillis();
        int dist = v.length/2;
        int j, aux;
        while (dist > 0){
            for (int i = 0; i < v.length - dist; i++) {
                j = i + dist;
                while ((j >= dist) && (v[j] < v[j - dist])){
                    de.añadeComparacion();
                    aux = v[j];
                    v[j] = v[j-dist];
                    v[j-dist] = aux;
                    de.añadeMovimiento();
                    j = j - dist;
                }
                if (j>dist) de.añadeComparacion();
            }
            dist = dist/2;
        }
        de.añadeTiempo((float)(System.currentTimeMillis()-tIni)/1000);
    }
    
}