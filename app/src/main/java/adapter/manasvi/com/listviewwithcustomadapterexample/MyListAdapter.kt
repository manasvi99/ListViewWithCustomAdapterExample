package adapter.manasvi.com.listviewwithcustomadapterexample

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyListAdapter(private val context: Activity, private val languageName:Array<String>, private val imageId:Array<Int>):
ArrayAdapter<String>(context, R.layout.custom_menu, languageName){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater=context.layoutInflater
        val rowView=inflater.inflate(R.layout.custom_menu,null,true)
        val langText=rowView.findViewById(R.id.textView)as TextView
        val imageview=rowView.findViewById(R.id.imageView)as ImageView
        langText.text=languageName[position]
        imageview.setImageResource(imageId[position])
        return rowView
    }
}