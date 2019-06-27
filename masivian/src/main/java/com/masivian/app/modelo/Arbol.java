package com.masivian.app.modelo;

public class Arbol {

	/* Atributos */
	private Nodo raiz;

	/* Contructories */
	public Arbol(int valor) {
		this.raiz = new Nodo(valor);
	}

	public Arbol(Nodo raiz) {
		this.raiz = raiz;
	}

	/* Setters y Getters */
	public Nodo getRaiz() {
		return raiz;
	}

	public void setRaiz(Nodo raiz) {
		this.raiz = raiz;
	}

	private void addNodo( Nodo nodo, Nodo raiz ) {
        if ( raiz == null ) {
            this.setRaiz(nodo);
        }
        else {
            if ( nodo.getValor() <= raiz.getValor() ) {
                if (raiz.getHojaIzquierda() == null) {
                    raiz.setHojaIzquierda(nodo);
                }
                else {
                    addNodo( nodo , raiz.getHojaIzquierda() );
                }
            }
            else {

                if (raiz.getHojaDerecha() == null) {
                    raiz.setHojaDerecha(nodo);
                }
                else {
                    addNodo( nodo, raiz.getHojaDerecha() );
                }
            }
        }
    }

	public void addNodo(Nodo nodo) {
		this.addNodo(nodo, this.raiz);
	}
	
	public Nodo findLCA(int n1, int n2) 
    { 
        return findLCA(this.raiz, n1, n2); 
    }
	
	private Nodo findLCA(Nodo node, int n1, int n2) 
    { 
        // Base case 
        if (node == null) 
            return null; 
  
        // If either n1 or n2 matches with root's key, report 
        // the presence by returning root (Note that if a key is 
        // ancestor of other, then the ancestor key becomes LCA 
        if (node.getValor() == n1 || node.getValor() == n2) 
            return node; 
  
        // Look for keys in left and right subtrees 
        Nodo left_lca = findLCA(node.getHojaIzquierda(), n1, n2);
        System.out.println("*********** nodo left *********");
        System.out.println(left_lca!=null ? left_lca.getValor() : "null left");
        Nodo right_lca = findLCA(node.getHojaDerecha(), n1, n2); 
        System.out.println("*********** nodo right *********");
        System.out.println(right_lca!=null ? right_lca.getValor() : "null right");
  
        // If both of the above calls return Non-NULL, then one key 
        // is present in once subtree and other is present in other, 
        // So this node is the LCA 
        if (left_lca!=null && right_lca!=null) 
            return node; 
  
        // Otherwise check if left subtree or right subtree is LCA 
        return (left_lca != null) ? left_lca : right_lca; 
    } 
  

}