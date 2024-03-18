package Ab;

import Z.AbstractC1725n;
import jf.y;
import l0.AbstractC4326r;

/* loaded from: classes.dex */
public final class s extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public static final s f779Z = new s(0);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f780Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i10) {
        super(2);
        this.f780Y = i10;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        switch (this.f780Y) {
            case 0:
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                    return;
                }
                return;
            default:
                AbstractC4326r a5 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                K8.d.b(Ad.l.W0(null, abstractC1725n, 31), a5, null, abstractC1725n, 8, 6);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        switch (this.f780Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
