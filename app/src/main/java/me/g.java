package Me;

import id.AbstractC3557B;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class g extends Oe.d {

    /* renamed from: k0  reason: collision with root package name */
    public final int f12031k0 = 4096;

    /* renamed from: l0  reason: collision with root package name */
    public final Ke.a f12032l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g() {
        super(1000);
        Ke.b bVar = Ke.b.f9785a;
        this.f12032l0 = bVar;
    }

    @Override // Oe.d
    public final Object h(Object obj) {
        Ne.c cVar = (Ne.c) obj;
        cVar.n();
        cVar.l();
        return cVar;
    }

    @Override // Oe.d
    public final void j(Object obj) {
        Ne.c cVar = (Ne.c) obj;
        AbstractC3557B.c0("instance", cVar);
        ((Ke.b) this.f12032l0).getClass();
        AbstractC3557B.c0("instance", cVar.f12021a);
        super.j(cVar);
        if (Ne.c.f12796j.compareAndSet(cVar, 0, -1)) {
            cVar.g();
            cVar.f12800h = null;
            return;
        }
        throw new IllegalStateException("Unable to unlink: buffer is in use.");
    }

    @Override // Oe.d
    public final Object k() {
        ((Ke.b) this.f12032l0).getClass();
        ByteBuffer allocate = ByteBuffer.allocate(this.f12031k0);
        AbstractC3557B.b0("allocate(size)", allocate);
        ByteBuffer byteBuffer = Ke.c.f9786a;
        return new Ne.c(allocate, null, this);
    }

    @Override // Oe.d
    public final void p(Object obj) {
        Ne.c cVar = (Ne.c) obj;
        AbstractC3557B.c0("instance", cVar);
        super.p(cVar);
        ByteBuffer byteBuffer = cVar.f12021a;
        int i10 = this.f12031k0;
        if (byteBuffer.limit() == i10) {
            Ne.c cVar2 = Ne.c.f12798l;
            if (cVar != cVar2) {
                if (cVar != cVar2) {
                    if (cVar.j() == 0) {
                        if (cVar.i() == null) {
                            if (cVar.f12800h == null) {
                                return;
                            }
                            throw new IllegalStateException("Recycled instance shouldn't be a view or another buffer.".toString());
                        }
                        throw new IllegalStateException("Recycled instance shouldn't be a part of a chain.".toString());
                    }
                    throw new IllegalStateException("Unable to clear buffer: it is still in use.".toString());
                }
                throw new IllegalStateException("Empty instance couldn't be recycled".toString());
            }
            throw new IllegalStateException("ChunkBuffer.Empty couldn't be recycled".toString());
        }
        StringBuilder q10 = android.gov.nist.core.a.q("Buffer size mismatch. Expected: ", i10, ", actual: ");
        q10.append(byteBuffer.limit());
        throw new IllegalStateException(q10.toString().toString());
    }
}
