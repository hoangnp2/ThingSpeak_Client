package com.example.hoang.app;

import android.content.Intent;

//import android.support.design.widget.NavigationView;

import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.util.Pair;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.hoang.AboutNetWork.ConnectionReceiver;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import static com.example.hoang.app.R.layout.item;

public class MainActivity extends AppCompatActivity {

    public final static  String TAG = "devi";
    public static final String DEVICE = "DeviceSelect";
    private ListView lvDevice ;
    private ArrayList<Device> CopyList;
    private CustomAdapter custem;
    private ArrayList<Device> listDevice;
    private FloatingActionButton floatbut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //ActionBar actionBar = getSupportActionBar();
        //actionBar.setHomeAsUpIndicator(R.drawable.ic_menu);
       // actionBar.setDisplayHomeAsUpEnabled(true);




<<<<<<< HEAD

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        FragmentManager fragmentManager = getSupportFragmentManager();

        FragmentTransaction ft = fragmentManager.beginTransaction();

        boolean netWorkStatus = ConnectionReceiver.isConnected();
        if(netWorkStatus){

            FragmentListDevice fralis = new FragmentListDevice();
            ft.replace(R.id.container_body,fralis);
            ft.commit();

            fralis.lvDevice = (ListView) findViewById(R.id.liv1);

           if(fralis.lvDevice == null)
                Log.d("status:","is null");
            else
                Log.d("status:","not null");

            listDevice = new ArrayList();

            GregorianCalendar time1 = new GregorianCalendar(2017,2,1,1,30,30);
            GregorianCalendar time2 = new GregorianCalendar(2017,2,2,2,30,30);
            GregorianCalendar time3 = new GregorianCalendar(2017,2,3,3,30,30);
            GregorianCalendar time4 = new GregorianCalendar(2017,2,4,4,30,30);
            GregorianCalendar time5 = new GregorianCalendar(2017,2,5,5,30,30);
            GregorianCalendar time6 = new GregorianCalendar(2017,2,6,6,30,30);
            GregorianCalendar time7 = new GregorianCalendar(2017,2,7,0,30,30);
            GregorianCalendar time8 = new GregorianCalendar(2017,2,8,2,30,30);
            GregorianCalendar time8_1 = new GregorianCalendar(2017,2,8,3,30,30);
            GregorianCalendar time8_2 = new GregorianCalendar(2017,2,8,4,30,30);
            GregorianCalendar time9 = new GregorianCalendar(2017,2,9,4,30,30);
            GregorianCalendar time10 = new GregorianCalendar(2017,2,10,5,30,30);

            Pair<GregorianCalendar,Integer> va_1 = Pair.create(time1,40);
            Pair<GregorianCalendar,Integer> va_2 = Pair.create(time2,80);
            Pair<GregorianCalendar,Integer> va_3 = Pair.create(time3,10);
            Pair<GregorianCalendar,Integer> va_4 = Pair.create(time4,30);
            Pair<GregorianCalendar,Integer> va_5 = Pair.create(time5,40);
            Pair<GregorianCalendar,Integer> va_6 = Pair.create(time6,10);
            Pair<GregorianCalendar,Integer> va_7 = Pair.create(time7,10);
            Pair<GregorianCalendar,Integer> va_8 = Pair.create(time8,60);
            Pair<GregorianCalendar,Integer> va_8_1 = Pair.create(time8_1,80);
            Pair<GregorianCalendar,Integer> va_8_2 = Pair.create(time8_2,100);
            Pair<GregorianCalendar,Integer> va_9 = Pair.create(time9,10);
            Pair<GregorianCalendar,Integer> va_10 = Pair.create(time10,10);

            ArrayList<Pair<GregorianCalendar,Integer>> arr =  new ArrayList<>();
            ArrayList<Pair<GregorianCalendar,Integer>> arr1 =  new ArrayList<>();
            ArrayList<Pair<GregorianCalendar,Integer>> arr2 = new ArrayList<>();
            arr.add(va_1);
            arr.add(va_2);
            arr.add(va_3);
            arr.add(va_4);
            arr.add(va_5);
            arr.add(va_6);
            arr.add(va_7);
            arr.add(va_8);
            arr.add(va_8_1);
            arr.add(va_8_2);
            arr.add(va_9);
            arr.add(va_10);


            arr1.add(va_2);
            arr2.add(va_3);

            Device de_1 = new Device("0001aaaaa",arr);
            Device de_2 = new Device("0004ababa",arr1);
            Device de_3 = new Device("0004ababa",arr2);


            listDevice.add(de_1);
            listDevice.add(de_2);
            listDevice.add(de_3);
=======
        /*listDevice.add(de_1);
        listDevice.add(de_2);
        listDevice.add(de_3);
>>>>>>> 6399522a9c2a13883065c707c37e324ce65b53b6
        /*listDevice.add(de_1);
        listDevice.add(de_2);
        listDevice.add(de_3);
        listDevice.add(de_1);
        listDevice.add(de_2);
        listDevice.add(de_3);
        listDevice.add(de_1);
        listDevice.add(de_2);
        listDevice.add(de_3);*/
            CopyList = new ArrayList<>();
            CopyList.addAll(listDevice);

            custem = new CustomAdapter(this, item,listDevice);
           // lvDevice.setAdapter(custem);

            final ArrayList<Device> finalListDevice = listDevice;

           /* lvDevice.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    provideGraph(finalListDevice.get(i));
                }

            });*/


        }
        else{
            FragmentDisconnected fradis = new FragmentDisconnected();
            ft.replace(R.id.container_body,fradis);
            ft.commit();
        }


       // NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
       // navigationView.setNavigationItemSelectedListener((NavigationView.OnNavigationItemSelectedListener) this);
        //final ArrayList<Device> finalListDevice1 = listDevice;

    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_tolbar, menu);
        MenuItem searchViewItem = menu.findItem(R.id.action_search);
        SearchView searchview = (SearchView) searchViewItem.getActionView();
        searchview.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

            @Override
            public boolean onQueryTextSubmit(String query) {
                if (listDevice.size() > 0) {
                    listDevice.clear();
                    if (query.length() == 0) {
                        listDevice.addAll(CopyList);
                    } else {
                        for (Device de : CopyList) {
                            if (de.getAPIkey().contains(query)) {
                                listDevice.add(de);
                            }
                        }
                    }
                    custem.notifyDataSetChanged();

                }
                return false;
            }
            @Override
            public boolean onQueryTextChange(String newText) {
                if (listDevice.size() > 0) {
                    listDevice.clear();
                    if(newText.length() == 0) {
                        listDevice.addAll(CopyList);
                    }
                    else
                    {
                        for(Device de : CopyList)
                        {
                            if(de.getAPIkey().contains(newText))
                            {
                                listDevice.add(de);
                            }
                        }
                    }
                    custem.notifyDataSetChanged();
                }
                return false;
            }
        });


        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item_) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item_.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_search) {
            return true;
        }

        return super.onOptionsItemSelected(item_);
    }


    public void provideGraph(Device devi){
        Intent intent = new Intent(MainActivity.this,GraphActivity.class);
        intent.putExtra(DEVICE,devi);
        startActivity(intent);
    }

}
