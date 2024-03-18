package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class o1 implements q1, IInterface {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f26952a;

    public o1(IBinder iBinder) {
        this.f26952a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f26952a;
    }

    public final int g(int i10, String str, String str2, Bundle bundle) {
        Parcel j6 = j();
        j6.writeInt(i10);
        j6.writeString(str);
        j6.writeString(str2);
        int i11 = s1.f26973a;
        j6.writeInt(1);
        bundle.writeToParcel(j6, 0);
        Parcel k10 = k(j6, 10);
        int readInt = k10.readInt();
        k10.recycle();
        return readInt;
    }

    public final void h(String str, Bundle bundle, K4.D d10) {
        Parcel j6 = j();
        j6.writeInt(18);
        j6.writeString(str);
        int i10 = s1.f26973a;
        j6.writeInt(1);
        bundle.writeToParcel(j6, 0);
        j6.writeStrongBinder(d10);
        l(j6, 1301);
    }

    public final Parcel j() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
        return obtain;
    }

    public final Parcel k(Parcel parcel, int i10) {
        parcel = Parcel.obtain();
        try {
            this.f26952a.transact(i10, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e10) {
            throw e10;
        } finally {
            parcel.recycle();
        }
    }

    public final void l(Parcel parcel, int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f26952a.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
