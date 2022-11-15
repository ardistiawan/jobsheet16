package com.example.joobsheet16

import android.content.DialogInterface
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "Jobsheet16", Toast.LENGTH_SHORT).show()

        val btn1 = findViewById<Button>(R.id.button1)
        val btn2 = findViewById<Button>(R.id.button2)
        val biodata = arrayOf("AHMAD ARDHI S", "XI PPLG 2", "2973")

        btn1.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Biodata Siswa")
                .setItems(biodata,  DialogInterface.OnClickListener { dialog, which ->
                })
                .setPositiveButton("oke", DialogInterface.OnClickListener { dialogInterface, i ->
                })
                .show()
        }

        btn2.setOnClickListener {
            val inflater = layoutInflater
            val dialog = inflater.inflate(R.layout.dialog, null)
            val editText = dialog.findViewById<EditText>(R.id.editText)
            AlertDialog.Builder(this)
                .setTitle("Masukkan  Nama")
                .setView(dialog)
                .setPositiveButton("oke",
                    DialogInterface.OnClickListener { dialogInterface, i ->
                        Toast.makeText(this,"Nama kamu " + editText.getText().toString(), Toast.LENGTH_SHORT).show()
                    })
                .setNegativeButton("Batal",
                    DialogInterface.OnClickListener { dialogInterface, i ->
                    }) .show()
        }
    }
}