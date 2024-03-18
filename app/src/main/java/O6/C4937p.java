package o6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import m6.C4564c;

/* renamed from: o6.p  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4937p extends L4.a {

    /* renamed from: j  reason: collision with root package name */
    public final String f40893j;

    /* renamed from: k  reason: collision with root package name */
    public final C4564c f40894k;

    public C4937p(String str) {
        C4564c c4564c = new C4564c();
        this.f40893j = str;
        this.f40894k = c4564c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4937p)) {
            return false;
        }
        C4937p c4937p = (C4937p) obj;
        if (AbstractC3557B.K(this.f40893j, c4937p.f40893j) && AbstractC3557B.K(this.f40894k, c4937p.f40894k)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f40894k.hashCode() + (this.f40893j.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorSent(viewId=" + this.f40893j + ", eventTime=" + this.f40894k + Separators.RPAREN;
    }

    @Override // L4.a
    public final C4564c v0() {
        return this.f40894k;
    }
}
