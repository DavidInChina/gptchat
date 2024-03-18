package o6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import m6.C4564c;

/* renamed from: o6.o  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4936o extends L4.a {

    /* renamed from: j  reason: collision with root package name */
    public final String f40891j;

    /* renamed from: k  reason: collision with root package name */
    public final C4564c f40892k;

    public C4936o(String str) {
        C4564c c4564c = new C4564c();
        this.f40891j = str;
        this.f40892k = c4564c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4936o)) {
            return false;
        }
        C4936o c4936o = (C4936o) obj;
        if (AbstractC3557B.K(this.f40891j, c4936o.f40891j) && AbstractC3557B.K(this.f40892k, c4936o.f40892k)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f40892k.hashCode() + (this.f40891j.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorDropped(viewId=" + this.f40891j + ", eventTime=" + this.f40892k + Separators.RPAREN;
    }

    @Override // L4.a
    public final C4564c v0() {
        return this.f40892k;
    }
}
