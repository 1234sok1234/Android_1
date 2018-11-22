package com.a1234sok1234gmail.aaaaaaa;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Settings extends AppCompatActivity
{
	MyDBHandler dbHandler;
	//TextView output;
	//EditText input;
	EditText numerrr;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_settings);

		Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar);
		mToolbar.setNavigationIcon(R.drawable.ic_arrow);
		mToolbar.setTitle(R.string.menu_action_setting);
		setSupportActionBar(mToolbar);
		//input = (EditText) findViewById(R.id.editTextc);
		//output = (TextView) findViewById(R.id.texxxt);
		dbHandler = new MyDBHandler(this, null, null, 1);
		//printDatabase();

	}
/*
	public void yy1(View view)
	{
		ProductsDB productsDB = new ProductsDB(input.getText().toString());
		dbHandler.addProduct(productsDB);
		printDatabase();
		//TextView x = (TextView) findViewById(R.id.texxxt);

		//	x.setText("");

		//Log.d(AppSe.tagg, "yy1");
	}

	public void xxcc(View view)
	{
		String inputText = input.getText().toString();
		dbHandler.deleteProduct(inputText);
		printDatabase();
	}
*/
	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		MenuInflater mMenuInflater = getMenuInflater();
		mMenuInflater.inflate(R.menu.back_fromsettings_menu, menu);
		return true;
	}

	public boolean onOptionsItemSelected(MenuItem item)
	{
		if (item.getItemId() == R.id.action_stat)
		{
			startActivity(new Intent(Settings.this, Stats.class));
			this.finish();
			//Intent intent = new Intent("android.intent.action.Settings");
			//startActivity(intent);
		} else
		{

		}
		return super.onOptionsItemSelected(item);
	}
/*
	public void printDatabase()
	{
		String dbString = dbHandler.databaseToString();
		output.setText(dbString);
		input.setText("");
	}
	*/

	public void setnum(View view)
	{

		String dbStringn = dbHandler.getbyid(0);

		String dbStringt = dbHandler.getbyid(2);

		String dbStrings = dbHandler.getbyid(3);

		Log.d(AppSe.tagg, "przed");
		dbHandler.ddb();
		Log.d(AppSe.tagg, "po");
		numerrr=(EditText)findViewById(R.id.nuberof);
		if(numerrr.getText().toString().matches(""))
		{
			numerrr.setText("100");
		}
		String xxxxxx=numerrr.getText().toString();
		ProductsDB productsDB = new ProductsDB(xxxxxx);
		dbHandler.addProduct(productsDB);
		ProductsDB productsDBx = new ProductsDB(Integer.toString(-1));
		dbHandler.addProduct(productsDBx);
		ProductsDB productsDBx1 = new ProductsDB(dbStringt);
		dbHandler.addProduct(productsDBx1);
		ProductsDB productsDBx2 = new ProductsDB(dbStrings);
		dbHandler.addProduct(productsDBx2);
		this.finish();
	}
	public void hhh(View view)
	{
		EditText mniejsza = (EditText) findViewById(R.id.nuberofmniejsza);
		EditText wieksza = (EditText) findViewById(R.id.nuberofwieksza);


		if(mniejsza.getText().toString().matches(""))
		{
			mniejsza.setText("0");

		}
		if (wieksza.getText().toString().matches(""))
		{
			wieksza.setText("1");
		}
		String mn=mniejsza.getText().toString();
		String wi=wieksza.getText().toString();
		float x1=Float.parseFloat(mn);
		float x2=Float.parseFloat(wi);
		if(x1>x2)
		{
			float x3;
			x3=x2;
			x2=x1;
			x1=x3;
		}
		Log.d(AppSe.tagg, "......");
		Log.d(AppSe.tagg, Float.toString(x1));
		Log.d(AppSe.tagg, Float.toString(x2));
		String dbStringn = dbHandler.getbyid(0);

		dbHandler.ddb();
		ProductsDB productsDB = new ProductsDB(dbStringn);
		dbHandler.addProduct(productsDB);
		ProductsDB productsDBx = new ProductsDB(Integer.toString(-1));
		dbHandler.addProduct(productsDBx);
		ProductsDB productsDBx1 = new ProductsDB(Float.toString(x1));
		dbHandler.addProduct(productsDBx1);
		ProductsDB productsDBx2 = new ProductsDB(Float.toString(x2));
		dbHandler.addProduct(productsDBx2);
		Log.d(AppSe.tagg, "......");
		this.finish();
	}
}
