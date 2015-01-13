package com.cursoandroid.mycustombaseadapter;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {

    private ListView lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Creamos tres usuarios
        Usuario user1 = new Usuario("Miguel","26237120M",953652030);
        Usuario user2 = new Usuario("Antonio","23617830X",953653838);
        Usuario user3 = new Usuario("Manolo","22222222Y",123456789);

        //Se crea la lista de objeto usuario
        List<Usuario> listUser = new ArrayList<Usuario>();

        //Añadimos los tres usuarios

        listUser.add(user1);
        listUser.add(user2);
        listUser.add(user3);

        //Se crea el adaptador Custom
        CustomBaseAdapter adapter = new CustomBaseAdapter(this,listUser);

        //Se referencia la lista a la activity
        lista = (ListView) findViewById(R.id.lista);

        //Se asigna el adaptador a la lista

        lista.setAdapter(adapter);
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
