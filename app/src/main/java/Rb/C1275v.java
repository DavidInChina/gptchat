package Rb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.Map;

/* renamed from: Rb.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1275v implements AbstractC1279z {

    /* renamed from: a  reason: collision with root package name */
    public final C1272s f15373a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15374b;

    /* renamed from: c  reason: collision with root package name */
    public final String f15375c;

    /* renamed from: d  reason: collision with root package name */
    public final Map f15376d;

    public C1275v(C1272s c1272s, String str, String str2, Map map) {
        AbstractC3557B.c0("contentId", c1272s);
        AbstractC3557B.c0("reasonId", str);
        AbstractC3557B.c0("collectedAdditionalFields", map);
        this.f15373a = c1272s;
        this.f15374b = str;
        this.f15375c = str2;
        this.f15376d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1275v)) {
            return false;
        }
        C1275v c1275v = (C1275v) obj;
        if (AbstractC3557B.K(this.f15373a, c1275v.f15373a) && AbstractC3557B.K(this.f15374b, c1275v.f15374b) && AbstractC3557B.K(this.f15375c, c1275v.f15375c) && AbstractC3557B.K(this.f15376d, c1275v.f15376d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int v10 = E9.f.v(this.f15374b, this.f15373a.hashCode() * 31, 31);
        String str = this.f15375c;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        return this.f15376d.hashCode() + ((v10 + i10) * 31);
    }

    public final String toString() {
        return "ReportContent(contentId=" + this.f15373a + ", reasonId=" + this.f15374b + ", description=" + this.f15375c + ", collectedAdditionalFields=" + this.f15376d + Separators.RPAREN;
    }
}
