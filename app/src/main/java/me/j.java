package Me;

import id.AbstractC3557B;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import nb.C4807b;
import wf.k;

/* loaded from: classes.dex */
public final class j extends Oe.h {

    /* renamed from: h0  reason: collision with root package name */
    public final ByteBuffer f12048h0;

    /* renamed from: i0  reason: collision with root package name */
    public final k f12049i0;

    public j(ByteBuffer byteBuffer, C4807b c4807b) {
        this.f12048h0 = byteBuffer;
        this.f12049i0 = c4807b;
    }

    @Override // Oe.h
    public final void h(Object obj) {
        AbstractC3557B.c0("instance", (Ne.c) obj);
        this.f12049i0.invoke(this.f12048h0);
    }

    @Override // Oe.h
    public final Object i() {
        ByteBuffer byteBuffer = this.f12048h0;
        AbstractC3557B.c0("buffer", byteBuffer);
        ByteBuffer byteBuffer2 = Ke.c.f9786a;
        ByteBuffer order = byteBuffer.slice().order(ByteOrder.BIG_ENDIAN);
        AbstractC3557B.b0("buffer.slice().order(ByteOrder.BIG_ENDIAN)", order);
        return new Ne.c(order, null, this);
    }
}
