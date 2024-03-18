package Tc;

import Ng.F;
import W.C1600p3;
import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import f9.C2958j;
import id.AbstractC3557B;
import s3.C5545H;
import wd.EnumC6206t;
import wf.AbstractC6216a;
import x8.W;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final EnumC6206t f17056a;

    /* renamed from: b  reason: collision with root package name */
    public final C5545H f17057b;

    /* renamed from: c  reason: collision with root package name */
    public final C1600p3 f17058c;

    /* renamed from: d  reason: collision with root package name */
    public final p9.s f17059d;

    /* renamed from: e  reason: collision with root package name */
    public final F f17060e;

    public f(EnumC6206t enumC6206t, C5545H c5545h, C1600p3 c1600p3, p9.s sVar, F f6) {
        AbstractC3557B.c0("appType", enumC6206t);
        AbstractC3557B.c0("navController", c5545h);
        AbstractC3557B.c0("snackbarHostState", c1600p3);
        AbstractC3557B.c0("resolver", sVar);
        AbstractC3557B.c0("snackbarScope", f6);
        this.f17056a = enumC6206t;
        this.f17057b = c5545h;
        this.f17058c = c1600p3;
        this.f17059d = sVar;
        this.f17060e = f6;
    }

    public static void b(f fVar, int i10) {
        fVar.getClass();
        AbstractC2469q0.q("duration", 1);
        c(fVar, ((C2958j) fVar.f17059d).a(i10), 1, 12);
    }

    public static /* synthetic */ void c(f fVar, String str, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 1;
        }
        fVar.a(str, i10, null, c.f17047Y);
    }

    public final void a(String str, int i10, String str2, AbstractC6216a abstractC6216a) {
        AbstractC3557B.c0("message", str);
        AbstractC2469q0.q("duration", i10);
        AbstractC3557B.c0("onActionPerformed", abstractC6216a);
        W.M(Pc.e.a(), "Showing snackbar: ".concat(str), null, 6);
        Ad.l.O0(this.f17060e, null, null, new e(this, str, str2, i10, abstractC6216a, null), 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f17056a == fVar.f17056a && AbstractC3557B.K(this.f17057b, fVar.f17057b) && AbstractC3557B.K(this.f17058c, fVar.f17058c) && AbstractC3557B.K(this.f17059d, fVar.f17059d) && AbstractC3557B.K(this.f17060e, fVar.f17060e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f17057b.hashCode();
        int hashCode2 = this.f17058c.hashCode();
        int hashCode3 = this.f17059d.hashCode();
        return this.f17060e.hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + (this.f17056a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AppState(appType=" + this.f17056a + ", navController=" + this.f17057b + ", snackbarHostState=" + this.f17058c + ", resolver=" + this.f17059d + ", snackbarScope=" + this.f17060e + Separators.RPAREN;
    }
}
