package x5;

import E9.f;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.List;

/* renamed from: x5.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6275a extends P4.a {

    /* renamed from: h  reason: collision with root package name */
    public final String f48894h;

    /* renamed from: i  reason: collision with root package name */
    public final Throwable f48895i;

    /* renamed from: j  reason: collision with root package name */
    public final long f48896j;

    /* renamed from: k  reason: collision with root package name */
    public final String f48897k;

    /* renamed from: l  reason: collision with root package name */
    public final String f48898l = "crash";

    /* renamed from: m  reason: collision with root package name */
    public final List f48899m;

    public C6275a(String str, Throwable th2, long j6, String str2, List list) {
        AbstractC3557B.c0("throwable", th2);
        AbstractC3557B.c0("message", str2);
        this.f48894h = str;
        this.f48895i = th2;
        this.f48896j = j6;
        this.f48897k = str2;
        this.f48899m = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6275a)) {
            return false;
        }
        C6275a c6275a = (C6275a) obj;
        if (AbstractC3557B.K(this.f48894h, c6275a.f48894h) && AbstractC3557B.K(this.f48895i, c6275a.f48895i) && this.f48896j == c6275a.f48896j && AbstractC3557B.K(this.f48897k, c6275a.f48897k) && AbstractC3557B.K(this.f48898l, c6275a.f48898l) && AbstractC3557B.K(this.f48899m, c6275a.f48899m)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f48895i.hashCode();
        long j6 = this.f48896j;
        return this.f48899m.hashCode() + f.v(this.f48898l, f.v(this.f48897k, (((hashCode + (this.f48894h.hashCode() * 31)) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31, 31), 31);
    }

    public final String toString() {
        return "Logs(threadName=" + this.f48894h + ", throwable=" + this.f48895i + ", timestamp=" + this.f48896j + ", message=" + this.f48897k + ", loggerName=" + this.f48898l + ", threads=" + this.f48899m + Separators.RPAREN;
    }
}
