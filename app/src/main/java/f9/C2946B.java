package f9;

import Z.AbstractC1725n;
import Z.AbstractC1734s;

/* renamed from: f9.B  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2946B extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f29763Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ String f29764Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.n f29765h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f29766i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2946B(String str, wf.n nVar, int i10, int i11) {
        super(2);
        this.f29763Y = i11;
        this.f29764Z = str;
        this.f29765h0 = nVar;
        this.f29766i0 = i10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f29766i0;
        String str = this.f29764Z;
        wf.n nVar = this.f29765h0;
        int i11 = this.f29763Y;
        switch (i11) {
            case 0:
                AbstractC1725n abstractC1725n = (AbstractC1725n) obj;
                ((Number) obj2).intValue();
                switch (i11) {
                    case 0:
                        K8.d.K(str, nVar, abstractC1725n, AbstractC1734s.p(i10 | 1));
                        break;
                    default:
                        K8.d.K(str, nVar, abstractC1725n, AbstractC1734s.p(i10 | 1));
                        break;
                }
                return yVar;
            default:
                AbstractC1725n abstractC1725n2 = (AbstractC1725n) obj;
                ((Number) obj2).intValue();
                switch (i11) {
                    case 0:
                        K8.d.K(str, nVar, abstractC1725n2, AbstractC1734s.p(i10 | 1));
                        break;
                    default:
                        K8.d.K(str, nVar, abstractC1725n2, AbstractC1734s.p(i10 | 1));
                        break;
                }
                return yVar;
        }
    }
}
