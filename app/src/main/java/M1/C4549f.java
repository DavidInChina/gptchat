package m1;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import q.k1;

/* renamed from: m1.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4549f extends K1.b {
    public static final Parcelable.Creator<C4549f> CREATOR = new k1(3);

    /* renamed from: h0  reason: collision with root package name */
    public SparseArray f38868h0;

    public C4549f(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        this.f38868h0 = new SparseArray(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f38868h0.append(iArr[i10], readParcelableArray[i10]);
        }
    }

    @Override // K1.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11;
        super.writeToParcel(parcel, i10);
        SparseArray sparseArray = this.f38868h0;
        if (sparseArray != null) {
            i11 = sparseArray.size();
        } else {
            i11 = 0;
        }
        parcel.writeInt(i11);
        int[] iArr = new int[i11];
        Parcelable[] parcelableArr = new Parcelable[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            iArr[i12] = this.f38868h0.keyAt(i12);
            parcelableArr[i12] = (Parcelable) this.f38868h0.valueAt(i12);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i10);
    }
}
