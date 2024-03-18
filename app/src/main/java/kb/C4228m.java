package kb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.C6209w;

/* renamed from: kb.m  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4228m implements AbstractC4232q {

    /* renamed from: a  reason: collision with root package name */
    public final String f37261a;

    public C4228m(String str) {
        this.f37261a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4228m)) {
            return false;
        }
        if (AbstractC3557B.K(this.f37261a, ((C4228m) obj).f37261a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f37261a.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.A("ImageShare(image=", C6209w.a(this.f37261a), Separators.RPAREN);
    }
}
