package S7;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import q.k1;

/* loaded from: classes.dex */
public final class c extends K1.b {
    public static final Parcelable.Creator<c> CREATOR = new k1(7);

    /* renamed from: h0  reason: collision with root package name */
    public final int f16195h0;

    /* renamed from: i0  reason: collision with root package name */
    public final int f16196i0;

    /* renamed from: j0  reason: collision with root package name */
    public final boolean f16197j0;

    /* renamed from: k0  reason: collision with root package name */
    public final boolean f16198k0;

    /* renamed from: l0  reason: collision with root package name */
    public final boolean f16199l0;

    public c(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f16195h0 = parcel.readInt();
        this.f16196i0 = parcel.readInt();
        boolean z10 = false;
        this.f16197j0 = parcel.readInt() == 1;
        this.f16198k0 = parcel.readInt() == 1;
        this.f16199l0 = parcel.readInt() == 1 ? true : z10;
    }

    @Override // K1.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f16195h0);
        parcel.writeInt(this.f16196i0);
        parcel.writeInt(this.f16197j0 ? 1 : 0);
        parcel.writeInt(this.f16198k0 ? 1 : 0);
        parcel.writeInt(this.f16199l0 ? 1 : 0);
    }

    public c(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.f16195h0 = bottomSheetBehavior.f27030L;
        this.f16196i0 = bottomSheetBehavior.f27049e;
        this.f16197j0 = bottomSheetBehavior.f27043b;
        this.f16198k0 = bottomSheetBehavior.f27027I;
        this.f16199l0 = bottomSheetBehavior.f27028J;
    }
}
