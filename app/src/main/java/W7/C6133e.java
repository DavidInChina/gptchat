package w7;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.api.Scope;
import io.sentry.android.core.AbstractC3612c;
import t7.C5682d;
import x7.AbstractC6355a;

/* renamed from: w7.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6133e extends AbstractC6355a {
    public static final Parcelable.Creator<C6133e> CREATOR = new t(5);

    /* renamed from: t0  reason: collision with root package name */
    public static final Scope[] f48122t0 = new Scope[0];

    /* renamed from: u0  reason: collision with root package name */
    public static final C5682d[] f48123u0 = new C5682d[0];

    /* renamed from: Y  reason: collision with root package name */
    public final int f48124Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f48125Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f48126h0;

    /* renamed from: i0  reason: collision with root package name */
    public String f48127i0;

    /* renamed from: j0  reason: collision with root package name */
    public IBinder f48128j0;

    /* renamed from: k0  reason: collision with root package name */
    public Scope[] f48129k0;

    /* renamed from: l0  reason: collision with root package name */
    public Bundle f48130l0;

    /* renamed from: m0  reason: collision with root package name */
    public Account f48131m0;

    /* renamed from: n0  reason: collision with root package name */
    public C5682d[] f48132n0;

    /* renamed from: o0  reason: collision with root package name */
    public C5682d[] f48133o0;

    /* renamed from: p0  reason: collision with root package name */
    public final boolean f48134p0;

    /* renamed from: q0  reason: collision with root package name */
    public final int f48135q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f48136r0;

    /* renamed from: s0  reason: collision with root package name */
    public final String f48137s0;

    public C6133e(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C5682d[] c5682dArr, C5682d[] c5682dArr2, boolean z10, int i13, boolean z11, String str2) {
        Object obj;
        scopeArr = scopeArr == null ? f48122t0 : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        C5682d[] c5682dArr3 = f48123u0;
        c5682dArr = c5682dArr == null ? c5682dArr3 : c5682dArr;
        c5682dArr2 = c5682dArr2 == null ? c5682dArr3 : c5682dArr2;
        this.f48124Y = i10;
        this.f48125Z = i11;
        this.f48126h0 = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f48127i0 = "com.google.android.gms";
        } else {
            this.f48127i0 = str;
        }
        if (i10 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i14 = AbstractBinderC6129a.f48106b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface instanceof AbstractC6135g) {
                    obj = (AbstractC6135g) queryLocalInterface;
                } else {
                    obj = new J(iBinder);
                }
                if (obj != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        try {
                            account2 = ((J) obj).g();
                        } catch (RemoteException unused) {
                            AbstractC3612c.r("AccountAccessor", "Remote account accessor probably died");
                        }
                    } finally {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                }
            }
            this.f48131m0 = account2;
        } else {
            this.f48128j0 = iBinder;
            this.f48131m0 = account;
        }
        this.f48129k0 = scopeArr;
        this.f48130l0 = bundle;
        this.f48132n0 = c5682dArr;
        this.f48133o0 = c5682dArr2;
        this.f48134p0 = z10;
        this.f48135q0 = i13;
        this.f48136r0 = z11;
        this.f48137s0 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        t.a(this, parcel, i10);
    }
}
