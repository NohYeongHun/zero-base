public class CharacterEx {

    public static void main(String[] args) {
        // 문자형
        // 문자열 -> 
        char c1 = '\ubc15'; 
        System.out.println(c1);

        char startValue = '\u0000';
        char endValue = '\uffff';

        char koStart = '\uac00';
        char koEnd = '\ud7af';
        for (int i = startValue; i <=endValue; i++) {
            if (i >= (int)koStart && i <= (int)koEnd){
                char c3 = (char)i;
                System.out.print(c3);
            }
        }



    }
    
}
