package h0;

import K4.J;
import id.AbstractC3557B;

/* renamed from: h0.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3289b {

    /* renamed from: a  reason: collision with root package name */
    public int f31682a;

    public C3289b(int i10) {
        this.f31682a = i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntRef(element = ");
        sb2.append(this.f31682a);
        sb2.append(")@");
        int hashCode = hashCode();
        J.j(16);
        String num = Integer.toString(hashCode, 16);
        AbstractC3557B.b0("toString(this, checkRadix(radix))", num);
        sb2.append(num);
        return sb2.toString();
    }
}
