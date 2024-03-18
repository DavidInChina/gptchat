package h4;

/* loaded from: classes.dex */
public final class h {
    public static final double a(int i10, int i11, int i12, int i13, r4.g gVar) {
        double d10 = i12 / i10;
        double d11 = i13 / i11;
        int ordinal = gVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return Math.min(d10, d11);
            }
            throw new RuntimeException();
        }
        return Math.max(d10, d11);
    }
}
