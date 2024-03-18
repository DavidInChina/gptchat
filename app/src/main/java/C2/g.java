package C2;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class g extends x2.h {

    /* renamed from: p0  reason: collision with root package name */
    public long f2537p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f2538q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f2539r0;

    @Override // x2.h
    public final void i() {
        super.i();
        this.f2538q0 = 0;
    }

    public final boolean m(x2.h hVar) {
        ByteBuffer byteBuffer;
        Gi.e.l(!hVar.g(1073741824));
        Gi.e.l(!hVar.g(268435456));
        Gi.e.l(!hVar.g(4));
        if (n()) {
            if (this.f2538q0 < this.f2539r0) {
                ByteBuffer byteBuffer2 = hVar.f48641j0;
                if (byteBuffer2 != null && (byteBuffer = this.f48641j0) != null) {
                    if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        int i10 = this.f2538q0;
        this.f2538q0 = i10 + 1;
        if (i10 == 0) {
            this.f48643l0 = hVar.f48643l0;
            if (hVar.g(1)) {
                this.f48626Z = 1;
            }
        }
        ByteBuffer byteBuffer3 = hVar.f48641j0;
        if (byteBuffer3 != null) {
            k(byteBuffer3.remaining());
            this.f48641j0.put(byteBuffer3);
        }
        this.f2537p0 = hVar.f48643l0;
        return true;
    }

    public final boolean n() {
        if (this.f2538q0 > 0) {
            return true;
        }
        return false;
    }
}
