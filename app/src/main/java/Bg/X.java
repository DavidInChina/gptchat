package Bg;

import id.AbstractC3557B;
import java.util.ArrayDeque;

/* loaded from: classes2.dex */
public class X {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f2091a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f2092b;

    /* renamed from: c  reason: collision with root package name */
    public final Eg.k f2093c;

    /* renamed from: d  reason: collision with root package name */
    public final Cg.g f2094d;

    /* renamed from: e  reason: collision with root package name */
    public final Cg.i f2095e;

    /* renamed from: f  reason: collision with root package name */
    public int f2096f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayDeque f2097g;

    /* renamed from: h  reason: collision with root package name */
    public Ig.g f2098h;

    public X(boolean z10, boolean z11, Eg.k kVar, Cg.g gVar, Cg.i iVar) {
        AbstractC3557B.c0("typeSystemContext", kVar);
        AbstractC3557B.c0("kotlinTypePreparator", gVar);
        AbstractC3557B.c0("kotlinTypeRefiner", iVar);
        this.f2091a = z10;
        this.f2092b = z11;
        this.f2093c = kVar;
        this.f2094d = gVar;
        this.f2095e = iVar;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f2097g;
        AbstractC3557B.Z(arrayDeque);
        arrayDeque.clear();
        Ig.g gVar = this.f2098h;
        AbstractC3557B.Z(gVar);
        gVar.clear();
    }

    public boolean b(Eg.f fVar, Eg.f fVar2) {
        AbstractC3557B.c0("subType", fVar);
        AbstractC3557B.c0("superType", fVar2);
        return true;
    }

    public final void c() {
        if (this.f2097g == null) {
            this.f2097g = new ArrayDeque(4);
        }
        if (this.f2098h == null) {
            this.f2098h = new Ig.g();
        }
    }

    public final o0 d(Eg.f fVar) {
        AbstractC3557B.c0("type", fVar);
        return this.f2094d.a(fVar);
    }

    public final A e(Eg.f fVar) {
        AbstractC3557B.c0("type", fVar);
        return ((Cg.h) this.f2095e).a(fVar);
    }
}
