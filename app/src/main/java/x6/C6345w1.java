package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.Map;

/* renamed from: x6.w1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6345w1 {

    /* renamed from: a  reason: collision with root package name */
    public final Map f49468a;

    public C6345w1(Map map) {
        AbstractC3557B.c0("additionalProperties", map);
        this.f49468a = map;
    }

    public final I8.u a() {
        I8.u uVar = new I8.u();
        for (Map.Entry entry : this.f49468a.entrySet()) {
            uVar.U((String) entry.getKey(), Gi.e.T(entry.getValue()));
        }
        return uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C6345w1) && AbstractC3557B.K(this.f49468a, ((C6345w1) obj).f49468a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f49468a.hashCode();
    }

    public final String toString() {
        return "Context(additionalProperties=" + this.f49468a + Separators.RPAREN;
    }
}
