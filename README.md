# BinaryTree

Creacion de un Arbol binario y busqueda de el ancentro
mas cercano.

## Instalacion

Descargar archivo test-0.0.1-SNAPSHOT.jar  ubicado en la carpeta [jar].

ejecutar JAR

```bash
java -jar test-0.0.1-SNAPSHOT.jar
```

## Consumo servicios 

### Creacion Arbol 

```json
Method = POST
Url = http://localhost:8181/api/BinaryTree
Content-Type = application/json
Body = 
{
    "raiz": 1,
    "nodos": [
        2,
        3,
        4,
        5,
        6
    ]
}
```

### Ancestro común más cercano

```json
Method = POST
Parameter url nodoa = nodo inicial para la busqueda del ancestro.
Parameter url nodob = nodo final para la busqueda del ancestro.
Url = http://localhost:8181/api/BinaryTreeLAC/{nodoa}/{nodob}
Content-Type = application/json
Body = 
{
    "raiz": 1,
    "nodos": [
        2,
        3,
        4,
        5,
        6
    ]
}
```

## Proyecto realizado en JAVA y Spring Boot

 - Descargar el proyecto.
 - Importarlo en eclipse o STS como proyecto MAVEN.
 - Ejecutar como Spring Boot App.
 - El proyecto se esta ejecutando por el puerto = 8181. 