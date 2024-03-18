package ic;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: ic.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3551v implements Ad.s {

    /* renamed from: a  reason: collision with root package name */
    public final Boolean f33066a;

    /* renamed from: b  reason: collision with root package name */
    public final Ba.c f33067b;

    public C3551v(Boolean bool, Ba.c cVar) {
        this.f33066a = bool;
        this.f33067b = cVar;
    }

    public static C3551v e(C3551v c3551v, Boolean bool, Ba.c cVar, int i10) {
        if ((i10 & 1) != 0) {
            bool = c3551v.f33066a;
        }
        if ((i10 & 2) != 0) {
            cVar = c3551v.f33067b;
        }
        c3551v.getClass();
        return new C3551v(bool, cVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3551v)) {
            return false;
        }
        C3551v c3551v = (C3551v) obj;
        if (AbstractC3557B.K(this.f33066a, c3551v.f33066a) && AbstractC3557B.K(this.f33067b, c3551v.f33067b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        Boolean bool = this.f33066a;
        if (bool == null) {
            i10 = 0;
        } else {
            i10 = bool.hashCode();
        }
        int i12 = i10 * 31;
        Ba.c cVar = this.f33067b;
        if (cVar != null) {
            i11 = cVar.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        return "MemorySettingsState(memoryActive=" + this.f33066a + ", customInstructions=" + this.f33067b + Separators.RPAREN;
    }
}
