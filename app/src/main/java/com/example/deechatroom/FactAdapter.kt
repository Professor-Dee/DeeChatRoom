package com.example.deechatroom

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView

class FactAdapter(context: Context,facts:List<FactModel>):ArrayAdapter<FactModel>(context, 0,facts) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view = convertView
        if (view == null){
            view = LayoutInflater.from(parent.context).inflate(R.layout.fact_item,parent, attachToRoot: false)
        }
        val logo = view?.findViewById<ImageView>(R.id.imageLogo)
        val name
        return super.getView(position, convertView, parent)
    }
}