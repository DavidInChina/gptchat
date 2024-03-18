package M7;

import android.os.Parcel;
import android.os.Parcelable;
import l8.AbstractC4344b;
import t7.C5680b;
import w7.t;
import w7.u;
import x7.AbstractC6355a;

/* loaded from: classes.dex */
public final class i extends AbstractC6355a {
    public static final Parcelable.Creator<i> CREATOR = new t(14);

    /* renamed from: Y  reason: collision with root package name */
    public final int f11720Y;

    /* renamed from: Z  reason: collision with root package name */
    public final C5680b f11721Z;

    /* renamed from: h0  reason: collision with root package name */
    public final u f11722h0;

    public i(int i10, C5680b c5680b, u uVar) {
        this.f11720Y = i10;
        this.f11721Z = c5680b;
        this.f11722h0 = uVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int D12 = AbstractC4344b.D1(parcel, 20293);
        AbstractC4344b.G1(parcel, 1, 4);
        parcel.writeInt(this.f11720Y);
        AbstractC4344b.z1(parcel, 2, this.f11721Z, i10);
        AbstractC4344b.z1(parcel, 3, this.f11722h0, i10);
        AbstractC4344b.F1(parcel, D12);
    }
}
