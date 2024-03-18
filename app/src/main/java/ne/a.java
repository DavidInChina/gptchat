package Ne;

import Oe.g;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class a implements g {
    @Override // Oe.g
    public final Object C() {
        return c.f12798l;
    }

    @Override // Oe.g
    public final void E0(Object obj) {
        c cVar = (c) obj;
        AbstractC3557B.c0("instance", cVar);
        if (cVar == c.f12798l) {
            return;
        }
        throw new IllegalArgumentException("Only ChunkBuffer.Empty instance could be recycled.".toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
