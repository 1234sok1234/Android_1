package com.a1234sok1234gmail.aaaaaaa;

public class ProductsDB
{
	private int _id;
	private String _productname;
	public ProductsDB()
	{

	}
	public ProductsDB(String productname)
	{
		this._productname = productname;
	}

	public int get_id()
	{
		return _id;
	}

	public void set_id(int _id)
	{
		this._id = _id;
	}

	public String get_productname()
	{
		return _productname;
	}

	public void set_productname(String _productname)
	{
		this._productname = _productname;
	}
}