package w7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import l8.AbstractC4344b;
import x7.AbstractC6355a;

/* loaded from: classes2.dex */
public final class l extends AbstractC6355a {
    public static final Parcelable.Creator<l> CREATOR = new Y2.n(28);

    /* renamed from: Y  reason: collision with root package name */
    public final int f48181Y;

    /* renamed from: Z  reason: collision with root package name */
    public List f48182Z;

    public l(int i10, List list) {
        this.f48181Y = i10;
        this.f48182Z = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int D12 = AbstractC4344b.D1(parcel, 20293);
        AbstractC4344b.G1(parcel, 1, 4);
        parcel.writeInt(this.f48181Y);
        AbstractC4344b.C1(parcel, 2, this.f48182Z);
        AbstractC4344b.F1(parcel, D12);
    }
}
