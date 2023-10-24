package css3334.basketballstatsheet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextPlayerNumber;
    Button buttonScore1, buttonScore2, buttonScore3, buttonAssist, buttonRebound, buttonBlock, buttonSteal, buttonTurnover;

    private PlayerNumber[] players;
    private PlayerNumber playerNumber;
    TextView textViewPlayer, textViewPoints, textViewAssists, textViewRebounds, textViewBlocks, textViewSteals, textViewTurnovers, textViewFouls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewPlayer = findViewById(R.id.textViewPlayer);
        textViewPoints = findViewById(R.id.textViewPoints);
        editTextPlayerNumber = findViewById(R.id.editTextPlayerNumber);

        //Initialize Player Array
        players = new PlayerNumber[] {
                new PlayerNumber("Player 1"),
                new PlayerNumber("Player 2"),
                new PlayerNumber("Player 3")
        };

        //Initialize playerNumber
        playerNumber = players[0];

        // Add 1 Point
        buttonScore1 = findViewById(R.id.buttonScore1);
        buttonScore1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int enteredPlayerNumber = Integer.parseInt(editTextPlayerNumber.getText().toString());
                Log.d("BBB", "in on click" + enteredPlayerNumber);
                if (enteredPlayerNumber >= 1 && enteredPlayerNumber <= players.length) {
                    Log.d("BBB", "inside on click player num = " + enteredPlayerNumber);
                    players[enteredPlayerNumber - 1].addPoints(1);
                    playerNumber = players[enteredPlayerNumber - 1];
                    updatePlayerInfo(enteredPlayerNumber - 1);
                }
                text
            }
        });


        //Add 2 Points
        buttonScore2 = findViewById(R.id.buttonScore2);
        buttonScore2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playerNumber.addPoints(2);

            }
        });

        //Add 3 points
        buttonScore3 = findViewById(R.id.buttonScore3);
        buttonScore3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playerNumber.addPoints(3);

            }
        });
    }

    private void updatePlayerInfo(int playerIndex) {
        String info = "Player Number: " + players[playerIndex].getPlayerNumber() +
                " Points: " + players[playerIndex].getPoints();
        textViewPlayerInfo.setText(info);
    }
}