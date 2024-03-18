package hc;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class z implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f32238a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f32239b;

    public z(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2) {
        this.f32238a = abstractC2400f;
        this.f32239b = abstractC2400f2;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f32239b.get();
        AbstractC3557B.b0("get(...)", obj);
        return new y((androidx.lifecycle.P) this.f32238a.get(), (Ba.j) obj);
    }
}
