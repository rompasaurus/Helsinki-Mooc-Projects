public class Change {
    private char fromChar;
    private char toChar;
    public Change(char fromChar, char toChar) {
        this.fromChar = fromChar;
        this.toChar = toChar;
        }
    public String change(String characterString){
        String change="";
        for (int i = 0; i < characterString.length(); i++) {
            if(characterString.charAt(i)==fromChar){
                change += toChar;
            }else{
                change += characterString.charAt(i);
            }
        }
        return change;
    }
}
