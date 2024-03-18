package S8;

import E.g0;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: S8.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1381z {

    /* renamed from: d  reason: collision with root package name */
    public static final C1381z f16398d = new C1381z(null, null, null);

    /* renamed from: a  reason: collision with root package name */
    public final g0 f16399a;

    /* renamed from: b  reason: collision with root package name */
    public final wf.o f16400b;

    /* renamed from: c  reason: collision with root package name */
    public final wf.o f16401c;

    public C1381z(g0 g0Var, wf.o oVar, wf.o oVar2) {
        this.f16399a = g0Var;
        this.f16400b = oVar;
        this.f16401c = oVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1381z)) {
            return false;
        }
        C1381z c1381z = (C1381z) obj;
        if (AbstractC3557B.K(this.f16399a, c1381z.f16399a) && AbstractC3557B.K(this.f16400b, c1381z.f16400b) && AbstractC3557B.K(this.f16401c, c1381z.f16401c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        g0 g0Var = this.f16399a;
        if (g0Var == null) {
            i10 = 0;
        } else {
            i10 = g0Var.hashCode();
        }
        int i13 = i10 * 31;
        wf.o oVar = this.f16400b;
        if (oVar == null) {
            i11 = 0;
        } else {
            i11 = oVar.hashCode();
        }
        int i14 = (i13 + i11) * 31;
        wf.o oVar2 = this.f16401c;
        if (oVar2 != null) {
            i12 = oVar2.hashCode();
        }
        return i14 + i12;
    }

    public final String toString() {
        return "InfoPanelStyle(contentPadding=" + this.f16399a + ", background=" + this.f16400b + ", textStyle=" + this.f16401c + Separators.RPAREN;
    }
}
