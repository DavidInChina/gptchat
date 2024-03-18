package G3;

import android.view.View;
import java.util.ArrayList;

/* renamed from: G3.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0607k implements r {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f5925a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f5926b;

    public C0607k(View view, ArrayList arrayList) {
        this.f5925a = view;
        this.f5926b = arrayList;
    }

    @Override // G3.r
    public final void c(s sVar) {
        sVar.w(this);
        sVar.a(this);
    }

    @Override // G3.r
    public final void d(s sVar) {
        sVar.w(this);
        this.f5925a.setVisibility(8);
        ArrayList arrayList = this.f5926b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((View) arrayList.get(i10)).setVisibility(0);
        }
    }

    @Override // G3.r
    public final void a() {
    }

    @Override // G3.r
    public final void b() {
    }

    @Override // G3.r
    public final void e() {
    }
}
