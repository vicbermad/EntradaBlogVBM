/**
 * Clase para manejar las entradas de un blog
 * @author Víctor Berenguer Madrid
 * @version 2.3
 * since 7/2/2023
 */
public class EntradaBlogVBM {
    /**
     * separador atributo de tipo character con el valor que separa el autor de la cadena.
     * id atributo de tipo int con el valor que identifica la entrada.
     * texto atributo de tipo String con el valor del texto.
     * autor atributo de tipo String con el valor del autor.
     */

    public static char separador=':';
    private int id;
    private String texto;
    private String autor;

    /**
     *
     * @param id atributo de tipo int con el valor que identifica la entrada.
     * @param autor autor atributo de tipo String con el valor del autor.
     * @param texto atributo de tipo String con el valor del texto.
     * @throws IllegalArgumentException El id no puede ser negativo.
     */
    public EntradaBlogVBM(int id,String autor,String texto)throws IllegalArgumentException{
        if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
        this.id=id;
        this.autor=autor;
        this.texto=texto;
    }

    /**
     *
     * @return Muestra un texto con los valores de los atributos.
     */
    @Override
    public String toString(){
        String cad="";
        cad+="\nENTRADA DE"+separador+autor;
        cad+="\n "+texto;
        return cad;
    }

    /**
     *
     * @return Obtiene el valor del atributo id.
     */
    public int getId(){
        return this.id;
    }

    /**
     *
     * @return Obtiene el valor el atributo texto.
     */
    public String getTexto(){
        return this.texto;
    }

    /**
     *
     * @return Obtiene el valor del atributo autor en mayúsculas.
     */
    public String getAutor(){
        return this.autor.toUpperCase();
    }

    /**
     *
     * @return Devuleve el valor del atributo autor.
     */
    public String devuelveAutor(){
        return this.autor;
    }

    /**
     *
     * No tiene porqué tener argumentos.
     */

    public static void main(String[] args) {
        /**
         *  Método main en el que se crea un objeto de tipo EntradaBlogVBM parametrizado y, posteriormente, se muestra con System.out.println.
         */
        EntradaBlogVBM e1=new EntradaBlogVBM (3,"Víctor","Últimas noticias, está disponible BixBy 2.0");
        System.out.println(e1);
    }
}
