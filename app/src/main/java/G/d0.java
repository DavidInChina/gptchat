package G;

import b0.C2104h;

/* loaded from: classes.dex */
public final class d0 implements AbstractC0551f {

    /* renamed from: a  reason: collision with root package name */
    public final C2104h f5493a = new C2104h(new C0550e[16]);

    /* renamed from: b  reason: collision with root package name */
    public int f5494b;

    /* renamed from: c  reason: collision with root package name */
    public C0550e f5495c;

    public final void a(int i10, Object obj) {
        if (i10 >= 0) {
            if (i10 == 0) {
                return;
            }
            C0550e c0550e = new C0550e(this.f5494b, obj, i10);
            this.f5494b += i10;
            this.f5493a.b(c0550e);
            return;
        }
        throw new IllegalArgumentException(android.gov.nist.core.a.e("size should be >=0, but was ", i10).toString());
    }

    public final void b(int i10) {
        if (i10 >= 0 && i10 < this.f5494b) {
            return;
        }
        StringBuilder q10 = android.gov.nist.core.a.q("Index ", i10, ", size ");
        q10.append(this.f5494b);
        throw new IndexOutOfBoundsException(q10.toString());
    }

    public final void c(int i10, int i11, wf.k kVar) {
        b(i10);
        b(i11);
        if (i11 >= i10) {
            C2104h c2104h = this.f5493a;
            int g10 = Gi.e.g(i10, c2104h);
            int i12 = ((C0550e) c2104h.f25567Y[g10]).f5496a;
            while (i12 <= i11) {
                C0550e c0550e = (C0550e) c2104h.f25567Y[g10];
                kVar.invoke(c0550e);
                i12 += c0550e.f5497b;
                g10++;
            }
            return;
        }
        throw new IllegalArgumentException(("toIndex (" + i11 + ") should be not smaller than fromIndex (" + i10 + ')').toString());
    }

    public final C0550e d(int i10) {
        b(i10);
        C0550e c0550e = this.f5495c;
        if (c0550e != null) {
            int i11 = c0550e.f5497b;
            int i12 = c0550e.f5496a;
            if (i10 < i11 + i12 && i12 <= i10) {
                return c0550e;
            }
        }
        C2104h c2104h = this.f5493a;
        C0550e c0550e2 = (C0550e) c2104h.f25567Y[Gi.e.g(i10, c2104h)];
        this.f5495c = c0550e2;
        return c0550e2;
    }
}
