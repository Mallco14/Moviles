package tecsp.edu.pokemon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import tecsp.edu.pokemon.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    private lateinit var  binding:ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val intent = Intent(this,MainActivity::class.java).apply {

        }
        Handler(Looper.getMainLooper()).postDelayed({startActivity(intent);finish()},3000)
    }
}


