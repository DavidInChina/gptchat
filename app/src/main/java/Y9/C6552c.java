package y9;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import com.openai.experiment.t;
import id.AbstractC3557B;
import ld.C4428a;
import u7.C5848d;

/* renamed from: y9.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6552c implements AbstractC2397c {

    /* renamed from: c  reason: collision with root package name */
    public static final C5848d f50843c = new C5848d(29, 0);

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f50844a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f50845b;

    public C6552c(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2) {
        this.f50844a = abstractC2400f;
        this.f50845b = abstractC2400f2;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f50844a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f50845b.get();
        AbstractC3557B.b0("get(...)", obj2);
        f50843c.getClass();
        return new C6551b((C4428a) obj, (t) obj2);
    }
}
