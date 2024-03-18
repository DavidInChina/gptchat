package s7;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import p7.AbstractC5096a;
import u7.m;
import v7.v;
import w7.AbstractC6134f;

/* loaded from: classes.dex */
public final class g extends h {

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ int f45436p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(v vVar, int i10) {
        super(vVar);
        this.f45436p = i10;
        A7.b.l0(vVar, "GoogleApiClient must not be null");
        A7.b.l0(AbstractC5096a.f42750a, "Api must not be null");
    }

    @Override // s7.h
    public final void K0(AbstractC6134f abstractC6134f) {
        switch (this.f45436p) {
            case 0:
                e eVar = (e) abstractC6134f;
                k kVar = (k) eVar.l();
                f fVar = new f(0, this);
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(kVar.f5064b);
                int i10 = F7.d.f5067a;
                obtain.writeStrongBinder(fVar);
                GoogleSignInOptions googleSignInOptions = eVar.f45433A;
                if (googleSignInOptions == null) {
                    obtain.writeInt(0);
                } else {
                    obtain.writeInt(1);
                    googleSignInOptions.writeToParcel(obtain, 0);
                }
                kVar.g(obtain, 102);
                return;
            default:
                e eVar2 = (e) abstractC6134f;
                k kVar2 = (k) eVar2.l();
                f fVar2 = new f(1, this);
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(kVar2.f5064b);
                int i11 = F7.d.f5067a;
                obtain2.writeStrongBinder(fVar2);
                GoogleSignInOptions googleSignInOptions2 = eVar2.f45433A;
                if (googleSignInOptions2 == null) {
                    obtain2.writeInt(0);
                } else {
                    obtain2.writeInt(1);
                    googleSignInOptions2.writeToParcel(obtain2, 0);
                }
                kVar2.g(obtain2, 103);
                return;
        }
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ m G0(Status status) {
        return status;
    }
}
