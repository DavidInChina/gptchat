package o6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.Map;
import m6.C4564c;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class D extends L4.a {

    /* renamed from: j  reason: collision with root package name */
    public final i6.d f40623j;

    /* renamed from: k  reason: collision with root package name */
    public final String f40624k = "";

    /* renamed from: l  reason: collision with root package name */
    public final Map f40625l;

    /* renamed from: m  reason: collision with root package name */
    public final C4564c f40626m;

    public D(i6.d dVar, Map map, C4564c c4564c) {
        this.f40623j = dVar;
        this.f40625l = map;
        this.f40626m = c4564c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d10 = (D) obj;
        if (this.f40623j == d10.f40623j && AbstractC3557B.K(this.f40624k, d10.f40624k) && AbstractC3557B.K(this.f40625l, d10.f40625l) && AbstractC3557B.K(this.f40626m, d10.f40626m)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        i6.d dVar = this.f40623j;
        if (dVar == null) {
            i10 = 0;
        } else {
            i10 = dVar.hashCode();
        }
        int i12 = i10 * 31;
        String str = this.f40624k;
        if (str != null) {
            i11 = str.hashCode();
        }
        return this.f40626m.hashCode() + AbstractC6463a.f(this.f40625l, (i12 + i11) * 31, 31);
    }

    public final String toString() {
        return "StopAction(type=" + this.f40623j + ", name=" + this.f40624k + ", attributes=" + this.f40625l + ", eventTime=" + this.f40626m + Separators.RPAREN;
    }

    @Override // L4.a
    public final C4564c v0() {
        return this.f40626m;
    }
}
