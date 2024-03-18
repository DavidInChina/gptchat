package Ig;

import Ad.l;
import Hg.u;
import id.AbstractC3557B;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kf.q;
import v0.C5942F;

/* loaded from: classes.dex */
public final class g extends AbstractSet {

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ int f8602h0 = 0;

    /* renamed from: Y  reason: collision with root package name */
    public Object f8603Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f8604Z;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Object[] objArr;
        int i10 = this.f8604Z;
        if (i10 == 0) {
            this.f8603Y = obj;
        } else if (i10 == 1) {
            if (AbstractC3557B.K(this.f8603Y, obj)) {
                return false;
            }
            this.f8603Y = new Object[]{this.f8603Y, obj};
        } else if (i10 < 5) {
            Object obj2 = this.f8603Y;
            AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>", obj2);
            Object[] objArr2 = (Object[]) obj2;
            if (q.S2(obj, objArr2)) {
                return false;
            }
            int i11 = this.f8604Z;
            if (i11 == 4) {
                Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
                AbstractC3557B.c0("elements", copyOf);
                LinkedHashSet linkedHashSet = new LinkedHashSet(P4.a.n0(copyOf.length));
                q.y3(linkedHashSet, copyOf);
                linkedHashSet.add(obj);
                objArr = linkedHashSet;
            } else {
                Object[] copyOf2 = Arrays.copyOf(objArr2, i11 + 1);
                AbstractC3557B.b0("copyOf(...)", copyOf2);
                copyOf2[copyOf2.length - 1] = obj;
                objArr = copyOf2;
            }
            this.f8603Y = objArr;
        } else {
            Object obj3 = this.f8603Y;
            AbstractC3557B.a0("null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>", obj3);
            if (!l.J(obj3).add(obj)) {
                return false;
            }
        }
        this.f8604Z++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f8603Y = null;
        this.f8604Z = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i10 = this.f8604Z;
        if (i10 == 0) {
            return false;
        }
        if (i10 == 1) {
            return AbstractC3557B.K(this.f8603Y, obj);
        }
        if (i10 < 5) {
            Object obj2 = this.f8603Y;
            AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>", obj2);
            return q.S2(obj, (Object[]) obj2);
        }
        Object obj3 = this.f8603Y;
        AbstractC3557B.a0("null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>", obj3);
        return ((Set) obj3).contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i10 = this.f8604Z;
        if (i10 == 0) {
            return Collections.emptySet().iterator();
        }
        if (i10 == 1) {
            return new u(1, this.f8603Y);
        }
        if (i10 < 5) {
            Object obj = this.f8603Y;
            AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>", obj);
            return new C5942F((Object[]) obj);
        }
        Object obj2 = this.f8603Y;
        AbstractC3557B.a0("null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>", obj2);
        return l.J(obj2).iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f8604Z;
    }
}
