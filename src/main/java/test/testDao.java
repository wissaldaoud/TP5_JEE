package test;

import java.util.List;

import dao.ProduitDaoImp;
import metier.entities.Produit;

public class testDao {
	public static void main(String[] args) {
		ProduitDaoImp pdao= new ProduitDaoImp();
		Produit prod= pdao.save(new Produit("iphone 8 plus",2800));
		System.out.println(prod);
		List<Produit> prods =pdao.produitsParMC("HP");
		for (Produit p : prods)
		System.out.println(p);
		}
		}


