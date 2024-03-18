package V1;

import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class Y implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f18127Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ ArrayList f18128Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ ArrayList f18129h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ ArrayList f18130i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ ArrayList f18131j0;

    public Y(int i10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f18127Y = i10;
        this.f18128Z = arrayList;
        this.f18129h0 = arrayList2;
        this.f18130i0 = arrayList3;
        this.f18131j0 = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i10 = 0; i10 < this.f18127Y; i10++) {
            WeakHashMap weakHashMap = D1.Z.f3247a;
            D1.N.v((View) this.f18128Z.get(i10), (String) this.f18129h0.get(i10));
            D1.N.v((View) this.f18130i0.get(i10), (String) this.f18131j0.get(i10));
        }
    }
}
