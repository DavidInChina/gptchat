package th;

import java.lang.annotation.Annotation;
import wh.AbstractC6242g;
import yh.C6641v;
import yh.l1;

/* renamed from: th.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5796d extends AbstractC5793a implements AbstractC5798f {

    /* renamed from: e  reason: collision with root package name */
    public final Class f46215e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ C5797e f46216f;

    public C5796d(C5797e c5797e, Class cls) {
        this.f46216f = c5797e;
        this.f46215e = cls;
    }

    @Override // th.AbstractC5798f
    public final Annotation a() {
        Class cls = this.f46215e;
        return C5794b.a(cls.getClassLoader(), cls, this.f46216f.f46218f);
    }

    @Override // th.AbstractC5802j
    public final AbstractC5798f b(Class cls) {
        return this.f46216f.b(cls);
    }

    @Override // th.AbstractC5802j
    public final h0 c(AbstractC6242g abstractC6242g) {
        return this.f46216f.c(abstractC6242g);
    }

    @Override // th.AbstractC5802j
    public final l1 d() {
        return C6641v.l1(this.f46215e);
    }
}
