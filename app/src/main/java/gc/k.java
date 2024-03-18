package gc;

import jf.y;

/* loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ p f31562Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C3251c f31563Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p pVar, C3251c c3251c) {
        super(1);
        this.f31562Y = pVar;
        this.f31563Z = c3251c;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        ((Boolean) obj).booleanValue();
        C3251c c3251c = this.f31563Z;
        this.f31562Y.j(new C3254f(c3251c.f31550a, !c3251c.f31551b));
        return y.f36177a;
    }
}
