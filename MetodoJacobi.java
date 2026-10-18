public class MetodoJacobi {

    public static double calcularError(double[] xAnt, double[] xNuevo) {
        double maxDiff = 0.0;
        double maxVal = 0.0;
        for (int i = 0; i < xNuevo.length; i++) {
            double diff = Math.abs(xNuevo[i] - xAnt[i]);
            if (diff > maxDiff) {
                maxDiff = diff;
            }
            if (Math.abs(xNuevo[i]) > maxVal) {
                maxVal = Math.abs(xNuevo[i]);
            }
        }
        return maxVal == 0 ? maxDiff : maxDiff / maxVal;
    }

    public static double[] jacobi(double[][] A, double[] b, double[] xInicial, double tol, int maxIter) {
        int n = xInicial.length;
        double[] x = xInicial.clone();
        double[] xNuevo = new double[n];

        System.out.println("\n--- ITINERARIO MÉTODO DE JACOBI ---");
        System.out.printf("%-10s %-12s %-12s %-12s %-12s%n", "Iter", "x1", "x2", "x3", "Error");

        for (int iter = 1; iter <= maxIter; iter++) {
            for (int i = 0; i < n; i++) {
                double suma = b[i];
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        suma -= A[i][j] * x[j];
                    }
                }
                xNuevo[i] = suma / A[i][i];
            }

            double error = calcularError(x, xNuevo);
            System.out.printf("%-10d %-12.6f %-12.6f %-12.6f %-12.6f%n", iter, xNuevo[0], xNuevo[1], xNuevo[2], error);

            if (error < tol) {
                System.out.println("Convergencia alcanzada en la iteración " + iter);
                return xNuevo;
            }

            x = xNuevo.clone();
        }

        return xNuevo;
    }
}