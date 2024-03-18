package o8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import u8.AbstractC5858h;
import u8.AbstractC5862l;
import u8.C5860j;

/* loaded from: classes.dex */
public final class j extends o {

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ String f40953h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ long f40954i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ long f40955j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ N7.f f40956k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ p f40957l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p pVar, N7.f fVar, String str, long j6, long j10, N7.f fVar2) {
        super(pVar, fVar);
        this.f40957l0 = pVar;
        this.f40953h0 = str;
        this.f40954i0 = j6;
        this.f40955j0 = j10;
        this.f40956k0 = fVar2;
    }

    @Override // u8.AbstractRunnableC5866p
    public final void b() {
        long j6 = this.f40954i0;
        N7.f fVar = this.f40956k0;
        p pVar = this.f40957l0;
        if (!p.c(pVar)) {
            try {
                AbstractC5862l abstractC5862l = (AbstractC5862l) pVar.f40976f.f46486n;
                Bundle a5 = p.a(pVar, this.f40953h0, this.f40954i0, this.f40955j0);
                m mVar = new m(pVar, fVar, j6);
                C5860j c5860j = (C5860j) abstractC5862l;
                c5860j.getClass();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
                int i10 = AbstractC5858h.f46491a;
                obtain.writeInt(1);
                a5.writeToParcel(obtain, 0);
                obtain.writeStrongBinder(mVar);
                c5860j.g(obtain, 3);
                return;
            } catch (RemoteException e10) {
                pVar.f40971a.a(e10, "requestExpressIntegrityToken(%s, %s)", this.f40953h0, Long.valueOf(j6));
                fVar.a(new C4948a(-100, e10));
                return;
            }
        }
        a(new C4948a(-2, null));
    }
}
