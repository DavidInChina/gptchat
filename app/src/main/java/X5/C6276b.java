package x5;

import E9.f;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.List;

/* renamed from: x5.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6276b extends P4.a {

    /* renamed from: h  reason: collision with root package name */
    public final Throwable f48900h;

    /* renamed from: i  reason: collision with root package name */
    public final String f48901i;

    /* renamed from: j  reason: collision with root package name */
    public final List f48902j;

    public C6276b(String str, Throwable th2, List list) {
        AbstractC3557B.c0("throwable", th2);
        AbstractC3557B.c0("message", str);
        this.f48900h = th2;
        this.f48901i = str;
        this.f48902j = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6276b)) {
            return false;
        }
        C6276b c6276b = (C6276b) obj;
        if (AbstractC3557B.K(this.f48900h, c6276b.f48900h) && AbstractC3557B.K(this.f48901i, c6276b.f48901i) && AbstractC3557B.K(this.f48902j, c6276b.f48902j)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f48902j.hashCode() + f.v(this.f48901i, this.f48900h.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Rum(throwable=" + this.f48900h + ", message=" + this.f48901i + ", threads=" + this.f48902j + Separators.RPAREN;
    }
}
