package Me;

import id.AbstractC3557B;
import java.io.Closeable;
import java.nio.ByteBuffer;
import oe.C4992a;

/* loaded from: classes.dex */
public abstract class i implements Appendable, Closeable {

    /* renamed from: Y  reason: collision with root package name */
    public final Oe.g f12040Y;

    /* renamed from: Z  reason: collision with root package name */
    public Ne.c f12041Z;

    /* renamed from: h0  reason: collision with root package name */
    public Ne.c f12042h0;

    /* renamed from: i0  reason: collision with root package name */
    public ByteBuffer f12043i0 = Ke.c.f9786a;

    /* renamed from: j0  reason: collision with root package name */
    public int f12044j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f12045k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f12046l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f12047m0;

    public i(Oe.g gVar) {
        this.f12040Y = gVar;
    }

    public final void a() {
        Ne.c cVar = this.f12042h0;
        if (cVar != null) {
            this.f12044j0 = cVar.f12023c;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Oe.g gVar = this.f12040Y;
        Ne.c j6 = j();
        if (j6 != null) {
            Ne.c cVar = j6;
            do {
                try {
                    AbstractC3557B.c0("source", cVar.f12021a);
                    cVar = cVar.i();
                } finally {
                    AbstractC3557B.c0("pool", gVar);
                    while (j6 != null) {
                        Ne.c g10 = j6.g();
                        j6.k(gVar);
                        j6 = g10;
                    }
                }
            } while (cVar != null);
        }
    }

    public final Ne.c h() {
        Ne.c cVar = (Ne.c) this.f12040Y.C();
        cVar.e();
        if (cVar.i() == null) {
            Ne.c cVar2 = this.f12042h0;
            if (cVar2 == null) {
                this.f12041Z = cVar;
                this.f12047m0 = 0;
            } else {
                cVar2.m(cVar);
                int i10 = this.f12044j0;
                cVar2.b(i10);
                this.f12047m0 = (i10 - this.f12046l0) + this.f12047m0;
            }
            this.f12042h0 = cVar;
            this.f12047m0 = this.f12047m0;
            this.f12043i0 = cVar.f12021a;
            this.f12044j0 = cVar.f12023c;
            this.f12046l0 = cVar.f12022b;
            this.f12045k0 = cVar.f12025e;
            return cVar;
        }
        throw new IllegalStateException("It should be a single buffer chunk.".toString());
    }

    public final Ne.c i(int i10) {
        Ne.c cVar;
        int i11 = this.f12045k0;
        int i12 = this.f12044j0;
        if (i11 - i12 >= i10 && (cVar = this.f12042h0) != null) {
            cVar.b(i12);
            return cVar;
        }
        return h();
    }

    public final Ne.c j() {
        Ne.c cVar = this.f12041Z;
        if (cVar == null) {
            return null;
        }
        Ne.c cVar2 = this.f12042h0;
        if (cVar2 != null) {
            cVar2.b(this.f12044j0);
        }
        this.f12041Z = null;
        this.f12042h0 = null;
        this.f12044j0 = 0;
        this.f12045k0 = 0;
        this.f12046l0 = 0;
        this.f12047m0 = 0;
        this.f12043i0 = Ke.c.f9786a;
        return cVar;
    }

    public final void k(byte b10) {
        int i10 = this.f12044j0;
        if (i10 < this.f12045k0) {
            this.f12044j0 = i10 + 1;
            this.f12043i0.put(i10, b10);
            return;
        }
        Ne.c h10 = h();
        int i11 = h10.f12023c;
        if (i11 != h10.f12025e) {
            h10.f12021a.put(i11, b10);
            h10.f12023c = i11 + 1;
            this.f12044j0++;
            return;
        }
        throw new C4992a("No free space in the buffer to write a byte", 3);
    }
}
