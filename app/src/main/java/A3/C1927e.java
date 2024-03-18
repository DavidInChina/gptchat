package a3;

import Y2.n;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: a3.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1927e extends AbstractC1924b {
    public static final Parcelable.Creator<C1927e> CREATOR = new n(7);

    /* renamed from: Y  reason: collision with root package name */
    public final long f23868Y;

    /* renamed from: Z  reason: collision with root package name */
    public final boolean f23869Z;

    /* renamed from: h0  reason: collision with root package name */
    public final boolean f23870h0;

    /* renamed from: i0  reason: collision with root package name */
    public final boolean f23871i0;

    /* renamed from: j0  reason: collision with root package name */
    public final boolean f23872j0;

    /* renamed from: k0  reason: collision with root package name */
    public final long f23873k0;

    /* renamed from: l0  reason: collision with root package name */
    public final long f23874l0;

    /* renamed from: m0  reason: collision with root package name */
    public final List f23875m0;

    /* renamed from: n0  reason: collision with root package name */
    public final boolean f23876n0;

    /* renamed from: o0  reason: collision with root package name */
    public final long f23877o0;

    /* renamed from: p0  reason: collision with root package name */
    public final int f23878p0;

    /* renamed from: q0  reason: collision with root package name */
    public final int f23879q0;

    /* renamed from: r0  reason: collision with root package name */
    public final int f23880r0;

    public C1927e(long j6, boolean z10, boolean z11, boolean z12, boolean z13, long j10, long j11, List list, boolean z14, long j12, int i10, int i11, int i12) {
        this.f23868Y = j6;
        this.f23869Z = z10;
        this.f23870h0 = z11;
        this.f23871i0 = z12;
        this.f23872j0 = z13;
        this.f23873k0 = j10;
        this.f23874l0 = j11;
        this.f23875m0 = Collections.unmodifiableList(list);
        this.f23876n0 = z14;
        this.f23877o0 = j12;
        this.f23878p0 = i10;
        this.f23879q0 = i11;
        this.f23880r0 = i12;
    }

    @Override // a3.AbstractC1924b
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb2.append(this.f23873k0);
        sb2.append(", programSplicePlaybackPositionUs= ");
        return android.gov.nist.core.a.m(sb2, this.f23874l0, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f23868Y);
        parcel.writeByte(this.f23869Z ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f23870h0 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f23871i0 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f23872j0 ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f23873k0);
        parcel.writeLong(this.f23874l0);
        List list = this.f23875m0;
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            C1926d c1926d = (C1926d) list.get(i11);
            parcel.writeInt(c1926d.f23865a);
            parcel.writeLong(c1926d.f23866b);
            parcel.writeLong(c1926d.f23867c);
        }
        parcel.writeByte(this.f23876n0 ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f23877o0);
        parcel.writeInt(this.f23878p0);
        parcel.writeInt(this.f23879q0);
        parcel.writeInt(this.f23880r0);
    }

    public C1927e(Parcel parcel) {
        this.f23868Y = parcel.readLong();
        boolean z10 = true;
        this.f23869Z = parcel.readByte() == 1;
        this.f23870h0 = parcel.readByte() == 1;
        this.f23871i0 = parcel.readByte() == 1;
        this.f23872j0 = parcel.readByte() == 1;
        this.f23873k0 = parcel.readLong();
        this.f23874l0 = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(new C1926d(parcel.readLong(), parcel.readInt(), parcel.readLong()));
        }
        this.f23875m0 = Collections.unmodifiableList(arrayList);
        this.f23876n0 = parcel.readByte() != 1 ? false : z10;
        this.f23877o0 = parcel.readLong();
        this.f23878p0 = parcel.readInt();
        this.f23879q0 = parcel.readInt();
        this.f23880r0 = parcel.readInt();
    }
}
