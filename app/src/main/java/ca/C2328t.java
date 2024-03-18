package ca;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.N;
import fa.EnumC2970G;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ca.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2328t extends N {

    /* renamed from: g  reason: collision with root package name */
    public final EnumC2970G f26419g;

    /* renamed from: h  reason: collision with root package name */
    public final List f26420h;

    public C2328t(EnumC2970G enumC2970G, ArrayList arrayList) {
        AbstractC3557B.c0("recipientTool", enumC2970G);
        AbstractC3557B.c0("output", arrayList);
        this.f26419g = enumC2970G;
        this.f26420h = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2328t)) {
            return false;
        }
        C2328t c2328t = (C2328t) obj;
        if (this.f26419g == c2328t.f26419g && AbstractC3557B.K(this.f26420h, c2328t.f26420h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f26420h.hashCode() + (this.f26419g.hashCode() * 31);
    }

    public final String toString() {
        return "Default(recipientTool=" + this.f26419g + ", output=" + this.f26420h + Separators.RPAREN;
    }
}
