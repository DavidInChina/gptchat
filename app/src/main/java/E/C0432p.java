package E;

import L.AbstractC0844e;
import Z.AbstractC1725n;
import Z.AbstractC1734s;
import l0.AbstractC4326r;

/* renamed from: E.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0432p extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f3934Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f3935Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ int f3936h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0432p(AbstractC4326r abstractC4326r, int i10, int i11) {
        super(2);
        this.f3934Y = i11;
        this.f3935Z = abstractC4326r;
        this.f3936h0 = i10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f3936h0;
        AbstractC4326r abstractC4326r = this.f3935Z;
        int i11 = this.f3934Y;
        switch (i11) {
            case 0:
                AbstractC1725n abstractC1725n = (AbstractC1725n) obj;
                ((Number) obj2).intValue();
                switch (i11) {
                    case 0:
                        AbstractC0434s.a(abstractC4326r, abstractC1725n, AbstractC1734s.p(i10 | 1));
                        break;
                    default:
                        AbstractC0844e.b(abstractC4326r, abstractC1725n, AbstractC1734s.p(i10 | 1));
                        break;
                }
                return yVar;
            default:
                AbstractC1725n abstractC1725n2 = (AbstractC1725n) obj;
                ((Number) obj2).intValue();
                switch (i11) {
                    case 0:
                        AbstractC0434s.a(abstractC4326r, abstractC1725n2, AbstractC1734s.p(i10 | 1));
                        break;
                    default:
                        AbstractC0844e.b(abstractC4326r, abstractC1725n2, AbstractC1734s.p(i10 | 1));
                        break;
                }
                return yVar;
        }
    }
}
