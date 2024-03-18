package V7;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import w7.t;

/* loaded from: classes2.dex */
public final class b extends View.BaseSavedState {
    public static final Parcelable.Creator<b> CREATOR = new t(15);

    /* renamed from: Y  reason: collision with root package name */
    public int f18413Y;

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("MaterialCheckBox.SavedState{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" CheckedState=");
        int i10 = this.f18413Y;
        if (i10 != 1) {
            if (i10 != 2) {
                str = "unchecked";
            } else {
                str = "indeterminate";
            }
        } else {
            str = "checked";
        }
        return R.a.t(sb2, str, "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeValue(Integer.valueOf(this.f18413Y));
    }
}
