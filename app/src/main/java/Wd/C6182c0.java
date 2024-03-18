package wd;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* renamed from: wd.c0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6182c0 implements Comparable<C6182c0> {
    public static final C6180b0 Companion = new Object();

    /* renamed from: Y  reason: collision with root package name */
    public final String f48393Y;

    public /* synthetic */ C6182c0(String str) {
        this.f48393Y = str;
    }

    public static String a(String str) {
        return android.gov.nist.core.a.A("MessageId(value=", str, Separators.RPAREN);
    }

    @Override // java.lang.Comparable
    public final int compareTo(C6182c0 c6182c0) {
        String str = c6182c0.f48393Y;
        AbstractC3557B.c0("other", str);
        return AbstractC6184d0.f48395a.compare(new C6182c0(this.f48393Y), new C6182c0(str));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6182c0)) {
            return false;
        }
        if (!AbstractC3557B.K(this.f48393Y, ((C6182c0) obj).f48393Y)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f48393Y.hashCode();
    }

    public final String toString() {
        return a(this.f48393Y);
    }
}
