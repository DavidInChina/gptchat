package G9;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import jf.y;
import na.D0;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class h extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f6127Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f6128Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ int f6129h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i10, int i11, AbstractC6216a abstractC6216a) {
        super(2);
        this.f6127Y = i11;
        this.f6128Z = abstractC6216a;
        this.f6129h0 = i10;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f6127Y;
        AbstractC6216a abstractC6216a = this.f6128Z;
        int i12 = this.f6129h0;
        switch (i11) {
            case 0:
                A7.b.R(abstractC6216a, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
            case 1:
                D0.c(abstractC6216a, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
            case 2:
                L4.a.c(abstractC6216a, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
            default:
                R4.b.u(abstractC6216a, abstractC1725n, AbstractC1734s.p(i12 | 1));
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        switch (this.f6127Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 1:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 2:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
