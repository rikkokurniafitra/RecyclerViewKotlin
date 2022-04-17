package com.rikko.recyclerviewkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rikko.recyclerviewkotlin.KlubterkayaAdapter

class MainActivity : AppCompatActivity() {
    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val KlubterkayaList = listOf<Klubterkaya>(
            Klubterkaya(
                R.drawable.barcelona,
                "Barcelona – Rp12,57 triliun ",
                " Klub berjuluk Blaugrana ini mendapatkan uang pada musim 2019/2020 sebesar 715,1 juta euro atau setara dengan Rp12,57 triliun."
            ),
            Klubterkaya(
                R.drawable.realmadrid,
                "Real Madrid – Rp12,57 triliun",
                "Cberhasil meraih gelar Liga Spanyol musim 2019/2020. Pada musim lalu, Real Madrid meraup uang sebanyak 714,9 juta euro atau setara dengan Rp12,57 triliun.."
            ),
            Klubterkaya(
                R.drawable.bayermunchen,
                "Bayern Munchen – Rp11,15 triliun",
                "Bayern Munchen mendapatkan banyak uang pada musim lalu, yakni 634,1 juta euro atau setara dengan Rp11,15 triliun. Pendapatan Bayern Munchen diprediksi akan menurun pada musim ini karena prestasi mereka mengalami penurunan.."
            ),
            Klubterkaya(
                R.drawable.manchesterunited,
                "Manchester United – Rp10,2 triliun",
                "Manchester United mendapatkan dana sebesar 580,4 juta euro atau setara dengan Rp10,2 triliun pada musim lalu.."
            ),
            Klubterkaya(
                R.drawable.liverpol,
                " Liverpool – Rp9,8 triliun ",
                "berhasil meraih gelar juara Premier League. Liverpool sendiri total mendapatkan uang sebesar 558,6 juta euro atau setara Rp9,8 triliun pada musim lalu.."
            ),
            Klubterkaya(
                R.drawable.manchestercity,
                "Manchester City – Rp9,6 triliun",
                "nominal yang didapatkan oleh Manchester City tetaplah besar, yakni 549,2 juta euro atau setara dengan Rp9,6 triliun. Sama seperti Liverpool, City juga mengalami penurunan di pendapatan penyiaran. Namun, pendapatan komersial dari City meningkat sangat drastis."
            ),
            Klubterkaya(
                R.drawable.psg,
                "Paris Saint-Germain – Rp9,5 triliun",
                "Kylian Mbappe dan kolega juga sukses menembus partai final Liga Champions. Karena itu, PSG mendapatkan uang sebesar 540,6 juta euro atau setara dengan Rp9,5 triliun."
            ),
            Klubterkaya(
                R.drawable.chelsea,
                " Chelsea – Rp8,2 triliun ",
                "SChelsea pada musim lalu meraup 469,7 juta euro atau setara dengan Rp8,2 triliun. Sumber pendapatan terbanyak Chelsea datang dari aliran komersial dengan angka menyentuh 200 juta euro atau setara Rp3,5 triliun."
            ),
            Klubterkaya(
                R.drawable.spur,
                "Tottenham Hotspur- Rp7,8 triliun ",
                "klasemen akhir Premier League musim 2019/2020. Spurs sendiri mendapatkan uang yang cukup banyak, yaitu 445,7 juta euro atau setara Rp7,8 triliun."
            ),
            Klubterkaya(
                R.drawable.juventus,
                "Juventus – Rp6,9 triliun ",
                "Juventus sendiri pada musim lalu sebesar 397,9 juta euro atau setara Rp6,9 triliun. Pendapatannya cenderung naik karena berbagai sponsor seperti Allianz, Jeep, dan Adidas juga meningkatkan nominalnya untuk Juventus."
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = KlubterkayaAdapter(this,KlubterkayaList ){

            val intent = Intent (this, DetailKlubterkayaActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}