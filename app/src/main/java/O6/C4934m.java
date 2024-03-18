package o6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import m6.C4564c;

/* renamed from: o6.m  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4934m extends L4.a {

    /* renamed from: j  reason: collision with root package name */
    public final long f40886j;

    /* renamed from: k  reason: collision with root package name */
    public final String f40887k;

    /* renamed from: l  reason: collision with root package name */
    public final C4564c f40888l;

    public C4934m(long j6, String str) {
        C4564c c4564c = new C4564c();
        this.f40886j = j6;
        this.f40887k = str;
        this.f40888l = c4564c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4934m)) {
            return false;
        }
        C4934m c4934m = (C4934m) obj;
        if (this.f40886j == c4934m.f40886j && AbstractC3557B.K(this.f40887k, c4934m.f40887k) && AbstractC3557B.K(this.f40888l, c4934m.f40888l)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f40886j;
        return this.f40888l.hashCode() + E9.f.v(this.f40887k, ((int) (j6 ^ (j6 >>> 32))) * 31, 31);
    }

    public final String toString() {
        return "AddLongTask(durationNs=" + this.f40886j + ", target=" + this.f40887k + ", eventTime=" + this.f40888l + Separators.RPAREN;
    }

    @Override // L4.a
    public final C4564c v0() {
        return this.f40888l;
    }
}
