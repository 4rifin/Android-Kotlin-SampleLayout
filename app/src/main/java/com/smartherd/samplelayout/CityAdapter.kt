package com.smartherd.samplelayout

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.list_item.view.*

class CityAdapter(val context: Context, private val cities: List<City>) : RecyclerView.Adapter<CityAdapter.MyViewHolded>() {

    companion object {
        val TAG: String = CityAdapter::class.java.simpleName
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolded{
        val view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        return MyViewHolded(view)
    }

    override fun getItemCount(): Int {
        return cities.size
    }

    override fun onBindViewHolder(holder:MyViewHolded, position: Int) {
        val hobby = cities[position]
        holder.setData(hobby, position)
    }

    inner class MyViewHolded(itemView: View) : RecyclerView.ViewHolder(itemView) {


        var currentCity: City? = null
        var currentPosition: Int = 0

        init {
            itemView.setOnClickListener {
                //Toast.makeText(context,currentHobby!!.title + " Clicked!",Toast.LENGTH_SHORT).show()
                currentCity?.let {
                    Toast.makeText(context,currentCity!!.title + " Clicked!",Toast.LENGTH_SHORT).show()

                }
                //context.showToast(currentHobby!!.title + " Clicked!")
            }
            itemView.imgShare.setOnClickListener {

                currentCity?.let {
                    val message: String = "My city is: " + currentCity!!.title
                    val intent = Intent()
                    intent.action = Intent.ACTION_SEND
                    intent.putExtra(Intent.EXTRA_TEXT, message)
                    intent.type = "text/plan"
                    context.startActivity(Intent.createChooser(intent, "aaaaa"))
                }
            }
        }

        fun setData(city: City?, pos: Int) {
            city?.let {
                itemView.txvTitle.text = city.title
            }

            this.currentCity = city
            this.currentPosition = pos
        }
    }

}