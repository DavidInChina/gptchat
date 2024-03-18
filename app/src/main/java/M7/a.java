package M7;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import io.sentry.android.core.AbstractC3612c;
import l8.AbstractC4344b;
import q.RunnableC5216j;
import s7.C5581b;
import t7.C5680b;
import v7.BinderC5982C;
import w7.AbstractC6134f;
import w7.C6131c;
import w7.s;

/* loaded from: classes.dex */
public final class a extends AbstractC6134f implements L7.c {

    /* renamed from: A  reason: collision with root package name */
    public final boolean f11709A = true;

    /* renamed from: B  reason: collision with root package name */
    public final C6131c f11710B;

    /* renamed from: C  reason: collision with root package name */
    public final Bundle f11711C;

    /* renamed from: D  reason: collision with root package name */
    public final Integer f11712D;

    public a(Context context, Looper looper, C6131c c6131c, Bundle bundle, u7.h hVar, u7.i iVar) {
        super(context, looper, 44, c6131c, hVar, iVar);
        this.f11710B = c6131c;
        this.f11711C = bundle;
        this.f11712D = c6131c.f48115i;
    }

    @Override // L7.c
    public final void b(e eVar) {
        GoogleSignInAccount googleSignInAccount;
        A7.b.l0(eVar, "Expecting a valid ISignInCallbacks");
        try {
            Account account = this.f11710B.f48107a;
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            if ("<<default account>>".equals(account.name)) {
                googleSignInAccount = C5581b.a(this.f48141c).b();
            } else {
                googleSignInAccount = null;
            }
            Integer num = this.f11712D;
            A7.b.k0(num);
            s sVar = new s(2, account, num.intValue(), googleSignInAccount);
            f fVar = (f) l();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(fVar.f5064b);
            int i10 = H7.a.f7474a;
            obtain.writeInt(1);
            int D12 = AbstractC4344b.D1(obtain, 20293);
            AbstractC4344b.G1(obtain, 1, 4);
            obtain.writeInt(1);
            AbstractC4344b.z1(obtain, 2, sVar, 0);
            AbstractC4344b.F1(obtain, D12);
            obtain.writeStrongBinder(eVar.asBinder());
            Parcel obtain2 = Parcel.obtain();
            fVar.f5063a.transact(12, obtain, obtain2, 0);
            obtain2.readException();
            obtain.recycle();
            obtain2.recycle();
        } catch (RemoteException e10) {
            AbstractC3612c.r("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                BinderC5982C binderC5982C = (BinderC5982C) eVar;
                binderC5982C.f47269b.post(new RunnableC5216j(binderC5982C, 22, new i(1, new C5680b(8, null), null)));
            } catch (RemoteException unused) {
                AbstractC3612c.u("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
            }
        }
    }

    @Override // u7.AbstractC5847c
    public final int f() {
        return 12451000;
    }

    @Override // w7.AbstractC6134f, u7.AbstractC5847c
    public final boolean g() {
        return this.f11709A;
    }

    @Override // L7.c
    public final void h() {
        this.f48147i = new J0.a(this);
        v(2, null);
    }

    @Override // w7.AbstractC6134f
    public final IInterface i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof f) {
            return (f) queryLocalInterface;
        }
        return new F7.a(iBinder, "com.google.android.gms.signin.internal.ISignInService", 1);
    }

    @Override // w7.AbstractC6134f
    public final Bundle k() {
        C6131c c6131c = this.f11710B;
        boolean equals = this.f48141c.getPackageName().equals(c6131c.f48112f);
        Bundle bundle = this.f11711C;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", c6131c.f48112f);
        }
        return bundle;
    }

    @Override // w7.AbstractC6134f
    public final String m() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // w7.AbstractC6134f
    public final String n() {
        return "com.google.android.gms.signin.service.START";
    }
}
