package tela.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import tela.login.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ic_navegar.setOnClickListener {
             val navegartelacadastro = intent(MainActivity.this,telacadastro::class.java)
        }
    }
}