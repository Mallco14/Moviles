package tecsp.edu.nameapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import tecsp.edu.nameapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun resultadoFinal(view: android.view.View) {
        val name = binding.resultNombre.text
        val correo = binding.resultCorreo.text
        binding.viewprincipal.visibility = View.VISIBLE
        binding.viewTest.visibility = View.VISIBLE
        binding.viewTest2.visibility = View.VISIBLE
        binding.viewTest.text="Nombre : $name "
        binding.viewTest2.text="Correo : $correo"

    }

}