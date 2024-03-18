package V1;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: V1.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1462c implements Parcelable {
    public static final Parcelable.Creator<C1462c> CREATOR = new C1461b(0);

    /* renamed from: Y  reason: collision with root package name */
    public final int[] f18160Y;

    /* renamed from: Z  reason: collision with root package name */
    public final ArrayList f18161Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int[] f18162h0;

    /* renamed from: i0  reason: collision with root package name */
    public final int[] f18163i0;

    /* renamed from: j0  reason: collision with root package name */
    public final int f18164j0;

    /* renamed from: k0  reason: collision with root package name */
    public final String f18165k0;

    /* renamed from: l0  reason: collision with root package name */
    public final int f18166l0;

    /* renamed from: m0  reason: collision with root package name */
    public final int f18167m0;

    /* renamed from: n0  reason: collision with root package name */
    public final CharSequence f18168n0;

    /* renamed from: o0  reason: collision with root package name */
    public final int f18169o0;

    /* renamed from: p0  reason: collision with root package name */
    public final CharSequence f18170p0;

    /* renamed from: q0  reason: collision with root package name */
    public final ArrayList f18171q0;

    /* renamed from: r0  reason: collision with root package name */
    public final ArrayList f18172r0;

    /* renamed from: s0  reason: collision with root package name */
    public final boolean f18173s0;

    public C1462c(C1460a c1460a) {
        int size = c1460a.f18132a.size();
        this.f18160Y = new int[size * 6];
        if (c1460a.f18138g) {
            this.f18161Z = new ArrayList(size);
            this.f18162h0 = new int[size];
            this.f18163i0 = new int[size];
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                Q q10 = (Q) c1460a.f18132a.get(i11);
                int i12 = i10 + 1;
                this.f18160Y[i10] = q10.f18104a;
                ArrayList arrayList = this.f18161Z;
                AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = q10.f18105b;
                arrayList.add(abstractComponentCallbacksC1480v != null ? abstractComponentCallbacksC1480v.f18289j0 : null);
                int[] iArr = this.f18160Y;
                iArr[i12] = q10.f18106c ? 1 : 0;
                iArr[i10 + 2] = q10.f18107d;
                iArr[i10 + 3] = q10.f18108e;
                int i13 = i10 + 5;
                iArr[i10 + 4] = q10.f18109f;
                i10 += 6;
                iArr[i13] = q10.f18110g;
                this.f18162h0[i11] = q10.f18111h.ordinal();
                this.f18163i0[i11] = q10.f18112i.ordinal();
            }
            this.f18164j0 = c1460a.f18137f;
            this.f18165k0 = c1460a.f18139h;
            this.f18166l0 = c1460a.f18149r;
            this.f18167m0 = c1460a.f18140i;
            this.f18168n0 = c1460a.f18141j;
            this.f18169o0 = c1460a.f18142k;
            this.f18170p0 = c1460a.f18143l;
            this.f18171q0 = c1460a.f18144m;
            this.f18172r0 = c1460a.f18145n;
            this.f18173s0 = c1460a.f18146o;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f18160Y);
        parcel.writeStringList(this.f18161Z);
        parcel.writeIntArray(this.f18162h0);
        parcel.writeIntArray(this.f18163i0);
        parcel.writeInt(this.f18164j0);
        parcel.writeString(this.f18165k0);
        parcel.writeInt(this.f18166l0);
        parcel.writeInt(this.f18167m0);
        TextUtils.writeToParcel(this.f18168n0, parcel, 0);
        parcel.writeInt(this.f18169o0);
        TextUtils.writeToParcel(this.f18170p0, parcel, 0);
        parcel.writeStringList(this.f18171q0);
        parcel.writeStringList(this.f18172r0);
        parcel.writeInt(this.f18173s0 ? 1 : 0);
    }

    public C1462c(Parcel parcel) {
        this.f18160Y = parcel.createIntArray();
        this.f18161Z = parcel.createStringArrayList();
        this.f18162h0 = parcel.createIntArray();
        this.f18163i0 = parcel.createIntArray();
        this.f18164j0 = parcel.readInt();
        this.f18165k0 = parcel.readString();
        this.f18166l0 = parcel.readInt();
        this.f18167m0 = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f18168n0 = (CharSequence) creator.createFromParcel(parcel);
        this.f18169o0 = parcel.readInt();
        this.f18170p0 = (CharSequence) creator.createFromParcel(parcel);
        this.f18171q0 = parcel.createStringArrayList();
        this.f18172r0 = parcel.createStringArrayList();
        this.f18173s0 = parcel.readInt() != 0;
    }
}
