package ke;

import Ng.AbstractC1089x;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class t extends IllegalArgumentException implements AbstractC1089x {

    /* renamed from: Y  reason: collision with root package name */
    public final io.ktor.websocket.q f37439Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(io.ktor.websocket.q qVar) {
        super("Unsupported frame type: " + qVar);
        AbstractC3557B.c0("frame", qVar);
        this.f37439Y = qVar;
    }

    @Override // Ng.AbstractC1089x
    public final Throwable a() {
        t tVar = new t(this.f37439Y);
        tVar.initCause(this);
        return tVar;
    }
}
