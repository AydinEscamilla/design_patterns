/**
 * Author: Aydin Escamilla
 * CSCE247
 */
package decorator;

public class Cone extends IceCream {
    public Cone() {
    this.asciiArt = FileReader.getLines("decorator/txt/cone.txt");
    for (int i = 0; i < asciiArt.size(); i++) {
        String line = asciiArt.get(i);
        asciiArt.set(i, Colors.BROWN + line + Colors.RESET);
    }
    globalScoopCount = 0;
}


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        int maxScoopWidth = (globalScoopCount == 0 ? 2 : (globalScoopCount - 1) * 2 + 2);

        int coneMaxWidth = 0;
        for (String line : asciiArt) {
            coneMaxWidth = Math.max(coneMaxWidth, line.trim().length());
        }

        int totalWidth = Math.max(maxScoopWidth, coneMaxWidth);

        for (String line : asciiArt) {
            String raw = line.trim();
            int spaces = (totalWidth - raw.length()) / 2;
            sb.append(" ".repeat(Math.max(0, spaces))).append(raw).append("\n");
        }

        return sb.toString();
    }
}
