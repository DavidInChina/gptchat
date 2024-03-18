package ca;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.List;
import jf.C3959i;

/* renamed from: ca.r  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2326r extends N {

    /* renamed from: g  reason: collision with root package name */
    public final C3959i f26413g;

    /* renamed from: h  reason: collision with root package name */
    public final List f26414h;

    /* renamed from: i  reason: collision with root package name */
    public final fa.q f26415i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f26416j;

    public C2326r(C3959i c3959i, List list, fa.q qVar, boolean z10) {
        AbstractC3557B.c0("size", c3959i);
        this.f26413g = c3959i;
        this.f26414h = list;
        this.f26415i = qVar;
        this.f26416j = z10;
    }

    public static C2326r H0(C2326r c2326r, fa.q qVar, boolean z10, int i10) {
        C3959i c3959i = c2326r.f26413g;
        List list = c2326r.f26414h;
        if ((i10 & 8) != 0) {
            z10 = c2326r.f26416j;
        }
        c2326r.getClass();
        AbstractC3557B.c0("size", c3959i);
        return new C2326r(c3959i, list, qVar, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2326r)) {
            return false;
        }
        C2326r c2326r = (C2326r) obj;
        if (AbstractC3557B.K(this.f26413g, c2326r.f26413g) && AbstractC3557B.K(this.f26414h, c2326r.f26414h) && AbstractC3557B.K(this.f26415i, c2326r.f26415i) && this.f26416j == c2326r.f26416j) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int hashCode = this.f26413g.hashCode() * 31;
        int i12 = 0;
        List list = this.f26414h;
        if (list == null) {
            i10 = 0;
        } else {
            i10 = list.hashCode();
        }
        int i13 = (hashCode + i10) * 31;
        fa.q qVar = this.f26415i;
        if (qVar != null) {
            i12 = qVar.f30075b.hashCode();
        }
        int i14 = (i13 + i12) * 31;
        if (this.f26416j) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        return i14 + i11;
    }

    public final String toString() {
        return "Dalle(size=" + this.f26413g + ", prompts=" + this.f26414h + ", multimodal=" + this.f26415i + ", imagesReady=" + this.f26416j + Separators.RPAREN;
    }
}
