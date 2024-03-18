package I9;

import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class K extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final K f8193Z = new K(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final K f8194h0 = new K(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final K f8195i0 = new K(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final K f8196j0 = new K(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final K f8197k0 = new K(4);

    /* renamed from: l0  reason: collision with root package name */
    public static final K f8198l0 = new K(5);

    /* renamed from: m0  reason: collision with root package name */
    public static final K f8199m0 = new K(6);

    /* renamed from: n0  reason: collision with root package name */
    public static final K f8200n0 = new K(7);

    /* renamed from: o0  reason: collision with root package name */
    public static final K f8201o0 = new K(8);

    /* renamed from: p0  reason: collision with root package name */
    public static final K f8202p0 = new K(9);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f8203Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K(int i10) {
        super(1);
        this.f8203Y = i10;
    }

    public final j1 a(j1 j1Var) {
        switch (this.f8203Y) {
            case 1:
                AbstractC3557B.c0("$this$setState", j1Var);
                return j1.e(j1Var, false, false, true, null, null, false, null, false, null, null, null, null, false, 131067);
            case 2:
                AbstractC3557B.c0("$this$setState", j1Var);
                return j1.e(j1Var, false, false, false, null, null, false, null, false, null, null, null, null, false, 130815);
            case 3:
                AbstractC3557B.c0("$this$setState", j1Var);
                return j1.e(j1Var, false, false, false, null, null, false, null, false, null, null, null, null, false, 131067);
            case 4:
                AbstractC3557B.c0("$this$setState", j1Var);
                return j1.e(j1Var, false, false, false, null, null, false, null, true, null, null, null, null, false, 130047);
            case 5:
                AbstractC3557B.c0("$this$setState", j1Var);
                return j1.e(j1Var, false, true, false, null, null, false, null, false, null, null, null, null, false, 131069);
            case 6:
                AbstractC3557B.c0("$this$setState", j1Var);
                return j1.e(j1Var, false, false, false, null, null, false, null, false, null, null, null, null, false, 131069);
            case 7:
                AbstractC3557B.c0("$this$setState", j1Var);
                return j1.e(j1Var, true, false, false, null, null, false, null, false, null, null, null, null, false, 131070);
            case 8:
                AbstractC3557B.c0("$this$setState", j1Var);
                return j1.e(j1Var, false, false, false, null, null, false, null, false, null, null, null, null, false, 131070);
            default:
                AbstractC3557B.c0("$this$setState", j1Var);
                return j1.e(j1Var, false, false, false, null, null, false, null, false, null, null, null, null, false, 130047);
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        switch (this.f8203Y) {
            case 0:
                zd.n nVar = (zd.n) obj;
                AbstractC3557B.c0("$this$update", nVar);
                return zd.n.a(nVar, false, null, false, false, false, false, false, false, null, false, 4094);
            case 1:
                return a((j1) obj);
            case 2:
                return a((j1) obj);
            case 3:
                return a((j1) obj);
            case 4:
                return a((j1) obj);
            case 5:
                return a((j1) obj);
            case 6:
                return a((j1) obj);
            case 7:
                return a((j1) obj);
            case 8:
                return a((j1) obj);
            default:
                return a((j1) obj);
        }
    }
}
