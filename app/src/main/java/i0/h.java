package i0;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ j f32415Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar) {
        super(1);
        this.f32415Y = jVar;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        boolean z10;
        m mVar = this.f32415Y.f32423c;
        if (mVar != null) {
            z10 = mVar.a(obj);
        } else {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }
}
