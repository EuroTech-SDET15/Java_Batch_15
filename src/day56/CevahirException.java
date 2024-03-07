package day56;

public class CevahirException extends Exception {

    public CevahirException(String message) {
        super(message);
    }
}

class Test{


    public static void main(String[] args) throws CevahirException {

        String currentTopic = "Errors";
        String cevahirQuestion = "Collections";

        if (!cevahirQuestion.equals(currentTopic)){
            throw new CevahirException("Out of topic!");
        }


    }
}
