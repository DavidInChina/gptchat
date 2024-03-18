package Ne;

import Oe.f;
import id.AbstractC3557B;
import io.ktor.utils.io.internal.i;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class b extends f {
    @Override // Oe.g
    public final Object C() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(io.ktor.utils.io.internal.f.f33452a);
        AbstractC3557B.b0("allocateDirect(BUFFER_SIZE)", allocateDirect);
        return new i(allocateDirect);
    }

    @Override // Oe.g
    public final void E0(Object obj) {
        AbstractC3557B.c0("instance", obj);
    }
}
