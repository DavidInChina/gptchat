package q2;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import x8.N;
import x8.k0;

/* renamed from: q2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5261a {

    /* renamed from: a  reason: collision with root package name */
    public final N f43657a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f43658b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public ByteBuffer[] f43659c = new ByteBuffer[0];

    /* renamed from: d  reason: collision with root package name */
    public boolean f43660d = false;

    public C5261a(k0 k0Var) {
        this.f43657a = k0Var;
        C5262b c5262b = C5262b.f43661e;
    }

    public final C5262b a(C5262b c5262b) {
        if (!c5262b.equals(C5262b.f43661e)) {
            int i10 = 0;
            while (true) {
                N n10 = this.f43657a;
                if (i10 < n10.size()) {
                    AbstractC5264d abstractC5264d = (AbstractC5264d) n10.get(i10);
                    C5262b d10 = abstractC5264d.d(c5262b);
                    if (abstractC5264d.a()) {
                        Gi.e.n(!d10.equals(C5262b.f43661e));
                        c5262b = d10;
                    }
                    i10++;
                } else {
                    return c5262b;
                }
            }
        } else {
            throw new C5263c(c5262b);
        }
    }

    public final void b() {
        ArrayList arrayList = this.f43658b;
        arrayList.clear();
        this.f43660d = false;
        int i10 = 0;
        while (true) {
            N n10 = this.f43657a;
            if (i10 >= n10.size()) {
                break;
            }
            AbstractC5264d abstractC5264d = (AbstractC5264d) n10.get(i10);
            abstractC5264d.flush();
            if (abstractC5264d.a()) {
                arrayList.add(abstractC5264d);
            }
            i10++;
        }
        this.f43659c = new ByteBuffer[arrayList.size()];
        for (int i11 = 0; i11 <= c(); i11++) {
            this.f43659c[i11] = ((AbstractC5264d) arrayList.get(i11)).c();
        }
    }

    public final int c() {
        return this.f43659c.length - 1;
    }

    public final boolean d() {
        if (this.f43660d && ((AbstractC5264d) this.f43658b.get(c())).g() && !this.f43659c[c()].hasRemaining()) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        return !this.f43658b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5261a)) {
            return false;
        }
        C5261a c5261a = (C5261a) obj;
        N n10 = this.f43657a;
        if (n10.size() != c5261a.f43657a.size()) {
            return false;
        }
        for (int i10 = 0; i10 < n10.size(); i10++) {
            if (n10.get(i10) != c5261a.f43657a.get(i10)) {
                return false;
            }
        }
        return true;
    }

    public final void f(ByteBuffer byteBuffer) {
        boolean z10;
        ByteBuffer byteBuffer2;
        boolean z11;
        do {
            z10 = false;
            for (int i10 = 0; i10 <= c(); i10++) {
                if (!this.f43659c[i10].hasRemaining()) {
                    ArrayList arrayList = this.f43658b;
                    AbstractC5264d abstractC5264d = (AbstractC5264d) arrayList.get(i10);
                    if (abstractC5264d.g()) {
                        if (!this.f43659c[i10].hasRemaining() && i10 < c()) {
                            ((AbstractC5264d) arrayList.get(i10 + 1)).f();
                        }
                    } else {
                        if (i10 > 0) {
                            byteBuffer2 = this.f43659c[i10 - 1];
                        } else if (byteBuffer.hasRemaining()) {
                            byteBuffer2 = byteBuffer;
                        } else {
                            byteBuffer2 = AbstractC5264d.f43666a;
                        }
                        abstractC5264d.e(byteBuffer2);
                        this.f43659c[i10] = abstractC5264d.c();
                        if (byteBuffer2.remaining() - byteBuffer2.remaining() <= 0 && !this.f43659c[i10].hasRemaining()) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        z10 |= z11;
                    }
                }
            }
        } while (z10);
    }

    public final void g() {
        int i10 = 0;
        while (true) {
            N n10 = this.f43657a;
            if (i10 < n10.size()) {
                AbstractC5264d abstractC5264d = (AbstractC5264d) n10.get(i10);
                abstractC5264d.flush();
                abstractC5264d.b();
                i10++;
            } else {
                this.f43659c = new ByteBuffer[0];
                C5262b c5262b = C5262b.f43661e;
                this.f43660d = false;
                return;
            }
        }
    }

    public final int hashCode() {
        return this.f43657a.hashCode();
    }
}
