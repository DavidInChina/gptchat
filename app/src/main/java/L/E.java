package L;

import B.W0;
import Z.AbstractC1725n;
import l0.AbstractC4326r;
import l0.C4323o;
import y.C6471i;
import z.C6672L;

/* loaded from: classes.dex */
public final class E extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ P0 f9886Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ N0.E f9887Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ int f9888h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f9889i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ N0 f9890j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ T0.z f9891k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ T0.I f9892l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f9893m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f9894n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f9895o0;

    /* renamed from: p0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f9896p0;

    /* renamed from: q0  reason: collision with root package name */
    public final /* synthetic */ I.f f9897q0;

    /* renamed from: r0  reason: collision with root package name */
    public final /* synthetic */ N.t0 f9898r0;

    /* renamed from: s0  reason: collision with root package name */
    public final /* synthetic */ boolean f9899s0;

    /* renamed from: t0  reason: collision with root package name */
    public final /* synthetic */ boolean f9900t0;

    /* renamed from: u0  reason: collision with root package name */
    public final /* synthetic */ wf.k f9901u0;

    /* renamed from: v0  reason: collision with root package name */
    public final /* synthetic */ T0.s f9902v0;

    /* renamed from: w0  reason: collision with root package name */
    public final /* synthetic */ Z0.b f9903w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(P0 p02, N0.E e10, int i10, int i11, N0 n02, T0.z zVar, T0.I i12, AbstractC4326r abstractC4326r, AbstractC4326r abstractC4326r2, AbstractC4326r abstractC4326r3, AbstractC4326r abstractC4326r4, I.f fVar, N.t0 t0Var, boolean z10, boolean z11, wf.k kVar, T0.s sVar, Z0.b bVar) {
        super(2);
        this.f9886Y = p02;
        this.f9887Z = e10;
        this.f9888h0 = i10;
        this.f9889i0 = i11;
        this.f9890j0 = n02;
        this.f9891k0 = zVar;
        this.f9892l0 = i12;
        this.f9893m0 = abstractC4326r;
        this.f9894n0 = abstractC4326r2;
        this.f9895o0 = abstractC4326r3;
        this.f9896p0 = abstractC4326r4;
        this.f9897q0 = fVar;
        this.f9898r0 = t0Var;
        this.f9899s0 = z10;
        this.f9900t0 = z11;
        this.f9901u0 = kVar;
        this.f9902v0 = sVar;
        this.f9903w0 = bVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        AbstractC4326r abstractC4326r;
        AbstractC1725n abstractC1725n = (AbstractC1725n) obj;
        if ((((Number) obj2).intValue() & 11) == 2) {
            Z.r rVar = (Z.r) abstractC1725n;
            if (rVar.B()) {
                rVar.P();
                return jf.y.f36177a;
            }
        }
        C4323o c4323o = C4323o.f37719b;
        P0 p02 = this.f9886Y;
        AbstractC4326r g10 = androidx.compose.foundation.layout.e.g(c4323o, ((Z0.e) p02.f10035g.getValue()).f22788Y, 0.0f, 2);
        int i10 = this.f9888h0;
        int i11 = this.f9889i0;
        N0.E e10 = this.f9887Z;
        AbstractC4326r o10 = U3.f.o(g10, new C0839b0(i10, i11, e10));
        C6672L c6672l = new C6672L(5, p02);
        N0 n02 = this.f9890j0;
        W0 w02 = (W0) n02.f10009e.getValue();
        T0.z zVar = this.f9891k0;
        long j6 = zVar.f16831b;
        int i12 = N0.D.f12484c;
        int i13 = (int) (j6 >> 32);
        long j10 = n02.f10008d;
        if (i13 == ((int) (j10 >> 32))) {
            int i14 = (int) (j6 & 4294967295L);
            if (i14 != ((int) (4294967295L & j10))) {
                i13 = i14;
            } else {
                i13 = N0.D.e(j6);
            }
        }
        n02.f10008d = zVar.f16831b;
        T0.G a5 = AbstractC0857k0.a(this.f9892l0, zVar.f16830a);
        int ordinal = w02.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                abstractC4326r = new C0843d0(n02, i13, a5, c6672l);
            } else {
                throw new RuntimeException();
            }
        } else {
            abstractC4326r = new S0(n02, i13, a5, c6672l);
        }
        Df.H.j(androidx.compose.foundation.relocation.a.a(U3.f.o(androidx.compose.ui.draw.a.c(o10).g(abstractC4326r).g(this.f9893m0).g(this.f9894n0), new C6471i(6, e10)).g(this.f9895o0).g(this.f9896p0), this.f9897q0), R4.b.X(abstractC1725n, -363167407, new D(this.f9898r0, this.f9886Y, this.f9899s0, this.f9900t0, this.f9901u0, this.f9891k0, this.f9902v0, this.f9903w0, this.f9889i0)), abstractC1725n, 48, 0);
        return jf.y.f36177a;
    }
}
