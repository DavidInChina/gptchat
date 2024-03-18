package ec;

import id.AbstractC3557B;
import wd.m0;
import wd.n0;

/* renamed from: ec.E  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2835E extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final C2835E f29132Z = new C2835E(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C2835E f29133h0 = new C2835E(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C2835E f29134i0 = new C2835E(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final C2835E f29135j0 = new C2835E(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final C2835E f29136k0 = new C2835E(4);

    /* renamed from: l0  reason: collision with root package name */
    public static final C2835E f29137l0 = new C2835E(5);

    /* renamed from: m0  reason: collision with root package name */
    public static final C2835E f29138m0 = new C2835E(6);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f29139Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2835E(int i10) {
        super(1);
        this.f29139Y = i10;
    }

    public final C2873y a(C2873y c2873y) {
        jf.y yVar = jf.y.f36177a;
        m0 m0Var = m0.f48443a;
        switch (this.f29139Y) {
            case 0:
                AbstractC3557B.c0("$this$setState", c2873y);
                return C2873y.e(c2873y, null, null, m0Var, null, null, null, null, null, 1019);
            case 1:
                AbstractC3557B.c0("$this$setState", c2873y);
                return C2873y.e(c2873y, null, null, new n0(yVar), null, null, null, null, null, 1019);
            case 2:
                AbstractC3557B.c0("$this$setState", c2873y);
                return C2873y.e(c2873y, null, m0Var, null, null, null, null, null, null, 1021);
            case 3:
                AbstractC3557B.c0("$this$setState", c2873y);
                return C2873y.e(c2873y, null, new n0(yVar), null, null, null, null, null, null, 1021);
            case 4:
                AbstractC3557B.c0("$this$setState", c2873y);
                return C2873y.e(c2873y, null, null, null, null, m0Var, null, null, null, 1007);
            case 5:
                AbstractC3557B.c0("$this$setState", c2873y);
                return C2873y.e(c2873y, null, null, null, null, new n0(yVar), null, null, null, 1007);
            default:
                AbstractC3557B.c0("$this$setState", c2873y);
                return C2873y.e(c2873y, null, null, null, m0Var, null, null, null, null, 1015);
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f29139Y) {
            case 0:
                return a((C2873y) obj);
            case 1:
                return a((C2873y) obj);
            case 2:
                return a((C2873y) obj);
            case 3:
                return a((C2873y) obj);
            case 4:
                return a((C2873y) obj);
            case 5:
                return a((C2873y) obj);
            default:
                return a((C2873y) obj);
        }
    }
}
