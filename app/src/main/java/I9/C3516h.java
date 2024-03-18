package i9;

import Qg.AbstractC1207j;
import io.sentry.L0;
import jf.y;
import mc.C4616c;
import nf.AbstractC4825e;

/* renamed from: i9.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3516h implements AbstractC1207j {

    /* renamed from: Y  reason: collision with root package name */
    public static final C3516h f32897Y = new Object();

    @Override // Qg.AbstractC1207j
    public final Object c(Object obj, AbstractC4825e abstractC4825e) {
        C4616c c4616c = (C4616c) obj;
        L0.h("useApiStaging", String.valueOf(c4616c.f39125a));
        L0.h("useAuth0Staging", String.valueOf(c4616c.f39126b));
        L0.h("voiceApiHost", c4616c.f39127c.f18526Y);
        return y.f36177a;
    }
}
