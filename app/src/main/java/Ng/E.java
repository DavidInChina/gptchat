package Ng;

import id.AbstractC3557B;
import nf.AbstractC4821a;

/* loaded from: classes.dex */
public final class E extends AbstractC4821a {

    /* renamed from: Z  reason: collision with root package name */
    public static final P5.c f12865Z = new Object();

    /* renamed from: Y  reason: collision with root package name */
    public final String f12866Y;

    public E(String str) {
        super(f12865Z);
        this.f12866Y = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof E) && AbstractC3557B.K(this.f12866Y, ((E) obj).f12866Y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f12866Y.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.n(new StringBuilder("CoroutineName("), this.f12866Y, ')');
    }
}
