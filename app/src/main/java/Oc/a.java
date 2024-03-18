package Oc;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import jf.y;
import kotlin.jvm.internal.o;
import wf.n;

/* loaded from: classes2.dex */
public final class a extends o implements n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f13675Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ String f13676Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ boolean f13677h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f13678i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10, int i11, String str, boolean z10) {
        super(2);
        this.f13675Y = i11;
        this.f13676Z = str;
        this.f13677h0 = z10;
        this.f13678i0 = i10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        int i10 = this.f13678i0;
        String str = this.f13676Z;
        boolean z10 = this.f13677h0;
        int i11 = this.f13675Y;
        switch (i11) {
            case 0:
                AbstractC1725n abstractC1725n = (AbstractC1725n) obj;
                ((Number) obj2).intValue();
                switch (i11) {
                    case 0:
                        L4.a.r(str, z10, abstractC1725n, AbstractC1734s.p(i10 | 1));
                        break;
                    default:
                        L4.a.r(str, z10, abstractC1725n, AbstractC1734s.p(i10 | 1));
                        break;
                }
                return yVar;
            default:
                AbstractC1725n abstractC1725n2 = (AbstractC1725n) obj;
                ((Number) obj2).intValue();
                switch (i11) {
                    case 0:
                        L4.a.r(str, z10, abstractC1725n2, AbstractC1734s.p(i10 | 1));
                        break;
                    default:
                        L4.a.r(str, z10, abstractC1725n2, AbstractC1734s.p(i10 | 1));
                        break;
                }
                return yVar;
        }
    }
}
