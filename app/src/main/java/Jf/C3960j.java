package jf;

import id.AbstractC3557B;
import java.io.Serializable;

/* renamed from: jf.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3960j implements Serializable {

    /* renamed from: Y  reason: collision with root package name */
    public final Throwable f36157Y;

    public C3960j(Throwable th2) {
        AbstractC3557B.c0("exception", th2);
        this.f36157Y = th2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3960j) {
            if (AbstractC3557B.K(this.f36157Y, ((C3960j) obj).f36157Y)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f36157Y.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f36157Y + ')';
    }
}
