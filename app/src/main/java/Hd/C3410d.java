package hd;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import com.openai.experiment.t;
import id.AbstractC3557B;
import nd.AbstractC4816e;

/* renamed from: hd.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3410d implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f32247a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f32248b;

    public C3410d(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2) {
        this.f32247a = abstractC2400f;
        this.f32248b = abstractC2400f2;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f32247a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f32248b.get();
        AbstractC3557B.b0("get(...)", obj2);
        return new C3409c((t) obj, (AbstractC4816e) obj2);
    }
}
