package W;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import l0.AbstractC4326r;

/* renamed from: W.d1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1538d1 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f19996Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f19997Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ float f19998h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ long f19999i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f20000j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ int f20001k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1538d1(AbstractC4326r abstractC4326r, float f6, long j6, int i10, int i11, int i12) {
        super(2);
        this.f19996Y = i12;
        this.f19997Z = abstractC4326r;
        this.f19998h0 = f6;
        this.f19999i0 = j6;
        this.f20000j0 = i10;
        this.f20001k0 = i11;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f19996Y;
        int i12 = this.f20000j0;
        switch (i11) {
            case 0:
                int p10 = AbstractC1734s.p(i12 | 1);
                U3.f.c(this.f19997Z, this.f19998h0, this.f19999i0, abstractC1725n, p10, this.f20001k0);
                return;
            default:
                int p11 = AbstractC1734s.p(i12 | 1);
                U3.f.f(this.f19997Z, this.f19998h0, this.f19999i0, abstractC1725n, p11, this.f20001k0);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f19996Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
