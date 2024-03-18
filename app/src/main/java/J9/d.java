package J9;

import Sc.n;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final n f8897a;

    /* renamed from: b  reason: collision with root package name */
    public final n f8898b;

    /* renamed from: c  reason: collision with root package name */
    public final n f8899c;

    public d(n nVar, n nVar2, n nVar3) {
        this.f8897a = nVar;
        this.f8898b = nVar2;
        this.f8899c = nVar3;
    }

    public final n a() {
        n nVar = this.f8899c;
        if (nVar == null) {
            return this.f8897a;
        }
        return nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (AbstractC3557B.K(this.f8897a, dVar.f8897a) && AbstractC3557B.K(this.f8898b, dVar.f8898b) && AbstractC3557B.K(this.f8899c, dVar.f8899c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        n nVar = this.f8897a;
        if (nVar == null) {
            i10 = 0;
        } else {
            i10 = nVar.hashCode();
        }
        int i13 = i10 * 31;
        n nVar2 = this.f8898b;
        if (nVar2 == null) {
            i11 = 0;
        } else {
            i11 = nVar2.hashCode();
        }
        int i14 = (i13 + i11) * 31;
        n nVar3 = this.f8899c;
        if (nVar3 != null) {
            i12 = nVar3.hashCode();
        }
        return i14 + i12;
    }

    public final String toString() {
        return "ConversationModelState(selectorModel=" + this.f8897a + ", downgradeModel=" + this.f8898b + ", lastUsedModel=" + this.f8899c + Separators.RPAREN;
    }
}
