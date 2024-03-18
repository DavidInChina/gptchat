package bb;

import Z8.AbstractC1809m0;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;

/* renamed from: bb.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2170j extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final C2170j f25837Z = new C2170j(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C2170j f25838h0 = new C2170j(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C2170j f25839i0 = new C2170j(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final C2170j f25840j0 = new C2170j(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final C2170j f25841k0 = new C2170j(4);

    /* renamed from: l0  reason: collision with root package name */
    public static final C2170j f25842l0 = new C2170j(5);

    /* renamed from: m0  reason: collision with root package name */
    public static final C2170j f25843m0 = new C2170j(6);

    /* renamed from: n0  reason: collision with root package name */
    public static final C2170j f25844n0 = new C2170j(7);

    /* renamed from: o0  reason: collision with root package name */
    public static final C2170j f25845o0 = new C2170j(8);

    /* renamed from: p0  reason: collision with root package name */
    public static final C2170j f25846p0 = new C2170j(9);

    /* renamed from: q0  reason: collision with root package name */
    public static final C2170j f25847q0 = new C2170j(10);

    /* renamed from: r0  reason: collision with root package name */
    public static final C2170j f25848r0 = new C2170j(11);

    /* renamed from: s0  reason: collision with root package name */
    public static final C2170j f25849s0 = new C2170j(12);

    /* renamed from: t0  reason: collision with root package name */
    public static final C2170j f25850t0 = new C2170j(13);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f25851Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2170j(int i10) {
        super(1);
        this.f25851Y = i10;
    }

    public final C2152D a(C2152D c2152d) {
        switch (this.f25851Y) {
            case 2:
                AbstractC3557B.c0("$this$setState", c2152d);
                return C2152D.e(c2152d, null, null, null, null, false, null, false, false, 383);
            case 3:
                AbstractC3557B.c0("$this$setState", c2152d);
                return C2152D.e(c2152d, null, null, null, null, false, null, false, true, 255);
            default:
                AbstractC3557B.c0("$this$setState", c2152d);
                return C2152D.e(c2152d, null, null, null, null, false, null, false, false, 255);
        }
    }

    public final m0 c(m0 m0Var) {
        switch (this.f25851Y) {
            case 9:
                AbstractC3557B.c0("$this$setState", m0Var);
                return m0.e(m0Var, null, null, null, null, 7);
            case 10:
            default:
                AbstractC3557B.c0("$this$setState", m0Var);
                return m0.e(m0Var, null, null, null, null, 7);
            case 11:
                AbstractC3557B.c0("$this$setState", m0Var);
                return m0.e(m0Var, null, null, null, null, 7);
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        wd.m0 m0Var = wd.m0.f48443a;
        int i10 = this.f25851Y;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("it", (T) obj);
                return yVar;
            case 1:
                AbstractC2469q0.p(obj);
                AbstractC3557B.c0("it", null);
                return yVar;
            case 2:
                return a((C2152D) obj);
            case 3:
                return a((C2152D) obj);
            case 4:
                return a((C2152D) obj);
            case 5:
                return null;
            case 6:
                AbstractC2469q0.p(obj);
                AbstractC3557B.c0("it", null);
                return yVar;
            case 7:
                p0.o oVar = (p0.o) obj;
                AbstractC3557B.c0("it", oVar);
                if (((p0.p) oVar).a()) {
                    AbstractC1809m0.a().b(Z8.G.f23248c, kf.w.f37484Y);
                }
                return yVar;
            case 8:
                return null;
            case 9:
                return c((m0) obj);
            case 10:
                H0 h02 = (H0) obj;
                switch (i10) {
                    case 10:
                        AbstractC3557B.c0("it", h02);
                        wd.o0 o0Var = h02.f25720a;
                        AbstractC3557B.c0("categoryResult", o0Var);
                        return new H0(o0Var, m0Var);
                    default:
                        AbstractC3557B.c0("it", h02);
                        wd.o0 o0Var2 = h02.f25720a;
                        AbstractC3557B.c0("categoryResult", o0Var2);
                        return new H0(o0Var2, m0Var);
                }
            case 11:
                return c((m0) obj);
            case 12:
                return c((m0) obj);
            default:
                H0 h03 = (H0) obj;
                switch (i10) {
                    case 10:
                        AbstractC3557B.c0("it", h03);
                        wd.o0 o0Var3 = h03.f25720a;
                        AbstractC3557B.c0("categoryResult", o0Var3);
                        return new H0(o0Var3, m0Var);
                    default:
                        AbstractC3557B.c0("it", h03);
                        wd.o0 o0Var4 = h03.f25720a;
                        AbstractC3557B.c0("categoryResult", o0Var4);
                        return new H0(o0Var4, m0Var);
                }
        }
    }
}
