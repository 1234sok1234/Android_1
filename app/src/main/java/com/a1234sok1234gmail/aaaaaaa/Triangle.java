package com.a1234sok1234gmail.aaaaaaa;

import android.util.Log;

public class Triangle extends Obje
{
	public double uniqueID;
	private String name = "triangle";
	private String field;
	private String attri;
	private float min;
	private float max;
	private int fi;
	private int at;


	public Triangle(String name, String field, String attri,float minmin,float maxmax)
	{
		this.min=minmin;
		this.max=maxmax;
		//Log.d(AppSe.tagg, Float.toString(this.min));
		//Log.d(AppSe.tagg, Float.toString(this.max));
		this.setuniqueID();
		this.setField(uniqueID);
		this.setMin(minmin);
		this.setMax(maxmax);
		//Log.d(AppSe.tagg, Float.toString(minmin));
		//Log.d(AppSe.tagg, Float.toString(maxmax));
		this.field = getfield();
		this.name = getName();
		this.attri = getattri();


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

		double minnum = this.min;
		double maxnum = this.max;
		//Log.d(AppSe.tagg, "x2");
		//Log.d(AppSe.tagg, Double.toString(minnum));
		//Log.d(AppSe.tagg, Double.toString(maxnum));
		this.uniqueID = minnum + (double) (Math.random() * ((maxnum - minnum)));
		//System.out.println("Unique ID set to: " + this.uniqueID);
		double number = (int) Math.round(this.uniqueID * 1000) / (double) 1000;
		this.attri=Double.toString(number);
		number=number*10000;
		int cc=(int) number;
		this.at=cc;
		//System.out.println(number);
	}

	public double getUniqueID()
	{
		return uniqueID;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getField()
	{

		return field;
	}

	public void setField(double uniqueID)
	{
		double x;
		x = (((4 * this.uniqueID * this.uniqueID) / 3) * 1.73205) / 4;
		double number = (int) Math.round(x * 1000) / (double) 1000;
		this.field = Double.toString(number);
		number=number*10000;
		int cd=(int)number;
		this.fi=cd;
		//System.out.print((int) Math.round(this.field * 1000) / (double) 1000);
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
