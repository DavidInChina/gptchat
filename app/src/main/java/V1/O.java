package V1;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class O implements Parcelable {
    public static final Parcelable.Creator<O> CREATOR = new C1461b(4);

    /* renamed from: Y  reason: collision with root package name */
    public final String f18085Y;

    /* renamed from: Z  reason: collision with root package name */
    public final String f18086Z;

    /* renamed from: h0  reason: collision with root package name */
    public final boolean f18087h0;

    /* renamed from: i0  reason: collision with root package name */
    public final int f18088i0;

    /* renamed from: j0  reason: collision with root package name */
    public final int f18089j0;

    /* renamed from: k0  reason: collision with root package name */
    public final String f18090k0;

    /* renamed from: l0  reason: collision with root package name */
    public final boolean f18091l0;

    /* renamed from: m0  reason: collision with root package name */
    public final boolean f18092m0;

    /* renamed from: n0  reason: collision with root package name */
    public final boolean f18093n0;

    /* renamed from: o0  reason: collision with root package name */
    public final boolean f18094o0;

    /* renamed from: p0  reason: collision with root package name */
    public final int f18095p0;

    /* renamed from: q0  reason: collision with root package name */
    public final String f18096q0;

    /* renamed from: r0  reason: collision with root package name */
    public final int f18097r0;

    /* renamed from: s0  reason: collision with root package name */
    public final boolean f18098s0;

    public O(AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v) {
        this.f18085Y = abstractComponentCallbacksC1480v.getClass().getName();
        this.f18086Z = abstractComponentCallbacksC1480v.f18289j0;
        this.f18087h0 = abstractComponentCallbacksC1480v.f18297r0;
        this.f18088i0 = abstractComponentCallbacksC1480v.f18260A0;
        this.f18089j0 = abstractComponentCallbacksC1480v.f18261B0;
        this.f18090k0 = abstractComponentCallbacksC1480v.f18262C0;
        this.f18091l0 = abstractComponentCallbacksC1480v.f18265F0;
        this.f18092m0 = abstractComponentCallbacksC1480v.f18296q0;
        this.f18093n0 = abstractComponentCallbacksC1480v.f18264E0;
        this.f18094o0 = abstractComponentCallbacksC1480v.f18263D0;
        this.f18095p0 = abstractComponentCallbacksC1480v.f18277R0.ordinal();
        this.f18096q0 = abstractComponentCallbacksC1480v.f18292m0;
        this.f18097r0 = abstractComponentCallbacksC1480v.f18293n0;
        this.f18098s0 = abstractComponentCallbacksC1480v.f18271L0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f18085Y);
        sb2.append(" (");
        sb2.append(this.f18086Z);
        sb2.append(")}:");
        if (this.f18087h0) {
            sb2.append(" fromLayout");
        }
        int i10 = this.f18089j0;
        if (i10 != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(i10));
        }
        String str = this.f18090k0;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(str);
        }
        if (this.f18091l0) {
            sb2.append(" retainInstance");
        }
        if (this.f18092m0) {
            sb2.append(" removing");
        }
        if (this.f18093n0) {
            sb2.append(" detached");
        }
        if (this.f18094o0) {
            sb2.append(" hidden");
        }
        String str2 = this.f18096q0;
        if (str2 != null) {
            sb2.append(" targetWho=");
            sb2.append(str2);
            sb2.append(" targetRequestCode=");
            sb2.append(this.f18097r0);
        }
        if (this.f18098s0) {
            sb2.append(" userVisibleHint");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f18085Y);
        parcel.writeString(this.f18086Z);
        parcel.writeInt(this.f18087h0 ? 1 : 0);
        parcel.writeInt(this.f18088i0);
        parcel.writeInt(this.f18089j0);
        parcel.writeString(this.f18090k0);
        parcel.writeInt(this.f18091l0 ? 1 : 0);
        parcel.writeInt(this.f18092m0 ? 1 : 0);
        parcel.writeInt(this.f18093n0 ? 1 : 0);
        parcel.writeInt(this.f18094o0 ? 1 : 0);
        parcel.writeInt(this.f18095p0);
        parcel.writeString(this.f18096q0);
        parcel.writeInt(this.f18097r0);
        parcel.writeInt(this.f18098s0 ? 1 : 0);
    }

    public O(Parcel parcel) {
        this.f18085Y = parcel.readString();
        this.f18086Z = parcel.readString();
        boolean z10 = true;
        this.f18087h0 = parcel.readInt() != 0;
        this.f18088i0 = parcel.readInt();
        this.f18089j0 = parcel.readInt();
        this.f18090k0 = parcel.readString();
        this.f18091l0 = parcel.readInt() != 0;
        this.f18092m0 = parcel.readInt() != 0;
        this.f18093n0 = parcel.readInt() != 0;
        this.f18094o0 = parcel.readInt() != 0;
        this.f18095p0 = parcel.readInt();
        this.f18096q0 = parcel.readString();
        this.f18097r0 = parcel.readInt();
        this.f18098s0 = parcel.readInt() == 0 ? false : z10;
    }
}
