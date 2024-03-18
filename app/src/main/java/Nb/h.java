package nb;

import android.app.Application;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;
import o9.AbstractC4954b;
import o9.C4953a;

/* loaded from: classes.dex */
public final class h implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f40185a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f40186b;

    public h(AbstractC2400f abstractC2400f) {
        j9.g gVar = AbstractC4954b.f40985a;
        this.f40185a = abstractC2400f;
        this.f40186b = gVar;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f40185a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f40186b.get();
        AbstractC3557B.b0("get(...)", obj2);
        return new g((Application) obj, (C4953a) obj2);
    }
}
