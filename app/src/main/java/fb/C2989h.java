package fb;

import W.AbstractC1522a0;
import W.C1568j1;
import W.n4;
import Z.AbstractC1725n;
import Z.r;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import ec.AbstractC2853e;
import ec.C2873y;
import fc.AbstractC3009d;
import id.AbstractC3557B;
import jf.y;
import l0.AbstractC4326r;
import lc.AbstractC4407f;
import lc.C4393Q;
import wf.p;

/* renamed from: fb.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2989h extends kotlin.jvm.internal.o implements p {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f30092Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ n4 f30093Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Tc.f f30094h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2989h(C1568j1 c1568j1, Tc.f fVar, int i10) {
        super(4);
        this.f30092Y = i10;
        this.f30093Z = c1568j1;
        this.f30094h0 = fVar;
    }

    @Override // wf.p
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        y yVar = y.f36177a;
        int i10 = this.f30092Y;
        Tc.f fVar = this.f30094h0;
        switch (i10) {
            case 0:
                AbstractC1725n abstractC1725n = (AbstractC1725n) obj3;
                int intValue = ((Number) obj4).intValue();
                AbstractC3557B.c0("$anonymous$parameter$0$", (C2996o) obj);
                AbstractC3557B.c0("$anonymous$parameter$1$", (wf.k) obj2);
                AbstractC4326r a5 = io.sentry.compose.b.a("LicensesScreen");
                if ((intValue & 641) == 128) {
                    r rVar = (r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return yVar;
                    }
                }
                AbstractC1522a0.b(AbstractC2983b.f30087a, a5, AbstractC2469q0.g(fVar, 9, abstractC1725n, 639026767), null, null, null, this.f30093Z, abstractC1725n, 390, 58);
                return yVar;
            case 1:
                AbstractC1725n abstractC1725n2 = (AbstractC1725n) obj3;
                int intValue2 = ((Number) obj4).intValue();
                AbstractC3557B.c0("$anonymous$parameter$0$", (dc.g) obj);
                AbstractC3557B.c0("$anonymous$parameter$1$", (wf.k) obj2);
                AbstractC4326r a10 = io.sentry.compose.b.a("BetaSettingsScreen");
                if ((intValue2 & 641) == 128) {
                    r rVar2 = (r) abstractC1725n2;
                    if (rVar2.B()) {
                        rVar2.P();
                        return yVar;
                    }
                }
                AbstractC1522a0.b(dc.n.f28215a, a10, AbstractC2469q0.g(fVar, 11, abstractC1725n2, -638749549), null, null, null, this.f30093Z, abstractC1725n2, 390, 58);
                return yVar;
            case 2:
                AbstractC1725n abstractC1725n3 = (AbstractC1725n) obj3;
                ((Number) obj4).intValue();
                AbstractC3557B.c0("$anonymous$parameter$0$", (C2873y) obj);
                AbstractC3557B.c0("$anonymous$parameter$1$", (wf.k) obj2);
                AbstractC1522a0.b(AbstractC2853e.f29211a, io.sentry.compose.b.a("DataControlsScreen"), AbstractC2469q0.g(fVar, 12, abstractC1725n3, -1773232481), null, null, null, this.f30093Z, abstractC1725n3, 390, 58);
                return yVar;
            case 3:
                AbstractC1725n abstractC1725n4 = (AbstractC1725n) obj3;
                int intValue3 = ((Number) obj4).intValue();
                AbstractC3557B.c0("$anonymous$parameter$0$", (fc.y) obj);
                AbstractC3557B.c0("$anonymous$parameter$1$", (wf.k) obj2);
                AbstractC4326r a11 = io.sentry.compose.b.a("DeveloperSettingsScreen");
                if ((intValue3 & 641) == 128) {
                    r rVar3 = (r) abstractC1725n4;
                    if (rVar3.B()) {
                        rVar3.P();
                        return yVar;
                    }
                }
                AbstractC1522a0.b(AbstractC3009d.f30182a, a11, AbstractC2469q0.g(fVar, 13, abstractC1725n4, 1862247021), null, null, null, this.f30093Z, abstractC1725n4, 390, 58);
                return yVar;
            default:
                AbstractC1725n abstractC1725n5 = (AbstractC1725n) obj3;
                ((Number) obj4).intValue();
                AbstractC3557B.c0("$anonymous$parameter$0$", (C4393Q) obj);
                AbstractC3557B.c0("$anonymous$parameter$1$", (wf.k) obj2);
                AbstractC1522a0.d(AbstractC4407f.f38235a, io.sentry.compose.b.a("SettingsScreen"), AbstractC2469q0.g(fVar, 19, abstractC1725n5, 1109520300), null, null, null, this.f30093Z, abstractC1725n5, 390, 58);
                return yVar;
        }
    }
}
