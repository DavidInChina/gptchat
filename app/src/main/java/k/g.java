package k;

import android.content.Intent;
import g.AbstractActivityC3122o;
import id.AbstractC3557B;
import j.C3872b;

/* loaded from: classes2.dex */
public final class g extends P4.a {
    @Override // P4.a
    public final Intent D(AbstractActivityC3122o abstractActivityC3122o, Object obj) {
        Intent intent = (Intent) obj;
        AbstractC3557B.c0("context", abstractActivityC3122o);
        AbstractC3557B.c0("input", intent);
        return intent;
    }

    @Override // P4.a
    public final Object v0(Intent intent, int i10) {
        return new C3872b(intent, i10);
    }
}
