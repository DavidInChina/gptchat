package pg;

import Bg.C0213f;
import Bg.D;
import Bg.Q;
import Bg.Y;
import Mf.AbstractC1000i;
import Mf.B;
import Uf.A;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import jf.C3963m;

/* renamed from: pg.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5177n implements Y {

    /* renamed from: a  reason: collision with root package name */
    public final long f43151a;

    /* renamed from: b  reason: collision with root package name */
    public final B f43152b;

    /* renamed from: c  reason: collision with root package name */
    public final Set f43153c;

    /* renamed from: d  reason: collision with root package name */
    public final D f43154d;

    /* renamed from: e  reason: collision with root package name */
    public final C3963m f43155e = R4.b.D1(new A(6, this));

    public C5177n(long j6, B b10, Set set) {
        Q.f2084Z.getClass();
        Q q10 = Q.f2085h0;
        AbstractC3557B.c0("attributes", q10);
        this.f43154d = C0213f.n(q10, this, kf.v.f37483Y, false, Dg.m.a(Dg.i.f3661h0, true, "unknown integer literal type"));
        this.f43151a = j6;
        this.f43152b = b10;
        this.f43153c = set;
    }

    @Override // Bg.Y
    public final List getParameters() {
        return kf.v.f37483Y;
    }

    @Override // Bg.Y
    public final Jf.l j() {
        return this.f43152b.j();
    }

    @Override // Bg.Y
    public final AbstractC1000i k() {
        return null;
    }

    @Override // Bg.Y
    public final Collection l() {
        return (List) this.f43155e.getValue();
    }

    @Override // Bg.Y
    public final boolean m() {
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntegerLiteralType");
        sb2.append("[" + kf.t.m2(this.f43153c, Separators.COMMA, null, null, C5176m.f43150Y, 30) + ']');
        return sb2.toString();
    }
}
