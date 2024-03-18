package a3;

import Y2.n;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class i extends AbstractC1924b {
    public static final Parcelable.Creator<i> CREATOR = new n(9);

    /* renamed from: Y  reason: collision with root package name */
    public final List f23894Y;

    public i(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(new h(parcel));
        }
        this.f23894Y = Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f23894Y;
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = (h) list.get(i11);
            parcel.writeLong(hVar.f23883a);
            parcel.writeByte(hVar.f23884b ? (byte) 1 : (byte) 0);
            parcel.writeByte(hVar.f23885c ? (byte) 1 : (byte) 0);
            parcel.writeByte(hVar.f23886d ? (byte) 1 : (byte) 0);
            List list2 = hVar.f23888f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i12 = 0; i12 < size2; i12++) {
                C1929g c1929g = (C1929g) list2.get(i12);
                parcel.writeInt(c1929g.f23881a);
                parcel.writeLong(c1929g.f23882b);
            }
            parcel.writeLong(hVar.f23887e);
            parcel.writeByte(hVar.f23889g ? (byte) 1 : (byte) 0);
            parcel.writeLong(hVar.f23890h);
            parcel.writeInt(hVar.f23891i);
            parcel.writeInt(hVar.f23892j);
            parcel.writeInt(hVar.f23893k);
        }
    }

    public i(ArrayList arrayList) {
        this.f23894Y = Collections.unmodifiableList(arrayList);
    }
}
