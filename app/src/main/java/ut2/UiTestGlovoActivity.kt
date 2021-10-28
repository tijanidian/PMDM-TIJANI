package ut2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.AppCompatImageView
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
        changeBackGround()
    }


    private fun changeStyleText(){
        val textView: TextView =findViewById(R.id.text_logo_top1)
        textView.setText(R.string.glovo_principal_text)
        textView.setTextColor(ContextCompat.getColor(this,R.color.white))

        val textView2:TextView=findViewById(R.id.text_logo_top2)
        textView2.setText(R.string.glovo_secundario_text)
        textView2.setTextColor(ContextCompat.getColor(this,R.color.white))


        val textView3:TextView=findViewById(R.id.text_logo_top4)
        textView3.setText(R.string.text_left_icon)
        textView3.setTextColor(ContextCompat.getColor(this,R.color.white))

        val textView4:TextView=findViewById(R.id.text_logo_top6)
        textView4.setText(R.string.text_right_icon)
        textView4.setTextColor(ContextCompat.getColor(this,R.color.white))


    }

    private fun changeBackGround(){
        val image: AppCompatImageView =findViewById(R.id.backgroud_top)
        image.setImageResource(R.mipmap.glovo_comida)

        val image2: AppCompatImageView =findViewById(R.id.text_logo_top3)
        image2.setImageResource(R.drawable.ic_electric_moped_black_24dp)

        val image3: AppCompatImageView =findViewById(R.id.img_logo_glovo)
        image3.setImageResource(R.drawable.ic_glovo_logo)

        val image4: AppCompatImageView =findViewById(R.id.text_logo_top5)
        image4.setImageResource(R.drawable.ic_watch_later_white_24dp)




    }


}