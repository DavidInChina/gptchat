package Rf;

import Mf.AbstractC0994c;
import Pf.AbstractC1144b;
import Sf.u;
import ag.AbstractC1989a;
import bg.AbstractC2202j;
import id.AbstractC3557B;
import java.util.ArrayList;
import xg.s;

/* loaded from: classes2.dex */
public final class f implements s, AbstractC1989a {

    /* renamed from: b  reason: collision with root package name */
    public static final f f15504b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static final f f15505c = new Object();

    public h a(AbstractC2202j abstractC2202j) {
        AbstractC3557B.c0("javaElement", abstractC2202j);
        return new h((u) abstractC2202j);
    }

    @Override // xg.s
    public void b(AbstractC1144b abstractC1144b, ArrayList arrayList) {
        AbstractC3557B.c0("descriptor", abstractC1144b);
        throw new IllegalStateException("Incomplete hierarchy for class " + abstractC1144b.getName() + ", unresolved classes " + arrayList);
    }

    @Override // xg.s
    public void c(AbstractC0994c abstractC0994c) {
        AbstractC3557B.c0("descriptor", abstractC0994c);
        throw new IllegalStateException("Cannot infer visibility for " + abstractC0994c);
    }
}
