package w7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import io.sentry.android.core.AbstractC3612c;

/* renamed from: w7.A  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC6123A extends F7.c {

    /* renamed from: b  reason: collision with root package name */
    public AbstractC6134f f48072b;

    /* renamed from: c  reason: collision with root package name */
    public final int f48073c;

    public BinderC6123A(AbstractC6134f abstractC6134f, int i10) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 1);
        this.f48072b = abstractC6134f;
        this.f48073c = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
        if (r6.f48176Y >= r10.f48176Y) goto L19;
     */
    @Override // F7.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j(int i10, Parcel parcel, Parcel parcel2) {
        C6139k c6139k;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return false;
                }
                int readInt = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                C6127E c6127e = (C6127E) I7.a.a(parcel, C6127E.CREATOR);
                I7.a.b(parcel);
                AbstractC6134f abstractC6134f = this.f48072b;
                A7.b.l0(abstractC6134f, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
                A7.b.k0(c6127e);
                abstractC6134f.f48159u = c6127e;
                if (abstractC6134f.s()) {
                    C6132d c6132d = c6127e.f48082i0;
                    C6138j a5 = C6138j.a();
                    if (c6132d == null) {
                        c6139k = null;
                    } else {
                        c6139k = c6132d.f48116Y;
                    }
                    synchronized (a5) {
                        if (c6139k == null) {
                            c6139k = C6138j.f48174c;
                        } else {
                            C6139k c6139k2 = a5.f48175a;
                            if (c6139k2 != null) {
                            }
                        }
                        a5.f48175a = c6139k;
                    }
                }
                Bundle bundle = c6127e.f48079Y;
                A7.b.l0(this.f48072b, "onPostInitComplete can be called only once per call to getRemoteService");
                AbstractC6134f abstractC6134f2 = this.f48072b;
                abstractC6134f2.getClass();
                C6125C c6125c = new C6125C(abstractC6134f2, readInt, readStrongBinder, bundle);
                z zVar = abstractC6134f2.f48143e;
                zVar.sendMessage(zVar.obtainMessage(1, this.f48073c, -1, c6125c));
                this.f48072b = null;
            } else {
                parcel.readInt();
                Bundle bundle2 = (Bundle) I7.a.a(parcel, Bundle.CREATOR);
                I7.a.b(parcel);
                AbstractC3612c.u("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
            }
        } else {
            I7.a.b(parcel);
            A7.b.l0(this.f48072b, "onPostInitComplete can be called only once per call to getRemoteService");
            AbstractC6134f abstractC6134f3 = this.f48072b;
            abstractC6134f3.getClass();
            C6125C c6125c2 = new C6125C(abstractC6134f3, parcel.readInt(), parcel.readStrongBinder(), (Bundle) I7.a.a(parcel, Bundle.CREATOR));
            z zVar2 = abstractC6134f3.f48143e;
            zVar2.sendMessage(zVar2.obtainMessage(1, this.f48073c, -1, c6125c2));
            this.f48072b = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
