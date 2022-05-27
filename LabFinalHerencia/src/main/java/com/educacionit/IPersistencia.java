package com.educacionit;
//una interface es un conjunto de metodos abstractos y atributos costantes
//en una interface todos los atributos son public, static y final (constante) implicitamete
public interface IPersistencia {

    //lo metodos dentro de una interface son implicitamente Abtract y public
    void guardar();

    void eliminar();

    void modificar();
}
