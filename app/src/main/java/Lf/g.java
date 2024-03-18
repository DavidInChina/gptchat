package Lf;

import Df.v;
import Mf.AbstractC0997f;
import Mf.B;
import Pf.C1156n;
import Pf.G;
import id.AbstractC3557B;
import java.util.Collection;
import kf.x;
import kg.C4290b;
import kg.C4291c;
import kg.C4293e;
import kg.C4294f;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.u;
import ud.C5902a;

/* loaded from: classes2.dex */
public final class g implements Of.c {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ v[] f11085e;

    /* renamed from: g  reason: collision with root package name */
    public static final C4294f f11087g;

    /* renamed from: h  reason: collision with root package name */
    public static final C4290b f11088h;

    /* renamed from: a  reason: collision with root package name */
    public final B f11089a;

    /* renamed from: b  reason: collision with root package name */
    public final wf.k f11090b;

    /* renamed from: c  reason: collision with root package name */
    public final Ag.l f11091c;

    /* renamed from: d  reason: collision with root package name */
    public static final Cf.k f11084d = new Cf.k(8, 0);

    /* renamed from: f  reason: collision with root package name */
    public static final C4291c f11086f = Jf.q.f9204k;

    static {
        D d10 = C.f37623a;
        f11085e = new v[]{d10.g(new u(d10.b(g.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};
        C4293e c4293e = Jf.p.f9169c;
        C4294f f6 = c4293e.f();
        AbstractC3557B.b0("shortName(...)", f6);
        f11087g = f6;
        f11088h = C4290b.j(c4293e.g());
    }

    public g(Ag.u uVar, G g10) {
        f fVar = f.f11083Y;
        this.f11089a = g10;
        this.f11090b = fVar;
        this.f11091c = new Ag.l((Ag.q) uVar, new C5902a(this, 12, uVar));
    }

    @Override // Of.c
    public final Collection a(C4291c c4291c) {
        AbstractC3557B.c0("packageFqName", c4291c);
        if (AbstractC3557B.K(c4291c, f11086f)) {
            return R4.b.W1((C1156n) A7.b.X0(this.f11091c, f11085e[0]));
        }
        return x.f37485Y;
    }

    @Override // Of.c
    public final boolean b(C4291c c4291c, C4294f c4294f) {
        AbstractC3557B.c0("packageFqName", c4291c);
        AbstractC3557B.c0("name", c4294f);
        if (AbstractC3557B.K(c4294f, f11087g) && AbstractC3557B.K(c4291c, f11086f)) {
            return true;
        }
        return false;
    }

    @Override // Of.c
    public final AbstractC0997f c(C4290b c4290b) {
        AbstractC3557B.c0("classId", c4290b);
        if (AbstractC3557B.K(c4290b, f11088h)) {
            return (C1156n) A7.b.X0(this.f11091c, f11085e[0]);
        }
        return null;
    }
}
