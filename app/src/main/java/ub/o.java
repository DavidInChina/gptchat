package ub;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import ca.AbstractC2318j;
import l0.AbstractC4326r;

/* loaded from: classes2.dex */
public final class o extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f46574Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC2318j f46575Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.k f46576h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f46577i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f46578j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ int f46579k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(AbstractC2318j abstractC2318j, wf.k kVar, AbstractC4326r abstractC4326r, int i10, int i11, int i12) {
        super(2);
        this.f46574Y = i12;
        this.f46575Z = abstractC2318j;
        this.f46576h0 = kVar;
        this.f46577i0 = abstractC4326r;
        this.f46578j0 = i10;
        this.f46579k0 = i11;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f46574Y;
        int i12 = this.f46578j0;
        switch (i11) {
            case 0:
                s.a(this.f46575Z, this.f46576h0, this.f46577i0, abstractC1725n, AbstractC1734s.p(i12 | 1), this.f46579k0);
                return;
            default:
                s.a(this.f46575Z, this.f46576h0, this.f46577i0, abstractC1725n, AbstractC1734s.p(i12 | 1), this.f46579k0);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f46574Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
