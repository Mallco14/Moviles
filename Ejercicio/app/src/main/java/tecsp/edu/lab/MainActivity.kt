package tecsp.edu.lab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import tecsp.edu.lab.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private  lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calculateAnimals(view: android.view.View) {
        val numberCats: Int = binding.edtCats.text.toString().toInt()
        val numberDogs: Int=binding.edtDogs.text.toString().toInt()

        val numberAnimals = numberCats + numberDogs
        binding.tvResult.visibility = View.VISIBLE

        binding.tvResult.text = "Cantidad de animales : $numberAnimals"
    }
}