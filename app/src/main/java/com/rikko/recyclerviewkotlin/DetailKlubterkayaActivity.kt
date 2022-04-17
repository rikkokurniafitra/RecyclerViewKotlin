package com.rikko.recyclerviewkotlin


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailKlubterkayaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_klubterkaya)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val klubterkaya = intent.getParcelableExtra<Klubterkaya>(MainActivity.INTENT_PARCELABLE)

        val imgKlubterkaya = findViewById<ImageView>(R.id.img_item_photo)
        val nameKlubterkaya = findViewById<TextView>(R.id.tv_item_name)
        val descKlubterkaya = findViewById<TextView>(R.id.tv_item_description)

        imgKlubterkaya.setImageResource(klubterkaya?.imgKlubterkaya!!)
        nameKlubterkaya.text = klubterkaya.nameKlubterkaya
        descKlubterkaya.text = klubterkaya.descKlubterkaya

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}