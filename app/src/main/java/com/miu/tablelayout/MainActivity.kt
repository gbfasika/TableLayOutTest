package com.miu.tablelayout

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.EditText
import android.widget.TableRow
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            var version = idVersion?.text?.toString();
            var code = code_id?.text?.toString();

            if(!version.isNullOrEmpty() || !code.isNullOrEmpty())
            {
                // Create a new table row.
                val tableRow = TableRow(getApplicationContext())

                val layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)
                tableRow.setLayoutParams(layoutParams)

                val versionTextView = EditText(getApplicationContext());
                versionTextView.setText(version)

                val codeTextView = EditText(getApplicationContext());
                codeTextView.setText(code)

                tableRow.addView(versionTextView,0)
                tableRow.addView(codeTextView,1)

                // Finally add the created row row into layout
                table_id.addView(tableRow)

                idVersion.text.clear();
                code_id.text.clear();
            }
        }
    }
}