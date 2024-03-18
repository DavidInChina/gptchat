package H1;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import j.C3871a;

/* loaded from: classes2.dex */
public final class l extends View.BaseSavedState {
    public static final Parcelable.Creator<l> CREATOR = new C3871a(7);

    /* renamed from: Y  reason: collision with root package name */
    public int f7180Y;

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HorizontalScrollView.SavedState{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" scrollPosition=");
        return android.gov.nist.core.a.l(sb2, this.f7180Y, "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f7180Y);
    }
}
