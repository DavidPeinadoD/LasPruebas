public class ClaseCadena {
    public static String DevuelveIniciales(String nombreCompleto) {
        String iniciales = "";
        if (nombreCompleto != null && !nombreCompleto.trim().isEmpty()) {
            String[] partes = nombreCompleto.trim().split("\\s+");
            for (String parte : partes) {
                if (!parte.isEmpty()) {
                    iniciales += parte.charAt(0) + ".";
                }
            }
            iniciales = iniciales.toUpperCase();
        }
        return iniciales;
    }

    public static void main(String[] args) {
        String iniciales1 = ClaseCadena.DevuelveIniciales("Andreas Dulac"); // iniciales1 contiene "A.D."
        String iniciales2 = ClaseCadena.DevuelveIniciales("juan perez"); // iniciales2 contiene "J.P."
        String iniciales3 = ClaseCadena.DevuelveIniciales(""); // iniciales3 contiene ""
        String iniciales4 = ClaseCadena.DevuelveIniciales(null); // iniciales4 contiene ""
    }
}
