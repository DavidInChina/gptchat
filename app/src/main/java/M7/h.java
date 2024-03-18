package M7;

import android.os.Parcel;
import android.os.Parcelable;
import l8.AbstractC4344b;
import w7.s;
import w7.t;
import x7.AbstractC6355a;

/* loaded from: classes.dex */
public final class h extends AbstractC6355a {
    public static final Parcelable.Creator<h> CREATOR = new t(13);

    /* renamed from: Y  reason: collision with root package name */
    public final int f11718Y;

    /* renamed from: Z  reason: collision with root package name */
    public final s f11719Z;

    public h(int i10, s sVar) {
        this.f11718Y = i10;
        this.f11719Z = sVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int D12 = AbstractC4344b.D1(parcel, 20293);
        AbstractC4344b.G1(parcel, 1, 4);
        parcel.writeInt(this.f11718Y);
        AbstractC4344b.z1(parcel, 2, this.f11719Z, i10);
        AbstractC4344b.F1(parcel, D12);
    }
}
