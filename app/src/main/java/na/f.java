package Na;

import Yg.o;
import Yg.p;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import k6.AbstractC4194d;
import wd.C6190g0;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final String f12768a;

    /* renamed from: b  reason: collision with root package name */
    public final p f12769b;

    /* renamed from: d  reason: collision with root package name */
    public p f12771d;

    /* renamed from: f  reason: collision with root package name */
    public final List f12773f;

    /* renamed from: c  reason: collision with root package name */
    public long f12770c = 0;

    /* renamed from: e  reason: collision with root package name */
    public long f12772e = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f12774g = false;

    public f(String str) {
        o oVar = p.Companion;
        oVar.getClass();
        p pVar = new p(AbstractC6463a.n("instant(...)"));
        Mg.a aVar = Mg.b.f12127Z;
        oVar.getClass();
        p pVar2 = new p(AbstractC6463a.n("instant(...)"));
        ArrayList arrayList = new ArrayList();
        AbstractC3557B.c0("model", str);
        this.f12768a = str;
        this.f12769b = pVar;
        this.f12771d = pVar2;
        this.f12773f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (AbstractC3557B.K(this.f12768a, fVar.f12768a) && AbstractC3557B.K(this.f12769b, fVar.f12769b) && Mg.b.d(this.f12770c, fVar.f12770c) && AbstractC3557B.K(this.f12771d, fVar.f12771d) && Mg.b.d(this.f12772e, fVar.f12772e) && AbstractC3557B.K(this.f12773f, fVar.f12773f) && this.f12774g == fVar.f12774g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f12769b.f22419Y.hashCode();
        int g10 = Mg.b.g(this.f12770c);
        int hashCode2 = this.f12771d.f22419Y.hashCode();
        int g11 = Mg.b.g(this.f12772e);
        int s10 = AbstractC4194d.s(this.f12773f, (g11 + ((hashCode2 + ((g10 + ((hashCode + (this.f12768a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31);
        if (this.f12774g) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return s10 + i10;
    }

    public final String toString() {
        String b10 = C6190g0.b(this.f12768a);
        String m10 = Mg.b.m(this.f12770c);
        p pVar = this.f12771d;
        String m11 = Mg.b.m(this.f12772e);
        boolean z10 = this.f12774g;
        StringBuilder s10 = android.gov.nist.core.a.s("RequestTimeData(model=", b10, ", requestStartTime=");
        s10.append(this.f12769b);
        s10.append(", totalRequestDuration=");
        s10.append(m10);
        s10.append(", requestLastTokenTime=");
        s10.append(pVar);
        s10.append(", lastTokenDuration=");
        s10.append(m11);
        s10.append(", tokenTimes=");
        s10.append(this.f12773f);
        s10.append(", websockets=");
        s10.append(z10);
        s10.append(Separators.RPAREN);
        return s10.toString();
    }
}
