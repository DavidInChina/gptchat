package s2;

import android.os.Message;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public Message f45199a;

    public final void a() {
        this.f45199a = null;
        ArrayList arrayList = y.f45200b;
        synchronized (arrayList) {
            if (arrayList.size() < 50) {
                arrayList.add(this);
            }
        }
    }

    public final void b() {
        Message message = this.f45199a;
        message.getClass();
        message.sendToTarget();
        a();
    }
}
