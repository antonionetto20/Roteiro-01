package com.example.antonio.app_fruit_cheers.util;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.antonio.app_fruit_cheers.R;

import java.util.List;

/**
 * Created by antonio on 14/04/2016.
 */
public class FrutasAdapter extends RecyclerView.Adapter<FrutasAdapter.FrutasViewHolder> {


    private Context context;
    private List<Fruta> frutas;
    private FrutasApplication application;

    public FrutasAdapter(Context context){
        this.context = context;
        application = (FrutasApplication) context.getApplicationContext();
        frutas = application.getFrutas();
    }

    @Override
    public FrutasViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Inflo meu layout e armazeno ele em uma view
        View view = LayoutInflater.from(context).inflate(R.layout.content_list_main, parent, false);
        // Envio meu layout inflado (view) para a classe ViewHolder
        return new FrutasViewHolder(view);
    }

    @Override
    public void onBindViewHolder(FrutasViewHolder holder, int position) {
        Fruta f = frutas.get(position);// Capturo minha fruta da posição
        // Mostro a imagem da minha fruta
        holder.imgView.setImageDrawable(context.getResources().getDrawable(f.getIdImageFruta()));
        // Exibo o nome da fruta
        holder.textView.setText(f.getNome());

    }

    @Override
    public int getItemCount() {
        return this.frutas.size(); // Retorno o tamanho da lista de frutass;
    }

    public class FrutasViewHolder extends RecyclerView.ViewHolder {

        private View toqueView;
        private ImageView imgView;
        private TextView textView;

        public FrutasViewHolder(View itemView) {
            super(itemView);
            toqueView = itemView.findViewById(R.id.toque_list);
            imgView = (ImageView)itemView.findViewById(R.id.img_list_main);
            textView = (TextView)itemView.findViewById(R.id.text_list_main);
            toqueView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getPosition();
                    application.removerFruta(position);
                    Toast.makeText(context, "Removeu da posição " + position, Toast.LENGTH_SHORT).show();
                    notifyDataSetChanged();
                }
            });
        }
    }
}
