package ma;

import android.app.Application;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import ce.C2398d;
import com.openai.experiment.t;
import id.AbstractC3557B;

/* renamed from: ma.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4575b implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f39013a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f39014b;

    public C4575b(C2398d c2398d, AbstractC2400f abstractC2400f) {
        this.f39013a = c2398d;
        this.f39014b = abstractC2400f;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f39013a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f39014b.get();
        AbstractC3557B.b0("get(...)", obj2);
        return new C4574a((Application) obj, (t) obj2);
    }
}
