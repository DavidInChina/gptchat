package B6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.LinkedHashMap;
import java.util.Map;
import x6.R1;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: e  reason: collision with root package name */
    public static final R1 f1945e = new R1(15, 0);

    /* renamed from: f  reason: collision with root package name */
    public static final String[] f1946f = {"type", "status", "message"};

    /* renamed from: a  reason: collision with root package name */
    public final String f1947a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f1948b;

    /* renamed from: c  reason: collision with root package name */
    public final String f1949c = "log";

    /* renamed from: d  reason: collision with root package name */
    public final String f1950d = "debug";

    public l(String str, LinkedHashMap linkedHashMap) {
        AbstractC3557B.c0("message", str);
        this.f1947a = str;
        this.f1948b = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (AbstractC3557B.K(this.f1947a, lVar.f1947a) && AbstractC3557B.K(this.f1948b, lVar.f1948b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1948b.hashCode() + (this.f1947a.hashCode() * 31);
    }

    public final String toString() {
        return "Telemetry(message=" + this.f1947a + ", additionalProperties=" + this.f1948b + Separators.RPAREN;
    }
}
