package com.example.calculatorapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.calculatorapplication.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var number1: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnNum1.setOnClickListener {
            binding.edtInput.setText(binding.edtInput.text.append("1"))
            number1 = binding.edtInput.text.toString()
        }
        binding.btnNum2.setOnClickListener {
            binding.edtInput.setText(binding.edtInput.text.append("2"))
            number1 = binding.edtInput.text.toString()
        }
        binding.btnNum3.setOnClickListener {
            binding.edtInput.setText(binding.edtInput.text.append("3"))
            number1 = binding.edtInput.text.toString()
        }
        binding.btnNum4.setOnClickListener {
            binding.edtInput.setText(binding.edtInput.text.append("4"))
            number1 = binding.edtInput.text.toString()
        }
        binding.btnNum5.setOnClickListener {
            binding.edtInput.setText(binding.edtInput.text.append("5"))
            number1 = binding.edtInput.text.toString()
        }
        binding.btnNum6.setOnClickListener {
            binding.edtInput.setText(binding.edtInput.text.append("6"))
            number1 = binding.edtInput.text.toString()
        }
        binding.btnNum7.setOnClickListener {
            binding.edtInput.setText(binding.edtInput.text.append("7"))
            number1 = binding.edtInput.text.toString()
        }
        binding.btnNum8.setOnClickListener {
            binding.edtInput.setText(binding.edtInput.text.append("8"))
            number1 = binding.edtInput.text.toString()
        }
        binding.btnNum9.setOnClickListener {
            binding.edtInput.setText(binding.edtInput.text.append("9"))
            number1 = binding.edtInput.text.toString()
        }
        binding.btnNum0.setOnClickListener {
            binding.edtInput.setText(binding.edtInput.text.append("0"))
            number1 = binding.edtInput.text.toString()
        }
        binding.btndot.setOnClickListener {
            binding.edtInput.setText("${binding.edtInput.text.toString()}.")
        }
        binding.btnAdd.setOnClickListener {
            binding.edtInput.setText("${binding.edtInput.text.toString()}+")
        }
        binding.btnMinus.setOnClickListener {
            binding.edtInput.setText("${binding.edtInput.text.toString()}-")
        }
        binding.btnMultiple.setOnClickListener {
            binding.edtInput.setText("${binding.edtInput.text.toString()}x")
        }
        binding.btnSlush.setOnClickListener {
            binding.edtInput.setText("${binding.edtInput.text.toString()}/")
        }
        binding.btnRemainder.setOnClickListener {
            binding.edtInput.setText("${binding.edtInput.text.toString()}%")
        }
        binding.btnResult.setOnClickListener {
            var str = binding.edtInput.text
            var num1 = String()
            var num2 = String()
            var result = 0.0
            var result2 = 0


            if (binding.edtInput.text.contains(".")) {
                if (binding.edtInput.text.contains("+")) {
                    var str2 = str.split("+")
                    num1 = str2[0]
                    num2 = str2[1]
                    result = num1.toDouble() + num2.toDouble()
                    binding.tvOutput.setText(String.format("%2f", result))
                } else if (binding.edtInput.text.contains("-")) {
                    var str2 = str.split("-")
                    num1 = str2[0]
                    num2 = str2[1]
                    result = num1.toDouble() - num2.toDouble()
                    binding.tvOutput.setText(String.format("%2f", result))
                } else if (binding.edtInput.text.contains("x")) {
                    var str2 = str.split("x")
                    num1 = str2[0]
                    num2 = str2[1]
                    result = num1.toDouble() * num2.toDouble()
                    binding.tvOutput.setText(String.format("%2f", result))
                } else if (binding.edtInput.text.contains("/")) {
                    var str2 = str.split("/")
                    num1 = str2[0]
                    num2 = str2[1]
                    result = num1.toDouble() / num2.toDouble()
                    binding.tvOutput.setText(String.format("%2f", result))
                } else if (binding.edtInput.text.contains("%")) {
                    var str2 = str.split("%")
                    num1 = str2[0]
                    num2 = str2[1]
                    result = num1.toDouble() % num2.toDouble()
                    binding.tvOutput.setText(String.format("%2f", result))
                }
            } else {
                if (binding.edtInput.text.contains("+")) {
                    var str2 = str.split("+")
                    num1 = str2[0]
                    num2 = str2[1]
                    result2 = num1.toInt() + num2.toInt()
                    binding.tvOutput.setText(String.format("%d", result2))
                } else if (binding.edtInput.text.contains("-")) {
                    var str2 = str.split("-")
                    num1 = str2[0]
                    num2 = str2[1]
                    result2 = num1.toInt() - num2.toInt()
                    binding.tvOutput.setText(String.format("%d", result2))
                } else if (binding.edtInput.text.contains("x")) {
                    var str2 = str.split("x")
                    num1 = str2[0]
                    num2 = str2[1]
                    result2 = num1.toInt() * num2.toInt()
                    binding.tvOutput.setText(String.format("%d", result2))
                } else if (binding.edtInput.text.contains("/")) {
                    var str2 = str.split("/")
                    num1 = str2[0]
                    num2 = str2[1]
                    result2 = num1.toInt() / num2.toInt()
                    binding.tvOutput.setText(String.format("%d", result2))
                } else if (binding.edtInput.text.contains("%")) {
                    var str2 = str.split("%")
                    num1 = str2[0]
                    num2 = str2[1]
                    result2 = num1.toInt() % num2.toInt()
                    binding.tvOutput.setText(String.format("%d", result2))
                }
            }
            binding.edtInput.setText("")

        }
        binding.btnAc.setOnClickListener {
            binding.edtInput.setText("")
        }
    }

}