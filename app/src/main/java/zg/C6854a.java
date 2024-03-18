package zg;

import id.AbstractC3557B;
import java.util.Iterator;
import java.util.List;
import kg.C4291c;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.D;
import l8.AbstractC4344b;
import wf.AbstractC6216a;

/* renamed from: zg.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6854a implements Nf.i {

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ Df.v[] f52018Z;

    /* renamed from: Y  reason: collision with root package name */
    public final Ag.l f52019Y;

    static {
        D d10 = C.f37623a;
        f52018Z = new Df.v[]{d10.g(new kotlin.jvm.internal.u(d10.b(C6854a.class), "annotations", "getAnnotations()Ljava/util/List;"))};
    }

    public C6854a(Ag.u uVar, AbstractC6216a abstractC6216a) {
        AbstractC3557B.c0("storageManager", uVar);
        this.f52019Y = new Ag.l((Ag.q) uVar, abstractC6216a);
    }

    @Override // Nf.i
    public final boolean G(C4291c c4291c) {
        return AbstractC4344b.x0(this, c4291c);
    }

    @Override // Nf.i
    public boolean isEmpty() {
        return ((List) A7.b.X0(this.f52019Y, f52018Z[0])).isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return ((List) A7.b.X0(this.f52019Y, f52018Z[0])).iterator();
    }

    @Override // Nf.i
    public final Nf.c l(C4291c c4291c) {
        return AbstractC4344b.i0(this, c4291c);
    }
}
