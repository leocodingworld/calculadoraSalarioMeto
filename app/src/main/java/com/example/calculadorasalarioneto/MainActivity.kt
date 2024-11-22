package com.example.calculadorasalarioneto

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.ViewCompat
import com.example.calculadorasalarioneto.ui.theme.CalculadoraSalarioNetoTheme

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		enableEdgeToEdge()
//		setContentView(R.layout.activity_main);
//		ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id))

		findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.calcular)
			.setOnClickListener{

			val sba = findViewById<EditText>(R.id.editTextSba)
			val numPagas = findViewById<EditText>(R.id.editTextNumPagas)
			val edad = findViewById<EditText>(R.id.editTextEdad)
			val grupoPro = findViewById<RadioGroup>(R.id.rgGrupoPro);
			val grupo = findViewById<RadioButton>(grupoPro.checkedRadioButtonId);

			// Log.i("INFO", grupo.checkedRadioButtonId.toString())
			val intent = Intent(this, CalcResultado::class.java)

				intent.putExtra("sba", sba.text.toString().toDouble());
				intent.putExtra("numPagas", numPagas.text.toString().toInt());
				intent.putExtra("edad", edad.text.toString());
				intent.putExtra("grupoPro", grupo.text.toString());
				//intent.putExtra("numPagas", numPagas.text.toString());
				//intent.putExtra("numPagas", numPagas.text.toString());

				startActivity(intent)

		}

	}
}