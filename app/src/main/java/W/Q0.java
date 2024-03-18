package W;

import java.util.UUID;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class Q0 extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Z  reason: collision with root package name */
    public static final Q0 f19565Z = new Q0(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final Q0 f19566h0 = new Q0(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final Q0 f19567i0 = new Q0(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final Q0 f19568j0 = new Q0(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final Q0 f19569k0 = new Q0(4);

    /* renamed from: l0  reason: collision with root package name */
    public static final Q0 f19570l0 = new Q0(5);

    /* renamed from: m0  reason: collision with root package name */
    public static final Q0 f19571m0 = new Q0(6);

    /* renamed from: n0  reason: collision with root package name */
    public static final Q0 f19572n0 = new Q0(7);

    /* renamed from: o0  reason: collision with root package name */
    public static final Q0 f19573o0 = new Q0(8);

    /* renamed from: p0  reason: collision with root package name */
    public static final Q0 f19574p0 = new Q0(9);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f19575Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Q0(int i10) {
        super(0);
        this.f19575Y = i10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        Boolean bool = Boolean.TRUE;
        switch (this.f19575Y) {
            case 0:
                return R0.f(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1);
            case 1:
                return bool;
            case 2:
                return new r0.r(r0.r.f44254b);
            case 3:
                return bool;
            case 4:
                return UUID.randomUUID();
            case 5:
                return null;
            case 6:
                return new C1525a3();
            case 7:
                return new Z0.e(0);
            case 8:
                return X.L.f21474a;
            default:
                return new p4(X.K.f21462d, X.K.f21463e, X.K.f21464f, X.K.f21465g, X.K.f21466h, X.K.f21467i, X.K.f21471m, X.K.f21472n, X.K.f21473o, X.K.f21459a, X.K.f21460b, X.K.f21461c, X.K.f21468j, X.K.f21469k, X.K.f21470l);
        }
    }
}
