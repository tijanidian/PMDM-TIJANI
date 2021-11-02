package ut2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.content.ContextCompat
import com.tijanidian.pmpd_playground.R

class UiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ui)
        initPlayGround()

    }

    private fun initPlayGround(){

    }

    private fun textPlayground(){
        //Manera larga
        val textView:AppCompatTextView=findViewById(R.id.label_x)
        //Cambiamos el texto
        textView.text=getString(R.string.app_name)
        //Otra manera con setText
        //textView.setText(R.string.app_name)
        /**¡Cambiar el color
         */
        textView.setTextColor(ContextCompat.getColor(this,R.color.black))
    }

    private fun edittextPlayGround(){
        val input:AppCompatEditText=findViewById(R.id.input_x)
        //Cambiamos el hint
        input.setHint(R.string.app_name)
        input.setText(R.string.app_name)

        //Recoger texto o dato del usuario
        val text = input.text.toString()
    }

    private fun edittextWithLabelPlayGround(){
        val inputLabel:AppCompatEditText=findViewById(R.id.input_2x)
        val text=inputLabel.text.toString()
    }

    private fun imageViewPlayGround(){
        val image:AppCompatImageView=findViewById(R.id.image01)
        image.setImageResource(R.drawable.ic_leon)

    }

    fun buttonPlayGround(){
        val button:AppCompatButton=findViewById(R.id.button01)
        button.text="Boton"
    }



}