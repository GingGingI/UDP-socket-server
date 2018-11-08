package util;

public class dataDivisor {

    /**
     * 데이터 보낼방식
     * 앞숫자는 채팅방 번호
     * 1_1:Name:Msg
     */

    public int DataGetCnt(String Data){
        int Cnt = 9999;
        String DataSplit[] = Data.split(":");
        Cnt = Integer.valueOf(DataSplit[0]);

        return Cnt;
    }
    public String DataGetName(String Data){
        String Name = "";
        String DataSplit[] = Data.split(":");
        Name = DataSplit[1];

        return Name;
    }
    public String DataGetMsg(String Data){
        String Msg = "";
        String DataSplit[] = Data.split(":");
        Msg = DataSplit[2];
//        System.out.println(Msg);
        return Msg.trim();
    }
}
