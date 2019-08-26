package matc89.exercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCumprimentar = (Button) findViewById(R.id.btnCumprimentar);
        final EditText editNome = (EditText) findViewById(R.id.editNome);
        final TextView labelMensagem = (TextView) findViewById(R.id.labelMensagem);

        btnCumprimentar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                labelMensagem.setText("Alô, "+(editNome.getText()+"!"));

            }



        });
    }
}

