
//before implementing give permission to vibrate 
<uses-permission android:name="android.permission.VIBRATE"/>
//include this line in your AndroidManifest.xml
//import vibration library
import android.os.Vibrator;

//Vibrate for a given time. Method example below 

//get instance of vibrator from current context
Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

//Vibrate for 400 milliseconds
v.vibrate(400);

//HOW TO VIBRATE INDEFINITELY
//get instance of vibrator from current context 
Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

//start without delay
//vibrate for 100 milliseconds
//Sleep for 1000 milliseconds
long[] pattern = {0, 100, 1000};

//the 0 means to repeat indefinetely
//to stop call cancel() method
v.cancel();
//Troubleshooting
// Get instance of vibrator from current contaxt 
Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

// output yes if can vibrate, no otherwise
if (v.hasVibrator()) {
	Log.v("Can Vibrate", "YES");
} else {
	Log.v("Can Vibrate", "YES");
}