package h8;

import U3.i;
import android.os.Handler;
import android.os.Message;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;

/* renamed from: h8.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3335e implements Handler.Callback {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ i f31954Y;

    public C3335e(i iVar) {
        this.f31954Y = iVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        i iVar = this.f31954Y;
        AbstractC2469q0.p(message.obj);
        synchronized (iVar.f17414Y) {
            AbstractC2469q0.p(iVar.f17416h0);
            throw null;
        }
    }
}
