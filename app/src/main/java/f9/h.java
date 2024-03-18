package F9;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import jf.y;

/* loaded from: classes2.dex */
public final class h extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f5083Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Tc.f f5084Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ String f5085h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f5086i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Tc.f fVar, String str, int i10, int i11) {
        super(2);
        this.f5083Y = i11;
        this.f5084Z = fVar;
        this.f5085h0 = str;
        this.f5086i0 = i10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        int i10 = this.f5086i0;
        Tc.f fVar = this.f5084Z;
        String str = this.f5085h0;
        int i11 = this.f5083Y;
        switch (i11) {
            case 0:
                AbstractC1725n abstractC1725n = (AbstractC1725n) obj;
                ((Number) obj2).intValue();
                switch (i11) {
                    case 0:
                        K8.d.h0(fVar, str, abstractC1725n, AbstractC1734s.p(i10 | 1));
                        break;
                    default:
                        A7.b.S(fVar, str, abstractC1725n, AbstractC1734s.p(i10 | 1));
                        break;
                }
                return yVar;
            default:
                AbstractC1725n abstractC1725n2 = (AbstractC1725n) obj;
                ((Number) obj2).intValue();
                switch (i11) {
                    case 0:
                        K8.d.h0(fVar, str, abstractC1725n2, AbstractC1734s.p(i10 | 1));
                        break;
                    default:
                        A7.b.S(fVar, str, abstractC1725n2, AbstractC1734s.p(i10 | 1));
                        break;
                }
                return yVar;
        }
    }
}
