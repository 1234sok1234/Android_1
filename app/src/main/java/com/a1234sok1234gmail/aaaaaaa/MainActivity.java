package com.a1234sok1234gmail.aaaaaaa;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class MainActivity extends AppCompatActivity
{
    private static String tag = "void";
    //private static ImageView imgview;
    //no ciekawy czy zaziala
    MyDBHandler dbHandler;
    private ArrayList<Obje> peopleList;
    private PersonListAdapter adapter;
    private int zmienna = 0;
    private int zmienna1 = 0;
    private int zmienna2 = 0;
    public float x1, x2;
    public String c1, c2;
    //private int current_image;
    //static int[]  images={R.drawable.aaa,R.drawable.kkk};
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(mToolbar);
        TextView ilosct = (TextView) findViewById(R.id.textView6);
        Log.d(tag, "onCreate: Started.");
        ListView mListView = (ListView) findViewById(R.id.listView);
        registerForContextMenu(mListView);

        dbHandler = new MyDBHandler(this, null, null, 1);
        ProductsDB productsDB;
        if (dbHandler.getbyid(0).matches(""))
        {
            Log.d(AppSe.tagg, "x2");
            productsDB = new ProductsDB("100");
            dbHandler.addProduct(productsDB);
            ProductsDB productsDB0 = new ProductsDB(Integer.toString(0));
            dbHandler.addProduct(productsDB0);
            ProductsDB productsDBx1 = new ProductsDB("0");
            dbHandler.addProduct(productsDBx1);
            ProductsDB productsDBx2 = new ProductsDB("1");
            dbHandler.addProduct(productsDBx2);
            recreate();
        }
        Log.d(AppSe.tagg, "x2");
        String dbString = dbHandler.getbyid(0);
        String dbStringx1 = dbHandler.getbyid(2);
        String dbStringx2 = dbHandler.getbyid(3);
        Log.d(AppSe.tagg, "x2");
        int t = 0;
        int c = 0;
        int s = 0;
        float ck = 0;
        float sk = 0;
        float tk = 0;
        float ch = 0;
        float sh = 0;
        float th = 0;
        float ci = 0;
        float si = 0;
        float ti = 0;
        float cl = 0;
        float sl = 0;
        float tl = 0;
        dbHandler.ddb();
        Log.d(AppSe.tagg, "x3");
        ProductsDB productsDB1 = new ProductsDB(dbString);
        dbHandler.addProduct(productsDB1);
        Log.d(AppSe.tagg, "x3");
        ProductsDB productsDB01 = new ProductsDB(Integer.toString(0));
        dbHandler.addProduct(productsDB01);
        Log.d(AppSe.tagg, "x3");
        ProductsDB productsDBx11 = new ProductsDB(dbStringx1);
        dbHandler.addProduct(productsDBx11);
        Log.d(AppSe.tagg, "x3");
        ProductsDB productsDBx21 = new ProductsDB(dbStringx2);
        dbHandler.addProduct(productsDBx21);
        String dbStringx11 = dbHandler.getbyid(2);
        String dbStringx21 = dbHandler.getbyid(3);
        Log.d(AppSe.tagg, "x4");
        float min1 = Float.parseFloat(dbStringx11);
        Log.d(AppSe.tagg, "x4");
        float max1 = Float.parseFloat(dbStringx21);
        Log.d(AppSe.tagg, "x4");
        int x = Integer.parseInt(dbString);
        Log.d(AppSe.tagg, "x5");
        Obje xd[] = new Obje[x + 1];
        double ko;
        int xxxx;
        int xx;
        xd[0] = new Empty("", "", "", 0, 0);
        for (int i = 1; i < x + 1; i++)
        {
            ko = (Math.random() * 1000);
            xxxx = (int) ko;
            xx = xxxx % 3;
            if (xx == 0)
            {
                xd[i] = new Square("square", "asdasd", "koko", min1, max1);
                s++;
                sk = sk + Float.parseFloat(xd[i].getfield());
                sh = sh + Float.parseFloat(xd[i].getattri());
            } else if (xx == 1)
            {
                xd[i] = new Triangle("circle", "asdasd", "koko", min1, max1);
                t++;
                tk = tk + Float.parseFloat(xd[i].getfield());
                th = th + Float.parseFloat(xd[i].getattri());
            } else
            {
                xd[i] = new Circle("circle", "asdasd", "koko", min1, max1);
                c++;
                ck = ck + Float.parseFloat(xd[i].getfield());
                ch = ch + Float.parseFloat(xd[i].getattri());
            }
        }
        sl = (int) Math.round(sk * 1000) / (float) 1000;
        tl = (int) Math.round(tk * 1000) / (float) 1000;
        cl = (int) Math.round(ck * 1000) / (float) 1000;
        si = (int) Math.round(sh * 1000) / (float) 1000;
        ti = (int) Math.round(th * 1000) / (float) 1000;
        ci = (int) Math.round(ch * 1000) / (float) 1000;

        productsDB = new ProductsDB(Integer.toString(s));
        dbHandler.addProduct(productsDB);
        productsDB = new ProductsDB(Integer.toString(t));
        dbHandler.addProduct(productsDB);
        productsDB = new ProductsDB(Integer.toString(c));
        dbHandler.addProduct(productsDB);
        productsDB = new ProductsDB(Float.toString(sl));
        dbHandler.addProduct(productsDB);
        productsDB = new ProductsDB(Float.toString(tl));
        dbHandler.addProduct(productsDB);
        productsDB = new ProductsDB(Float.toString(cl));
        dbHandler.addProduct(productsDB);
        productsDB = new ProductsDB(Float.toString(si));
        dbHandler.addProduct(productsDB);
        productsDB = new ProductsDB(Float.toString(ti));
        dbHandler.addProduct(productsDB);
        productsDB = new ProductsDB(Float.toString(ci));
        dbHandler.addProduct(productsDB);
        peopleList = new ArrayList<>();
        for (int i = 0; i < x + 1; i++)
        {
            peopleList.add(xd[i]);
        }


        adapter = new PersonListAdapter(this, R.layout.adapter_view_layout, peopleList);
        mListView.setAdapter(adapter);

    }

    public void x1(View view)
    {
        Log.d(AppSe.tagg, "x1");
        sortFigure();

    }

    public void x2(View view)
    {
        Log.d(AppSe.tagg, "x2");
        sortfield();
    }

    public void x3(View view)
    {
        Log.d(AppSe.tagg, "x3");
        sortattri();
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo)
    {
        super.onCreateContextMenu(menu, v, menuInfo);
        //menu.setHeaderTitle();
        //menu.add();;
    }

    @Override
    public boolean onContextItemSelected(MenuItem item)
    {
        return super.onContextItemSelected(item);
    }

    private void sortFigure()
    {
        if (zmienna == 0)
        {
            Collections.sort(peopleList, new Comparator<Obje>()
            {
                @Override
                public int compare(Obje o1, Obje o2)
                {
                    return o1.getName().compareTo(o2.getName());
                }
            });
            adapter.notifyDataSetChanged();
            zmienna = 1;
        } else
        {
            Collections.sort(peopleList, new Comparator<Obje>()
            {
                @Override
                public int compare(Obje o1, Obje o2)
                {
                    if (o2.getFi() == -1)
                    {
                        return 1;
                    } else
                    {
                        return o2.getName().compareTo(o1.getName());
                    }
                }
            });
            adapter.notifyDataSetChanged();
            zmienna = 0;
        }
    }

    private void sortfield()
    {
        if (zmienna1 == 0)
        {
            Collections.sort(peopleList, new Comparator<Obje>()
            {
                @Override
                public int compare(Obje o1, Obje o2)
                {
                    return Integer.valueOf(o1.getFi()).compareTo(o2.getFi());
                }
            });
            adapter.notifyDataSetChanged();
            zmienna1 = 1;
        } else
        {
            Collections.sort(peopleList, new Comparator<Obje>()
            {
                @Override
                public int compare(Obje o1, Obje o2)
                {
                    if (o2.getFi() == -1)
                    {
                        return 1;
                    } else
                    {
                        return Integer.valueOf(o2.getFi()).compareTo(o1.getFi());
                    }
                }
            });
            adapter.notifyDataSetChanged();
            zmienna1 = 0;
        }
    }

    private void sortattri()
    {
        if (zmienna2 == 0)
        {
            Collections.sort(peopleList, new Comparator<Obje>()
            {
                @Override
                public int compare(Obje o1, Obje o2)
                {
                    return Integer.valueOf(o1.getAt()).compareTo(o2.getAt());
                }

            });
            adapter.notifyDataSetChanged();
            zmienna2 = 1;
            Log.d(AppSe.tagg, "a");
        } else
        {
            Collections.sort(peopleList, new Comparator<Obje>()
            {
                @Override
                public int compare(Obje o1, Obje o2)
                {

                    if (o2.getAt() == -1)
                    {
                        return 1;
                    } else
                    {
                        return Integer.valueOf(o2.getAt()).compareTo(o1.getAt());
                    }
                }
            });

            adapter.notifyDataSetChanged();
            zmienna2 = 0;
            Log.d(AppSe.tagg, "b");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater mMenuInflater = getMenuInflater();
        mMenuInflater.inflate(R.menu.my_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        if (item.getItemId() == R.id.action_setting)
        {
            startActivity(new Intent(MainActivity.this, Settings.class));
            //Intent intent = new Intent("android.intent.action.Settings");
            //startActivity(intent);
        } else if (item.getItemId() == R.id.action_stat)
        {
            startActivity(new Intent(MainActivity.this, Stats.class));
            //Intent intent = new Intent("android.intent.action.Stats");
            //startActivity(intent);

        } else
        {

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onResume()
    {
        String dbStringt = dbHandler.getbyid(1);
        Log.d(AppSe.tagg, "..");
        Log.d(AppSe.tagg, dbStringt);
        Log.d(AppSe.tagg, "cd");
        String cpp = "-1";
        if (dbStringt.matches(cpp))
        {
            Log.d(AppSe.tagg, "weszlismy");
            this.recreate();
        }
        super.onResume();
    }

    public void xd()
    {
        this.recreate();
    }

    @Override
    public void recreate()
    {
        super.recreate();
    }
}
