package N;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import l0.AbstractC4326r;

/* renamed from: N.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1020d extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ AbstractC1031o f12297Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f12298Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Y0.h f12299h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ boolean f12300i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f12301j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ int f12302k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1020d(AbstractC1031o abstractC1031o, boolean z10, Y0.h hVar, boolean z11, AbstractC4326r abstractC4326r, int i10) {
        super(2);
        this.f12297Y = abstractC1031o;
        this.f12298Z = z10;
        this.f12299h0 = hVar;
        this.f12300i0 = z11;
        this.f12301j0 = abstractC4326r;
        this.f12302k0 = i10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p10 = AbstractC1734s.p(this.f12302k0 | 1);
        boolean z10 = this.f12300i0;
        AbstractC4326r abstractC4326r = this.f12301j0;
        M3.H.h(this.f12297Y, this.f12298Z, this.f12299h0, z10, abstractC4326r, (AbstractC1725n) obj, p10);
        return jf.y.f36177a;
    }
}
