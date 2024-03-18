package Sc;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import dh.C2695d;
import id.AbstractC3557B;
import java.util.List;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* loaded from: classes.dex */
public final class c {
    public static final b Companion = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static final KSerializer[] f16506c = {new C2695d(d.f16509a, 0), null};

    /* renamed from: a  reason: collision with root package name */
    public final List f16507a;

    /* renamed from: b  reason: collision with root package name */
    public final n f16508b;

    public c(int i10, List list, n nVar) {
        if (3 != (i10 & 3)) {
            R4.b.e2(i10, 3, a.f16505b);
            throw null;
        }
        this.f16507a = list;
        this.f16508b = nVar;
    }

    public final n a(String str) {
        AbstractC3557B.c0("slug", str);
        for (f fVar : this.f16507a) {
            for (n nVar : fVar.f16513b) {
                if (AbstractC3557B.K(nVar.f16534b, str)) {
                    return nVar;
                }
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (AbstractC3557B.K(this.f16507a, cVar.f16507a) && AbstractC3557B.K(this.f16508b, cVar.f16508b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f16508b.hashCode() + (this.f16507a.hashCode() * 31);
    }

    public final String toString() {
        return "AvailableModelsAndCategories(categories=" + this.f16507a + ", defaultModel=" + this.f16508b + Separators.RPAREN;
    }

    public c(List list, n nVar) {
        AbstractC3557B.c0("defaultModel", nVar);
        this.f16507a = list;
        this.f16508b = nVar;
    }
}
