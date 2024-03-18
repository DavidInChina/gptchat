package H1;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import id.AbstractC3557B;
import java.util.ArrayList;
import k6.AbstractC4194d;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final long[] f7181a;

    /* renamed from: b  reason: collision with root package name */
    public final RemoteViews[] f7182b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f7183c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7184d;

    public p(Parcel parcel) {
        AbstractC3557B.c0("parcel", parcel);
        int readInt = parcel.readInt();
        long[] jArr = new long[readInt];
        this.f7181a = jArr;
        parcel.readLongArray(jArr);
        Parcelable.Creator creator = RemoteViews.CREATOR;
        AbstractC3557B.b0("CREATOR", creator);
        RemoteViews[] remoteViewsArr = new RemoteViews[readInt];
        parcel.readTypedArray(remoteViewsArr, creator);
        boolean z10 = false;
        for (int i10 = 0; i10 < readInt; i10++) {
            if (remoteViewsArr[i10] == null) {
                throw new IllegalArgumentException("null element found in " + remoteViewsArr + '.');
            }
        }
        this.f7182b = remoteViewsArr;
        this.f7183c = parcel.readInt() == 1 ? true : z10;
        this.f7184d = parcel.readInt();
    }

    public p(long[] jArr, RemoteViews[] remoteViewsArr) {
        this.f7181a = jArr;
        this.f7182b = remoteViewsArr;
        this.f7183c = false;
        this.f7184d = 1;
        if (jArr.length == remoteViewsArr.length) {
            ArrayList arrayList = new ArrayList(remoteViewsArr.length);
            for (RemoteViews remoteViews : remoteViewsArr) {
                arrayList.add(Integer.valueOf(remoteViews.getLayoutId()));
            }
            int size = kf.t.Y1(arrayList).size();
            if (size > 1) {
                throw new IllegalArgumentException(AbstractC4194d.v("View type count is set to 1, but the collection contains ", size, " different layout ids").toString());
            }
            return;
        }
        throw new IllegalArgumentException("RemoteCollectionItems has different number of ids and views".toString());
    }
}
