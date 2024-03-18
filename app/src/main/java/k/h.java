package k;

import android.content.Intent;
import g.AbstractActivityC3122o;
import id.AbstractC3557B;
import j.C3872b;
import j.k;

/* loaded from: classes2.dex */
public final class h extends P4.a {
    @Override // P4.a
    public final Intent D(AbstractActivityC3122o abstractActivityC3122o, Object obj) {
        k kVar = (k) obj;
        AbstractC3557B.c0("context", abstractActivityC3122o);
        AbstractC3557B.c0("input", kVar);
        Intent putExtra = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", kVar);
        AbstractC3557B.b0("Intent(ACTION_INTENT_SEN\u2026NT_SENDER_REQUEST, input)", putExtra);
        return putExtra;
    }

    @Override // P4.a
    public final Object v0(Intent intent, int i10) {
        return new C3872b(intent, i10);
    }
}
