package o8;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import io.sentry.C3636c1;
import m.AbstractActivityC4532l;
import u8.AbstractC5857g;
import u8.AbstractC5858h;
import u8.AbstractC5862l;
import u8.C5852b;
import u8.C5860j;

/* loaded from: classes.dex */
public final class k extends o {

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Bundle f40958h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Activity f40959i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ N7.f f40960j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ int f40961k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ p f40962l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p pVar, N7.f fVar, Bundle bundle, AbstractActivityC4532l abstractActivityC4532l, N7.f fVar2, int i10) {
        super(pVar, fVar);
        this.f40962l0 = pVar;
        this.f40958h0 = bundle;
        this.f40959i0 = abstractActivityC4532l;
        this.f40960j0 = fVar2;
        this.f40961k0 = i10;
    }

    @Override // u8.AbstractRunnableC5866p
    public final void b() {
        p pVar = this.f40962l0;
        if (p.c(pVar)) {
            a(new C4948a(-2, null));
            return;
        }
        try {
            C5852b c5852b = pVar.f40976f;
            AbstractC5862l abstractC5862l = (AbstractC5862l) c5852b.f46486n;
            Bundle bundle = this.f40958h0;
            C3636c1 c3636c1 = pVar.f40974d;
            Activity activity = this.f40959i0;
            N7.f fVar = this.f40960j0;
            Object a5 = ((AbstractC5857g) c3636c1.f34285Z).a();
            a5.getClass();
            v vVar = (v) ((AbstractC5857g) c3636c1.f34286h0).a();
            vVar.getClass();
            activity.getClass();
            BinderC4950c binderC4950c = new BinderC4950c((Context) a5, vVar, activity, fVar, c5852b);
            C5860j c5860j = (C5860j) abstractC5862l;
            c5860j.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
            int i10 = AbstractC5858h.f46491a;
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(binderC4950c);
            c5860j.g(obtain, 6);
        } catch (RemoteException e10) {
            pVar.f40971a.a(e10, "requestAndShowDialog(%s)", Integer.valueOf(this.f40961k0));
            this.f40960j0.a(new C4948a(-100, e10));
        }
    }
}
