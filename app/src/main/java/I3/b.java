package I3;

import android.os.Parcel;
import android.util.SparseIntArray;
import w.C6049A;
import w.C6059f;

/* loaded from: classes2.dex */
public final class b extends a {

    /* renamed from: d  reason: collision with root package name */
    public final SparseIntArray f8026d;

    /* renamed from: e  reason: collision with root package name */
    public final Parcel f8027e;

    /* renamed from: f  reason: collision with root package name */
    public final int f8028f;

    /* renamed from: g  reason: collision with root package name */
    public final int f8029g;

    /* renamed from: h  reason: collision with root package name */
    public final String f8030h;

    /* renamed from: i  reason: collision with root package name */
    public int f8031i;

    /* renamed from: j  reason: collision with root package name */
    public int f8032j;

    /* renamed from: k  reason: collision with root package name */
    public int f8033k;

    /* JADX WARN: Type inference failed for: r5v0, types: [w.A, w.f] */
    /* JADX WARN: Type inference failed for: r6v0, types: [w.A, w.f] */
    /* JADX WARN: Type inference failed for: r7v0, types: [w.A, w.f] */
    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C6049A(), new C6049A(), new C6049A());
    }

    @Override // I3.a
    public final b a() {
        Parcel parcel = this.f8027e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f8032j;
        if (i10 == this.f8028f) {
            i10 = this.f8029g;
        }
        return new b(parcel, dataPosition, i10, R.a.t(new StringBuilder(), this.f8030h, "  "), this.f8023a, this.f8024b, this.f8025c);
    }

    @Override // I3.a
    public final boolean e(int i10) {
        while (this.f8032j < this.f8029g) {
            int i11 = this.f8033k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            int i12 = this.f8032j;
            Parcel parcel = this.f8027e;
            parcel.setDataPosition(i12);
            int readInt = parcel.readInt();
            this.f8033k = parcel.readInt();
            this.f8032j += readInt;
        }
        if (this.f8033k != i10) {
            return false;
        }
        return true;
    }

    @Override // I3.a
    public final void h(int i10) {
        int i11 = this.f8031i;
        SparseIntArray sparseIntArray = this.f8026d;
        Parcel parcel = this.f8027e;
        if (i11 >= 0) {
            int i12 = sparseIntArray.get(i11);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i12);
            parcel.writeInt(dataPosition - i12);
            parcel.setDataPosition(dataPosition);
        }
        this.f8031i = i10;
        sparseIntArray.put(i10, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i10);
    }

    public b(Parcel parcel, int i10, int i11, String str, C6059f c6059f, C6059f c6059f2, C6059f c6059f3) {
        super(c6059f, c6059f2, c6059f3);
        this.f8026d = new SparseIntArray();
        this.f8031i = -1;
        this.f8033k = -1;
        this.f8027e = parcel;
        this.f8028f = i10;
        this.f8029g = i11;
        this.f8032j = i10;
        this.f8030h = str;
    }
}
