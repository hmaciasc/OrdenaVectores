public class ComparaMetodos {
   /* public static void main(String[] args) {
        int[] vec = {5, 6, 9, 1, 23, 4, 56, 78, 12, 0,18,5,6,48,6,95,62,32,45,23,29,28,27,15,16,18,19,17,13,16,25,456,7};
       // int[] ordena1 = new Ordenar1Vector().ordena(vec, new DatosEstadisticos());
        int[] ordena2 = new Ordenar2Vector().shell(vec, vec.length);
        for (int i = 0; i < ordena2.length; i++) {
            System.out.println(ordena2[i]+", ");
        }
    }*/
    
    public static void main(String[] args) {
        CalculadorEstadisticas calculadorEstadisticas = new CalculadorEstadisticas();
        int [] tamañoVectores = new int [6];
        for (int i=0; i<tamañoVectores.length; i++){
            tamañoVectores[i]=(int)Math.pow(2, i)*1000;            
        }
        
        MediaDatosEstadisticos [] resultadosVecAleatorioOrdenar1 = calculadorEstadisticas.estadisticasOrdenaVectoresAleatorios(new Ordenar1Vector(), tamañoVectores);
        DatosEstadisticos [] resultadosVecInversoOrdenar1 = calculadorEstadisticas.estadisticasOrdenaVectoresInversos(new Ordenar1Vector(), tamañoVectores);
        MediaDatosEstadisticos [] resultadosVecAleatorioOrdenar2 = calculadorEstadisticas.estadisticasOrdenaVectoresAleatorios(new Ordenar2Vector(), tamañoVectores);
        DatosEstadisticos [] resultadosVecInversoOrdenar2 = calculadorEstadisticas.estadisticasOrdenaVectoresInversos(new Ordenar2Vector(), tamañoVectores);
        
        System.out.println("ORDENAR1:");
        System.out.println("Vector inversamente ordenado");
        System.out.println("       Tiempo       Comparaciones      Movimientos");
        System.out.printf("1000    %.4f            %d                %d\n", resultadosVecInversoOrdenar1[0].dameTiempo(), resultadosVecInversoOrdenar1[0].dameComparaciones(), resultadosVecInversoOrdenar1[0].dameMovimientos());
        System.out.printf("2000    %.4f            %d                %d\n", resultadosVecInversoOrdenar1[1].dameTiempo(), resultadosVecInversoOrdenar1[1].dameComparaciones(), resultadosVecInversoOrdenar1[1].dameMovimientos());
        System.out.printf("4000    %.4f            %d                %d\n", resultadosVecInversoOrdenar1[2].dameTiempo(), resultadosVecInversoOrdenar1[2].dameComparaciones(), resultadosVecInversoOrdenar1[2].dameMovimientos());
        System.out.printf("8000    %.4f            %d                %d\n", resultadosVecInversoOrdenar1[3].dameTiempo(), resultadosVecInversoOrdenar1[3].dameComparaciones(), resultadosVecInversoOrdenar1[3].dameMovimientos());
        System.out.printf("16000    %.4f            %d                %d\n", resultadosVecInversoOrdenar1[4].dameTiempo(), resultadosVecInversoOrdenar1[4].dameComparaciones(), resultadosVecInversoOrdenar1[4].dameMovimientos());
        System.out.printf("32000    %.4f            %d                %d\n", resultadosVecInversoOrdenar1[5].dameTiempo(), resultadosVecInversoOrdenar1[5].dameComparaciones(), resultadosVecInversoOrdenar1[5].dameMovimientos());
        
        System.out.println("Vector Aleatorio");
        System.out.println("       Tiempo       Comparaciones      Movimientos");
        System.out.printf("1000    %.4f            %d                %d\n", resultadosVecAleatorioOrdenar1[0].dameMediaTiempos(), resultadosVecAleatorioOrdenar1[0].dameMediaComparaciones(), resultadosVecAleatorioOrdenar1[0].dameMediaMovimientos());
        System.out.printf("2000    %.4f            %d                %d\n", resultadosVecAleatorioOrdenar1[1].dameMediaTiempos(), resultadosVecAleatorioOrdenar1[1].dameMediaComparaciones(), resultadosVecAleatorioOrdenar1[1].dameMediaMovimientos());
        System.out.printf("4000    %.4f            %d                %d\n", resultadosVecAleatorioOrdenar1[2].dameMediaTiempos(), resultadosVecAleatorioOrdenar1[2].dameMediaComparaciones(), resultadosVecAleatorioOrdenar1[2].dameMediaMovimientos());
        System.out.printf("8000    %.4f            %d                %d\n", resultadosVecAleatorioOrdenar1[3].dameMediaTiempos(), resultadosVecAleatorioOrdenar1[3].dameMediaComparaciones(), resultadosVecAleatorioOrdenar1[3].dameMediaMovimientos());
        System.out.printf("16000    %.4f            %d                %d\n", resultadosVecAleatorioOrdenar1[4].dameMediaTiempos(), resultadosVecAleatorioOrdenar1[4].dameMediaComparaciones(), resultadosVecAleatorioOrdenar1[4].dameMediaMovimientos());
        System.out.printf("32000    %.4f            %d                %d\n", resultadosVecAleatorioOrdenar1[5].dameMediaTiempos(), resultadosVecAleatorioOrdenar1[5].dameMediaComparaciones(), resultadosVecAleatorioOrdenar1[5].dameMediaMovimientos());
        
        System.out.println("******************************************************************************************************************");
        
        System.out.println("ORDENAR2:");
        System.out.println("Vector inversamente ordenado");
        System.out.println("       Tiempo       Comparaciones      Movimientos");
        System.out.printf("1000    %.4f            %d                %d\n", resultadosVecInversoOrdenar2[0].dameTiempo(), resultadosVecInversoOrdenar2[0].dameComparaciones(), resultadosVecInversoOrdenar2[0].dameMovimientos());
        System.out.printf("2000    %.4f            %d                %d\n", resultadosVecInversoOrdenar2[1].dameTiempo(), resultadosVecInversoOrdenar2[1].dameComparaciones(), resultadosVecInversoOrdenar2[1].dameMovimientos());
        System.out.printf("4000    %.4f            %d                %d\n", resultadosVecInversoOrdenar2[2].dameTiempo(), resultadosVecInversoOrdenar2[2].dameComparaciones(), resultadosVecInversoOrdenar2[2].dameMovimientos());
        System.out.printf("8000    %.4f            %d                %d\n", resultadosVecInversoOrdenar2[3].dameTiempo(), resultadosVecInversoOrdenar2[3].dameComparaciones(), resultadosVecInversoOrdenar2[3].dameMovimientos());
        System.out.printf("16000    %.4f            %d                %d\n", resultadosVecInversoOrdenar2[4].dameTiempo(), resultadosVecInversoOrdenar2[4].dameComparaciones(), resultadosVecInversoOrdenar2[4].dameMovimientos());
        System.out.printf("32000    %.4f            %d                %d\n", resultadosVecInversoOrdenar2[5].dameTiempo(), resultadosVecInversoOrdenar2[5].dameComparaciones(), resultadosVecInversoOrdenar2[5].dameMovimientos());
        
        System.out.println("Vector Aleatorio");
        System.out.println("       Tiempo       Comparaciones      Movimientos");
        System.out.printf("1000    %.4f            %d                %d\n", resultadosVecAleatorioOrdenar2[0].dameMediaTiempos(), resultadosVecAleatorioOrdenar2[0].dameMediaComparaciones(), resultadosVecAleatorioOrdenar2[0].dameMediaMovimientos());
        System.out.printf("2000    %.4f            %d                %d\n", resultadosVecAleatorioOrdenar2[1].dameMediaTiempos(), resultadosVecAleatorioOrdenar2[1].dameMediaComparaciones(), resultadosVecAleatorioOrdenar2[1].dameMediaMovimientos());
        System.out.printf("4000    %.4f            %d                %d\n", resultadosVecAleatorioOrdenar2[2].dameMediaTiempos(), resultadosVecAleatorioOrdenar2[2].dameMediaComparaciones(), resultadosVecAleatorioOrdenar2[2].dameMediaMovimientos());
        System.out.printf("8000    %.4f            %d                %d\n", resultadosVecAleatorioOrdenar2[3].dameMediaTiempos(), resultadosVecAleatorioOrdenar2[3].dameMediaComparaciones(), resultadosVecAleatorioOrdenar2[3].dameMediaMovimientos());
        System.out.printf("16000    %.4f            %d                %d\n", resultadosVecAleatorioOrdenar2[4].dameMediaTiempos(), resultadosVecAleatorioOrdenar2[4].dameMediaComparaciones(), resultadosVecAleatorioOrdenar2[4].dameMediaMovimientos());
        System.out.printf("32000    %.4f            %d                %d\n", resultadosVecAleatorioOrdenar2[5].dameMediaTiempos(), resultadosVecAleatorioOrdenar2[5].dameMediaComparaciones(), resultadosVecAleatorioOrdenar2[5].dameMediaMovimientos());
    }
}