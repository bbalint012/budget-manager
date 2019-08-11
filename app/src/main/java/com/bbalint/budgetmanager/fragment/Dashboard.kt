package com.bbalint.budgetmanager.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.bbalint.budgetmanager.R

class Dashboard : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.dashboard, container, false)
        setBtnOnClicks(view)


        return view
    }


    private fun setBtnOnClicks(view: View) {
        view.findViewById<Button>(R.id.addWalletBtn)
                .setOnClickListener {
                    Toast.makeText(context, "TODO: Not implemented yet", Toast.LENGTH_SHORT).show()
                }

        view.findViewById<Button>(R.id.connectBankBtn)
                .setOnClickListener {
                    Toast.makeText(context, "TODO: Not implemented yet", Toast.LENGTH_SHORT).show()
                }

    }

}
