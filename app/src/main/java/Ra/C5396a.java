package ra;

import Ad.l;
import L0.u;
import Z.AbstractC1725n;
import Z.r;
import jf.y;
import kotlin.jvm.internal.o;
import l0.AbstractC4326r;
import wf.n;

/* renamed from: ra.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5396a extends o implements n {

    /* renamed from: Z  reason: collision with root package name */
    public static final C5396a f44639Z = new C5396a(0);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f44640Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5396a(int i10) {
        super(2);
        this.f44640Y = i10;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        switch (this.f44640Y) {
            case 0:
                u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    r rVar = (r) abstractC1725n;
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
                    r rVar2 = (r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                AbstractC5399d.a(l.W0(null, abstractC1725n, 31), a5, abstractC1725n, 8, 2);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        switch (this.f44640Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
