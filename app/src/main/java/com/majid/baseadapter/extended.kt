package com.majid.baseadapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class extended (var array : ArrayList<String>) : BaseAdapter (){
    override fun getCount(): Int {
        return array.size
    }

    override fun getItem(position: Int): Any {
       return 0
    }

    override fun getItemId(position: Int): Long {
        return 1L
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view = LayoutInflater.from(parent?.context).inflate(R.layout.base_layout,parent,false)
        var textview = view.findViewById<TextView>(R.id.tvNames)
        textview.setText(array.get(position))
        return view
    }
}