package edu.wt.w08a;

// Adnotacja SerializedName pozwala odwzorować pole z pliku JSON na zmienną Javy o innej nazwie
import com.google.gson.annotations.SerializedName;

// Klasa opakowująca pojedynczą odpowiedź ze StackOverflow
public class Answer {

    @SerializedName("answer_id")
    public int answerId;

    @SerializedName("is_accepted")
    public boolean accepted;

    public int score;

    @Override
    public String toString() {
        return answerId + " - Score: " + score + " - Accepted: " + (accepted ? "Yes" : "No");
    }
}