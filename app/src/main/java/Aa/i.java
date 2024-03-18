package Aa;

import L0.u;
import W.AbstractC1607r1;
import W.j4;
import Z.AbstractC1725n;
import Z.r;
import jf.y;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.o;
import l0.AbstractC4326r;
import l0.C4323o;
import p9.q;
import wf.n;

/* loaded from: classes.dex */
public final class i extends o implements n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f743Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ e f744Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(e eVar, int i10) {
        super(2);
        this.f743Y = i10;
        this.f744Z = eVar;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        C4323o c4323o = C4323o.f37719b;
        int i11 = this.f743Y;
        e eVar = this.f744Z;
        switch (i11) {
            case 0:
                AbstractC4326r a5 = io.sentry.compose.b.a("ChipInputDecoration");
                if ((i10 & 11) == 2) {
                    r rVar = (r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                j4.b(eVar.f737c, a5, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
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
                Integer num = eVar.f736b;
                if (num != null) {
                    AbstractC1607r1.a(m.F(num.intValue(), abstractC1725n), "", androidx.compose.foundation.layout.e.j(c4323o, q.f42830a), 0L, abstractC1725n, 56, 8);
                    return;
                }
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        switch (this.f743Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
