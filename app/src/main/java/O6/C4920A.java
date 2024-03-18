package o6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.Map;
import m6.C4564c;
import y.AbstractC6463a;

/* renamed from: o6.A  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4920A extends L4.a {

    /* renamed from: j  reason: collision with root package name */
    public final i6.d f40610j;

    /* renamed from: k  reason: collision with root package name */
    public final String f40611k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f40612l;

    /* renamed from: m  reason: collision with root package name */
    public final Map f40613m;

    /* renamed from: n  reason: collision with root package name */
    public final C4564c f40614n;

    public C4920A(i6.d dVar, String str, boolean z10, Map map, C4564c c4564c) {
        this.f40610j = dVar;
        this.f40611k = str;
        this.f40612l = z10;
        this.f40613m = map;
        this.f40614n = c4564c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4920A)) {
            return false;
        }
        C4920A c4920a = (C4920A) obj;
        if (this.f40610j == c4920a.f40610j && AbstractC3557B.K(this.f40611k, c4920a.f40611k) && this.f40612l == c4920a.f40612l && AbstractC3557B.K(this.f40613m, c4920a.f40613m) && AbstractC3557B.K(this.f40614n, c4920a.f40614n)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int v10 = E9.f.v(this.f40611k, this.f40610j.hashCode() * 31, 31);
        boolean z10 = this.f40612l;
        if (z10) {
            z10 = true;
        }
        int i10 = z10 ? 1 : 0;
        int i11 = z10 ? 1 : 0;
        return this.f40614n.hashCode() + AbstractC6463a.f(this.f40613m, (v10 + i10) * 31, 31);
    }

    public final String toString() {
        return "StartAction(type=" + this.f40610j + ", name=" + this.f40611k + ", waitForStop=" + this.f40612l + ", attributes=" + this.f40613m + ", eventTime=" + this.f40614n + Separators.RPAREN;
    }

    @Override // L4.a
    public final C4564c v0() {
        return this.f40614n;
    }
}
