package com.masivian.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masivian.app.modelo.Arbol;
import com.masivian.app.modelo.GenerateTree;
import com.masivian.app.service.BinariTreeService;

@RestController
@RequestMapping("api")
public class BinaryTreeController {

	@Autowired
	BinariTreeService binariTreeService;

	@PostMapping(path = "/BinaryTree", consumes = "application/json", produces = "application/json")
	public Arbol createTree(@RequestBody GenerateTree generateTree) {
		Arbol arbol = binariTreeService.createBinaryTree(generateTree);
		return arbol;
	}

	@PostMapping("/BinaryTreeLAC/{nodea}/{nodeb}")
	public Integer getLAC(@PathVariable("nodea") Integer nodea, @PathVariable("nodeb") Integer nodeb,
			@RequestBody GenerateTree generateTree) {

		Integer nodoLAC = binariTreeService.getLCA(nodea, nodeb, generateTree);

		return nodoLAC;
	}

}