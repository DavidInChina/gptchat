package o1;

import a1.C1915c;
import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: o1.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4900o extends C1915c {

    /* renamed from: k0  reason: collision with root package name */
    public static HandlerThread f40468k0;

    /* renamed from: l0  reason: collision with root package name */
    public static Handler f40469l0;

    /* renamed from: Z  reason: collision with root package name */
    public final int f40470Z;

    /* renamed from: h0  reason: collision with root package name */
    public SparseIntArray[] f40471h0 = new SparseIntArray[9];

    /* renamed from: i0  reason: collision with root package name */
    public final ArrayList f40472i0 = new ArrayList();

    /* renamed from: j0  reason: collision with root package name */
    public final Window$OnFrameMetricsAvailableListenerC4899n f40473j0 = new Window$OnFrameMetricsAvailableListenerC4899n(0, this);

    public C4900o(int i10) {
        super(1);
        this.f40470Z = i10;
    }

    public static void y(SparseIntArray sparseIntArray, long j6) {
        if (sparseIntArray != null) {
            int i10 = (int) ((500000 + j6) / 1000000);
            if (j6 >= 0) {
                sparseIntArray.put(i10, sparseIntArray.get(i10) + 1);
            }
        }
    }

    @Override // a1.C1915c
    public final void g(Activity activity) {
        if (f40468k0 == null) {
            HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
            f40468k0 = handlerThread;
            handlerThread.start();
            f40469l0 = new Handler(f40468k0.getLooper());
        }
        for (int i10 = 0; i10 <= 8; i10++) {
            SparseIntArray[] sparseIntArrayArr = this.f40471h0;
            if (sparseIntArrayArr[i10] == null && (this.f40470Z & (1 << i10)) != 0) {
                sparseIntArrayArr[i10] = new SparseIntArray();
            }
        }
        activity.getWindow().addOnFrameMetricsAvailableListener(this.f40473j0, f40469l0);
        this.f40472i0.add(new WeakReference(activity));
    }

    @Override // a1.C1915c
    public final SparseIntArray[] m() {
        return this.f40471h0;
    }

    @Override // a1.C1915c
    public final SparseIntArray[] t(Activity activity) {
        ArrayList arrayList = this.f40472i0;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == activity) {
                arrayList.remove(weakReference);
                break;
            }
        }
        activity.getWindow().removeOnFrameMetricsAvailableListener(this.f40473j0);
        return this.f40471h0;
    }

    @Override // a1.C1915c
    public final SparseIntArray[] u() {
        SparseIntArray[] sparseIntArrayArr = this.f40471h0;
        this.f40471h0 = new SparseIntArray[9];
        return sparseIntArrayArr;
    }

    @Override // a1.C1915c
    public final SparseIntArray[] x() {
        ArrayList arrayList = this.f40472i0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            WeakReference weakReference = (WeakReference) arrayList.get(size);
            Activity activity = (Activity) weakReference.get();
            if (weakReference.get() != null) {
                activity.getWindow().removeOnFrameMetricsAvailableListener(this.f40473j0);
                arrayList.remove(size);
            }
        }
        return this.f40471h0;
    }
}
