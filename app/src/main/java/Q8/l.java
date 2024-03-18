package Q8;

import E0.C0453l;
import Z.AbstractC1725n;
import Z.r;
import id.AbstractC3557B;
import jf.y;
import l0.C4323o;

/* loaded from: classes2.dex */
public final class l extends kotlin.jvm.internal.o implements wf.p {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f14513Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ U3.f f14514Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(U3.f fVar, int i10) {
        super(4);
        this.f14513Y = i10;
        this.f14514Z = fVar;
    }

    public final void a(Z0.b bVar, String str, AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f14513Y;
        U3.f fVar = this.f14514Z;
        switch (i11) {
            case 0:
                AbstractC3557B.c0("$this$$receiver", bVar);
                AbstractC3557B.c0("it", str);
                if ((i10 & 641) == 128) {
                    r rVar = (r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                A7.b.D(0, abstractC1725n, ((R8.k) fVar).f15153g);
                return;
            default:
                AbstractC3557B.c0("$this$$receiver", bVar);
                AbstractC3557B.c0("it", str);
                if ((i10 & 641) == 128) {
                    r rVar2 = (r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                R8.m mVar = (R8.m) fVar;
                p.a(mVar.f15156h, mVar.f15155g, androidx.compose.foundation.layout.e.d(C4323o.f37719b, 1.0f), C0453l.f4075c, abstractC1725n, 3456, 0);
                return;
        }
    }

    @Override // wf.p
    public final /* bridge */ /* synthetic */ Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        y yVar = y.f36177a;
        switch (this.f14513Y) {
            case 0:
                a((Z0.b) obj, (String) obj2, (AbstractC1725n) obj3, ((Number) obj4).intValue());
                return yVar;
            default:
                a((Z0.b) obj, (String) obj2, (AbstractC1725n) obj3, ((Number) obj4).intValue());
                return yVar;
        }
    }
}
