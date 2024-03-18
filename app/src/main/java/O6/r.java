package o6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import m6.C4564c;

/* loaded from: classes2.dex */
public final class r extends L4.a {

    /* renamed from: j  reason: collision with root package name */
    public final String f40896j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f40897k;

    /* renamed from: l  reason: collision with root package name */
    public final C4564c f40898l;

    public r(String str, boolean z10) {
        C4564c c4564c = new C4564c();
        this.f40896j = str;
        this.f40897k = z10;
        this.f40898l = c4564c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (AbstractC3557B.K(this.f40896j, rVar.f40896j) && this.f40897k == rVar.f40897k && AbstractC3557B.K(this.f40898l, rVar.f40898l)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f40896j.hashCode() * 31;
        boolean z10 = this.f40897k;
        if (z10) {
            z10 = true;
        }
        int i10 = z10 ? 1 : 0;
        int i11 = z10 ? 1 : 0;
        return this.f40898l.hashCode() + ((hashCode + i10) * 31);
    }

    public final String toString() {
        return "LongTaskDropped(viewId=" + this.f40896j + ", isFrozenFrame=" + this.f40897k + ", eventTime=" + this.f40898l + Separators.RPAREN;
    }

    @Override // L4.a
    public final C4564c v0() {
        return this.f40898l;
    }
}
