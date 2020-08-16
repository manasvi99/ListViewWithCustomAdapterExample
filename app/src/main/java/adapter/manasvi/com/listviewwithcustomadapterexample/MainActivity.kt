package adapter.manasvi.com.listviewwithcustomadapterexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val languages= arrayOf("C language","Java", ".Net", "C++")
        val langImage= arrayOf(R.drawable.clang,R.drawable.java,R.drawable.net, R.drawable.cplus)
        setContentView(R.layout.activity_main)
        //MyListAdapter is the name of the adapter we are going to create
        val myAdapter=MyListAdapter(this,languages,langImage)
        listView.adapter=myAdapter
    }
}
