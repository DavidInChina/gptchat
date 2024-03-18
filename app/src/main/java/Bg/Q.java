package Bg;

import Hg.AbstractC0728a;
import Hg.AbstractC0731d;
import id.AbstractC3557B;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class Q extends AbstractC0731d {

    /* renamed from: Z  reason: collision with root package name */
    public static final P f2084Z = new P();

    /* renamed from: h0  reason: collision with root package name */
    public static final Q f2085h0 = new Q(kf.v.f37483Y);

    /* JADX WARN: Type inference failed for: r4v0, types: [Hg.a, Hg.c, java.lang.Object] */
    public Q(List list) {
        this.f7771Y = Hg.m.f7783Y;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            N n10 = (N) it.next();
            ((C0219l) n10).getClass();
            String p10 = kotlin.jvm.internal.C.f37623a.b(C0219l.class).p();
            AbstractC3557B.Z(p10);
            int b10 = f2084Z.b(p10);
            int r10 = this.f7771Y.r();
            if (r10 != 0) {
                if (r10 == 1) {
                    AbstractC0728a abstractC0728a = this.f7771Y;
                    AbstractC3557B.a0("null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>", abstractC0728a);
                    Hg.v vVar = (Hg.v) abstractC0728a;
                    int i10 = vVar.f7795Z;
                    if (i10 == b10) {
                        this.f7771Y = new Hg.v(b10, n10);
                    } else {
                        ?? obj = new Object();
                        obj.f7769Y = new Object[20];
                        obj.f7770Z = 0;
                        this.f7771Y = obj;
                        obj.s(i10, vVar.f7794Y);
                    }
                }
                this.f7771Y.s(b10, n10);
            } else {
                this.f7771Y = new Hg.v(b10, n10);
            }
        }
    }
}
