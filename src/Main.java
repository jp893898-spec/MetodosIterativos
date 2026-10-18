public class Main {
    public static void main(String[] args) {
        // Matriz de coeficientes A[cite: 13]
        double[][] A = {
                {5, 1, 1},
                {1, 4, 1},
                {1, 2, 5}
        };

        // Vector de términos independientes b[cite: 13]
        double[] b = {7, 6, 8};

        // Vector inicial X^(0) = [0, 0, 0]^T[cite: 13]
        double[] xInicial = {0, 0, 0};

        // Tolerancia de error epsilon = 0.0001[cite: 13]
        double tol = 0.0001;
        int maxIter = 100;

        System.out.println("==========================================");
        System.out.println(" RESOLUCIÓN POR MÉTODO DE JACOBI ");
        System.out.println("==========================================");
        MetodoJacobi.jacobi(A, b, xInicial, tol, maxIter);

        System.out.println("\n==========================================");
        System.out.println(" RESOLUCIÓN POR MÉTODO DE GAUSS-SEIDEL ");
        System.out.println("==========================================");
        GaussSeidelMetodo.gaussSeidel(A, b, xInicial, tol, maxIter);
    }
}