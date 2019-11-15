package com.example.carloan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<View>(R.id.calculate)

        btn.setOnClickListener(){

            val price = value_edit.text.toString()
            val down_payment = downPayment_edit.text.toString()
            val period = loanPeriod_edit.text.toString()
            val rate = intrestRate_edit.text.toString()


            val loan:Double = price.toDouble()-down_payment.toDouble()
            val interest:Double = loan.toDouble()*rate.toDouble()*period.toDouble()
            val pay:Double = (loan+interest)/period.toDouble()/12.0.toDouble()

            txtloan.text="RM%.2f".format(loan)
            txtinterest.text="RM%.2f".format(interest)
            txtpay.text="RM%.2f".format(pay)

        }
    }
}
