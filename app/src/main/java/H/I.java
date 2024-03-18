package H;

import Z.C1724m0;
import Z.o1;
import nf.AbstractC4828h;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class I extends F {

    /* renamed from: E  reason: collision with root package name */
    public static final f8.e f6575E = new f8.e(14, 0);

    /* renamed from: F  reason: collision with root package name */
    public static final i0.r f6576F = AbstractC4828h.X(G.f6572Y, u.f6670h0);

    /* renamed from: D  reason: collision with root package name */
    public final C1724m0 f6577D;

    public I(int i10, float f6, AbstractC6216a abstractC6216a) {
        super(i10, f6);
        this.f6577D = AbstractC4828h.Z(abstractC6216a, o1.f22665a);
    }

    @Override // H.F
    public final int h() {
        return ((Number) ((AbstractC6216a) this.f6577D.getValue()).mo122invoke()).intValue();
    }
}
