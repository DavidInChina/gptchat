package W;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import l0.AbstractC4312d;
import l0.C4317i;

/* renamed from: W.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1566j implements N1 {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC4312d f20162a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC4312d f20163b;

    /* renamed from: c  reason: collision with root package name */
    public final int f20164c;

    public C1566j(C4317i c4317i, C4317i c4317i2, int i10) {
        this.f20162a = c4317i;
        this.f20163b = c4317i2;
        this.f20164c = i10;
    }

    @Override // W.N1
    public final int a(Z0.j jVar, long j6, int i10) {
        return jVar.f22801b + ((C4317i) this.f20163b).a(0, jVar.a()) + (-((C4317i) this.f20162a).a(0, i10)) + this.f20164c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1566j)) {
            return false;
        }
        C1566j c1566j = (C1566j) obj;
        if (AbstractC3557B.K(this.f20162a, c1566j.f20162a) && AbstractC3557B.K(this.f20163b, c1566j.f20163b) && this.f20164c == c1566j.f20164c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f20163b.hashCode() + (this.f20162a.hashCode() * 31)) * 31) + this.f20164c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Vertical(menuAlignment=");
        sb2.append(this.f20162a);
        sb2.append(", anchorAlignment=");
        sb2.append(this.f20163b);
        sb2.append(", offset=");
        return AbstractC2469q0.j(sb2, this.f20164c, ')');
    }
}
