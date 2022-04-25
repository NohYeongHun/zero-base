package JavaCondition;

public class Loop {
    public static void main(String[] args) {
        
        int dan = 2;
        System.out.println("=== for 루프 ===");
        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + " x " + i + " = " + (dan * i));
        }
        
        
        System.out.println("=== while 루프 ===");
        int i = 1;
        while(i<=9){
            System.out.println(dan + " x " + i + " = " + (dan * i));
            i++;
        }
        
        System.out.println("=== do while 루프 ===");
        int j = 1;
        do{
            //무조건 한번 실행하고 그 이후로 조건에 따라서 실행.
            System.out.println(dan + " x " + j + " = " + (dan * i));
            j++;
        }while(i<=9);

        
        String[] koreanFamous = {"홍길동", "이순신", "세종대왕"};
        for (String famous : koreanFamous) {
            System.out.println("한국 위인들 = " + famous);
        }

        System.out.println("===break===");
        for (int k = 1; k < 100; k++) {
            if(k % 10 == 0){
                System.out.println("10의 배수이므로 종료합니다.");
                break;
            }
            System.out.println("현재 숫자 = " + k);
            
        }

        System.out.println("===continue===");
        for (int k = 0; k < 20; k++) {
            if(k % 10 == 0){
                System.out.println("10의 배수는 출력하지 않습니다.");
                continue;
            }
            System.out.println("현재 숫자 = " + k);
        }

    }
}
