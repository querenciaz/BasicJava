package Confilm.Confirm15;

public class Example1 {
    public static void main(String[] args) {

        Button btnOk = new Button();
        btnOk.setClickListener(() -> System.out.println("OK 버튼을 클릭했습니다."));
        btnOk.click();

//        btnOk.setClickListener(() -> {
//            System.out.println("OK 버튼을 클릭했습니다.");
//        });
//        btnOk.click();

        Button btnCancel = new Button();
        btnCancel.setClickListener(() -> {
            System.out.println("CANCEL 버튼을 클릭했습니다.");
        });
        btnCancel.click();
    }
}
