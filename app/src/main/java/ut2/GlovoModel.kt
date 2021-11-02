package ut2

import com.tijanidian.pmpd_playground.R

data class GlovoModel(val principal: Int = R.string.glovo_principal_text,
                      val segundario:Int=R.string.glovo_secundario_text,
                      val leftIcon:Int=R.string.label_price,
                      val rightIcon:Int=R.string.text_right_icon
                      )