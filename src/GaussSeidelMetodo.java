public class GaussSeidelMetodo {

    public static double[] gaussSeidel(double[][] A, double[] b, double[] xInicial, double tol, int maxIter) {

        int n = xInicial.length;
        double[] x = xInicial.clone();
        // Un solo vector que evoluciona al instante

        System.out.println("\n--- ITINERARIO MÉTODO DE GAUSS-SEIDEL ---");
        System.out.printf("%-10s %-12s %-12s %-12s %-12s%n", "Iter", "x1", "x2", "x3", "Error");

        for (int iter = 0; iter < maxIter; iter++) {
            double[] xAnt = x.clone();
            // Respaldamos el estado anterior para el error

            for (int i = 0; i < n; i++) {
                double suma = b[i];
                // Arranca con el término independiente b_i

                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        // TODO: Completa el código
                        suma -= A[i][j] * x[j];
                    }
                }
                // TODO: Completa el código
                x[i] = suma / A[i][i];
            }

            double error = MetodoJacobi.calcularError(xAnt, x);
            System.out.printf("%-10d %-12.6f %-12.6f %-12.6f %-12.6f%n", (iter + 1), x[0], x[1], x[2], error);

            // TODO: Completa el código
            if (error < tol) {
                System.out.println("Convergencia alcanzada en la iteración " + (iter + 1));
                return x;
            }
        }
        return x;
    }
}