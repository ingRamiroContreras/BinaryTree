package com.masivian.app.service;

import org.springframework.stereotype.Service;

import com.masivian.app.modelo.Arbol;
import com.masivian.app.modelo.GenerateTree;
import com.masivian.app.modelo.Nodo;

@Service
public class BinaryTreeServiceImpl implements BinariTreeService {

	@Override
	public Arbol createBinaryTree(GenerateTree entity) {
		Arbol arbol = new Arbol(entity.getRaiz());
		for (int valorNodo : entity.getNodos()) {
			arbol.addNodo(new Nodo(valorNodo));
		}

		return arbol;
	}

	@Override
	public Integer getLCA(Integer nodea, Integer nodeb, GenerateTree generateTree) {

		Arbol arbol = this.createBinaryTree(generateTree);
		Nodo nodo = arbol.findLCA(nodea, nodeb);
		return nodo.getValor();
	}

}
