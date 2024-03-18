package s7;

import Y2.n;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import l8.AbstractC4344b;
import x7.AbstractC6355a;

/* renamed from: s7.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5580a extends AbstractC6355a {
    public static final Parcelable.Creator<C5580a> CREATOR = new n(21);

    /* renamed from: Y  reason: collision with root package name */
    public final int f45421Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f45422Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Bundle f45423h0;

    public C5580a(int i10, int i11, Bundle bundle) {
        this.f45421Y = i10;
        this.f45422Z = i11;
        this.f45423h0 = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int D12 = AbstractC4344b.D1(parcel, 20293);
        AbstractC4344b.G1(parcel, 1, 4);
        parcel.writeInt(this.f45421Y);
        AbstractC4344b.G1(parcel, 2, 4);
        parcel.writeInt(this.f45422Z);
        AbstractC4344b.x1(parcel, 3, this.f45423h0);
        AbstractC4344b.F1(parcel, D12);
    }
}
