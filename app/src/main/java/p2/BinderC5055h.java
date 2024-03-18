package p2;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import s2.AbstractC5530A;

/* renamed from: p2.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC5055h extends Binder {

    /* renamed from: b  reason: collision with root package name */
    public static final int f42067b;

    /* renamed from: a  reason: collision with root package name */
    public final x8.N f42068a;

    static {
        int i10;
        if (AbstractC5530A.f45131a >= 30) {
            i10 = IBinder.getSuggestedMaxIpcSizeBytes();
        } else {
            i10 = 65536;
        }
        f42067b = i10;
    }

    public BinderC5055h(ArrayList arrayList) {
        this.f42068a = x8.N.V(arrayList);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return super.onTransact(i10, parcel, parcel2, i11);
        }
        int i12 = 0;
        if (parcel2 == null) {
            return false;
        }
        x8.N n10 = this.f42068a;
        int size = n10.size();
        int readInt = parcel.readInt();
        while (readInt < size && parcel2.dataSize() < f42067b) {
            parcel2.writeInt(1);
            parcel2.writeBundle((Bundle) n10.get(readInt));
            readInt++;
        }
        if (readInt < size) {
            i12 = 2;
        }
        parcel2.writeInt(i12);
        return true;
    }
}
