package pl.tomczyk.recyclerviewv2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class LiczbyAdapter extends RecyclerView.Adapter<LiczbyAdapter.LiczbyHolder> {


    private  Liczby[] tablicaliczb = WszystkieLiczby.liczby ;
    private LayoutInflater inflater;

    //generujemy konstruktor
    public LiczbyAdapter(Context context, Liczby[] tablicaliczb) {
        this.tablicaliczb = tablicaliczb;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public LiczbyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = inflater.inflate(R.layout.liczba, parent, false);
        return new LiczbyHolder(itemView,this);
    }

    @Override
    public void onBindViewHolder(@NonNull LiczbyHolder holder, int position) {
holder.imageView.setImageResource(tablicaliczb[position].getIdObrazka());
        holder.imgItemView.setText(tablicaliczb[position].getName());
    }

    @Override
    public int getItemCount() {
        return tablicaliczb.length;
    }
//podklasa
    public class LiczbyHolder  extends RecyclerView.ViewHolder {
       public final TextView imgItemView;
       public final ImageView imageView;
       final LiczbyAdapter liczbyAdapter;

    //konstruktor
        public LiczbyHolder(@NonNull View itemView, LiczbyAdapter liczbyAdapter) {
            super(itemView);
            imgItemView = itemView.findViewById(R.id.textView);
            imageView = itemView.findViewById(R.id.imageView);
            this.liczbyAdapter = liczbyAdapter;
        }
    }
}
