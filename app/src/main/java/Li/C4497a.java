package li;

/* renamed from: li.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4497a {

    /* renamed from: a  reason: collision with root package name */
    public final int f38526a;

    /* renamed from: b  reason: collision with root package name */
    public final double f38527b;

    /* renamed from: c  reason: collision with root package name */
    public final double f38528c;

    public C4497a(double d10) {
        int i10 = (int) (0.6366197723675814d * d10);
        while (true) {
            double d11 = -i10;
            double d12 = 1.570796251296997d * d11;
            double d13 = d10 + d12;
            double d14 = 7.549789948768648E-8d * d11;
            double d15 = d14 + d13;
            double d16 = (-((d13 - d10) - d12)) + (-((d15 - d13) - d14));
            double d17 = d11 * 6.123233995736766E-17d;
            double d18 = d17 + d15;
            double d19 = d16 + (-((d18 - d15) - d17));
            if (d18 > 0.0d) {
                this.f38526a = i10;
                this.f38527b = d18;
                this.f38528c = d19;
                return;
            }
            i10--;
        }
    }
}
