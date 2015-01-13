package com.cursoandroid.mycustombaseadapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class CustomBaseAdapter extends BaseAdapter {
    private Activity context;
    private List<Usuario> listUser;
    private class ViewHolder{
        public TextView nombre;
        public TextView dni;
        public TextView telefono;
        public TextView numero;
    }
    public CustomBaseAdapter(Activity context, List<Usuario> listUser)
    {
        super();
        this.context = context;
        this.listUser = listUser;
    }
    @Override
    public int getCount() {
        return listUser.size();
    }

    @Override
    public Object getItem(int position) {
        return listUser.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        //Objeto ViewHolder
        ViewHolder viewHolder;
        //Generamos un convertView por motivos de eficiencia
        View v = view;
        //Asociamos el layout de la lista que hemos creado e incrustamos el ViewHolder
        if(view == null)
        {
            LayoutInflater inf = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.layout_list_item,null);
            viewHolder = new ViewHolder();
            viewHolder.nombre = (TextView) v.findViewById(R.id.txtUno);
            viewHolder.dni = (TextView) v.findViewById(R.id.txtDos);
            viewHolder.telefono = (TextView) v.findViewById(R.id.txtTres);
            viewHolder.numero = (TextView) v.findViewById(R.id.txtnum);
            v.setTag(viewHolder);
        }
        //Creamos un objeto directivo
        Usuario user = listUser.get(position);

        //Rellenamos la información utilizando el viewHolder

        viewHolder = (ViewHolder) v.getTag();
        viewHolder.nombre.setText(user.getNombre());
        viewHolder.dni.setText(user.getDni());
        viewHolder.telefono.setText(String.valueOf(user.getTelefono()));
        viewHolder.numero.setText(String.valueOf(position));

        //retornamos la vista
        return v;
    }


}

