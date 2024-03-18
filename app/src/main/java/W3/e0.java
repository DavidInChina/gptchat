package w3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class e0 implements Parcelable {
    public static final Parcelable.Creator<e0> CREATOR = new Y2.n(14);

    /* renamed from: Y  reason: collision with root package name */
    public int f47852Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f47853Z;

    /* renamed from: h0  reason: collision with root package name */
    public int[] f47854h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f47855i0;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f47852Y + ", mGapDir=" + this.f47853Z + ", mHasUnwantedGapAfter=" + this.f47855i0 + ", mGapPerSpan=" + Arrays.toString(this.f47854h0) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f47852Y);
        parcel.writeInt(this.f47853Z);
        parcel.writeInt(this.f47855i0 ? 1 : 0);
        int[] iArr = this.f47854h0;
        if (iArr != null && iArr.length > 0) {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f47854h0);
            return;
        }
        parcel.writeInt(0);
    }
}
