package Za;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import dh.C2695d;
import id.AbstractC3557B;
import java.util.List;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* renamed from: Za.c0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1840c0 {
    public static final C1838b0 Companion = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static final KSerializer[] f23544c = {new C2695d(X.f23528a, 0), null};

    /* renamed from: a  reason: collision with root package name */
    public final List f23545a;

    /* renamed from: b  reason: collision with root package name */
    public final String f23546b;

    public C1840c0(int i10, String str, List list) {
        if (3 == (i10 & 3)) {
            this.f23545a = list;
            this.f23546b = str;
            return;
        }
        R4.b.e2(i10, 3, C1836a0.f23537b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1840c0)) {
            return false;
        }
        C1840c0 c1840c0 = (C1840c0) obj;
        if (AbstractC3557B.K(this.f23545a, c1840c0.f23545a) && AbstractC3557B.K(this.f23546b, c1840c0.f23546b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f23545a.hashCode() * 31;
        String str = this.f23546b;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "ApiGizmoSearchResult(items=" + this.f23545a + ", cursor=" + this.f23546b + Separators.RPAREN;
    }
}
