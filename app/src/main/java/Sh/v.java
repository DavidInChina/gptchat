package Sh;

/* loaded from: classes2.dex */
public final class v extends z {
    @Override // Sh.AbstractC1396b
    public final Hh.n b() {
        float floatValue = ((Float) this.f16690a).floatValue();
        if (floatValue == 0.0f) {
            return Lh.g.ZERO;
        }
        if (floatValue == 1.0f) {
            return Lh.g.ONE;
        }
        if (floatValue == 2.0f) {
            return Lh.g.TWO;
        }
        Lh.g gVar = Lh.g.ZERO;
        return new Lh.f(floatValue);
    }
}
