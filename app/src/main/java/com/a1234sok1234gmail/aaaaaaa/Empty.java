package com.a1234sok1234gmail.aaaaaaa;

public class Empty extends Obje
{
	public double uniqueID;
	private String name = "empty";
	private String field;
	private String attri;
	private int fi;
	private int at;
	private float min;
	private float max;

	public Empty(String name, String field, String attri,float minmin,float maxmax)
	{

		this.field = "";
		this.name = "";
		this.attri = "";
		this.fi=-1;
		this.at=-1;
	}

	public String getfield()
	{
		return field;
	}

	public String getattri()
	{
		return attri;
	}

	public void setuniqueID()
	{
	}

	public double getUniqueID()
	{
		return uniqueID;
	}

	public String getField()
	{
		return field;
	}

	//lkk
	public void setField(double uniqueID)
	{

	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public float getMin()
	{
		return min;
	}

	@Override
	public void setMin(float min)
	{
		this.min = min;
	}

	@Override
	public float getMax()
	{
		return max;
	}

	@Override
	public void setMax(float max)
	{
		this.max = max;
	}

	@Override
	public int getFi()
	{
		return fi;
	}

	public void setFi(int fi)
	{
		this.fi = fi;
	}

	@Override
	public int getAt()
	{
		return at;
	}

	public void setAt(int at)
	{
		this.at = at;
	}
}
