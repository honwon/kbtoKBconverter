package com.honwon.kbtokbconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        convertBt.setOnClickListener {
            val speed = inputSpeed.text.toString().toIntOrNull()?:0

            val spType = spinner.selectedItem.toString()

            val rSpeed :Int  = when (spType){
                "Kbps" -> speed/8
                "Mbps" -> speed*1000/8
                "Gbps" -> speed*1000000/8
                else -> 89382
            }

            val KBps = rSpeed
            val MBps = rSpeed/1024
            val GBps = rSpeed/1024/1024


            resultSpeed.setText("변환 결과\n${KBps}KBps\n${MBps}MBps\n${GBps}GBps")


        }





    }
}