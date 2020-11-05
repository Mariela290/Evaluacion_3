package com.example.evaluacion_3;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdaptadorCategorias extends RecyclerView.Adapter <AdaptadorCategorias.viewHolder> {
    private Context mctx;
    private List <ModeloCategoria> CategoriaLista;
    public AdaptadorCategorias(Context mctx, List <ModeloCategoria> categoriaLista){
        this.CategoriaLista=categoriaLista;
        this.mctx=mctx;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
    View v= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_recyclerview, viewGroup,false);
        viewHolder ViewHolder=new viewHolder(v);
        return ViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder categoriasViewHolder, int i) {

        categoriasViewHolder.tv_idCat.setText(String.valueOf(CategoriaLista.get(i).getId_categoria()));
        categoriasViewHolder.tv_NombreCat.setText(CategoriaLista.get(i).getNombre_categoria());
        categoriasViewHolder.tv_EstadoCat.setText(String.valueOf(CategoriaLista.get(i).getEstado_categoria()));
    }

    @Override
    public int getItemCount() {
        return CategoriaLista.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{

        TextView tv_idCat, tv_NombreCat, tv_EstadoCat;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            tv_idCat=itemView.findViewById(R.id.tv_idCat);
            tv_NombreCat=itemView.findViewById(R.id.tv_NombreCat);
            tv_EstadoCat=itemView.findViewById(R.id.tv_EstadoCat);
        }
    }
}
