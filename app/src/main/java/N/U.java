package N;

import q0.C5251c;
import z.C6720r;

/* loaded from: classes.dex */
public final class U extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final U f12253Z = new U(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final U f12254h0 = new U(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final U f12255i0 = new U(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final U f12256j0 = new U(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final U f12257k0 = new U(4);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f12258Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U(int i10) {
        super(1);
        this.f12258Y = i10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f12258Y) {
            case 0:
                long j6 = ((C5251c) obj).f43623a;
                if (R4.b.z1(j6)) {
                    return new C6720r(C5251c.d(j6), C5251c.e(j6));
                }
                return Y.f12269a;
            case 1:
                C6720r c6720r = (C6720r) obj;
                return new C5251c(R4.b.r(c6720r.f51354a, c6720r.f51355b));
            case 2:
                C1034s c1034s = (C1034s) obj;
                return yVar;
            case 3:
                return new m0(((Number) obj).longValue());
            default:
                T0.z zVar = (T0.z) obj;
                return yVar;
        }
    }
}
