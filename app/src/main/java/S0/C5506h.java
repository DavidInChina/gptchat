package s0;

/* renamed from: s0.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5506h {

    /* renamed from: e  reason: collision with root package name */
    public static final C5504f f45050e;

    /* renamed from: f  reason: collision with root package name */
    public static final C5506h f45051f;

    /* renamed from: g  reason: collision with root package name */
    public static final C5506h f45052g;

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC5502d f45053a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC5502d f45054b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC5502d f45055c;

    /* renamed from: d  reason: collision with root package name */
    public final float[] f45056d;

    /* JADX WARN: Type inference failed for: r1v0, types: [s0.f, s0.h] */
    static {
        C5515q c5515q = C5503e.f45028c;
        f45050e = new C5506h(c5515q, c5515q, 1);
        C5510l c5510l = C5503e.f45045t;
        f45051f = new C5506h(c5515q, c5510l, 0);
        f45052g = new C5506h(c5510l, c5515q, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C5506h(AbstractC5502d abstractC5502d, AbstractC5502d abstractC5502d2, int i10) {
        this(abstractC5502d2, r4, r5, r8);
        long j6 = abstractC5502d.f45024b;
        long j10 = AbstractC5501c.f45018a;
        AbstractC5502d o10 = AbstractC5501c.a(j6, j10) ? kotlin.jvm.internal.m.o(abstractC5502d) : abstractC5502d;
        AbstractC5502d o11 = AbstractC5501c.a(abstractC5502d2.f45024b, j10) ? kotlin.jvm.internal.m.o(abstractC5502d2) : abstractC5502d2;
        float[] fArr = null;
        if (i10 == 3) {
            boolean a5 = AbstractC5501c.a(abstractC5502d.f45024b, j10);
            boolean a10 = AbstractC5501c.a(abstractC5502d2.f45024b, j10);
            if ((!a5 || !a10) && (a5 || a10)) {
                abstractC5502d = !a5 ? abstractC5502d2 : abstractC5502d;
                float[] fArr2 = AbstractC5508j.f45061e;
                C5517s c5517s = ((C5515q) abstractC5502d).f45075d;
                float[] a11 = a5 ? c5517s.a() : fArr2;
                fArr2 = a10 ? c5517s.a() : fArr2;
                fArr = new float[]{a11[0] / fArr2[0], a11[1] / fArr2[1], a11[2] / fArr2[2]};
            }
        }
    }

    public long a(float f6, float f10, float f11, float f12) {
        AbstractC5502d abstractC5502d = this.f45054b;
        long d10 = abstractC5502d.d(f6, f10, f11);
        float intBitsToFloat = Float.intBitsToFloat((int) (d10 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (d10 & 4294967295L));
        float e10 = abstractC5502d.e(f6, f10, f11);
        float[] fArr = this.f45056d;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            e10 *= fArr[2];
        }
        float f13 = intBitsToFloat2;
        float f14 = intBitsToFloat;
        return this.f45055c.f(f14, f13, e10, f12, this.f45053a);
    }

    public C5506h(AbstractC5502d abstractC5502d, AbstractC5502d abstractC5502d2, AbstractC5502d abstractC5502d3, float[] fArr) {
        this.f45053a = abstractC5502d;
        this.f45054b = abstractC5502d2;
        this.f45055c = abstractC5502d3;
        this.f45056d = fArr;
    }
}
