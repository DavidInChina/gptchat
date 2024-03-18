package Z1;

import android.widget.RemoteViews;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: e  reason: collision with root package name */
    public static final s0 f23097e = new s0(new long[0], new RemoteViews[0], false, 1);

    /* renamed from: a  reason: collision with root package name */
    public final long[] f23098a;

    /* renamed from: b  reason: collision with root package name */
    public final RemoteViews[] f23099b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f23100c;

    /* renamed from: d  reason: collision with root package name */
    public final int f23101d;

    public s0(long[] jArr, RemoteViews[] remoteViewsArr, boolean z10, int i10) {
        this.f23098a = jArr;
        this.f23099b = remoteViewsArr;
        this.f23100c = z10;
        this.f23101d = i10;
        if (jArr.length == remoteViewsArr.length) {
            if (i10 >= 1) {
                ArrayList arrayList = new ArrayList(remoteViewsArr.length);
                for (RemoteViews remoteViews : remoteViewsArr) {
                    arrayList.add(Integer.valueOf(remoteViews.getLayoutId()));
                }
                int size = kf.t.Y1(arrayList).size();
                if (size <= this.f23101d) {
                    return;
                }
                throw new IllegalArgumentException(("View type count is set to " + this.f23101d + ", but the collection contains " + size + " different layout ids").toString());
            }
            throw new IllegalArgumentException("View type count must be >= 1".toString());
        }
        throw new IllegalArgumentException("RemoteCollectionItems has different number of ids and views".toString());
    }
}
