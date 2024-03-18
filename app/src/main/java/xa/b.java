package Xa;

import L0.u;
import W.AbstractC1607r1;
import W.j4;
import Z.AbstractC1725n;
import Z.r;
import androidx.compose.foundation.layout.e;
import cb.C2373n;
import jf.y;
import kotlin.jvm.internal.o;
import l0.AbstractC4326r;
import l0.C4323o;
import p9.q;
import wf.n;

/* loaded from: classes.dex */
public final class b extends o implements n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f21806Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C2373n f21807Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(C2373n c2373n, int i10) {
        super(2);
        this.f21806Y = i10;
        this.f21807Z = c2373n;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        C4323o c4323o = C4323o.f37719b;
        int i11 = this.f21806Y;
        C2373n c2373n = this.f21807Z;
        switch (i11) {
            case 0:
                AbstractC4326r a5 = io.sentry.compose.b.a("GizmoAuthor");
                if ((i10 & 11) == 2) {
                    r rVar = (r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                j4.b(c2373n.f26530b, a5, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            default:
                u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    r rVar2 = (r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                AbstractC1607r1.b(Bi.c.S0(c2373n.f26532d), c2373n.f26530b, e.j(c4323o, q.f42830a), 0L, abstractC1725n, 0, 8);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        switch (this.f21806Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
