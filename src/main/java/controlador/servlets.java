package controlador;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/primos")
public class servlets extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // obtener parametros del formulario

        int inicio = Integer.parseInt(request.getParameter("inicio"));
        int fin = Integer.parseInt(request.getParameter("final"));

        // lista para almacenar numeros primos

        List<Integer> primos = new ArrayList<>();
        for (int i = inicio; i <= fin; i++) {
            if (esPrimo(i)) {
                primos.add(i);
            }
        }

        // pasar datos a resultado.jsp

        request.setAttribute("primos", primos);
        request.setAttribute("cantidad", primos.size());
        request.getRequestDispatcher("resultado.jsp").forward(request, response);
    }
      // calculamos numeros primos

    private boolean esPrimo(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
}
}
