package t3;

import androidx.lifecycle.AbstractC2084t;
import androidx.lifecycle.AbstractC2086v;
import androidx.lifecycle.EnumC2081p;
import java.util.List;
import s3.C5562l;

/* loaded from: classes2.dex */
public final class k implements AbstractC2084t {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ boolean f45693Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ List f45694Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C5562l f45695h0;

    public k(C5562l c5562l, List list, boolean z10) {
        this.f45693Y = z10;
        this.f45694Z = list;
        this.f45695h0 = c5562l;
    }

    @Override // androidx.lifecycle.AbstractC2084t
    public final void b(AbstractC2086v abstractC2086v, EnumC2081p enumC2081p) {
        boolean z10 = this.f45693Y;
        C5562l c5562l = this.f45695h0;
        List list = this.f45694Z;
        if (z10 && !list.contains(c5562l)) {
            list.add(c5562l);
        }
        if (enumC2081p == EnumC2081p.ON_START && !list.contains(c5562l)) {
            list.add(c5562l);
        }
        if (enumC2081p == EnumC2081p.ON_STOP) {
            list.remove(c5562l);
        }
    }
}
