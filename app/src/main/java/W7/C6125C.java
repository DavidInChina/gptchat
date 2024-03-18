package w7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import io.sentry.android.core.AbstractC3612c;
import t7.C5680b;
import v7.AbstractC5986d;
import v7.AbstractC5991i;

/* renamed from: w7.C  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6125C extends v {

    /* renamed from: g  reason: collision with root package name */
    public final IBinder f48076g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ AbstractC6134f f48077h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6125C(AbstractC6134f abstractC6134f, int i10, IBinder iBinder, Bundle bundle) {
        super(abstractC6134f, i10, bundle);
        this.f48077h = abstractC6134f;
        this.f48076g = iBinder;
    }

    @Override // w7.v
    public final void b(C5680b c5680b) {
        J0.a aVar = this.f48077h.f48153o;
        if (aVar != null) {
            ((AbstractC5991i) aVar.f8729Y).h(c5680b);
        }
        System.currentTimeMillis();
    }

    @Override // w7.v
    public final boolean c() {
        IBinder iBinder = this.f48076g;
        try {
            A7.b.k0(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            AbstractC6134f abstractC6134f = this.f48077h;
            if (!abstractC6134f.m().equals(interfaceDescriptor)) {
                String m10 = abstractC6134f.m();
                AbstractC3612c.r("GmsClient", "service descriptor mismatch: " + m10 + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface i10 = abstractC6134f.i(iBinder);
            if (i10 == null || (!AbstractC6134f.u(abstractC6134f, 2, 4, i10) && !AbstractC6134f.u(abstractC6134f, 3, 4, i10))) {
                return false;
            }
            abstractC6134f.f48157s = null;
            J0.a aVar = abstractC6134f.f48152n;
            if (aVar != null) {
                ((AbstractC5986d) aVar.f8729Y).onConnected();
                return true;
            }
            return true;
        } catch (RemoteException unused) {
            AbstractC3612c.r("GmsClient", "service probably died");
            return false;
        }
    }
}
