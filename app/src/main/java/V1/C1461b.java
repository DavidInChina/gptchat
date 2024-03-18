package V1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: V1.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1461b implements Parcelable.Creator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f18156a;

    /* JADX WARN: Type inference failed for: r0v3, types: [V1.H, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, V1.L] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f18156a) {
            case 0:
                return new C1462c(parcel);
            case 1:
                return new C1463d(parcel);
            case 2:
                ?? obj = new Object();
                obj.f18025Y = parcel.readString();
                obj.f18026Z = parcel.readInt();
                return obj;
            case 3:
                ?? obj2 = new Object();
                obj2.f18074j0 = null;
                obj2.f18075k0 = new ArrayList();
                obj2.f18076l0 = new ArrayList();
                obj2.f18070Y = parcel.createStringArrayList();
                obj2.f18071Z = parcel.createStringArrayList();
                obj2.f18072h0 = (C1462c[]) parcel.createTypedArray(C1462c.CREATOR);
                obj2.f18073i0 = parcel.readInt();
                obj2.f18074j0 = parcel.readString();
                obj2.f18075k0 = parcel.createStringArrayList();
                obj2.f18076l0 = parcel.createTypedArrayList(C1463d.CREATOR);
                obj2.f18077m0 = parcel.createTypedArrayList(H.CREATOR);
                return obj2;
            default:
                return new O(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f18156a) {
            case 0:
                return new C1462c[i10];
            case 1:
                return new C1463d[i10];
            case 2:
                return new H[i10];
            case 3:
                return new L[i10];
            default:
                return new O[i10];
        }
    }
}
