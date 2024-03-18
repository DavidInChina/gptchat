package hh;

import android.app.Service;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import id.AbstractC3557B;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes2.dex */
public final class r implements Handler.Callback {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ Xf.f f32377Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Handler.Callback f32378Z;

    public r(Xf.f fVar, Handler.Callback callback) {
        this.f32377Y = fVar;
        this.f32378Z = callback;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        AbstractC3557B.d0("msg", message);
        Object obj = message.obj;
        if (!(obj instanceof IBinder)) {
            return false;
        }
        if (message.what == 116) {
            if (obj != null) {
                IBinder iBinder = (IBinder) obj;
                Xf.f fVar = this.f32377Y;
                Service service = (Service) ((Map) ((t) fVar.f21985Z).f32384d.getValue()).get(iBinder);
                if (service != null) {
                    ((t) fVar.f21985Z).f32381a.put(iBinder, new WeakReference(service));
                }
            } else {
                throw new ClassCastException("null cannot be cast to non-null type android.os.IBinder");
            }
        }
        Handler.Callback callback = this.f32378Z;
        if (callback == null) {
            return false;
        }
        return callback.handleMessage(message);
    }
}
