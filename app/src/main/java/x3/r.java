package x3;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.gov.nist.javax.sip.header.extensions.ReferencesHeader;
import android.os.IBinder;
import android.os.IInterface;
import cf.AbstractC2408g;
import id.AbstractC3557B;
import java.util.Set;
import nf.AbstractC4825e;
import s8.C5590g;
import s8.C5591h;
import s8.C5592i;
import u8.C5851a;
import u8.C5852b;
import z.AbstractC6708l;

/* loaded from: classes2.dex */
public final class r implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f48716a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f48717b;

    public /* synthetic */ r(int i10, Object obj) {
        this.f48716a = i10;
        this.f48717b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [x3.j, java.lang.Object] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        k kVar;
        switch (this.f48716a) {
            case 0:
                AbstractC3557B.c0("name", componentName);
                AbstractC3557B.c0(ReferencesHeader.SERVICE, iBinder);
                s sVar = (s) this.f48717b;
                int i10 = t.f48728b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
                if (queryLocalInterface != null && (queryLocalInterface instanceof k)) {
                    kVar = (k) queryLocalInterface;
                } else {
                    ?? obj = new Object();
                    obj.f48687a = iBinder;
                    kVar = obj;
                }
                sVar.f48723f = kVar;
                sVar.f48720c.execute(sVar.f48726i);
                return;
            case 1:
                m8.o oVar = (m8.o) this.f48717b;
                oVar.f38987b.e("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                oVar.a().post(new m8.n(this, iBinder));
                return;
            case 2:
                C5592i c5592i = (C5592i) this.f48717b;
                c5592i.f45452b.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                c5592i.a().post(new C5590g(this, iBinder));
                return;
            case 3:
                C5852b c5852b = (C5852b) this.f48717b;
                c5852b.f46474b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                c5852b.a().post(new o8.h(this, iBinder));
                return;
            default:
                AbstractC3557B.c0("name", componentName);
                AbstractC3557B.c0("binder", iBinder);
                AbstractC2408g.Companion.getClass();
                if (AbstractC6708l.b(1, 7) >= 0 && Mi.a.d() > 0) {
                    Mi.a.e(new Object[0]);
                }
                V.B b10 = (V.B) this.f48717b;
                b10.f17896c = ((Ye.b) iBinder).f22289a;
                synchronized (b10) {
                    try {
                        b10.f17894a = true;
                        for (AbstractC4825e abstractC4825e : (Set) b10.f17897d) {
                            abstractC4825e.resumeWith(jf.y.f36177a);
                        }
                        ((Set) b10.f17897d).clear();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i10 = this.f48716a;
        Object obj = this.f48717b;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("name", componentName);
                s sVar = (s) obj;
                sVar.f48720c.execute(sVar.f48727j);
                sVar.f48723f = null;
                return;
            case 1:
                m8.o oVar = (m8.o) obj;
                oVar.f38987b.e("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                oVar.a().post(new m8.m(1, this));
                return;
            case 2:
                C5592i c5592i = (C5592i) obj;
                c5592i.f45452b.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                c5592i.a().post(new C5591h(1, this));
                return;
            case 3:
                C5852b c5852b = (C5852b) obj;
                c5852b.f46474b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                c5852b.a().post(new C5851a(0, this));
                return;
            default:
                AbstractC3557B.c0("name", componentName);
                AbstractC2408g.Companion.getClass();
                if (AbstractC6708l.b(1, 7) >= 0 && Mi.a.d() > 0) {
                    Mi.a.e(new Object[0]);
                }
                V.B b10 = (V.B) obj;
                b10.f17894a = false;
                b10.f17896c = null;
                return;
        }
    }

    public /* synthetic */ r(Object obj, int i10) {
        this.f48716a = i10;
        this.f48717b = obj;
    }
}
