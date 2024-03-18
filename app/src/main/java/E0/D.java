package E0;

import java.util.Map;

/* loaded from: classes.dex */
public final class D implements O {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3993a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f3994b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Map f3995c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ E f3996d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ J f3997e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ wf.k f3998f;

    public D(int i10, int i11, Map map, E e10, J j6, wf.k kVar) {
        this.f3993a = i10;
        this.f3994b = i11;
        this.f3995c = map;
        this.f3996d = e10;
        this.f3997e = j6;
        this.f3998f = kVar;
    }

    @Override // E0.O
    public final Map a() {
        return this.f3995c;
    }

    @Override // E0.O
    public final void b() {
        G0.T t10;
        boolean P = this.f3996d.P();
        wf.k kVar = this.f3998f;
        J j6 = this.f3997e;
        if (P && (t10 = j6.f4012Y.f24831B0.f5701b.f5847M0) != null) {
            kVar.invoke(t10.f5672m0);
        } else {
            kVar.invoke(j6.f4012Y.f24831B0.f5701b.f5672m0);
        }
    }

    @Override // E0.O
    public final int getHeight() {
        return this.f3994b;
    }

    @Override // E0.O
    public final int getWidth() {
        return this.f3993a;
    }
}
