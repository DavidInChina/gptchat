package Rc;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import dh.C2695d;
import dh.u0;
import id.AbstractC3557B;
import java.util.List;
import k6.AbstractC4194d;
import kotlinx.serialization.KSerializer;
import wd.C6190g0;

@AbstractC1998i
/* loaded from: classes.dex */
public final class l {
    public static final k Companion = new Object();

    /* renamed from: h  reason: collision with root package name */
    public static final KSerializer[] f15407h;

    /* renamed from: a  reason: collision with root package name */
    public final String f15408a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15409b;

    /* renamed from: c  reason: collision with root package name */
    public final String f15410c;

    /* renamed from: d  reason: collision with root package name */
    public final String f15411d;

    /* renamed from: e  reason: collision with root package name */
    public final List f15412e;

    /* renamed from: f  reason: collision with root package name */
    public final List f15413f;

    /* renamed from: g  reason: collision with root package name */
    public final o f15414g;

    /* JADX WARN: Type inference failed for: r2v0, types: [Rc.k, java.lang.Object] */
    static {
        u0 u0Var = u0.f28491a;
        f15407h = new KSerializer[]{null, null, null, null, new C2695d(u0Var, 0), new C2695d(u0Var, 0), null};
    }

    public l(int i10, String str, int i11, String str2, String str3, List list, List list2, o oVar) {
        if (31 == (i10 & 31)) {
            this.f15408a = str;
            this.f15409b = i11;
            this.f15410c = str2;
            this.f15411d = str3;
            this.f15412e = list;
            if ((i10 & 32) == 0) {
                this.f15413f = null;
            } else {
                this.f15413f = list2;
            }
            if ((i10 & 64) == 0) {
                this.f15414g = null;
                return;
            } else {
                this.f15414g = oVar;
                return;
            }
        }
        R4.b.e2(i10, 31, j.f15406b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (AbstractC3557B.K(this.f15408a, lVar.f15408a) && this.f15409b == lVar.f15409b && AbstractC3557B.K(this.f15410c, lVar.f15410c) && AbstractC3557B.K(this.f15411d, lVar.f15411d) && AbstractC3557B.K(this.f15412e, lVar.f15412e) && AbstractC3557B.K(this.f15413f, lVar.f15413f) && AbstractC3557B.K(this.f15414g, lVar.f15414g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int s10 = AbstractC4194d.s(this.f15412e, E9.f.v(this.f15411d, E9.f.v(this.f15410c, ((this.f15408a.hashCode() * 31) + this.f15409b) * 31, 31), 31), 31);
        int i11 = 0;
        List list = this.f15413f;
        if (list == null) {
            i10 = 0;
        } else {
            i10 = list.hashCode();
        }
        int i12 = (s10 + i10) * 31;
        o oVar = this.f15414g;
        if (oVar != null) {
            i11 = oVar.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        StringBuilder s10 = android.gov.nist.core.a.s("ModelsResponseModel(slug=", C6190g0.b(this.f15408a), ", maxTokens=");
        s10.append(this.f15409b);
        s10.append(", title=");
        s10.append(this.f15410c);
        s10.append(", description=");
        s10.append(this.f15411d);
        s10.append(", tags=");
        s10.append(this.f15412e);
        s10.append(", enabledTools=");
        s10.append(this.f15413f);
        s10.append(", productFeatures=");
        s10.append(this.f15414g);
        s10.append(Separators.RPAREN);
        return s10.toString();
    }
}
