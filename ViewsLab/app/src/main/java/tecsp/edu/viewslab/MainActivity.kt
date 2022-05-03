package tecsp.edu.viewslab


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import tecsp.edu.viewslab.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private  lateinit var  binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        changeAmount()

    }
    private fun changeAmount(){
        binding.tvCreditAmount.text="$ 10000.00"
    }

}