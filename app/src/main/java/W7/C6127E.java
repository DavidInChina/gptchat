package w7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import l8.AbstractC4344b;
import t7.C5682d;
import x7.AbstractC6355a;

/* renamed from: w7.E  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6127E extends AbstractC6355a {
    public static final Parcelable.Creator<C6127E> CREATOR = new t(3);

    /* renamed from: Y  reason: collision with root package name */
    public Bundle f48079Y;

    /* renamed from: Z  reason: collision with root package name */
    public C5682d[] f48080Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f48081h0;

    /* renamed from: i0  reason: collision with root package name */
    public C6132d f48082i0;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int D12 = AbstractC4344b.D1(parcel, 20293);
        AbstractC4344b.x1(parcel, 1, this.f48079Y);
        AbstractC4344b.B1(parcel, 2, this.f48080Z, i10);
        AbstractC4344b.G1(parcel, 3, 4);
        parcel.writeInt(this.f48081h0);
        AbstractC4344b.z1(parcel, 4, this.f48082i0, i10);
        AbstractC4344b.F1(parcel, D12);
    }
}
