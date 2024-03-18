package e2;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import jf.y;
import nf.AbstractC4828h;
import wf.AbstractC6216a;
import x8.W;

/* renamed from: e2.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2789u extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f28793Y = 1;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f28794Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ int f28795h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f28796i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2789u(int i10, int i11, AbstractC6216a abstractC6216a) {
        super(2);
        this.f28794Z = i10;
        this.f28796i0 = abstractC6216a;
        this.f28795h0 = i11;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        Object obj3 = this.f28796i0;
        int i10 = this.f28795h0;
        int i11 = this.f28794Z;
        int i12 = this.f28793Y;
        switch (i12) {
            case 0:
                AbstractC1725n abstractC1725n = (AbstractC1725n) obj;
                ((Number) obj2).intValue();
                switch (i12) {
                    case 0:
                        AbstractC4828h.k((X1.m) obj3, abstractC1725n, i11 | 1, i10);
                        break;
                    default:
                        W.g(i11, (AbstractC6216a) obj3, abstractC1725n, AbstractC1734s.p(i10 | 1));
                        break;
                }
                return yVar;
            default:
                AbstractC1725n abstractC1725n2 = (AbstractC1725n) obj;
                ((Number) obj2).intValue();
                switch (i12) {
                    case 0:
                        AbstractC4828h.k((X1.m) obj3, abstractC1725n2, i11 | 1, i10);
                        break;
                    default:
                        W.g(i11, (AbstractC6216a) obj3, abstractC1725n2, AbstractC1734s.p(i10 | 1));
                        break;
                }
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2789u(X1.m mVar, int i10, int i11) {
        super(2);
        this.f28796i0 = mVar;
        this.f28794Z = i10;
        this.f28795h0 = i11;
    }
}
