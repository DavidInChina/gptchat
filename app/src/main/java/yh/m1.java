package yh;

import java.util.List;
import th.AbstractC5806n;
import wh.AbstractC6242g;
import wh.AbstractC6256u;
import yh.l1;

/* loaded from: classes.dex */
public abstract class m1 extends r {

    /* renamed from: i0  reason: collision with root package name */
    public final String f51050i0;

    /* renamed from: j0  reason: collision with root package name */
    public final int f51051j0;

    /* renamed from: k0  reason: collision with root package name */
    public final l1.a f51052k0;

    /* renamed from: l0  reason: collision with root package name */
    public final List f51053l0;

    public m1(String str, int i10, l1.a aVar, r1 r1Var) {
        this.f51050i0 = str;
        this.f51051j0 = i10;
        this.f51052k0 = aVar;
        this.f51053l0 = r1Var;
    }

    @Override // yh.l1
    public final AbstractC6624m A() {
        throw new IllegalStateException("Cannot resolve record components of a latent type description: " + this);
    }

    @Override // yh.l1
    public final H1 F() {
        throw new IllegalStateException("Cannot resolve inner types of a latent type description: " + this);
    }

    @Override // yh.l1
    public final boolean K() {
        throw new IllegalStateException("Cannot resolve anonymous type property of a latent type description: " + this);
    }

    @Override // yh.AbstractC6632q
    public final l1.a L() {
        return this.f51052k0;
    }

    @Override // yh.l1
    public final vh.l U0() {
        throw new IllegalStateException("Cannot resolve declared fields of a latent type description: " + this);
    }

    @Override // yh.l1
    public final l1 W() {
        throw new IllegalStateException("Cannot resolve enclosing type of a latent type description: " + this);
    }

    @Override // yh.AbstractC6632q
    public final boolean Y() {
        throw new IllegalStateException("Cannot resolve record attribute of a latent type description: " + this);
    }

    @Override // yh.l1
    public final H1 b1() {
        throw new IllegalStateException("Cannot resolve permitted subclasses of a latent type description: " + this);
    }

    @Override // yh.l1
    public final H1 d0() {
        throw new IllegalStateException("Cannot resolve nest mates of a latent type description: " + this);
    }

    @Override // th.AbstractC5808p
    public final AbstractC5806n getDeclaredAnnotations() {
        throw new IllegalStateException("Cannot resolve declared annotations of a latent type description: " + this);
    }

    @Override // sh.AbstractC5637i.b
    public final String getName() {
        return this.f51050i0;
    }

    @Override // yh.l1, yh.AbstractC6632q
    public final AbstractC6256u i() {
        throw new IllegalStateException("Cannot resolve declared methods of a latent type description: " + this);
    }

    @Override // yh.l1
    public final boolean m() {
        throw new IllegalStateException("Cannot resolve local class property of a latent type description: " + this);
    }

    @Override // yh.AbstractC6632q
    public final G1 o0() {
        return new t1(this.f51053l0);
    }

    @Override // sh.AbstractC5641m
    public final G1 r0() {
        throw new IllegalStateException("Cannot resolve type variables of a latent type description: " + this);
    }

    @Override // yh.l1
    public final AbstractC6242g s0() {
        throw new IllegalStateException("Cannot resolve enclosing method of a latent type description: " + this);
    }

    @Override // sh.AbstractC5636h
    public final int u0() {
        return this.f51051j0;
    }

    @Override // yh.l1
    public final l1 v() {
        throw new IllegalStateException("Cannot resolve nest host of a latent type description: " + this);
    }

    @Override // yh.l1
    public final AbstractC6597c z() {
        String str = this.f51050i0;
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return AbstractC6597c.f50995J;
        }
        return new C6594b(1, str.substring(0, lastIndexOf));
    }

    @Override // yh.AbstractC6635s, yh.l1, sh.AbstractC5633e, wh.AbstractC6242g
    /* renamed from: a */
    public final l1 mo118a() {
        throw new IllegalStateException("Cannot resolve declared type of a latent type description: " + this);
    }
}
