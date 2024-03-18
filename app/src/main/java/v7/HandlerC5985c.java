package v7;

import H0.C0672c0;
import android.os.Message;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import io.sentry.android.core.AbstractC3612c;

/* renamed from: v7.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class HandlerC5985c extends H7.d {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            if (i10 != 2) {
                AbstractC3612c.u("BasePendingResult", android.gov.nist.core.a.e("Don't know how to handle message: ", i10), new Exception());
                return;
            } else {
                ((BasePendingResult) message.obj).H0(Status.f26805m0);
                return;
            }
        }
        Pair pair = (Pair) message.obj;
        AbstractC2469q0.p(pair.first);
        u7.m mVar = (u7.m) pair.second;
        try {
            throw null;
        } catch (RuntimeException e10) {
            C0672c0 c0672c0 = BasePendingResult.f26811o;
            throw e10;
        }
    }
}
