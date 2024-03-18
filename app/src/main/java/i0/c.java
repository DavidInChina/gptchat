package i0;

import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ d f32401Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar) {
        super(0);
        this.f32401Y = dVar;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        d dVar = this.f32401Y;
        q qVar = dVar.f32402Y;
        Object obj = dVar.f32405i0;
        if (obj != null) {
            return qVar.a(dVar, obj);
        }
        throw new IllegalArgumentException("Value should be initialized".toString());
    }
}
