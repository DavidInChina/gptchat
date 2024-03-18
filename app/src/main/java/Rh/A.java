package Rh;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class A extends F implements G {

    /* renamed from: Y  reason: collision with root package name */
    public final ArrayList f15595Y = new ArrayList();

    /* renamed from: Z  reason: collision with root package name */
    public String f15596Z;

    /* renamed from: h0  reason: collision with root package name */
    public ArrayList f15597h0;

    @Override // Rh.F, Ph.a
    public final Ph.a c() {
        return new E(this);
    }

    @Override // Rh.G
    public final void d(AbstractC1337y0 abstractC1337y0) {
        ArrayList arrayList = this.f15597h0;
        if (arrayList != null) {
            arrayList.add(abstractC1337y0);
            return;
        }
        throw new IllegalStateException("Did not expect " + abstractC1337y0 + " before finding formal parameter");
    }

    @Override // Rh.F, Ph.a
    public final void h(String str) {
        r();
        this.f15596Z = str;
        this.f15597h0 = new ArrayList();
    }

    @Override // Rh.F, Ph.a
    public final Ph.a k() {
        return new E(this);
    }

    public final void r() {
        String str = this.f15596Z;
        if (str != null) {
            this.f15595Y.add(new C1292b0(str, this.f15597h0));
        }
    }
}
