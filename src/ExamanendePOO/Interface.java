package ExamanendePOO;

public interface Interface<T> {
    void crear(T objeto);
    T leer(int id);
    void actualizar(T objeto);
    void eliminar(int id);
}

