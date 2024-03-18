package ca;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ca.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2324p extends N {

    /* renamed from: g  reason: collision with root package name */
    public final List f26411g;

    public C2324p(ArrayList arrayList) {
        AbstractC3557B.c0("commands", arrayList);
        this.f26411g = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2324p) && AbstractC3557B.K(this.f26411g, ((C2324p) obj).f26411g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f26411g.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.o(new StringBuilder("Browsing(commands="), this.f26411g, Separators.RPAREN);
    }
}
