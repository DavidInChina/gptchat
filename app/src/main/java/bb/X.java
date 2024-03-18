package bb;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import cb.C2350T;
import l0.AbstractC4326r;
import wd.C6205s;

/* loaded from: classes.dex */
public final class X extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f25751Y = 0;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f25752Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ boolean f25753h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f25754i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f25755j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ Object f25756k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ Object f25757l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(C2350T c2350t, boolean z10, boolean z11, wf.k kVar, int i10, int i11) {
        super(2);
        this.f25756k0 = c2350t;
        this.f25752Z = z10;
        this.f25753h0 = z11;
        this.f25757l0 = kVar;
        this.f25754i0 = i10;
        this.f25755j0 = i11;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f25751Y;
        int i12 = this.f25754i0;
        Object obj = this.f25757l0;
        Object obj2 = this.f25756k0;
        switch (i11) {
            case 0:
                int p10 = AbstractC1734s.p(i12 | 1);
                boolean z10 = this.f25753h0;
                int i13 = this.f25755j0;
                L4.a.H((C2350T) obj2, this.f25752Z, z10, (wf.k) obj, abstractC1725n, p10, i13);
                return;
            default:
                int p11 = AbstractC1734s.p(i12 | 1);
                A7.b.N((C6205s) obj2, (AbstractC4326r) obj, this.f25752Z, this.f25753h0, abstractC1725n, p11, this.f25755j0);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f25751Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(C6205s c6205s, AbstractC4326r abstractC4326r, boolean z10, boolean z11, int i10, int i11) {
        super(2);
        this.f25756k0 = c6205s;
        this.f25757l0 = abstractC4326r;
        this.f25752Z = z10;
        this.f25753h0 = z11;
        this.f25754i0 = i10;
        this.f25755j0 = i11;
    }
}
