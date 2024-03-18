package o6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import m6.C4564c;

/* renamed from: o6.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4930i extends L4.a {

    /* renamed from: j  reason: collision with root package name */
    public final String f40868j;

    /* renamed from: k  reason: collision with root package name */
    public final C4564c f40869k;

    public C4930i(String str) {
        C4564c c4564c = new C4564c();
        this.f40868j = str;
        this.f40869k = c4564c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4930i)) {
            return false;
        }
        C4930i c4930i = (C4930i) obj;
        if (AbstractC3557B.K(this.f40868j, c4930i.f40868j) && AbstractC3557B.K(this.f40869k, c4930i.f40869k)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f40869k.hashCode() + (this.f40868j.hashCode() * 31);
    }

    public final String toString() {
        return "ActionDropped(viewId=" + this.f40868j + ", eventTime=" + this.f40869k + Separators.RPAREN;
    }

    @Override // L4.a
    public final C4564c v0() {
        return this.f40869k;
    }
}
