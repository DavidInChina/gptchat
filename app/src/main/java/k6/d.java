package K6;

import K4.C0813a;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;
import java.util.Map;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: h  reason: collision with root package name */
    public static final String[] f9495h = {ParameterNames.VERSION, "_dd", "span", "tracer", "usr", "network"};

    /* renamed from: a  reason: collision with root package name */
    public final String f9496a;

    /* renamed from: b  reason: collision with root package name */
    public final c f9497b;

    /* renamed from: c  reason: collision with root package name */
    public final C0813a f9498c;

    /* renamed from: d  reason: collision with root package name */
    public final i f9499d;

    /* renamed from: e  reason: collision with root package name */
    public final j f9500e;

    /* renamed from: f  reason: collision with root package name */
    public final f f9501f;

    /* renamed from: g  reason: collision with root package name */
    public final Map f9502g;

    public d(String str, c cVar, C0813a c0813a, i iVar, j jVar, f fVar, Map map) {
        AbstractC3557B.c0(ParameterNames.VERSION, str);
        this.f9496a = str;
        this.f9497b = cVar;
        this.f9498c = c0813a;
        this.f9499d = iVar;
        this.f9500e = jVar;
        this.f9501f = fVar;
        this.f9502g = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (AbstractC3557B.K(this.f9496a, dVar.f9496a) && AbstractC3557B.K(this.f9497b, dVar.f9497b) && AbstractC3557B.K(this.f9498c, dVar.f9498c) && AbstractC3557B.K(this.f9499d, dVar.f9499d) && AbstractC3557B.K(this.f9500e, dVar.f9500e) && AbstractC3557B.K(this.f9501f, dVar.f9501f) && AbstractC3557B.K(this.f9502g, dVar.f9502g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f9497b.hashCode();
        int hashCode2 = this.f9498c.hashCode();
        int hashCode3 = (this.f9500e.hashCode() + E9.f.v(this.f9499d.f9510a, (hashCode2 + ((hashCode + (this.f9496a.hashCode() * 31)) * 31)) * 31, 31)) * 31;
        f fVar = this.f9501f;
        if (fVar == null) {
            i10 = 0;
        } else {
            i10 = fVar.hashCode();
        }
        return this.f9502g.hashCode() + ((hashCode3 + i10) * 31);
    }

    public final String toString() {
        return "Meta(version=" + this.f9496a + ", dd=" + this.f9497b + ", span=" + this.f9498c + ", tracer=" + this.f9499d + ", usr=" + this.f9500e + ", network=" + this.f9501f + ", additionalProperties=" + this.f9502g + Separators.RPAREN;
    }
}
