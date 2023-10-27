package css3334.basketballstatsheet;

import androidx.appcompat.app.AppCompatActivity;
//import androidx.room.Room;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //private BasketballStatsDatabase database;
    //private PlayerDao playerDao;
    private EditText editTextPlayerNumber;
    Button buttonScore1, buttonScore2, buttonScore3, buttonAssist, buttonRebound, buttonBlock, buttonSteal, buttonTurnover;

    SeekBar seekBarFoul;
    private Player player;
    TextView textViewPlayer, textViewPoints, textViewAssists, textViewRebounds, textViewBlocks, textViewSteals, textViewTurnovers, textViewFouls, textViewFoulOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        player = new Player();

        textViewPlayer = findViewById(R.id.textViewPlayer);
        textViewPoints = findViewById(R.id.textViewPoints);
        textViewAssists = findViewById(R.id.textViewAssists);
        textViewRebounds = findViewById(R.id.textViewRebounds);
        textViewBlocks = findViewById(R.id.textViewBlocks);
        textViewSteals = findViewById(R.id.textViewSteals);
        textViewTurnovers = findViewById(R.id.textViewTurnovers);
        textViewFouls = findViewById(R.id.textViewFouls);
        textViewFoulOut = findViewById(R.id.textViewFoulOut);
        editTextPlayerNumber = findViewById(R.id.editTextPlayerNumber);

        // Initialize the Room database
        //database = Room.databaseBuilder(getApplicationContext(), BasketballStatsDatabase.class, "basketball_stats_db")
        //        .build();

        // Create an instance of the PlayerDao
        //playerDao = database.playerDao();

        // Add 1 Point
        buttonScore1 = findViewById(R.id.buttonScore1);
        buttonScore1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String enteredPlayerNumber = editTextPlayerNumber.getText().toString();
                player.addPoints(1);
                textViewPlayer.setText(enteredPlayerNumber);
                textViewPoints.setText(player.getPoints().toString());
            }
        });


        //Add 2 Points
        buttonScore2 = findViewById(R.id.buttonScore2);
        buttonScore2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String enteredPlayerNumber = editTextPlayerNumber.getText().toString();
                player.addPoints(2);
                textViewPlayer.setText(enteredPlayerNumber);
                textViewPoints.setText(player.getPoints().toString());

            }
        });

        //Add 3 points
        buttonScore3 = findViewById(R.id.buttonScore3);
        buttonScore3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String enteredPlayerNumber = editTextPlayerNumber.getText().toString();
                player.addPoints(3);
                textViewPlayer.setText(enteredPlayerNumber);
                textViewPoints.setText(player.getPoints().toString());
            }
        });

        //Add 1 assist
        buttonAssist = findViewById(R.id.buttonAssist);
        buttonAssist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String enteredPlayerNumber = editTextPlayerNumber.getText().toString();
                player.addAssists(1);
                textViewPlayer.setText(enteredPlayerNumber);
                textViewAssists.setText(player.getAssists().toString());
            }
        });

        //Add 1 rebound
        buttonRebound= findViewById(R.id.buttonRebound);
        buttonRebound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String enteredPlayerNumber = editTextPlayerNumber.getText().toString();
                player.addRebounds(1);
                textViewPlayer.setText(enteredPlayerNumber);
                textViewRebounds.setText(player.getRebounds().toString());
            }
        });

        //Add 1 steal
        buttonSteal = findViewById(R.id.buttonSteal);
        buttonSteal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String enteredPlayerNumber = editTextPlayerNumber.getText().toString();
                player.addSteals(1);
                textViewPlayer.setText(enteredPlayerNumber);
                textViewSteals.setText(player.getSteals().toString());
            }
        });

        //Add 1 block
        buttonBlock = findViewById(R.id.buttonBlock);
        buttonBlock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String enteredPlayerNumber = editTextPlayerNumber.getText().toString();
                player.addBlocks(1);
                textViewPlayer.setText(enteredPlayerNumber);
                textViewBlocks.setText(player.getBlocks().toString());
            }
        });

        //Add 1 turnover
        buttonTurnover = findViewById(R.id.buttonTurnover);
        buttonTurnover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String enteredPlayerNumber = editTextPlayerNumber.getText().toString();
                player.addTurnovers(1);
                textViewPlayer.setText(enteredPlayerNumber);
                textViewTurnovers.setText(player.getTurnovers().toString());
            }
        });

        seekBarFoul = findViewById(R.id.seekBarFoul);
        seekBarFoul.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                textViewFouls.setText(String.valueOf(progress));

                //Change Color based on fouls
                if (progress >= 0 && progress <= 2) {
                    textViewFouls.setTextColor(Color.GREEN);
                    textViewFoulOut.setText("");
                } else if (progress >= 3 && progress <= 4) {
                    textViewFouls.setTextColor(Color.parseColor("#FFA500"));
                    textViewFoulOut.setText("");
                } else if (progress >= 5 && progress <= 6) {
                    textViewFouls.setTextColor(Color.RED);
                    textViewFoulOut.setText("");
                    if (progress == 6) {
                        textViewFoulOut.setText("FOULED OUT");
                    }
                }
                else {
                    textViewFouls.setTextColor(Color.BLACK);
                    textViewFoulOut.setText("");
                }
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            //Not Needed
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            //Not Needed
            }

        });
    }

}