package baseball;

public class ForSample {

    public static void main(String[] args) {

        BaseBallTeam[] bass = new BaseBallTeam[6];
        String[] names = { "東京ヤクルトスワローズ", "横浜DeNAベイスターズ", "阪神タイガース", "読売ジャイアンツ", "広島東洋カープ", "中日ドラゴンズ" };

        for (int i = 0; i < bass.length; i++) {
            bass[i] = new BaseBallTeam(names[i], 0, 0, 0);
        }

        bass[0] = new BaseBallTeam("東京ヤクルトスワローズ", 80, 59, 4);

        bass[1] = new BaseBallTeam("横浜DeNAベイスターズ", 73, 68, 2);

        bass[2] = new BaseBallTeam("阪神タイガース", 68, 71, 4);

        bass[3] = new BaseBallTeam("読売ジャイアンツ", 68, 72, 3);

        bass[4] = new BaseBallTeam("広島東洋カープ", 66, 74, 3);

        bass[5] = new BaseBallTeam("中日ドラゴンズ", 66, 75, 2);

        for (BaseBallTeam bbt : bass) {
            bbt.report();
        }

        /*
         * bas01.report(); bas02.report(); bas03.report(); bas04.report();
         * bas05.report(); bas06.report();
         */

    }
}
