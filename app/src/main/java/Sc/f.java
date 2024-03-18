package Sc;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import dh.C2695d;
import id.AbstractC3557B;
import java.util.List;
import k6.AbstractC4194d;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* loaded from: classes.dex */
public final class f {
    public static final e Companion = new Object();

    /* renamed from: e  reason: collision with root package name */
    public static final KSerializer[] f16511e = {null, new C2695d(l.f16530a, 0), null, null};

    /* renamed from: a  reason: collision with root package name */
    public final j f16512a;

    /* renamed from: b  reason: collision with root package name */
    public final List f16513b;

    /* renamed from: c  reason: collision with root package name */
    public final n f16514c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f16515d;

    public f(int i10, j jVar, List list, n nVar, boolean z10) {
        if (15 != (i10 & 15)) {
            R4.b.e2(i10, 15, d.f16510b);
            throw null;
        }
        this.f16512a = jVar;
        this.f16513b = list;
        this.f16514c = nVar;
        this.f16515d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (AbstractC3557B.K(this.f16512a, fVar.f16512a) && AbstractC3557B.K(this.f16513b, fVar.f16513b) && AbstractC3557B.K(this.f16514c, fVar.f16514c) && this.f16515d == fVar.f16515d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (this.f16514c.hashCode() + AbstractC4194d.s(this.f16513b, this.f16512a.hashCode() * 31, 31)) * 31;
        if (this.f16515d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "CategoryAndModels(category=" + this.f16512a + ", models=" + this.f16513b + ", defaultModel=" + this.f16514c + ", shouldExpand=" + this.f16515d + Separators.RPAREN;
    }

    public f(j jVar, List list, n nVar, boolean z10) {
        AbstractC3557B.c0("category", jVar);
        AbstractC3557B.c0("defaultModel", nVar);
        this.f16512a = jVar;
        this.f16513b = list;
        this.f16514c = nVar;
        this.f16515d = z10;
    }
}
