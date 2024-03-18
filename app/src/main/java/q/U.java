package q;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import j.C3871a;

/* loaded from: classes.dex */
public final class U extends View.BaseSavedState {
    public static final Parcelable.Creator<U> CREATOR = new C3871a(2);

    /* renamed from: Y  reason: collision with root package name */
    public boolean f43361Y;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeByte(this.f43361Y ? (byte) 1 : (byte) 0);
    }
}
