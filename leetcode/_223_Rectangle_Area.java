/**
 * @author sunxiaoyang
 */
public class _223_Rectangle_Area {

    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int x1 = Math.max(A, E);
        int y1 = Math.max(B, F);
        int x2 = Math.min(C, G);
        int y2 = Math.min(D, H);

        int cover = (x2 > x1 && y2 > y1) ? (x2 - x1) * (y2 - y1) : 0;
        return (C - A) * (D - B) + (G - E) * (H - F) - cover;
    }

    public static void main(String[] args) {
        _223_Rectangle_Area a = new _223_Rectangle_Area();
        System.out.println(a.computeArea(0, 0, 0, 0, -1, -1, 1, 1));
    }
}
