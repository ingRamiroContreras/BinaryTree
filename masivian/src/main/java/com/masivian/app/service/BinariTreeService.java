package com.masivian.app.service;

import com.masivian.app.modelo.Arbol;
import com.masivian.app.modelo.GenerateTree;

public interface BinariTreeService {
	
	public Arbol createBinaryTree(GenerateTree entity);
	public Integer getLCA(Integer nodea, Integer nodeb, GenerateTree generateTree);

}
