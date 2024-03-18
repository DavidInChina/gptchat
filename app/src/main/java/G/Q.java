package G;

/* loaded from: classes2.dex */
public final class Q {

    /* renamed from: a  reason: collision with root package name */
    public P f5447a;

    public final O a(int i10, long j6) {
        P p10 = this.f5447a;
        if (p10 != null) {
            T t10 = (T) p10;
            S s10 = new S(i10, j6);
            t10.f5457j0.b(s10);
            if (!t10.f5460m0) {
                t10.f5460m0 = true;
                t10.f5456i0.post(t10);
                return s10;
            }
            return s10;
        }
        return C0549d.f5491a;
    }
}
