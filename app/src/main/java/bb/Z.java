package bb;

import Z.AbstractC1725n;
import Z.AbstractC1734s;

/* loaded from: classes.dex */
public final class Z extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f25761Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ H0 f25762Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.k f25763h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f25764i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Z(H0 h02, wf.k kVar, int i10, int i11) {
        super(2);
        this.f25761Y = i11;
        this.f25762Z = h02;
        this.f25763h0 = kVar;
        this.f25764i0 = i10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f25764i0;
        H0 h02 = this.f25762Z;
        wf.k kVar = this.f25763h0;
        int i11 = this.f25761Y;
        switch (i11) {
            case 0:
                AbstractC1725n abstractC1725n = (AbstractC1725n) obj;
                ((Number) obj2).intValue();
                switch (i11) {
                    case 0:
                        L4.a.I(h02, kVar, abstractC1725n, AbstractC1734s.p(i10 | 1));
                        break;
                    default:
                        L4.a.I(h02, kVar, abstractC1725n, AbstractC1734s.p(i10 | 1));
                        break;
                }
                return yVar;
            default:
                AbstractC1725n abstractC1725n2 = (AbstractC1725n) obj;
                ((Number) obj2).intValue();
                switch (i11) {
                    case 0:
                        L4.a.I(h02, kVar, abstractC1725n2, AbstractC1734s.p(i10 | 1));
                        break;
                    default:
                        L4.a.I(h02, kVar, abstractC1725n2, AbstractC1734s.p(i10 | 1));
                        break;
                }
                return yVar;
        }
    }
}
