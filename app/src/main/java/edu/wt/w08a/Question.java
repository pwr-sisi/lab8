package edu.wt.w08a;

// Adnotacja SerializedName pozwala odwzorować pole z pliku JSON na zmienną Javy o innej nazwie
import com.google.gson.annotations.SerializedName;

// Klasa opakowująca pojedyncze pytanie ze StackOverflow
public class Question {

    public String title;
    public String body;

    @SerializedName("question_id")
    public String questionId;

    @Override
    public String toString() {
        return(title);
    }
}