package q;

import android.os.Parcel;
import android.os.Parcelable;
import k6.AbstractC4194d;

/* loaded from: classes.dex */
public final class l1 extends K1.b {
    public static final Parcelable.Creator<l1> CREATOR = new k1(0);

    /* renamed from: h0  reason: collision with root package name */
    public boolean f43450h0;

    public l1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f43450h0 = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SearchView.SavedState{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" isIconified=");
        return AbstractC4194d.w(sb2, this.f43450h0, "}");
    }

    @Override // K1.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeValue(Boolean.valueOf(this.f43450h0));
    }
}
