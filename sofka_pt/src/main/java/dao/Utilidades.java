package dao;

public class Utilidades {
    
    //Metodo para validar si lo que hay en una cadena es solo numeros enteros
    public boolean isInteger(String cadena){
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
    
    //Metodo para abrir el navegador
    public void abrirPaginaWeb(String url) {
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url)); //Abre el navegador por default y lo direcciona a la url
        } catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
