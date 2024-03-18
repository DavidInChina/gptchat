package r9;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import l0.AbstractC4326r;
import v0.C5953f;

/* loaded from: classes2.dex */
public final class z extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f44632Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.n f44633Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C5953f f44634h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ long f44635i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f44636j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ int f44637k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ int f44638l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(int i10, wf.n nVar, C5953f c5953f, long j6, AbstractC4326r abstractC4326r, int i11, int i12) {
        super(2);
        this.f44632Y = i10;
        this.f44633Z = nVar;
        this.f44634h0 = c5953f;
        this.f44635i0 = j6;
        this.f44636j0 = abstractC4326r;
        this.f44637k0 = i11;
        this.f44638l0 = i12;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p10 = AbstractC1734s.p(this.f44637k0 | 1);
        long j6 = this.f44635i0;
        AbstractC4326r abstractC4326r = this.f44636j0;
        L4.a.n(this.f44632Y, this.f44633Z, this.f44634h0, j6, abstractC4326r, (AbstractC1725n) obj, p10, this.f44638l0);
        return jf.y.f36177a;
    }
}
