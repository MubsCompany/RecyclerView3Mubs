package com.example.recyclerview3mubs;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.recyclerview3mubs.fragment.FirstFragment;
import com.example.recyclerview3mubs.fragment.SecondFragment;
import com.example.recyclerview3mubs.fragment.ThirdFragment;

public class MainActivity extends AppCompatActivity {

    FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        fm = getSupportFragmentManager();
        fm.beginTransaction().add( R.id.kontener,new FirstFragment() ).commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate( R.menu.menu,menu );
        return super.onCreateOptionsMenu( menu );
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Fragment destinationFragment =  null;

        fm = getSupportFragmentManager();
        switch (item.getItemId()) {
            case R.id.mn_satu :
                destinationFragment  = new FirstFragment();
                break;
                case R.id.mn_dua :
                destinationFragment  = new SecondFragment();
                break;
                case R.id.mn_tiga :
                destinationFragment  = new ThirdFragment();
                break;
        }

        assert destinationFragment != null;
        fm.beginTransaction().replace( R.id.kontener,destinationFragment ).addToBackStack( "any" ).commit();
        return super.onOptionsItemSelected( item );
    }
}
