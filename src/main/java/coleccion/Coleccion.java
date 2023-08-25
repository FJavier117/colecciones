package coleccion;

public class Coleccion {
    // agrega un elemento al final de la coleccion
    // inserta un elemento en la i-esima posicion
    // retorna el i-esimo elemento de la coleccion
    // elimina y retorna el objeto en la i-esima posicion
    // busca la primera ocurrencia del objeto especificado y retorna
    // la posicion donde lo encuentra o un valor negativo si el
    // objeto no se encontro
    // retorna la cantidad de elementos del conjunto
    private Object [] elementos;
    private int size;

    public Coleccion(int capacidadInicial){
        elementos = new Object[capacidadInicial];
        size = 0;
    }


    public void add(Object object){
        add(object,size);
    }

    public void add(Object object, int i){
        if(size ==  elementos.length){
            //Creamos un arreglo auxiliar que almacena el cotenido actual
            Object [] aux = elementos;
            //Duplicamos el tamaño del array por dos
            elementos = new Object[elementos.length * 2];
            //Pasamos los elementos del array auxiliar al arrae elementos
            for (int j = 0; j < size; j++) {
                elementos[j] = aux[j];
            }
            //Desreferenciar al array aux asígnando null
            aux = null;
        }
        for (int j = size - 1; j >=i ; j--) {
            elementos[j+1] = elementos[j];
        }
        elementos[i] = object;
        size++;
    }

    public int getIndex(Object object){
        int i = 0;
        while (i < size && !elementos[i].equals(object)) {
            i++;
        }
        return i < size ? i: -1;
    }

    public Object get(int i){
        return  elementos[i];
    }

    public int size() {
        return size;
    }

    public Object delete(int i){
        Object aux = elementos[i];
        for (int j = 0; j < size-1 ; j++) {
            elementos[j] = elementos[j+1];
        }
        size--;
        return aux;
    }

}
