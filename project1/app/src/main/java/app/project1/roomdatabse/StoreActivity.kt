package app.project1.roomdatabse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.project1.R
import app.project1.databinding.ActivityDataShowBinding
import app.project1.databinding.ActivityStoreBinding

class StoreActivity : AppCompatActivity() {

    lateinit var binding:ActivityStoreBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_store)

        init()
    }

    fun init(){

//       var name=binding.etName.text.toString().trim()
//       var email=binding.etEmail.text.toString().trim()
//       var rbMale=binding.rbMale.text.toString().trim()
//       var rbfeMale=binding.rbFemale.text.toString().trim()
//       var password=binding.password.text.toString().trim()
//       var cpassword=binding.cpassword.text.toString().trim()



    }

}