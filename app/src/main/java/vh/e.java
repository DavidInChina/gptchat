package vh;

import android.gov.nist.core.Separators;
import yh.l1;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f47541a;

    /* renamed from: b  reason: collision with root package name */
    public final l1 f47542b;

    /* renamed from: c  reason: collision with root package name */
    public transient /* synthetic */ int f47543c;

    public e(String str, l1 l1Var) {
        this.f47541a = str;
        this.f47542b = l1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f47541a.equals(eVar.f47541a) && this.f47542b.equals(eVar.f47542b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        if (this.f47543c != 0) {
            i10 = 0;
        } else {
            i10 = (this.f47541a.hashCode() * 31) + this.f47542b.hashCode();
        }
        if (i10 == 0) {
            return this.f47543c;
        }
        this.f47543c = i10;
        return i10;
    }

    public final String toString() {
        return this.f47542b + Separators.SP + this.f47541a;
    }
}
