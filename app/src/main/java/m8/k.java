package m8;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.util.ArrayList;
import java.util.Iterator;
import s8.AbstractRunnableC5589f;
import s8.C5592i;
import u8.AbstractRunnableC5866p;
import u8.C5852b;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements IBinder.DeathRecipient {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f38975a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f38976b;

    public /* synthetic */ k(int i10, Object obj) {
        this.f38975a = i10;
        this.f38976b = obj;
    }

    private final void a() {
        o oVar = (o) this.f38976b;
        oVar.f38987b.e("reportBinderDeath", new Object[0]);
        AbstractC2469q0.p(oVar.f38994i.get());
        oVar.f38987b.e("%s : Binder has died.", oVar.f38988c);
        Iterator it = oVar.f38989d.iterator();
        while (it.hasNext()) {
            RemoteException remoteException = new RemoteException(String.valueOf(oVar.f38988c).concat(" : Binder has died."));
            N7.f fVar = ((j) it.next()).f38974Y;
            if (fVar != null) {
                fVar.a(remoteException);
            }
        }
        oVar.f38989d.clear();
        synchronized (oVar.f38991f) {
            oVar.d();
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        switch (this.f38975a) {
            case 0:
                a();
                return;
            case 1:
                C5592i c5592i = (C5592i) this.f38976b;
                c5592i.f45452b.d("reportBinderDeath", new Object[0]);
                AbstractC2469q0.p(c5592i.f45459i.get());
                c5592i.f45452b.d("%s : Binder has died.", c5592i.f45453c);
                ArrayList arrayList = c5592i.f45454d;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    RemoteException remoteException = new RemoteException(String.valueOf(c5592i.f45453c).concat(" : Binder has died."));
                    N7.f fVar = ((AbstractRunnableC5589f) it.next()).f45444Y;
                    if (fVar != null) {
                        fVar.a(remoteException);
                    }
                }
                arrayList.clear();
                c5592i.b();
                return;
            default:
                C5852b c5852b = (C5852b) this.f38976b;
                c5852b.f46474b.b("reportBinderDeath", new Object[0]);
                AbstractC2469q0.p(c5852b.f46482j.get());
                c5852b.f46474b.b("%s : Binder has died.", c5852b.f46475c);
                Iterator it2 = c5852b.f46476d.iterator();
                while (it2.hasNext()) {
                    ((AbstractRunnableC5866p) it2.next()).a(new RemoteException(String.valueOf(c5852b.f46475c).concat(" : Binder has died.")));
                }
                c5852b.f46476d.clear();
                synchronized (c5852b.f46478f) {
                    c5852b.d();
                }
                return;
        }
    }
}
