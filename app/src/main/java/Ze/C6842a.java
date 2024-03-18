package ze;

import io.ktor.utils.io.u;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import wf.n;
import xe.C6398C;
import xe.C6417f;

/* renamed from: ze.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6842a extends AbstractC6847f {

    /* renamed from: a  reason: collision with root package name */
    public final n f52003a;

    /* renamed from: b  reason: collision with root package name */
    public final C6417f f52004b;

    /* renamed from: c  reason: collision with root package name */
    public final C6398C f52005c = null;

    /* renamed from: d  reason: collision with root package name */
    public final Long f52006d = null;

    public C6842a(Ee.g gVar, C6417f c6417f) {
        this.f52003a = gVar;
        this.f52004b = c6417f;
    }

    @Override // ze.AbstractC6848g
    public final Long a() {
        return this.f52006d;
    }

    @Override // ze.AbstractC6848g
    public final C6417f b() {
        return this.f52004b;
    }

    @Override // ze.AbstractC6848g
    public final C6398C d() {
        return this.f52005c;
    }

    @Override // ze.AbstractC6847f
    public final Object e(u uVar, AbstractC4825e abstractC4825e) {
        Object invoke = this.f52003a.invoke(uVar, abstractC4825e);
        if (invoke == EnumC5000a.f41328Y) {
            return invoke;
        }
        return y.f36177a;
    }
}
