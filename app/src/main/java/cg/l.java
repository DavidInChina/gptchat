package Cg;

import Bg.A;
import Bg.d0;
import H.H;
import Mf.AbstractC1000i;
import Mf.b0;
import id.AbstractC3557B;
import java.util.Collection;
import java.util.List;
import jf.AbstractC3957g;
import jf.EnumC3958h;
import og.AbstractC5006b;
import ud.C5902a;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class l implements AbstractC5006b {

    /* renamed from: a  reason: collision with root package name */
    public final d0 f3135a;

    /* renamed from: b  reason: collision with root package name */
    public AbstractC6216a f3136b;

    /* renamed from: c  reason: collision with root package name */
    public final l f3137c;

    /* renamed from: d  reason: collision with root package name */
    public final b0 f3138d;

    /* renamed from: e  reason: collision with root package name */
    public final AbstractC3957g f3139e;

    public /* synthetic */ l(d0 d0Var, H h10, l lVar, b0 b0Var, int i10) {
        this(d0Var, (i10 & 2) != 0 ? null : h10, (i10 & 4) != 0 ? null : lVar, (i10 & 8) != 0 ? null : b0Var);
    }

    @Override // og.AbstractC5006b
    public final d0 a() {
        return this.f3135a;
    }

    public final l b(i iVar) {
        C5902a c5902a;
        AbstractC3557B.c0("kotlinTypeRefiner", iVar);
        d0 a5 = this.f3135a.a(iVar);
        if (this.f3136b != null) {
            c5902a = new C5902a(this, 26, iVar);
        } else {
            c5902a = null;
        }
        l lVar = this.f3137c;
        if (lVar == null) {
            lVar = this;
        }
        return new l(a5, c5902a, lVar, this.f3138d);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!AbstractC3557B.K(l.class, cls)) {
            return false;
        }
        AbstractC3557B.a0("null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor", obj);
        l lVar = (l) obj;
        l lVar2 = this.f3137c;
        if (lVar2 == null) {
            lVar2 = this;
        }
        l lVar3 = lVar.f3137c;
        if (lVar3 != null) {
            lVar = lVar3;
        }
        if (lVar2 == lVar) {
            return true;
        }
        return false;
    }

    @Override // Bg.Y
    public final List getParameters() {
        return kf.v.f37483Y;
    }

    public final int hashCode() {
        l lVar = this.f3137c;
        if (lVar != null) {
            return lVar.hashCode();
        }
        return super.hashCode();
    }

    @Override // Bg.Y
    public final Jf.l j() {
        A type = this.f3135a.getType();
        AbstractC3557B.b0("getType(...)", type);
        return Bi.c.P0(type);
    }

    @Override // Bg.Y
    public final AbstractC1000i k() {
        return null;
    }

    @Override // Bg.Y
    public final Collection l() {
        List list = (List) this.f3139e.getValue();
        if (list == null) {
            return kf.v.f37483Y;
        }
        return list;
    }

    @Override // Bg.Y
    public final boolean m() {
        return false;
    }

    public final String toString() {
        return "CapturedType(" + this.f3135a + ')';
    }

    public l(d0 d0Var, AbstractC6216a abstractC6216a, l lVar, b0 b0Var) {
        this.f3135a = d0Var;
        this.f3136b = abstractC6216a;
        this.f3137c = lVar;
        this.f3138d = b0Var;
        this.f3139e = R4.b.C1(EnumC3958h.f36152Y, new Uf.A(17, this));
    }
}
