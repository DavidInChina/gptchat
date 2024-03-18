package w7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import l8.AbstractC4344b;
import t7.C5680b;
import x7.AbstractC6355a;

/* loaded from: classes2.dex */
public final class u extends AbstractC6355a {
    public static final Parcelable.Creator<u> CREATOR = new t(1);

    /* renamed from: Y  reason: collision with root package name */
    public final int f48200Y;

    /* renamed from: Z  reason: collision with root package name */
    public final IBinder f48201Z;

    /* renamed from: h0  reason: collision with root package name */
    public final C5680b f48202h0;

    /* renamed from: i0  reason: collision with root package name */
    public final boolean f48203i0;

    /* renamed from: j0  reason: collision with root package name */
    public final boolean f48204j0;

    public u(int i10, IBinder iBinder, C5680b c5680b, boolean z10, boolean z11) {
        this.f48200Y = i10;
        this.f48201Z = iBinder;
        this.f48202h0 = c5680b;
        this.f48203i0 = z10;
        this.f48204j0 = z11;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object j6;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f48202h0.equals(uVar.f48202h0)) {
            Object obj3 = null;
            IBinder iBinder = this.f48201Z;
            if (iBinder == null) {
                obj2 = null;
            } else {
                int i10 = AbstractBinderC6129a.f48106b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface instanceof AbstractC6135g) {
                    obj2 = (AbstractC6135g) queryLocalInterface;
                } else {
                    obj2 = new J(iBinder);
                }
            }
            IBinder iBinder2 = uVar.f48201Z;
            if (iBinder2 != null) {
                int i11 = AbstractBinderC6129a.f48106b;
                IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface2 instanceof AbstractC6135g) {
                    j6 = (AbstractC6135g) queryLocalInterface2;
                } else {
                    j6 = new J(iBinder2);
                }
                obj3 = j6;
            }
            if (M3.H.P(obj2, obj3)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int D12 = AbstractC4344b.D1(parcel, 20293);
        AbstractC4344b.G1(parcel, 1, 4);
        parcel.writeInt(this.f48200Y);
        AbstractC4344b.y1(parcel, 2, this.f48201Z);
        AbstractC4344b.z1(parcel, 3, this.f48202h0, i10);
        AbstractC4344b.G1(parcel, 4, 4);
        parcel.writeInt(this.f48203i0 ? 1 : 0);
        AbstractC4344b.G1(parcel, 5, 4);
        parcel.writeInt(this.f48204j0 ? 1 : 0);
        AbstractC4344b.F1(parcel, D12);
    }
}
