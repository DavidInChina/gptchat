package o6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import m6.C4564c;

/* renamed from: o6.s  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4939s extends L4.a {

    /* renamed from: j  reason: collision with root package name */
    public final String f40899j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f40900k;

    /* renamed from: l  reason: collision with root package name */
    public final C4564c f40901l;

    public C4939s(String str, boolean z10) {
        C4564c c4564c = new C4564c();
        this.f40899j = str;
        this.f40900k = z10;
        this.f40901l = c4564c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4939s)) {
            return false;
        }
        C4939s c4939s = (C4939s) obj;
        if (AbstractC3557B.K(this.f40899j, c4939s.f40899j) && this.f40900k == c4939s.f40900k && AbstractC3557B.K(this.f40901l, c4939s.f40901l)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f40899j.hashCode() * 31;
        boolean z10 = this.f40900k;
        if (z10) {
            z10 = true;
        }
        int i10 = z10 ? 1 : 0;
        int i11 = z10 ? 1 : 0;
        return this.f40901l.hashCode() + ((hashCode + i10) * 31);
    }

    public final String toString() {
        return "LongTaskSent(viewId=" + this.f40899j + ", isFrozenFrame=" + this.f40900k + ", eventTime=" + this.f40901l + Separators.RPAREN;
    }

    @Override // L4.a
    public final C4564c v0() {
        return this.f40901l;
    }
}
