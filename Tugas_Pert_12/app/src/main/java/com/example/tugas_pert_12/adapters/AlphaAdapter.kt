package com.example.tugas_pert_12.adapters
import android.content.Context
import com.example.tugas_pert_12
import android.view.ViewGroup
import android.widget.TextView
import com.example.tugas_pert_12
class AlphaAdapter(var context: Context, var arrayList: ArrayList<AlphaChar>): RecycleView.Adapter<RecycleView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecycleView.ViewHolder{

    }
    override fun getItemCount(): Int{

    }
    override fun onBindViewHolder(holder: RecycleView.viewHolder, position: Int){

    }
    class ItemHolder(ItemView:View): RecycleView.ViewHolder(itemView){

        var icons : imageView = itemView.findiewById<ImageView>(R.id.icons_image)
        var alphas:TextView = itemView.findViewById<TextView>(R.id.alpha_text_view)

    }
}