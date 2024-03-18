package jf;

import id.AbstractC3557B;
import java.io.Serializable;

/* renamed from: jf.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3961k implements Serializable {

    /* renamed from: Y  reason: collision with root package name */
    public final Object f36158Y;

    public /* synthetic */ C3961k(Object obj) {
        this.f36158Y = obj;
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof C3960j) {
            return ((C3960j) obj).f36157Y;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3961k)) {
            return false;
        }
        if (!AbstractC3557B.K(this.f36158Y, ((C3961k) obj).f36158Y)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.f36158Y;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f36158Y;
        if (obj instanceof C3960j) {
            return ((C3960j) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
