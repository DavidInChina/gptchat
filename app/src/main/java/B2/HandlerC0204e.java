package B2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Arrays;
import java.util.Iterator;
import s2.AbstractC5530A;

/* renamed from: B2.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class HandlerC0204e extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0207h f1775a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC0204e(C0207h c0207h, Looper looper) {
        super(looper);
        this.f1775a = c0207h;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        byte[] bArr = (byte[]) message.obj;
        if (bArr == null) {
            return;
        }
        Iterator it = this.f1775a.f1794q0.iterator();
        while (it.hasNext()) {
            C0203d c0203d = (C0203d) it.next();
            c0203d.o();
            if (Arrays.equals(c0203d.f1771v, bArr)) {
                if (message.what == 2 && c0203d.f1754e == 0 && c0203d.f1765p == 4) {
                    int i10 = AbstractC5530A.f45131a;
                    c0203d.h(false);
                    return;
                }
                return;
            }
        }
    }
}
