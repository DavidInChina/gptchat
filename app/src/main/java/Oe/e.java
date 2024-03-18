package Oe;

import id.AbstractC3557B;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class e extends d {

    /* renamed from: k0  reason: collision with root package name */
    public final int f13747k0;

    public e(int i10, int i11) {
        super(i10);
        this.f13747k0 = i11;
    }

    @Override // Oe.d
    public final Object h(Object obj) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        byteBuffer.clear();
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
        return byteBuffer;
    }

    @Override // Oe.d
    public final Object k() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.f13747k0);
        AbstractC3557B.Z(allocateDirect);
        return allocateDirect;
    }

    @Override // Oe.d
    public final void p(Object obj) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        AbstractC3557B.c0("instance", byteBuffer);
        if (byteBuffer.capacity() == this.f13747k0) {
            if (byteBuffer.isDirect()) {
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
