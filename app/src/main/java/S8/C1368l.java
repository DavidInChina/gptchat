package S8;

import Z.AbstractC1725n;
import Z.C1737t0;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import d1.AbstractC2581p;
import d1.C2579n;
import id.AbstractC3557B;
import java.util.List;
import xe.AbstractC6435x;

/* renamed from: S8.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1368l extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f16339Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.n f16340Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1368l(wf.n nVar, int i10) {
        super(2);
        this.f16339Y = i10;
        this.f16340Z = nVar;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        AbstractC2581p abstractC2581p;
        Window window;
        int i11 = this.f16339Y;
        wf.n nVar = this.f16340Z;
        switch (i11) {
            case 0:
                if ((i10 & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                nVar.invoke(abstractC1725n, 0);
                return;
            case 1:
                if ((i10 & 11) == 2) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                nVar.invoke(abstractC1725n, 0);
                return;
            case 2:
                if ((i10 & 11) == 2) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                nVar.invoke(abstractC1725n, 0);
                return;
            case 3:
                if ((i10 & 11) == 2) {
                    Z.r rVar4 = (Z.r) abstractC1725n;
                    if (rVar4.B()) {
                        rVar4.P();
                        return;
                    }
                }
                nVar.invoke(abstractC1725n, 0);
                return;
            case 4:
                if ((i10 & 11) == 2) {
                    Z.r rVar5 = (Z.r) abstractC1725n;
                    if (rVar5.B()) {
                        rVar5.P();
                        return;
                    }
                }
                nVar.invoke(abstractC1725n, 0);
                return;
            case 5:
                if ((i10 & 11) == 2) {
                    Z.r rVar6 = (Z.r) abstractC1725n;
                    if (rVar6.B()) {
                        rVar6.P();
                        return;
                    }
                }
                nVar.invoke(abstractC1725n, 0);
                return;
            case 6:
                if ((i10 & 11) == 2) {
                    Z.r rVar7 = (Z.r) abstractC1725n;
                    if (rVar7.B()) {
                        rVar7.P();
                        return;
                    }
                }
                A7.b.l(new C1737t0[]{T8.e.f16963a.b(Boolean.TRUE)}, R4.b.X(abstractC1725n, -1234904101, new C1368l(nVar, 5)), abstractC1725n, 56);
                return;
            case 7:
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar8 = (Z.r) abstractC1725n;
                    if (rVar8.B()) {
                        rVar8.P();
                        return;
                    }
                }
                nVar.invoke(abstractC1725n, 0);
                return;
            case 8:
                L0.u uVar2 = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar9 = (Z.r) abstractC1725n;
                    if (rVar9.B()) {
                        rVar9.P();
                        return;
                    }
                }
                nVar.invoke(abstractC1725n, 0);
                return;
            case 9:
                L0.u uVar3 = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar10 = (Z.r) abstractC1725n;
                    if (rVar10.B()) {
                        rVar10.P();
                        return;
                    }
                }
                Z.r rVar11 = (Z.r) abstractC1725n;
                ViewParent parent = ((View) rVar11.m(H0.Z.f6892f)).getParent();
                if (parent instanceof AbstractC2581p) {
                    abstractC2581p = (AbstractC2581p) parent;
                } else {
                    abstractC2581p = null;
                }
                if (abstractC2581p != null && (window = ((C2579n) abstractC2581p).f27880p0) != null) {
                    window.clearFlags(2);
                }
                nVar.invoke(rVar11, 0);
                return;
            case 10:
                L0.u uVar4 = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar12 = (Z.r) abstractC1725n;
                    if (rVar12.B()) {
                        rVar12.P();
                        return;
                    }
                }
                nVar.invoke(abstractC1725n, 0);
                return;
            default:
                L0.u uVar5 = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar13 = (Z.r) abstractC1725n;
                    if (rVar13.B()) {
                        rVar13.P();
                        return;
                    }
                }
                nVar.invoke(abstractC1725n, 0);
                return;
        }
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        String str;
        jf.y yVar = jf.y.f36177a;
        switch (this.f16339Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 1:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 2:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 3:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 4:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 5:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 6:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 7:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 8:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 9:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 10:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 11:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                String str2 = (String) obj;
                List<String> list = (List) obj2;
                AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str2);
                AbstractC3557B.c0(DiagnosticsEntry.Histogram.VALUES_KEY, list);
                List list2 = AbstractC6435x.f49956a;
                if (!AbstractC3557B.K(SIPHeaderNames.CONTENT_LENGTH, str2) && !AbstractC3557B.K(SIPHeaderNames.CONTENT_TYPE, str2)) {
                    boolean contains = je.l.f36140a.contains(str2);
                    wf.n nVar = this.f16340Z;
                    if (contains) {
                        for (String str3 : list) {
                            nVar.invoke(str2, str3);
                        }
                    } else {
                        if (AbstractC3557B.K("Cookie", str2)) {
                            str = "; ";
                        } else {
                            str = Separators.COMMA;
                        }
                        nVar.invoke(str2, kf.t.m2(list, str, null, null, null, 62));
                    }
                }
                return yVar;
        }
    }
}
