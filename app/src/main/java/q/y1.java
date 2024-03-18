package q;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class y1 extends K1.b {
    public static final Parcelable.Creator<y1> CREATOR = new k1(1);

    /* renamed from: h0  reason: collision with root package name */
    public int f43589h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f43590i0;

    public y1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        boolean z10;
        this.f43589h0 = parcel.readInt();
        if (parcel.readInt() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f43590i0 = z10;
    }

    @Override // K1.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f43589h0);
        parcel.writeInt(this.f43590i0 ? 1 : 0);
    }
}
