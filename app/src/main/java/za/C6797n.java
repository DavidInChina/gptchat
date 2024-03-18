package za;

import Jc.E;
import android.gov.nist.core.Separators;
import android.net.Uri;
import id.AbstractC3557B;

/* renamed from: za.n  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6797n implements AbstractC6806w {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f51794a;

    /* renamed from: b  reason: collision with root package name */
    public final E f51795b;

    public C6797n(Uri uri, E e10) {
        AbstractC3557B.c0("file", uri);
        AbstractC3557B.c0("useCase", e10);
        this.f51794a = uri;
        this.f51795b = e10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6797n)) {
            return false;
        }
        C6797n c6797n = (C6797n) obj;
        if (AbstractC3557B.K(this.f51794a, c6797n.f51794a) && this.f51795b == c6797n.f51795b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f51795b.hashCode() + (this.f51794a.hashCode() * 31);
    }

    public final String toString() {
        return "FileRetry(file=" + this.f51794a + ", useCase=" + this.f51795b + Separators.RPAREN;
    }
}
