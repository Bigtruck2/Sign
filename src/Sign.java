public class Sign {
    private String lines;
    private int nChars;
    public Sign(String lines, int nChars) {
        this.lines = lines;
        this.nChars = nChars;
    }

    public String getLines() {
        if(lines.isEmpty()) return null;
        String result = "";
        int n = 0;
        for (int i = 0;i<lines.length();i+=nChars){
            result += lines.substring(i,Math.min(i+nChars,lines.length()))+";";
            n = i;
        }
        return result.endsWith(";") ? result.substring(0,result.length()-1):result;
    }

    public int numberOfLines() {
        return lines.length()%nChars==0 ? lines.length()/nChars : lines.length()/nChars + 1;
    }
}
