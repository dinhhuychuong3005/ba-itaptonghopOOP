package bt10;

public class VanBan {
    private String string;

    public VanBan() {
    }

    public VanBan(String string) {
        this.string = string;
    }

    public int count(String string) {
        this.string = string.trim();
//        while (string.indexOf("  ") != -1) {
//            string = string.replaceAll("  ", " ");
//        }

        int count = 0;
        for (int i = 0;i<string.length();i++){
            if (string.charAt(i) == 'a' || string.charAt(i) == 'A'){
                count++;
            }
        }
        return count;
    }
}
