package com.masivian.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masivian.app.modelo.Arbol;
import com.masivian.app.modelo.GenerateTree;
import com.masivian.app.modelo.Nodo;

@RestController
@RequestMapping("BinaryTree")
public class BinaryTreeController {

	@GetMapping("/ListadoTreeA")
	public Arbol getAllTreeA() {
		Arbol arbol = new Arbol(67);

		arbol.addNodo(new Nodo(39));
		arbol.addNodo(new Nodo(76));

		arbol.addNodo(new Nodo(28));
		arbol.addNodo(new Nodo(44));

		arbol.addNodo(new Nodo(29));
		arbol.addNodo(new Nodo(74));
		arbol.addNodo(new Nodo(85));

		arbol.addNodo(new Nodo(83));
		arbol.addNodo(new Nodo(87));

		return arbol;
	}

	@GetMapping("/ListadoTreeB")
	public Arbol getAllTreeB() {
		Arbol arbol = new Arbol(1);

		arbol.addNodo(new Nodo(2));
		arbol.addNodo(new Nodo(3));

		arbol.addNodo(new Nodo(4));
		arbol.addNodo(new Nodo(5));

		arbol.addNodo(new Nodo(6));
		arbol.addNodo(new Nodo(7));
		arbol.addNodo(new Nodo(8));

		arbol.addNodo(new Nodo(9));
		arbol.addNodo(new Nodo(10));

		return arbol;
	}

	@GetMapping("/geneateTreesJson")
	public GenerateTree geneateTreeTest() {

		int[] intArray = new int[] { 4, 5, 6, 7, 8 };

		GenerateTree generateTree = new GenerateTree();

		generateTree.setRaiz(1);
		generateTree.setNodos(intArray);

		return generateTree;
	}

	@PostMapping(path = "/generarTree", consumes = "application/json", produces = "application/json")
	public Arbol geneateTree(@RequestBody GenerateTree generateTree) {
		Arbol arbol = new Arbol(generateTree.getRaiz());
		for (int valorNodo : generateTree.getNodos()) {
			arbol.addNodo(new Nodo(valorNodo));
		}

		return arbol;
	}
	
	@GetMapping("/ListadoNodoPadre")
	public Nodo getAllNodoPadre() {
		Arbol arbol = new Arbol(67);

		arbol.addNodo(new Nodo(39));
		arbol.addNodo(new Nodo(76));

		arbol.addNodo(new Nodo(28));
		arbol.addNodo(new Nodo(44));

		arbol.addNodo(new Nodo(29));
		arbol.addNodo(new Nodo(74));
		arbol.addNodo(new Nodo(85));

		arbol.addNodo(new Nodo(83));
		arbol.addNodo(new Nodo(87));

		return arbol.findLCA(29, 87);
	}

}