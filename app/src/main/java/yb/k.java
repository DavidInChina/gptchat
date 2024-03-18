package Yb;

import android.content.Intent;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class k extends h {
    @Override // Ad.g
    public final void i(Ad.i iVar) {
        String str;
        d dVar = (d) iVar;
        AbstractC3557B.c0("intent", dVar);
        if (AbstractC3557B.K(dVar, c.f22210a) && (str = ((m) this.f808e.getValue()).f22228c) != null) {
            Intent intent = new Intent();
            A7.b.G0(intent, str);
            f(new a(intent));
        }
    }
}
