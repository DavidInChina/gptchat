package a3;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final long f23883a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f23884b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f23885c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f23886d;

    /* renamed from: e  reason: collision with root package name */
    public final long f23887e;

    /* renamed from: f  reason: collision with root package name */
    public final List f23888f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f23889g;

    /* renamed from: h  reason: collision with root package name */
    public final long f23890h;

    /* renamed from: i  reason: collision with root package name */
    public final int f23891i;

    /* renamed from: j  reason: collision with root package name */
    public final int f23892j;

    /* renamed from: k  reason: collision with root package name */
    public final int f23893k;

    public h(long j6, boolean z10, boolean z11, boolean z12, ArrayList arrayList, long j10, boolean z13, long j11, int i10, int i11, int i12) {
        this.f23883a = j6;
        this.f23884b = z10;
        this.f23885c = z11;
        this.f23886d = z12;
        this.f23888f = Collections.unmodifiableList(arrayList);
        this.f23887e = j10;
        this.f23889g = z13;
        this.f23890h = j11;
        this.f23891i = i10;
        this.f23892j = i11;
        this.f23893k = i12;
    }

    public h(Parcel parcel) {
        this.f23883a = parcel.readLong();
        boolean z10 = false;
        this.f23884b = parcel.readByte() == 1;
        this.f23885c = parcel.readByte() == 1;
        this.f23886d = parcel.readByte() == 1;
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(new C1929g(parcel.readInt(), parcel.readLong()));
        }
        this.f23888f = Collections.unmodifiableList(arrayList);
        this.f23887e = parcel.readLong();
        this.f23889g = parcel.readByte() == 1 ? true : z10;
        this.f23890h = parcel.readLong();
        this.f23891i = parcel.readInt();
        this.f23892j = parcel.readInt();
        this.f23893k = parcel.readInt();
    }
}
