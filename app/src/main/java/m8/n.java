package m8;

import K4.C0813a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import io.sentry.android.core.AbstractC3612c;
import java.util.Iterator;
import x3.r;

/* loaded from: classes.dex */
public final class n extends j {

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ IBinder f38983Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ r f38984h0;

    public n(r rVar, IBinder iBinder) {
        this.f38984h0 = rVar;
        this.f38983Z = iBinder;
    }

    @Override // m8.j
    public final void a() {
        g gVar;
        r rVar = this.f38984h0;
        o oVar = (o) rVar.f48717b;
        int i10 = f.f38972b;
        IBinder iBinder = this.f38983Z;
        if (iBinder == null) {
            gVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
            if (queryLocalInterface instanceof g) {
                gVar = (g) queryLocalInterface;
            } else {
                gVar = new e(iBinder);
            }
        }
        oVar.f38998m = gVar;
        Object obj = rVar.f48717b;
        o oVar2 = (o) obj;
        oVar2.f38987b.e("linkToDeath", new Object[0]);
        try {
            oVar2.f38998m.asBinder().linkToDeath(oVar2.f38995j, 0);
        } catch (RemoteException e10) {
            Object[] objArr = new Object[0];
            C0813a c0813a = oVar2.f38987b;
            c0813a.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                AbstractC3612c.d("PlayCore", C0813a.f(c0813a.f9398Z, "linkToDeath failed", objArr), e10);
            }
        }
        o oVar3 = (o) obj;
        oVar3.f38992g = false;
        Iterator it = oVar3.f38989d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ((o) obj).f38989d.clear();
    }
}
