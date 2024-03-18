package vc;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import dh.C2682H;
import dh.C2695d;
import dh.u0;
import id.AbstractC3557B;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import y.AbstractC6463a;

@AbstractC1998i
/* renamed from: vc.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6013c {
    public static final C6012b Companion = new Object();

    /* renamed from: e  reason: collision with root package name */
    public static final KSerializer[] f47439e;

    /* renamed from: a  reason: collision with root package name */
    public final C6019i f47440a;

    /* renamed from: b  reason: collision with root package name */
    public final zd.c f47441b;

    /* renamed from: c  reason: collision with root package name */
    public final Map f47442c;

    /* renamed from: d  reason: collision with root package name */
    public final List f47443d;

    /* JADX WARN: Type inference failed for: r3v0, types: [vc.b, java.lang.Object] */
    static {
        u0 u0Var = u0.f28491a;
        f47439e = new KSerializer[]{null, null, new C2682H(u0Var, u0Var, 1), new C2695d(u0Var, 0)};
    }

    public C6013c(int i10, C6019i c6019i, zd.c cVar, Map map, List list) {
        if (13 == (i10 & 13)) {
            this.f47440a = c6019i;
            if ((i10 & 2) == 0) {
                this.f47441b = null;
            } else {
                this.f47441b = cVar;
            }
            this.f47442c = map;
            this.f47443d = list;
            return;
        }
        R4.b.e2(i10, 13, C6011a.f47438b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6013c)) {
            return false;
        }
        C6013c c6013c = (C6013c) obj;
        if (AbstractC3557B.K(this.f47440a, c6013c.f47440a) && AbstractC3557B.K(this.f47441b, c6013c.f47441b) && AbstractC3557B.K(this.f47442c, c6013c.f47442c) && AbstractC3557B.K(this.f47443d, c6013c.f47443d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f47440a.hashCode() * 31;
        zd.c cVar = this.f47441b;
        if (cVar == null) {
            i10 = 0;
        } else {
            i10 = cVar.hashCode();
        }
        return this.f47443d.hashCode() + AbstractC6463a.f(this.f47442c, (hashCode + i10) * 31, 31);
    }

    public final String toString() {
        return "ApiUserSettings(settings=" + this.f47440a + ", betaSettings=" + this.f47441b + ", announcements=" + this.f47442c + ", eligibleAnnouncements=" + this.f47443d + Separators.RPAREN;
    }
}
