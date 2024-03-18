package Sh;

/* loaded from: classes2.dex */
public final class u extends z {
    @Override // Sh.AbstractC1396b
    public final Hh.n b() {
        double doubleValue = ((Double) this.f16690a).doubleValue();
        if (doubleValue == 0.0d) {
            return Lh.e.ZERO;
        }
        if (doubleValue == 1.0d) {
            return Lh.e.ONE;
        }
        Lh.e eVar = Lh.e.ZERO;
        return new Lh.d(doubleValue);
    }
}
