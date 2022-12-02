package com.example.datasiswa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)
        supportActionBar?.hide()
//        Handler().postDelayed(
//            {
//                val intent = Intent(this@MainActivity,SplashScreen::class.java)
//                startActivity(intent)
//                finish()
//            },3000
//        )
        checkSiswa()
    }

    fun checkSiswa()
    {
        btnKirim.setOnClickListener {
            val nameSiswa = inputName.text.toString()
            val kelasSiswa = inputKelas.text.toString()


            val checkData = HashMap<String,String>()
            checkData.put("Satria", "XII TKJ")
            checkData.put("Suntomo", "XII RPL")
            checkData.put("Razan", "XI TBSM")
            checkData.put("Aldi", "X TKR")

            for ((key,value) in checkData)
            {
                if (key.equals(nameSiswa) && value.equals(kelasSiswa))
                {
                    text_namaSiswa.setText(key)
                    text_numberNISN.setText(value)

                }
                else if (key.equals(nameSiswa) && value.equals(kelasSiswa) == false)
                {
                    Toast.makeText(this@MainActivity, "Kelas Tidak Ditemukan",Toast.LENGTH_SHORT)
                        .show()

                }
                else if (key.equals(nameSiswa) == false && value.equals(kelasSiswa))
                {
                    Toast.makeText(this@MainActivity, "Nama Tidak Ditemukan",Toast.LENGTH_SHORT)
                        .show()

                }
                else if (key.equals(nameSiswa) == false && value.equals(kelasSiswa) == false)
                {
                    Toast.makeText(this@MainActivity, "Data Tidak Ditemukan", Toast.LENGTH_SHORT)
                        .show()
                }
                break
            }
        }
    }

}
