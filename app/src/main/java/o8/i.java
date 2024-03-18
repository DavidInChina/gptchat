package o8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import u8.AbstractC5858h;
import u8.AbstractC5862l;
import u8.C5860j;

/* loaded from: classes.dex */
public final class i extends o {

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ long f40950h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ N7.f f40951i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ p f40952j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p pVar, N7.f fVar, long j6, N7.f fVar2) {
        super(pVar, fVar);
        this.f40952j0 = pVar;
        this.f40950h0 = j6;
        this.f40951i0 = fVar2;
    }

    @Override // u8.AbstractRunnableC5866p
    public final void b() {
        N7.f fVar = this.f40951i0;
        long j6 = this.f40950h0;
        p pVar = this.f40952j0;
        if (!p.c(pVar)) {
            try {
                Bundle b10 = p.b(pVar, j6);
                n nVar = new n(pVar, fVar);
                C5860j c5860j = (C5860j) ((AbstractC5862l) pVar.f40976f.f46486n);
                c5860j.getClass();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
                int i10 = AbstractC5858h.f46491a;
                obtain.writeInt(1);
                b10.writeToParcel(obtain, 0);
                obtain.writeStrongBinder(nVar);
                c5860j.g(obtain, 2);
                return;
            } catch (RemoteException e10) {
                pVar.f40971a.a(e10, "warmUpIntegrityToken(%s)", Long.valueOf(j6));
                fVar.a(new C4948a(-100, e10));
                return;
            }
        }
        a(new C4948a(-2, null));
    }
}
