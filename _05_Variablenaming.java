package Chapter_01;

public class _05_Variablenaming {
    public static void main(String[] args) {
        // 변수 이름 짓는 법
        // 1. 저장할 값에 어울리는 이름
        // 2. 밑줄, 문자, 숫자 사용 가능(공백 사용 불가)
        // 3. 밑줄또는 문자로 시작 가능 (숫자로는 시작 불가)
        // 4. 한 단어 또는 2개 이상 단어의 연속
        // 5. 소문자로 시작, 각 단어의 시작 글자는 대문자 (첫 단어는 제외)
        // 6. 예약어 사용 불가 (public, static, void, int, double, float, ...)


        // 입국 신고서 (여행)
        String nationality = "대한민국"; //국적
        String firstName = "현성";
        String lastName = "김";
        String dateOfBirth = "1994-07-27";
        String residentialAddress = "무슨 호텔";
        String purposeOfVist="관광";
        String flightNo = "KE657";
        String _flight_no_2 = "KE657";
        // String -flightNo = "ke657"; 밑줄 문자 숫자 아니면 불가

        int accompany =2;
        int lengthOfStay = 5;

        String item1 ="시계";
        String item2 ="가방";
        String item3 ="마우스";
        //String 3item = "전자제품";
    }}