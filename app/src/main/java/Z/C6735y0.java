package z;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import id.AbstractC3557B;

/* renamed from: z.y0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6735y0 implements AbstractC6651A {

    /* renamed from: a  reason: collision with root package name */
    public final int f51412a;

    /* renamed from: b  reason: collision with root package name */
    public final int f51413b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC6653B f51414c;

    public C6735y0(int i10, AbstractC6653B abstractC6653B, int i11) {
        this((i11 & 1) != 0 ? RCHTTPStatusCodes.UNSUCCESSFUL : i10, 0, (i11 & 4) != 0 ? AbstractC6657D.f51125a : abstractC6653B);
    }

    @Override // z.AbstractC6651A, z.AbstractC6714o
    /* renamed from: a */
    public final AbstractC6654B0 mo121a(C6737z0 c6737z0) {
        return new C6668I0(this.f51412a, this.f51413b, this.f51414c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6735y0)) {
            return false;
        }
        C6735y0 c6735y0 = (C6735y0) obj;
        if (c6735y0.f51412a != this.f51412a || c6735y0.f51413b != this.f51413b || !AbstractC3557B.K(c6735y0.f51414c, this.f51414c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f51414c.hashCode() + (this.f51412a * 31)) * 31) + this.f51413b;
    }

    @Override // z.AbstractC6651A, z.AbstractC6714o
    /* renamed from: a  reason: collision with other method in class */
    public final AbstractC6656C0 mo121a(C6737z0 c6737z0) {
        return new C6668I0(this.f51412a, this.f51413b, this.f51414c);
    }

    public C6735y0(int i10, int i11, AbstractC6653B abstractC6653B) {
        this.f51412a = i10;
        this.f51413b = i11;
        this.f51414c = abstractC6653B;
    }
}
