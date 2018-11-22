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

public class Stats extends AppCompatActivity
{
	MyDBHandler dbHandler;

	TextView outputt;
	TextView outputs;
	TextView outputc;
	TextView outputt1;
	TextView outputs1;
	TextView outputc1;
	TextView outputt2;
	TextView outputs2;
	TextView outputc2;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_stats);
		Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar3);
		mToolbar.setNavigationIcon(R.drawable.ic_arrow);
		mToolbar.setTitle(R.string.menu_stats);
		setSupportActionBar(mToolbar);
		outputt = (TextView) findViewById(R.id.textView6);
		outputs = (TextView) findViewById(R.id.textView7);
		outputc = (TextView) findViewById(R.id.textView8);
		outputt1 = (TextView) findViewById(R.id.textView61);
		outputs1 = (TextView) findViewById(R.id.textView71);
		outputc1 = (TextView) findViewById(R.id.textView81);
		outputt2 = (TextView) findViewById(R.id.textView62);
		outputs2 = (TextView) findViewById(R.id.textView72);
		outputc2 = (TextView) findViewById(R.id.textView82);
		dbHandler = new MyDBHandler(this, null, null, 1);
		printDatabase();
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		MenuInflater mMenuInflater = getMenuInflater();
		mMenuInflater.inflate(R.menu.back_menu, menu);
		return true;
	}
	public boolean onOptionsItemSelected(MenuItem item)
	{
		if (item.getItemId() == R.id.action_setting)
		{
			startActivity(new Intent(Stats.this,Settings.class));
			this.finish();
			//Intent intent = new Intent("android.intent.action.Settings");
			//startActivity(intent);
		}else
		{

		}
		return super.onOptionsItemSelected(item);
	}
	public void printDatabase()
	{

		String dbString = dbHandler.getbyid(4);
		outputt.setText(dbString);
		String dbStringg = dbHandler.getbyid(5);
		outputs.setText(dbStringg);
		String dbStringgg = dbHandler.getbyid(6);
		outputc.setText(dbStringgg);
		String dbString1 = dbHandler.getbyid(7);
		outputt1.setText(dbString1);
		String dbStringg1 = dbHandler.getbyid(8);
		outputs1.setText(dbStringg1);
		String dbStringgg1 = dbHandler.getbyid(9);
		outputc1.setText(dbStringgg1);
		String dbString2 = dbHandler.getbyid(10);
		outputt2.setText(dbString2);
		String dbStringg2 = dbHandler.getbyid(11);
		outputs2.setText(dbStringg2);
		String dbStringgg2 = dbHandler.getbyid(12);
		outputc2.setText(dbStringgg2);
	}
}
