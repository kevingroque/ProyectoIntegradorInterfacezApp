package app.roque.com.interfacezapp.modelo;

public class Anuncio {

    private String imagen;
    private String title;
    private String direccion;
    private String lugar;

    public Anuncio(String imagen, String title, String direccion, String lugar) {
        this.imagen = imagen;
        this.title = title;
        this.direccion = direccion;
        this.lugar = lugar;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
}
