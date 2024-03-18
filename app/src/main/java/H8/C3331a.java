package h8;

import android.os.Handler;
import android.os.Message;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;

/* renamed from: h8.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3331a implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 0) {
            if (i10 != 1) {
                return false;
            }
            AbstractC2469q0.p(message.obj);
            throw null;
        }
        AbstractC2469q0.p(message.obj);
        throw null;
    }
}
