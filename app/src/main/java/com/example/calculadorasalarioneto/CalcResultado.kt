package com.example.calculadorasalarioneto

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CalcResultado : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		enableEdgeToEdge()
		setContentView(R.layout.activity_calc_resultado)

		val intent = intent

		val sbaBrutoRes = findViewById<TextView>(R.id.sbaBrutoRes)
		val sbaNetoRes = findViewById<TextView>(R.id.sbaNetoRes)
		val sbaDedudcionesRes = findViewById<TextView>(R.id.sbaDeduccionesRes)
		val sbaIrpfRes = findViewById<TextView>(R.id.sbaIrpfRes)

		val sba = intent.getDoubleExtra("sba", 1.0);
		val numPagas = intent.getIntExtra("numPagas", 2)
		val sbm = sba / numPagas
		val deducciones = sbm * (6.35/100);

		sbaBrutoRes.text = (sbm).toString();
		sbaNetoRes.text = (sbm - deducciones).toString();
		sbaDedudcionesRes.text = deducciones.toString();
		sbaIrpfRes.text = "7.1";
	}
}