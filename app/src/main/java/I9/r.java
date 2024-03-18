package I9;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import l0.AbstractC4326r;
import na.AbstractC4778o0;

/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f8434Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.k f8435Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f8436h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f8437i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f8438j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(wf.k kVar, AbstractC4326r abstractC4326r, int i10, int i11, int i12) {
        super(2);
        this.f8434Y = i12;
        this.f8435Z = kVar;
        this.f8436h0 = abstractC4326r;
        this.f8437i0 = i10;
        this.f8438j0 = i11;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f8434Y;
        AbstractC4326r abstractC4326r = this.f8436h0;
        wf.k kVar = this.f8435Z;
        int i12 = this.f8438j0;
        int i13 = this.f8437i0;
        switch (i11) {
            case 0:
                L4.a.F(kVar, abstractC4326r, abstractC1725n, AbstractC1734s.p(i13 | 1), i12);
                return;
            case 1:
                L4.a.N(kVar, abstractC4326r, abstractC1725n, AbstractC1734s.p(i13 | 1), i12);
                return;
            default:
                AbstractC4778o0.c(kVar, abstractC4326r, abstractC1725n, AbstractC1734s.p(i13 | 1), i12);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f8434Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 1:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
