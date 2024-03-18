package W;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import l0.AbstractC4311c;
import l0.C4316h;

/* renamed from: W.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1561i implements M1 {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC4311c f20121a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC4311c f20122b;

    /* renamed from: c  reason: collision with root package name */
    public final int f20123c;

    public C1561i(C4316h c4316h, C4316h c4316h2, int i10) {
        this.f20121a = c4316h;
        this.f20122b = c4316h2;
        this.f20123c = i10;
    }

    @Override // W.M1
    public final int a(Z0.j jVar, long j6, int i10, Z0.l lVar) {
        int a5 = this.f20122b.a(0, jVar.b(), lVar);
        int i11 = -this.f20121a.a(0, i10, lVar);
        Z0.l lVar2 = Z0.l.f22805Y;
        int i12 = this.f20123c;
        if (lVar != lVar2) {
            i12 = -i12;
        }
        return jVar.f22800a + a5 + i11 + i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1561i)) {
            return false;
        }
        C1561i c1561i = (C1561i) obj;
        if (AbstractC3557B.K(this.f20121a, c1561i.f20121a) && AbstractC3557B.K(this.f20122b, c1561i.f20122b) && this.f20123c == c1561i.f20123c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f20122b.hashCode() + (this.f20121a.hashCode() * 31)) * 31) + this.f20123c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Horizontal(menuAlignment=");
        sb2.append(this.f20121a);
        sb2.append(", anchorAlignment=");
        sb2.append(this.f20122b);
        sb2.append(", offset=");
        return AbstractC2469q0.j(sb2, this.f20123c, ')');
    }
}
