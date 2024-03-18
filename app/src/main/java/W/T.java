package W;

import E.AbstractC0425i;
import E.AbstractC0427k;
import E.AbstractC0429m;
import E.C0424h;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class T extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ E0.d0 f19678Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f19679Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ E0.d0 f19680h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC0425i f19681i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ long f19682j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ E0.d0 f19683k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ E0.P f19684l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ AbstractC0427k f19685m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ int f19686n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ int f19687o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(E0.d0 d0Var, int i10, E0.d0 d0Var2, AbstractC0425i abstractC0425i, long j6, E0.d0 d0Var3, E0.P p10, AbstractC0427k abstractC0427k, int i11, int i12) {
        super(1);
        this.f19678Y = d0Var;
        this.f19679Z = i10;
        this.f19680h0 = d0Var2;
        this.f19681i0 = abstractC0425i;
        this.f19682j0 = j6;
        this.f19683k0 = d0Var3;
        this.f19684l0 = p10;
        this.f19685m0 = abstractC0427k;
        this.f19686n0 = i11;
        this.f19687o0 = i12;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        int i10;
        int h10;
        E0.c0 c0Var = (E0.c0) obj;
        E0.d0 d0Var = this.f19678Y;
        int i11 = d0Var.f4054Z;
        int i12 = this.f19679Z;
        int i13 = 0;
        E0.c0.g(c0Var, d0Var, 0, (i12 - i11) / 2);
        C0424h c0424h = AbstractC0429m.f3911e;
        AbstractC0425i abstractC0425i = this.f19681i0;
        boolean K10 = AbstractC3557B.K(abstractC0425i, c0424h);
        E0.d0 d0Var2 = this.f19680h0;
        E0.d0 d0Var3 = this.f19683k0;
        long j6 = this.f19682j0;
        if (K10) {
            int h11 = Z0.a.h(j6);
            int i14 = d0Var2.f4053Y;
            i10 = (h11 - i14) / 2;
            int i15 = d0Var.f4053Y;
            if (i10 < i15) {
                h10 = i15 - i10;
            } else if (i14 + i10 > Z0.a.h(j6) - d0Var3.f4053Y) {
                h10 = (Z0.a.h(j6) - d0Var3.f4053Y) - (d0Var2.f4053Y + i10);
            }
            i10 += h10;
        } else if (AbstractC3557B.K(abstractC0425i, AbstractC0429m.f3908b)) {
            i10 = (Z0.a.h(j6) - d0Var2.f4053Y) - d0Var3.f4053Y;
        } else {
            i10 = Math.max(this.f19684l0.a0(AbstractC1522a0.f19888d), d0Var.f4053Y);
        }
        AbstractC0427k abstractC0427k = this.f19685m0;
        if (AbstractC3557B.K(abstractC0427k, c0424h)) {
            i13 = (i12 - d0Var2.f4054Z) / 2;
        } else if (AbstractC3557B.K(abstractC0427k, AbstractC0429m.f3910d)) {
            int i16 = this.f19686n0;
            if (i16 == 0) {
                i13 = i12 - d0Var2.f4054Z;
            } else {
                int i17 = d0Var2.f4054Z;
                i13 = (i12 - i17) - Math.max(0, (i16 - i17) + this.f19687o0);
            }
        }
        E0.c0.g(c0Var, d0Var2, i10, i13);
        E0.c0.g(c0Var, d0Var3, Z0.a.h(j6) - d0Var3.f4053Y, (i12 - d0Var3.f4054Z) / 2);
        return jf.y.f36177a;
    }
}
