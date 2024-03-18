package Lf;

import id.AbstractC3557B;
import kg.C4290b;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final C4290b f11064a;

    /* renamed from: b  reason: collision with root package name */
    public final C4290b f11065b;

    /* renamed from: c  reason: collision with root package name */
    public final C4290b f11066c;

    public c(C4290b c4290b, C4290b c4290b2, C4290b c4290b3) {
        this.f11064a = c4290b;
        this.f11065b = c4290b2;
        this.f11066c = c4290b3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (AbstractC3557B.K(this.f11064a, cVar.f11064a) && AbstractC3557B.K(this.f11065b, cVar.f11065b) && AbstractC3557B.K(this.f11066c, cVar.f11066c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f11065b.hashCode();
        return this.f11066c.hashCode() + ((hashCode + (this.f11064a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PlatformMutabilityMapping(javaClass=" + this.f11064a + ", kotlinReadOnly=" + this.f11065b + ", kotlinMutable=" + this.f11066c + ')';
    }
}
