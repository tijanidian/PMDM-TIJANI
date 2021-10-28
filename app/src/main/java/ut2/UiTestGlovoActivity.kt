package ut2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.content.ContextCompat
import com.tijanidian.pmpd_playground.R

class UiTestGlovoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ui_test_glovo)
        initTest()
    }

    private fun initTest(){
        changeStyleText()
    }


    private fun changeStyleText(){
        val textView: TextView =findViewById(R.id.text_logo_top1)
        textView.setText("McDonald's")
        textView.setTextColor(ContextCompat.getColor(this,R.color.white))

        val textView2:TextView=findViewById(R.id.text_logo_top1)

    }


}