package g8;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;
import q.k1;

/* renamed from: g8.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3209c extends K1.b {
    public static final Parcelable.Creator<C3209c> CREATOR = new k1(10);

    /* renamed from: h0  reason: collision with root package name */
    public final int f31308h0;

    public C3209c(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f31308h0 = parcel.readInt();
    }

    @Override // K1.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f31308h0);
    }

    public C3209c(AbsSavedState absSavedState, SideSheetBehavior sideSheetBehavior) {
        super(absSavedState);
        this.f31308h0 = sideSheetBehavior.f27235h;
    }
}
