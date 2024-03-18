package ke;

import Wh.B;
import Wh.u;
import id.AbstractC3557B;
import io.ktor.utils.io.x;
import java.io.IOException;
import jf.C3963m;
import ji.AbstractC4136k;
import ji.C4130e;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class s extends B {

    /* renamed from: b  reason: collision with root package name */
    public final Long f37437b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC6216a f37438c;

    public s(Long l10, AbstractC6216a abstractC6216a) {
        this.f37437b = l10;
        this.f37438c = abstractC6216a;
    }

    @Override // Wh.B
    public final long a() {
        Long l10 = this.f37437b;
        if (l10 != null) {
            return l10.longValue();
        }
        return -1L;
    }

    @Override // Wh.B
    public final u b() {
        return null;
    }

    @Override // Wh.B
    public final void c(AbstractC4136k abstractC4136k) {
        try {
            x xVar = (x) this.f37438c.mo122invoke();
            C3963m c3963m = io.ktor.utils.io.jvm.javaio.e.f33497a;
            AbstractC3557B.c0("<this>", xVar);
            Throwable th2 = null;
            C4130e Z12 = R4.b.Z1(new io.ktor.utils.io.jvm.javaio.i(xVar, null));
            Long valueOf = Long.valueOf(abstractC4136k.I0(Z12));
            try {
                Z12.close();
            } catch (Throwable th3) {
                th2 = th3;
            }
            if (th2 == null) {
                AbstractC3557B.Z(valueOf);
                return;
            }
            throw th2;
        } catch (IOException e10) {
            throw e10;
        } catch (Throwable th4) {
            throw new IOException(th4);
        }
    }
}
