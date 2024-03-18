package Bh;

import java.util.HashMap;
import java.util.Map;
import wh.C6246k;
import yh.l1;

/* loaded from: classes2.dex */
public final class J implements K {

    /* renamed from: Y  reason: collision with root package name */
    public final O f2221Y;

    /* renamed from: Z  reason: collision with root package name */
    public final O f2222Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Map f2223h0;

    public J(B b10, O o10, HashMap hashMap) {
        this.f2221Y = b10;
        this.f2222Z = o10;
        this.f2223h0 = hashMap;
    }

    @Override // Bh.K
    public final O a(l1 l1Var) {
        O o10 = (O) this.f2223h0.get(l1Var);
        if (o10 == null) {
            return I.f2215Y;
        }
        return o10;
    }

    @Override // Bh.O
    public final N b() {
        return this.f2221Y.b();
    }

    @Override // Bh.O
    public final M d(C6246k c6246k) {
        return this.f2221Y.d(c6246k);
    }

    @Override // Bh.K
    public final O e() {
        return this.f2222Z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || J.class != obj.getClass()) {
            return false;
        }
        J j6 = (J) obj;
        if (this.f2221Y.equals(j6.f2221Y) && this.f2222Z.equals(j6.f2222Z) && this.f2223h0.equals(j6.f2223h0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f2221Y.hashCode();
        int hashCode2 = this.f2222Z.hashCode();
        return this.f2223h0.hashCode() + ((hashCode2 + ((hashCode + (J.class.hashCode() * 31)) * 31)) * 31);
    }
}
