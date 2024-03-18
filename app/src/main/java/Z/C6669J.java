package z;

import id.AbstractC3557B;

/* renamed from: z.J  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6669J implements AbstractC6714o {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC6651A f51155a;

    /* renamed from: b  reason: collision with root package name */
    public final int f51156b;

    /* renamed from: c  reason: collision with root package name */
    public final long f51157c;

    public C6669J(AbstractC6651A abstractC6651A, int i10, long j6) {
        this.f51155a = abstractC6651A;
        this.f51156b = i10;
        this.f51157c = j6;
    }

    @Override // z.AbstractC6714o
    /* renamed from: a */
    public final AbstractC6654B0 mo121a(C6737z0 c6737z0) {
        return new C6662F0(this.f51155a.mo121a(c6737z0), this.f51156b, this.f51157c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6669J)) {
            return false;
        }
        C6669J c6669j = (C6669J) obj;
        if (!AbstractC3557B.K(c6669j.f51155a, this.f51155a) || c6669j.f51156b != this.f51156b) {
            return false;
        }
        if (c6669j.f51157c != this.f51157c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int d10 = AbstractC6708l.d(this.f51156b, this.f51155a.hashCode() * 31, 31);
        long j6 = this.f51157c;
        return d10 + ((int) (j6 ^ (j6 >>> 32)));
    }
}
